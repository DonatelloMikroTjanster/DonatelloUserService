-- Insert Users
INSERT INTO users (id, username, email)
VALUES
    (1, 'kalle_anka', 'kalle@example.com'),
    (2, 'lisa_svensson', 'lisa@example.com');

-- Insert Media
INSERT INTO media (id, title, media_category, genre, release_date, url, duration)
VALUES
    (1, 'Tech Talk Episode 1', 'Podcast', 'Teknologi', '2023-01-01', 'http://example.com/tech-talk-1', '30:00'),
    (2, 'Planet Earth II Episode 1', 'Dokumentär', 'Natur', '2016-11-06', 'http://example.com/planet-earth-2-1', '60:00'),
    (3, 'Come Together', 'Song', 'Rock', '1969-09-26', 'http://example.com/come-together', '4:20'),
    (4, 'Billie Jean', 'Song', 'Pop', '1982-11-30', 'http://example.com/billie-jean', '4:54');

-- Insert PlaybackHistory
INSERT INTO playback_history (id, user_id, media_id, played_at, progress, timestamp)
VALUES
    (1, 1, 1, '2023-01-01T10:00:00', 1800, '2023-01-01T10:00:00'),
    (2, 2, 2, '2023-01-02T11:00:00', 3600, '2023-01-02T11:00:00');

-- Insert Ratings
INSERT INTO ratings (id, user_id, media_id, rating)
VALUES
    (1, 1, 1, 'UP'),
    (2, 2, 2, 'DOWN');