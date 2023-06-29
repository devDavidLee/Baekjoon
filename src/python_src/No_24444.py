import sys
from collections import deque

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
    return save,visited_bfs


N, M, R = map(int, input().split())

graph = dict()
for i in range(1,N+1):
    graph[i]=[]

visited_bfs = [0 for _ in range(N+1)]

for i in range(1,M+1):
    a,b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)


for i in range(1,N+1):
    graph[i].sort()

result_bfs=bfs(graph,R,visited_bfs)

for i in range(1,N+1):
    if result_bfs[1][i]==1:
        print(result_bfs[0].index(i)+1)
    else:
        print(0)