delete
from big_data
where big_data notnull;

insert into big_data (name, age, uri, date_time)
values ('sam', 20, 'https://yandex.ru', '2021-02-13 18:01:01'),
       ('dean', 23, 'https://www.google.ru', '2021-02-21 18:05:01'),
       ('john', 33, 'https://www.youtube.com', '2021-04-15 21:30:30'),
       ('conor', 18, 'https://wasd.tv/', '2021-05-30 18:11:01'),
       ('habib', 29, 'https://www.twitch.tv', '2021-05-12 17:00:01'),
       ('dilan', 21, 'https://vk.com/', '2021-06-17 19:22:01'),
       ('tomas', 31, 'https://www.instagram.com/', '2021-06-18 19:15:01'),
       ('smith', 35, 'https://twitter.com/', '2021-10-09 18:56:01');