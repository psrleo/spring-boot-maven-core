delete from Emp e1 where ROWID > (select min(ROWID) from Emp e2 where e1.key1 = e2.key1 and e1.key2 = e2.key2)