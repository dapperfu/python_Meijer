package com.launchdarkly.sdk;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import og.InterfaceC16126b;

@InterfaceC16126b(LDValueTypeAdapter.class)
/* loaded from: classes8.dex */
final class LDValueArray extends LDValue {
    private static final LDValueArray EMPTY = new LDValueArray(Collections.EMPTY_LIST);
    private final List<LDValue> list;

    static LDValueArray C(List<LDValue> list) {
        return (list == null || list.isEmpty()) ? EMPTY : new LDValueArray(list);
    }

    @Override // com.launchdarkly.sdk.LDValue
    public LDValue f(int i10) {
        return (i10 < 0 || i10 >= this.list.size()) ? LDValue.u() : this.list.get(i10);
    }

    @Override // com.launchdarkly.sdk.LDValue
    public i h() {
        return i.ARRAY;
    }

    @Override // com.launchdarkly.sdk.LDValue
    public int w() {
        return this.list.size();
    }

    @Override // com.launchdarkly.sdk.LDValue
    public Iterable<LDValue> z() {
        return this.list;
    }

    private LDValueArray(List<LDValue> list) {
        this.list = Collections.unmodifiableList(list);
    }

    @Override // com.launchdarkly.sdk.LDValue
    void B(JsonWriter jsonWriter) throws IOException {
        jsonWriter.beginArray();
        Iterator<LDValue> it = this.list.iterator();
        while (it.hasNext()) {
            it.next().B(jsonWriter);
        }
        jsonWriter.endArray();
    }
}
