package cm;

import Ul.e;
import com.meijer.mobile.home.service.models.homecard.HomeGetCardsResponseItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "Lcom/meijer/mobile/home/service/models/homecard/HomeGetCardsResponseItem;", "LUl/e;", "a", "(Ljava/util/List;)Ljava/util/List;", "service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: cm.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6415c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [Ul.e$e] */
    /* JADX WARN: Type inference failed for: r2v2, types: [Ul.e$f, Ul.e$f$c] */
    /* JADX WARN: Type inference failed for: r2v3, types: [Ul.e$c, Ul.e$c$b] */
    /* JADX WARN: Type inference failed for: r2v4, types: [Ul.e$c, Ul.e$c$a] */
    /* JADX WARN: Type inference failed for: r2v5, types: [Ul.e$f, Ul.e$f$b$a] */
    /* JADX WARN: Type inference failed for: r2v6, types: [Ul.e$f, Ul.e$f$b$b] */
    /* JADX WARN: Type inference failed for: r2v7, types: [Ul.e$f, Ul.e$f$b$c] */
    /* JADX WARN: Type inference failed for: r2v8, types: [Ul.e$f, Ul.e$f$d$a] */
    public static final List<e> a(List<HomeGetCardsResponseItem> list) {
        Intrinsics.j(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String id2 = ((HomeGetCardsResponseItem) it.next()).getId();
            e.f.a aVar = e.f.a.f36123d;
            boolean zE = Intrinsics.e(id2, aVar.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String());
            e.f.a aVar2 = aVar;
            if (!zE) {
                ?? r22 = e.f.c.f36127d;
                boolean zE2 = Intrinsics.e(id2, r22.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String());
                aVar2 = r22;
                if (!zE2) {
                    ?? r23 = e.c.b.f36111b;
                    boolean zE3 = Intrinsics.e(id2, r23.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String());
                    aVar2 = r23;
                    if (!zE3) {
                        ?? r24 = e.c.a.f36110b;
                        boolean zE4 = Intrinsics.e(id2, r24.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String());
                        aVar2 = r24;
                        if (!zE4) {
                            ?? r25 = e.f.b.a.f36124d;
                            boolean zE5 = Intrinsics.e(id2, r25.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String());
                            aVar2 = r25;
                            if (!zE5) {
                                ?? r26 = e.f.b.C0793b.f36125d;
                                boolean zE6 = Intrinsics.e(id2, r26.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String());
                                aVar2 = r26;
                                if (!zE6) {
                                    ?? r27 = e.f.b.c.f36126d;
                                    boolean zE7 = Intrinsics.e(id2, r27.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String());
                                    aVar2 = r27;
                                    if (!zE7) {
                                        ?? r28 = e.f.d.a.f36129e;
                                        boolean zE8 = Intrinsics.e(id2, r28.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String());
                                        aVar2 = r28;
                                        if (!zE8) {
                                            aVar2 = Intrinsics.e(id2, "rewards") ? e.C0792e.f36119a : null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (aVar2 != null) {
                arrayList.add(aVar2);
            }
        }
        return arrayList;
    }
}
