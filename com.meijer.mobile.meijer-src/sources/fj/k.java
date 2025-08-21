package fj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfj/j;", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "a", "(Lfj/j;I)Lfj/j;", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class k {
    public static final EntryChange a(EntryChange entryChange, int i10) {
        Intrinsics.j(entryChange, "<this>");
        Entry entry = entryChange.getEntry();
        return EntryChange.b(entryChange, entry != null ? l.b(entry, i10) : null, null, null, 0.0d, 0.0d, 30, null);
    }
}
