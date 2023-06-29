import sys
from collections import deque
sys.setrecursionlimit(10 ** 5) 

def dfs(graph, start, visited_dfs, save=[]):
    # visited.append(start)
    save.append(start)
    visited_dfs[start]=1
    for node in graph[start]:
        if visited_dfs[node]==0:
            
            #print("dfs(node:",node,")",end="\n")
            dfs(graph, node, visited_dfs)
    return save

def bfs(graph, start, visited_bfs, save=[]):
    queue=deque([start])
    visited_bfs[start]=1
    while len(queue)!=0:
        v=queue.popleft()
        save.append(v)
        for node in graph[v]:
            if visited_bfs[node]==0:
                queue.append(node)
                visited_bfs[node]=1
    return save

                

# graph[1] = [2,4]
# graph[2] = [1,3,4]
# graph[3] = [2,4]
# graph[4] = [1,2,3]
# graph[5] = []


N, M, R = map(int, input().split())

graph = dict()
for i in range(1,N+1):
    graph[i]=[]


visited_dfs = [0 for _ in range(N+1)]
visited_bfs = [0 for _ in range(N+1)]

for i in range(1,M+1):
    a,b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)


for i in range(1,N+1):
    graph[i].sort()

result_dfs=dfs(graph,R,visited_dfs)
result_bfs=bfs(graph,R,visited_bfs)

for s in result_dfs:
    print(s,end=' ')
print()
for s in result_bfs:
    print(s,end=' ')
print()