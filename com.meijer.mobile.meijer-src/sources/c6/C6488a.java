package c6;

import P0.e;
import b6.f;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u0010"}, d2 = {"Lc6/a;", "", "<init>", "()V", "Lb6/f$b;", "alignment", "LP0/e$c;", "a", "(Lb6/f$b;)LP0/e$c;", "", "b", "Ljava/util/Map;", "verticalAlignmentMap", "LP0/e$b;", "c", "horizontalAlignmentMap", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: c6.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6488a {

    /* renamed from: a, reason: collision with root package name */
    public static final C6488a f61412a = new C6488a();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Map<f.b, e.c> verticalAlignmentMap;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Map<f.b, e.b> horizontalAlignmentMap;

    static {
        f.b bVar = f.b.TOP;
        e.Companion companion = e.INSTANCE;
        Pair pairA = TuplesKt.a(bVar, companion.l());
        Pair pairA2 = TuplesKt.a(f.b.BOTTOM, companion.a());
        f.b bVar2 = f.b.CENTER;
        verticalAlignmentMap = MapsKt.o(pairA, pairA2, TuplesKt.a(bVar2, companion.i()));
        horizontalAlignmentMap = MapsKt.o(TuplesKt.a(f.b.LEFT, companion.k()), TuplesKt.a(f.b.RIGHT, companion.j()), TuplesKt.a(bVar2, companion.g()));
    }

    public final e.c a(f.b alignment) {
        Intrinsics.j(alignment, "alignment");
        e.c cVar = verticalAlignmentMap.get(alignment);
        return cVar == null ? e.INSTANCE.i() : cVar;
    }

    private C6488a() {
    }
}
