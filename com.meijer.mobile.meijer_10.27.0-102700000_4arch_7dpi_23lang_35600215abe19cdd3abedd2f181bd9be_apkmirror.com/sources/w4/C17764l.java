package w4;

import Z.C5503a;
import androidx.room.G;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a{\u0010\u000b\u001a\u00020\t\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u00022\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00042\u0006\u0010\u0007\u001a\u00020\u00062.\u0010\n\u001a*\u0012 \u0012\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0004\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a[\u0010\u000e\u001a\u00020\t\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u0007\u001a\u00020\u00062\u001e\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "K", "V", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "map", "", "isRelationCollection", "Lkotlin/Function1;", "", "fetchBlock", "b", "(Ljava/util/HashMap;ZLkotlin/jvm/functions/Function1;)V", "LZ/a;", "a", "(LZ/a;ZLkotlin/jvm/functions/Function1;)V", "room-runtime_release"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/room/util/RelationUtil")
/* renamed from: w4.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final /* synthetic */ class C17764l {
    public static final <K, V> void a(C5503a<K, V> map, boolean z10, Function1<? super C5503a<K, V>, Unit> fetchBlock) {
        Intrinsics.j(map, "map");
        Intrinsics.j(fetchBlock, "fetchBlock");
        C5503a c5503a = new C5503a(G.MAX_BIND_PARAMETER_CNT);
        int size = map.getSize();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (z10) {
                c5503a.put(map.g(i10), map.k(i10));
            } else {
                c5503a.put(map.g(i10), null);
            }
            i10++;
            i11++;
            if (i11 == 999) {
                fetchBlock.invoke(c5503a);
                if (!z10) {
                    map.putAll(c5503a);
                }
                c5503a.clear();
                i11 = 0;
            }
        }
        if (i11 > 0) {
            fetchBlock.invoke(c5503a);
            if (z10) {
                return;
            }
            map.putAll(c5503a);
        }
    }

    public static final <K, V> void b(HashMap<K, V> map, boolean z10, Function1<? super HashMap<K, V>, Unit> fetchBlock) {
        int i10;
        Intrinsics.j(map, "map");
        Intrinsics.j(fetchBlock, "fetchBlock");
        HashMap map2 = new HashMap(G.MAX_BIND_PARAMETER_CNT);
        loop0: while (true) {
            i10 = 0;
            for (K k10 : map.keySet()) {
                Intrinsics.i(k10, "next(...)");
                if (z10) {
                    map2.put(k10, map.get(k10));
                } else {
                    map2.put(k10, null);
                }
                i10++;
                if (i10 == 999) {
                    fetchBlock.invoke(map2);
                    if (!z10) {
                        map.putAll(map2);
                    }
                    map2.clear();
                }
            }
            break loop0;
        }
        if (i10 > 0) {
            fetchBlock.invoke(map2);
            if (z10) {
                return;
            }
            map.putAll(map2);
        }
    }
}
