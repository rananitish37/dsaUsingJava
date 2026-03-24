### When the Roll Book Starts Elsewhere
Difficulty: Medium  
Reveal Path  
A school keeps attendance in a circular order so each student periodically appears first. At the end of each month, the teacher announces that the visible register should now begin K seats later than before. K may be bigger than the number of students. The circular order itself is unchanged; only the flattened representation begins somewhere else. The most direct solution comes from reasoning about how indices move under wrap-around.  

Ans: 
---

### The Coach's Best Chapter
Difficulty: Hard  
Reveal Path  
A coach rates every training day with a positive or negative morale score. To produce a season documentary, she wants one uninterrupted chapter that captures the strongest overall rise in morale. It cannot skip bad days in the middle if those days lie inside the chosen chapter, and it cannot splice disconnected weeks together. The trick is recognizing when carrying earlier disappointment into the future is harmful enough that a new chapter should start at the current day. The language is narrative and psychological, but the algorithmic core is a best contiguous total.  

Ans:
---

### Every Center in the Poet's Mirror
Difficulty: Brutal  
Reveal Path  
A digital-humanities lab studies symmetry in poetic lines. For each line, the researchers want the radius of reflective structure around every center position, because later they aggregate stylistic statistics across thousands of poems. The longest reflected span matters too, but it is not enough on its own. Brute-force expansion from every center would waste time, yet one large known reflected zone can reveal information about centers inside it by mirror logic. This makes the problem far more specific than generic dynamic programming over substrings.  

---

### Tracks Touched by Too Many Hands
Difficulty: Hard  
Reveal Path  
A railway planner assigns reinforcement crews to inclusive spans of track IDs. One crew strengthens 20 to 90, another polishes 61 to 140, another inspects 1 to 500, and so on. The planner is not interested in immediate answers after each assignment. At the end of planning, she wants the final number of touches on every track segment and then statistics about segments that crossed thresholds. The workload is dominated by repeated start-to-end additions before any final reconstruction happens.  

---

### Pilgrim Road Under Tolerance Rules
Difficulty: Savage  
Reveal Path  
A pilgrimage office rates each checkpoint on a sacred route as peaceful or stressful. For tourism promotion, the office wants the longest continuous brochure-worthy route that may contain at most K stressful checkpoints, because small discomfort is acceptable but too much ruins the package. The route has to stay unbroken; skipping around is forbidden. As analysts extend the proposed route one checkpoint at a time, there comes a point where the route breaks the comfort rule and the left boundary must be advanced until the brochure becomes valid again. Students frequently confuse this with Kadane because both talk about unbroken stretches, but here the signal is not cumulative gain. The signal is validity under a moving constraint and the need to expand and shrink boundaries dynamically.  

---

### Quarterly Recovery Narrative
Difficulty: Savage  
Reveal Path  
A media company rates each day of a quarter by how much trust it gained or lost with its subscribers. A future documentary wants to highlight one unbroken chapter of the quarter as the company’s strongest recovery arc. The chapter must stay unbroken because the editor wants to show causally connected days rather than cherry-picked moments. Some days inside the quarter are disastrous, some moderately positive, and a few spectacular. The producers are not asking for the number of good days, the longest non-negative run, or the best set of disjoint scenes. They want the single unbroken stretch whose combined score is highest. The hidden challenge is deciding when a weak prefix should be abandoned because carrying it forward only hurts future totals. The story looks like media analytics, but the algorithmic signature is pure best-streak optimization.  

---

### Three-Tier Cargo Without Sorting
Difficulty: Hard  
Reveal Path  
A port authority receives containers tagged for three handling levels: hand-carry, forklift, and crane. The line controller must rearrange them so all hand-carry containers come first, then forklift, then crane. The memory available to the controller is tiny, and management explicitly says the relative order inside a category is irrelevant. Each container already belongs to one of exactly three categories, so the problem is much more specialized than generic sorting. However, the wording tries to bait students into thinking of custom comparator sort or counting sort simply because categories are involved. The real structure is an in-place region-building process in which one pointer explores while two other boundaries mark settled zones.  

Ans: DNF
---

### Review the Apprentices' Code, Not the Story
Difficulty: Hard  
Reveal Path  
Three apprentices each write a different routine for processing celestial logs. One routine nests loops but advances an inner pointer monotonically across the entire run. Another recursively divides the input and creates temporary structures before combining results. The third scans once while maintaining a table whose size depends only on a fixed alphabet of symbols. The master does not ask which routine is best for the domain story, nor does he ask for a more elegant implementation. He asks for the runtime and auxiliary memory growth of each approach. The student who jumps to data structures before noticing the meta-level nature of the task will misclassify it immediately.  

---

