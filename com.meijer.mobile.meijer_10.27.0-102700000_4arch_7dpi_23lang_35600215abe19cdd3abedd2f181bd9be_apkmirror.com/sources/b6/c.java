package b6;

import a6.f;
import androidx.compose.foundation.layout.C5658d;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u0010"}, d2 = {"Lb6/c;", "", "<init>", "()V", "La6/f$b;", "alignment", "Landroidx/compose/foundation/layout/d$e;", "a", "(La6/f$b;)Landroidx/compose/foundation/layout/d$e;", "", "b", "Ljava/util/Map;", "horizontalArrangementMap", "Landroidx/compose/foundation/layout/d$m;", "c", "verticalArrangementMap", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f59944a = new c();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Map<f.b, C5658d.e> horizontalArrangementMap;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Map<f.b, C5658d.m> verticalArrangementMap;

    static {
        f.b bVar = f.b.LEFT;
        C5658d c5658d = C5658d.f48555a;
        Pair pairA = TuplesKt.a(bVar, c5658d.g());
        Pair pairA2 = TuplesKt.a(f.b.RIGHT, c5658d.c());
        f.b bVar2 = f.b.CENTER;
        horizontalArrangementMap = MapsKt.o(pairA, pairA2, TuplesKt.a(bVar2, c5658d.b()));
        verticalArrangementMap = MapsKt.o(TuplesKt.a(f.b.TOP, c5658d.h()), TuplesKt.a(f.b.BOTTOM, c5658d.a()), TuplesKt.a(bVar2, c5658d.b()));
    }

    public final C5658d.e a(f.b alignment) {
        Intrinsics.j(alignment, "alignment");
        C5658d.e eVar = horizontalArrangementMap.get(alignment);
        return eVar == null ? C5658d.f48555a.b() : eVar;
    }

    private c() {
    }
}
