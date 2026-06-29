vector<int> findAnagrams(string s, string p) {
    vector<int> res;
    if (p.size() > s.size()) return res;

    vector<int> freqP(26, 0), freqS(26, 0);
    for (char c : p) freqP[c - 'a']++;
    for (int i = 0; i < p.size(); i++) freqS[s[i] - 'a']++;

    if (freqP == freqS) res.push_back(0);

    for (int i = p.size(); i < s.size(); i++) {
        freqS[s[i] - 'a']++;
        freqS[s[i - p.size()] - 'a']--;
        if (freqP == freqS) res.push_back(i - p.size() + 1);
    }
    return res;
}
