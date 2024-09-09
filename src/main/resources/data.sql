INSERT INTO users (id, username, email)
VALUES
    (1, 'anna_svensson', 'anna@example.com'),
    (2, 'erik_larsson', 'erik@example.com');

INSERT INTO media (id, title, mediaCategory)
VALUES
    (1, 'Come Together', 'MUSIC'),
    (2, 'Billie Jean', 'MUSIC'),
    (3, 'Tech Talk Episode 1', 'PODCAST');

INSERT INTO ratings (id, user_id, media_id, rating)
VALUES
    (1, 1, 1, 'UP'),
    (2, 2, 2, 'DOWN');


INSERT INTO playback_history (id, user_id, media_id, timestamp)
VALUES
    (1, 1, 1, '2024-01-10 14:00:00'),
    (2, 2, 3, '2024-02-15 09:30:00');

