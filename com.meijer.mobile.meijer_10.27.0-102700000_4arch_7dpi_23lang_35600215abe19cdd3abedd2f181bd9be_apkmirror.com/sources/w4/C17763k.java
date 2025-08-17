package w4;

import Z.C;
import androidx.room.G;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u001aE\u0010\b\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\u000b\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"V", "LZ/C;", "map", "", "isRelationCollection", "Lkotlin/Function1;", "", "fetchBlock", "a", "(LZ/C;ZLkotlin/jvm/functions/Function1;)V", "", "MAX_BIND_PARAMETER_CNT", "I", "room-runtime_release"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/room/util/RelationUtil")
/* renamed from: w4.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final /* synthetic */ class C17763k {
    public static final <V> void a(C<V> map, boolean z10, Function1<? super C<V>, Unit> fetchBlock) {
        Intrinsics.j(map, "map");
        Intrinsics.j(fetchBlock, "fetchBlock");
        C<? extends V> c10 = new C<>(G.MAX_BIND_PARAMETER_CNT);
        int iM = map.m();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iM) {
            if (z10) {
                c10.i(map.g(i10), map.n(i10));
            } else {
                c10.i(map.g(i10), null);
            }
            i10++;
            i11++;
            if (i11 == 999) {
                fetchBlock.invoke(c10);
                if (!z10) {
                    map.j(c10);
                }
                c10.a();
                i11 = 0;
            }
        }
        if (i11 > 0) {
            fetchBlock.invoke(c10);
            if (z10) {
                return;
            }
            map.j(c10);
        }
    }
}
