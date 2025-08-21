package androidx.room;

import androidx.room.C6273q;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0000¢\u0006\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001c\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/room/u;", "", "Landroidx/room/q$b;", "observer", "", "tableIds", "", "", "tableNames", "<init>", "(Landroidx/room/q$b;[I[Ljava/lang/String;)V", "", "", "invalidatedTablesIds", "", "c", "(Ljava/util/Set;)V", "invalidatedTablesNames", "d", "a", "Landroidx/room/q$b;", "()Landroidx/room/q$b;", "b", "[I", "()[I", "[Ljava/lang/String;", "Ljava/util/Set;", "singleTableSet", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.room.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6276u {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C6273q.b observer;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int[] tableIds;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String[] tableNames;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Set<String> singleTableSet;

    public C6276u(C6273q.b observer, int[] tableIds, String[] tableNames) {
        Intrinsics.j(observer, "observer");
        Intrinsics.j(tableIds, "tableIds");
        Intrinsics.j(tableNames, "tableNames");
        this.observer = observer;
        this.tableIds = tableIds;
        this.tableNames = tableNames;
        if (tableIds.length != tableNames.length) {
            throw new IllegalStateException("Check failed.");
        }
        this.singleTableSet = !(tableNames.length == 0) ? SetsKt.d(tableNames[0]) : SetsKt.e();
    }

    /* renamed from: a, reason: from getter */
    public final C6273q.b getObserver() {
        return this.observer;
    }

    /* renamed from: b, reason: from getter */
    public final int[] getTableIds() {
        return this.tableIds;
    }

    public final void c(Set<Integer> invalidatedTablesIds) {
        Set<String> setE;
        Intrinsics.j(invalidatedTablesIds, "invalidatedTablesIds");
        int[] iArr = this.tableIds;
        int length = iArr.length;
        if (length != 0) {
            int i10 = 0;
            if (length != 1) {
                Set setB = SetsKt.b();
                int[] iArr2 = this.tableIds;
                int length2 = iArr2.length;
                int i11 = 0;
                while (i10 < length2) {
                    int i12 = i11 + 1;
                    if (invalidatedTablesIds.contains(Integer.valueOf(iArr2[i10]))) {
                        setB.add(this.tableNames[i11]);
                    }
                    i10++;
                    i11 = i12;
                }
                setE = SetsKt.a(setB);
            } else {
                setE = invalidatedTablesIds.contains(Integer.valueOf(iArr[0])) ? this.singleTableSet : SetsKt.e();
            }
        } else {
            setE = SetsKt.e();
        }
        if (setE.isEmpty()) {
            return;
        }
        this.observer.c(setE);
    }

    public final void d(Set<String> invalidatedTablesNames) {
        Set<String> setE;
        Intrinsics.j(invalidatedTablesNames, "invalidatedTablesNames");
        int length = this.tableNames.length;
        if (length == 0) {
            setE = SetsKt.e();
        } else if (length != 1) {
            Set setB = SetsKt.b();
            for (String str : invalidatedTablesNames) {
                String[] strArr = this.tableNames;
                int length2 = strArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length2) {
                        String str2 = strArr[i10];
                        if (StringsKt.H(str2, str, true)) {
                            setB.add(str2);
                            break;
                        }
                        i10++;
                    }
                }
            }
            setE = SetsKt.a(setB);
        } else {
            Set<String> set = invalidatedTablesNames;
            if ((set instanceof Collection) && set.isEmpty()) {
                setE = SetsKt.e();
            } else {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    if (StringsKt.H((String) it.next(), this.tableNames[0], true)) {
                        setE = this.singleTableSet;
                        break;
                    }
                }
                setE = SetsKt.e();
            }
        }
        if (setE.isEmpty()) {
            return;
        }
        this.observer.c(setE);
    }
}
