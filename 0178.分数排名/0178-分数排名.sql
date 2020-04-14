# Write your MySQL query statement below
select a.Score as Score,
(select count(distinct b.Score) from Scores as b where b.Score>=a.score)as Rank
from Scores as a
order by a.Score desc;

