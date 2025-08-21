package fj;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\n\u001a\u00020\u0001*\u00020\u00012\n\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000b*\n\u0010\f\"\u00020\u00072\u00020\u0007¨\u0006\r"}, d2 = {"", "Lfj/i;", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "code", "a", "(Ljava/lang/Iterable;Ljava/lang/String;)Lfj/i;", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "b", "(Lfj/i;I)Lfj/i;", "EntryNumber", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class l {
    public static final Entry a(Iterable<Entry> iterable, String code) {
        Entry next;
        Intrinsics.j(iterable, "<this>");
        Intrinsics.j(code, "code");
        Iterator<Entry> it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.e(next.m().getCode(), code)) {
                break;
            }
        }
        return next;
    }

    public static final Entry b(Entry entry, int i10) {
        Intrinsics.j(entry, "<this>");
        return Entry.b(entry, 0, Co.i.a(entry.m(), i10), 0.0d, 0.0d, 0.0d, null, null, null, null, null, null, null, null, null, false, 32765, null);
    }
}
