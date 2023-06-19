import sys
sys.setrecursionlimit(10 ** 5) 

def dfs(graph, start, visited, save=[]):
    # visited.append(start)
    save.append(start)
    visited[start]=1
    for node in graph[start]:
        if visited[node]==0:
            
            #print("dfs(node:",node,")",end="\n")
            dfs(graph, node, visited)
    return save,visited

N, M, R = map(int, input().split())

graph = dict()
for i in range(1,N+1):
    graph[i]=[]


visited = [0 for _ in range(N+1)]

for i in range(1,M+1):
    a,b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)


for i in range(1,N+1):
    graph[i].sort(reverse=True)

result=dfs(graph,R,visited)

for i in range(1,N+1):
    if result[1][i]==1:
        print(result[0].index(i)+1)
    else:
        print(0)
