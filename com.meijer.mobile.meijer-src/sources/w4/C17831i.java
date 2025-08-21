package w4;

import androidx.room.C6261e;
import androidx.room.G;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import u4.AbstractC17349b;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\u001a#\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\n\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e*\u00020\u00072\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aA\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e*\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00122\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/room/e;", "", "fromVersion", "toVersion", "", "d", "(Landroidx/room/e;II)Z", "Landroidx/room/G$e;", "startVersion", "endVersion", "a", "(Landroidx/room/G$e;II)Z", "start", "end", "", "Lu4/b;", "b", "(Landroidx/room/G$e;II)Ljava/util/List;", "", "result", "upgrade", "c", "(Landroidx/room/G$e;Ljava/util/List;ZII)Ljava/util/List;", "room-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
/* renamed from: w4.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17831i {
    public static final boolean a(G.e eVar, int i10, int i11) {
        Intrinsics.j(eVar, "<this>");
        Map<Integer, Map<Integer, AbstractC17349b>> mapE = eVar.e();
        if (!mapE.containsKey(Integer.valueOf(i10))) {
            return false;
        }
        Map<Integer, AbstractC17349b> mapK = mapE.get(Integer.valueOf(i10));
        if (mapK == null) {
            mapK = MapsKt.k();
        }
        return mapK.containsKey(Integer.valueOf(i11));
    }

    public static final List<AbstractC17349b> b(G.e eVar, int i10, int i11) {
        Intrinsics.j(eVar, "<this>");
        if (i10 == i11) {
            return CollectionsKt.m();
        }
        return c(eVar, new ArrayList(), i11 > i10, i10, i11);
    }

    private static final List<AbstractC17349b> c(G.e eVar, List<AbstractC17349b> list, boolean z10, int i10, int i11) {
        int iIntValue;
        boolean z11;
        while (true) {
            if (z10) {
                if (i10 >= i11) {
                    return list;
                }
            } else if (i10 <= i11) {
                return list;
            }
            Pair<Map<Integer, AbstractC17349b>, Iterable<Integer>> pairF = z10 ? eVar.f(i10) : eVar.g(i10);
            if (pairF == null) {
                return null;
            }
            Map<Integer, AbstractC17349b> mapA = pairF.a();
            Iterator<Integer> it = pairF.b().iterator();
            while (it.hasNext()) {
                iIntValue = it.next().intValue();
                if (!z10) {
                    if (i11 <= iIntValue && iIntValue < i10) {
                        AbstractC17349b abstractC17349b = mapA.get(Integer.valueOf(iIntValue));
                        Intrinsics.g(abstractC17349b);
                        list.add(abstractC17349b);
                        z11 = true;
                        break;
                    }
                } else if (i10 + 1 <= iIntValue && iIntValue <= i11) {
                    AbstractC17349b abstractC17349b2 = mapA.get(Integer.valueOf(iIntValue));
                    Intrinsics.g(abstractC17349b2);
                    list.add(abstractC17349b2);
                    z11 = true;
                    break;
                }
            }
            iIntValue = i10;
            z11 = false;
            if (!z11) {
                return null;
            }
            i10 = iIntValue;
        }
    }

    public static final boolean d(C6261e c6261e, int i10, int i11) {
        Intrinsics.j(c6261e, "<this>");
        if (i10 > i11 && c6261e.allowDestructiveMigrationOnDowngrade) {
            return false;
        }
        Set<Integer> setC = c6261e.c();
        return c6261e.requireMigration && (setC == null || !setC.contains(Integer.valueOf(i10)));
    }
}
