-- Insert Users
INSERT INTO users (id, username, email)
VALUES
    (1, 'anna_svensson', 'anna@example.com'),
    (2, 'erik_larsson', 'erik@example.com');

-- Insert Media (Simplified Media with String mediaCategory)
INSERT INTO media (id, title, mediacategory)
VALUES
    (1, 'Come Together', 'MUSIC'),
    (2, 'Billie Jean', 'MUSIC'),
    (3, 'Tech Talk Episode 1', 'PODCAST'),
    (4, 'Planet Earth II Episode 1', 'VIDEO');

-- Insert Playback History (linking users to media)
INSERT INTO playback_history (id, user_id, media_id, timestamp)
VALUES
    (1, 1, 1, '2024-01-10 14:00:00'),  -- Anna Svensson played "Come Together"
    (2, 2, 3, '2024-02-15 09:30:00');  -- Erik Larsson played "Tech Talk Episode 1"

-- Insert Ratings (Thumbs Up/Down)
INSERT INTO ratings (id, user_id, media_id, rating)
VALUES
    (1, 1, 1, 'UP'),   -- Anna Svensson gave a thumbs up for "Come Together"
    (2, 2, 2, 'DOWN'); -- Erik Larsson gave a thumbs down for "Billie Jean"