-- Insert Users
INSERT INTO users (id, username, email, created_at)
VALUES
    (1, 'kalle_anka', 'kalle@example.com', '2023-01-01T10:00:00'),
    (2, 'lisa_svensson', 'lisa@example.com', '2023-01-02T11:00:00'),
    (3, 'erik_eriksson', 'erik@example.com', '2023-01-03T12:00:00'),
    (4, 'anna_andersson', 'anna@example.com', '2023-01-04T13:00:00');

-- Insert Media with album associations
INSERT INTO media (id, title, media_type, genre, release_date, url, duration)
VALUES
    (1, 'Tech Talk Episode 1', 'Podcast', 'Technology', '2023-01-01', 'http://example.com/tech-talk-1', '30:00'),
    (2, 'Planet Earth II Episode 1', 'Documentary', 'Nature', '2016-11-06', 'http://example.com/planet-earth-2-1', '60:00'),
    (3, 'Come Together', 'Song', 'Rock', '1969-09-26', 'http://example.com/come-together', '4:20'),
    (4, 'Billie Jean', 'Song', 'Pop', '1982-11-30', 'http://example.com/billie-jean', '4:54');


-- Insert PlayBackHistory

INSERT INTO playback_history (id, user_id, media_id, played_at)
VALUES
    (1, 1, 1, '2023-01-01T10:00:00'),
    (2, 2, 2, '2023-01-02T11:00:00'),
    (3, 3, 3, '2023-01-03T12:00:00'),
    (4, 4, 4, '2023-01-04T13:00:00');

-- Insert Ratings
INSERT INTO ratings (id, user_id, media_id, rating)
VALUES
    (1, 1, 1, 'UP'),
    (2, 2, 2, 'DOWN'),
    (3, 3, 3, 'UP'),
    (4, 4, 4, 'DOWN');