### Posters Before Sunrise
Difficulty: Brutal  
Reveal Path  
Before sunrise, a campaign team sends hundreds of volunteer groups to paste posters across a numbered highway barrier. Each group receives an inclusive segment to cover, and overlapping placements are allowed. The coordination software does not need to answer how many layers exist on barrier 713 immediately after group 19 acts. Instead, after every group has finished, headquarters wants the final layer count at every barrier position, followed by a report of how many positions exceeded a legal density threshold. The highway may have millions of positions, and each group may cover very long spans. A naive engineer updates every location inside every assigned segment. A different engineer hears the word “final counts” and reaches for ordinary prefix sums without noticing the actual sequence of operations. The twist is that all assignments come first, the aggregate profile is built after, and only then are downstream reports generated. The hidden pattern is not obvious unless you notice whether the workload is query-heavy or update-heavy.  

---

### A Clause that Repeats Within Itself
Difficulty: Hard  
Reveal Path  
A legal-compliance engine searches a massive policy document for a template clause whose wording contains repeated fragments. During scanning, many alignments almost match and then fail one character later. The engine should not forget everything at that moment, because the suffix of what already matched may itself be a valid prefix of the clause. The correct algorithm is the one built around border reuse on mismatch, not window hashing and not global prefix-length-at-every-position analysis.  

---

### Dominance in the Gate Registry
Difficulty: Hard  
Reveal Path  
A stadium registry records the preferred entry gate on every ticket. Management suspects one gate was preferred by more than half the audience, but they want a memory-light way to identify a serious candidate before doing a confirmatory recount. Someone suggests a peculiar thought experiment: whenever two tickets disagree on gate preference, imagine discarding them both from consideration. If a true majority exists, it should remain standing after enough such neutralizations. The hidden pattern is easy to miss because the story does not talk about elements, arrays, or frequencies in textbook style.  

---

### Signals, Sirens, and Live Intervals
Difficulty: Hard  
Reveal Path  
A smart-city control room tracks a congestion score at each traffic signal. Sensors revise individual signals throughout the day, while operators ask for interval aggregates such as the worst score across one corridor or the total score across another. Because changes and questions interleave, any strategy based on one-time preprocessing collapses quickly. The solution must support a mergeable statistic over ranges while surviving constant point edits. Students who focus only on the word “sum” or “maximum” often miss the more important phrase “throughout the day.”  

---

### Thermal Archive of Cold Storage Blocks
Difficulty: Brutal  
Reveal Path  
A pharmaceutical company stores vaccines in a giant climate-controlled hall divided into a rectangular lattice of micro-zones. At the end of each day, every cell stores the accumulated thermal drift score observed in that zone. The hall map is locked afterward for compliance, but analysts spend the next morning asking for combined drift across countless rectangular sectors. They never modify the data after storage. The real clue is repeated box-shaped area aggregation on a fixed grid.  

---

### The Hall of Perfect Mirrors
Difficulty: Savage  
Reveal Path  
An architect builds a symbolic hallway and wants to know the mirrored reach around every possible center position. Once a large reflective interval is known, nearby centers inherit partial information by symmetry, avoiding redundant comparisons.  

---

### A Ring of Lantern Keepers
Difficulty: Hard  
Reveal Path  
Along a ceremonial ring road, each lantern keeper stands in a fixed circular order. Before every festival round, the marshal declares that the visible lineup will now begin K positions later than before, wrapping around when the end is crossed.  

---

### The Gene Hymn with Self-Overlap
Difficulty: Brutal  
Reveal Path  
A biotech lab searches a very long genome for a motif with repeated internal structure. After mismatch, part of the previous match can still be reused.  

---

### Forgery via Moving Fingerprint
Difficulty: Savage  
Reveal Path  
Use a rolling fingerprint to scan efficiently and verify only on potential matches.  

---

### The Smallest Usable Fragment of Speech
Difficulty: Brutal  
Reveal Path  
Find the smallest substring that contains all required elements, expanding and shrinking dynamically.  

---

### Broadcast Offsets that Resemble the Beginning
Difficulty: Hard  
Reveal Path  
For every position, compute how much of the string matches the prefix using reuse of known intervals.  

---

### The Compiler's Secret Flags
Difficulty: Medium  
Reveal Path  
Store multiple boolean capabilities in a single word and manipulate them efficiently.  

---

### Three Bottles, One Conveyor, No Excuses
Difficulty: Medium  
Reveal Path  
Group three types in-place using minimal memory and region partitioning.  

---

### Silent Cells at the End of the Ledger
Difficulty: Hard  
Reveal Path  
Move valid entries forward while preserving order and push placeholders to the end.  

---

### Night Electricity Across the East Wing
Difficulty: Medium  
Reveal Path  
Data is fixed, and many range sum queries must be answered efficiently.  

---

### Green Mass in the Satellite Quilt
Difficulty: Medium  
Reveal Path  
Answer multiple rectangular sum queries on a fixed grid.  

---

### Telemetry Rule in a Narrow Cockpit
Difficulty: Medium  
Reveal Path  
Process stream data using minimal state in a single pass.  