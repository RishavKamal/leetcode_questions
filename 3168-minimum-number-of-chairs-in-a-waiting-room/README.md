# 3168. Minimum Number of Chairs in a Waiting Room

**Difficulty:** Easy
**Topics:** String, Simulation

## Problem Statement

You are given a string `s`. Simulate events at each second `i`:

- If `s[i] == 'E'`, a person enters the waiting room and takes one of the chairs in it.

	- If `s[i] == 'L'`, a person leaves the waiting room, freeing up a chair.

Return the **minimum **number of chairs needed so that a chair is available for every person who enters the waiting room given that it is initially **empty**.

 

**Example 1:**

**Input:** s = "EEEEEEE"

**Output:** 7

**Explanation:**

After each second, a person enters the waiting room and no person leaves it. Therefore, a minimum of 7 chairs is needed.

**Example 2:**

**Input:** s = "ELELEEL"

**Output:** 2

**Explanation:**

Let's consider that there are 2 chairs in the waiting room. The table below shows the state of the waiting room at each second.

SecondEventPeople in the Waiting RoomAvailable Chairs0Enter111Leave022Enter113Leave024Enter115Enter206Leave11

**Example 3:**

**Input:** s = "ELEELEELLL"

**Output:** 3

**Explanation:**

Let's consider that there are 3 chairs in the waiting room. The table below shows the state of the waiting room at each second.

SecondEventPeople in the Waiting RoomAvailable Chairs0Enter121Leave032Enter123Enter214Leave125Enter216Enter307Leave218Leave129Leave03

 

**Constraints:**

- `1 <= s.length <= 50`

	- `s` consists only of the letters `'E'` and `'L'`.

	- `s` represents a valid sequence of entries and exits.

## Sample Test Cases

### Example 1

**Input:**
```
s = "EEEEEEE"
```

**Output:**
```
7
```

### Example 2

**Input:**
```
s = "ELELEEL"
```

**Output:**
```
2
```

### Example 3

**Input:**
```
s = "ELEELEELLL"
```

**Output:**
```
3
```
