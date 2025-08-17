package I1;

import H1.m;
import Z.o0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0019\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00172\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u0007H\u0082\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b \u0010\u001cR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\"R.\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001b\u0010$\u0012\u0004\b)\u0010\u0003\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010,¨\u0006."}, d2 = {"LI1/b;", "", "<init>", "()V", "LI1/a;", "start", "end", "", "interpolationPoint", "a", "(LI1/a;LI1/a;F)LI1/a;", "fontScale", "", "d", "(F)I", "key", "e", "(I)F", "scaleKey", "fontScaleConverter", "", "g", "(FLI1/a;)V", "LZ/o0;", "table", "h", "(LZ/o0;FLI1/a;)V", "c", "(F)LI1/a;", "", "f", "(F)Z", "b", "", "[F", "CommonFontSizes", "LZ/o0;", "getSLookupTables", "()LZ/o0;", "setSLookupTables", "(LZ/o0;)V", "getSLookupTables$annotations", "sLookupTables", "", "[Ljava/lang/Object;", "LookupTablesWriteLock", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f13447a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float[] CommonFontSizes;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static volatile o0<a> sLookupTables;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final Object[] LookupTablesWriteLock;

    /* renamed from: e, reason: collision with root package name */
    public static final int f13451e;

    private final float e(int key) {
        return key / 100.0f;
    }

    static {
        b bVar = new b();
        f13447a = bVar;
        CommonFontSizes = new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
        sLookupTables = new o0<>(0, 1, null);
        Object[] objArr = new Object[0];
        LookupTablesWriteLock = objArr;
        synchronized (objArr) {
            bVar.h(sLookupTables, 1.15f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            bVar.h(sLookupTables, 1.3f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            bVar.h(sLookupTables, 1.5f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            bVar.h(sLookupTables, 1.8f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            bVar.h(sLookupTables, 2.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
            Unit unit = Unit.f142422a;
        }
        if (!(bVar.e(sLookupTables.i(0)) - 0.01f > 1.03f)) {
            m.b("You should only apply non-linear scaling to font scales > 1");
        }
        f13451e = 8;
    }

    private final a a(a start, a end, float interpolationPoint) {
        float[] fArr = CommonFontSizes;
        float[] fArr2 = new float[fArr.length];
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            float f10 = CommonFontSizes[i10];
            fArr2[i10] = d.f13456a.b(start.b(f10), end.b(f10), interpolationPoint);
        }
        return new c(CommonFontSizes, fArr2);
    }

    private final a c(float scaleKey) {
        return sLookupTables.e(d(scaleKey));
    }

    private final int d(float fontScale) {
        return (int) (fontScale * 100.0f);
    }

    private final void g(float scaleKey, a fontScaleConverter) {
        synchronized (LookupTablesWriteLock) {
            o0<a> o0VarClone = sLookupTables.clone();
            f13447a.h(o0VarClone, scaleKey, fontScaleConverter);
            sLookupTables = o0VarClone;
            Unit unit = Unit.f142422a;
        }
    }

    private b() {
    }

    private final void h(o0<a> table, float scaleKey, a fontScaleConverter) {
        table.j(d(scaleKey), fontScaleConverter);
    }

    public final a b(float fontScale) {
        a aVarN;
        if (!f(fontScale)) {
            return null;
        }
        a aVarC = f13447a.c(fontScale);
        if (aVarC != null) {
            return aVarC;
        }
        int iF = sLookupTables.f(d(fontScale));
        if (iF >= 0) {
            return sLookupTables.n(iF);
        }
        int i10 = -(iF + 1);
        int i11 = i10 - 1;
        float fE = 1.0f;
        if (i10 >= sLookupTables.m()) {
            c cVar = new c(new float[]{1.0f}, new float[]{fontScale});
            g(fontScale, cVar);
            return cVar;
        }
        if (i11 < 0) {
            float[] fArr = CommonFontSizes;
            aVarN = new c(fArr, fArr);
        } else {
            fE = e(sLookupTables.i(i11));
            aVarN = sLookupTables.n(i11);
        }
        a aVarA = a(aVarN, sLookupTables.n(i10), d.f13456a.a(0.0f, 1.0f, fE, e(sLookupTables.i(i10)), fontScale));
        g(fontScale, aVarA);
        return aVarA;
    }

    public final boolean f(float fontScale) {
        if (fontScale >= 1.03f) {
            return true;
        }
        return false;
    }
}
