import sys
sys.setrecursionlimit(10 ** 6) 

def dfs(graph, start, visited = []):
    visited.append(start)
    for node in graph[start]:
        if node not in visited:
            #print("dfs(node:",node,")",end="\n")
            dfs(graph, node, visited)
    return visited

N, M, R = map(int, input().split())

graph = dict()
for i in range(1,N+1):
    graph[i]=[]

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

result=dfs(graph,1)

for i in range(1,N+1):
    if i in result:
        print(result.index(i)+1)
    else:
        print(0)

# print(graph)
# print(dfs(graph,1))