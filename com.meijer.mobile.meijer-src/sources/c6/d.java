package c6;

import H1.h;
import b6.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lc6/d;", "", "<init>", "()V", "Lb6/f$b;", "horizontalAlignment", "", "offsetPercent", "LH1/h;", "screenWidthDp", "a", "(Lb6/f$b;IF)F", "verticalAlignment", "screenHeightDp", "b", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f61434a = new d();

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[f.b.values().length];
            try {
                iArr[f.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f.b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[f.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final float a(f.b horizontalAlignment, int offsetPercent, float screenWidthDp) {
        Intrinsics.j(horizontalAlignment, "horizontalAlignment");
        float fP = h.p((offsetPercent * screenWidthDp) / 100);
        int i10 = a.$EnumSwitchMapping$0[horizontalAlignment.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? h.p(0) : h.p(0) : h.p(-fP) : fP;
    }

    public final float b(f.b verticalAlignment, int offsetPercent, float screenHeightDp) {
        Intrinsics.j(verticalAlignment, "verticalAlignment");
        float fP = h.p((offsetPercent * screenHeightDp) / 100);
        int i10 = a.$EnumSwitchMapping$0[verticalAlignment.ordinal()];
        return i10 != 3 ? i10 != 4 ? i10 != 5 ? h.p(0) : h.p(-fP) : fP : h.p(0);
    }

    private d() {
    }
}
