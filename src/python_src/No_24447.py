import sys
from collections import deque

def bfs(graph, start, visited_bfs, depth, t):
    queue=deque([start])
    visited_bfs[start]=1
    while len(queue)!=0:
        v=queue.popleft()
        t.append(v)
        for node in graph[v]:
            if visited_bfs[node]==0:
                queue.append(node)
                visited_bfs[node]=1
                depth[node]=depth[v]+1
    return depth,visited_bfs


N, M, R = map(int, input().split())

graph = dict()
for i in range(1,N+1):
    graph[i]=[]

visited_bfs = [0 for _ in range(N+1)]
depth = [-1 for _ in range(N+1)]
t=[]

for i in range(1,M+1):
    a,b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)


for i in range(1,N+1):
    graph[i].sort()

result_bfs=bfs(graph,R,visited_bfs, depth, t)
sum=0

# depth값 정제
for i in range(1,N+1):
    if result_bfs[1][i]==1:
        result_bfs[0][i]=result_bfs[0][i]+1

t_new=[] # 정제한 t값들 담는 배열

# t값 정제
for i in range(1,N+1):
    if result_bfs[1][i]==1:
        t_new.append(t.index(i)+1)
    else:
        t_new.append(0)

# 합 구하기
for i in range(1,N+1):
    a=result_bfs[0][i]
    b=t_new[i-1]
    sum=sum+(a*b)

print(sum)