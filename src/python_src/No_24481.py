import sys
sys.setrecursionlimit(10 ** 5) 

def dfs(graph, start, visited, save):
    # visited.append(start)
    save[start]+=1
    visited[start]=1
    for node in graph[start]:
        if visited[node]==0:
            #print("dfs(node:",node,")",end="\n")
            dfs(graph, node, visited,save)
    return save,visited

N, M, R = map(int, input().split())

graph = dict()
for i in range(1,N+1):
    graph[i]=[]


visited = [0 for _ in range(N+1)]
save = [-1 for _ in range(N+1)]

for i in range(1,M+1):
    a,b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)


# graph[1] = [2,4]
# graph[2] = [1,3,4]
# graph[3] = [2,4]
# graph[4] = [1,2,3]
# graph[5] = []


for i in range(1,N+1):
    graph[i].sort()

result=dfs(graph,R,visited,save)

print(result)

# for i in range(1,N+1):
#     if result[1][i]==1:
#         print(result[0].index(i)+1)
#     else:
#         print(0)
