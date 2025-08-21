package q6;

import android.graphics.Paint;
import h6.C14478i;
import j6.InterfaceC14951c;
import java.util.List;
import p6.C16406a;
import p6.C16407b;
import p6.C16409d;
import r6.AbstractC16860b;

/* loaded from: classes4.dex */
public class s implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f158017a;

    /* renamed from: b, reason: collision with root package name */
    private final C16407b f158018b;

    /* renamed from: c, reason: collision with root package name */
    private final List<C16407b> f158019c;

    /* renamed from: d, reason: collision with root package name */
    private final C16406a f158020d;

    /* renamed from: e, reason: collision with root package name */
    private final C16409d f158021e;

    /* renamed from: f, reason: collision with root package name */
    private final C16407b f158022f;

    /* renamed from: g, reason: collision with root package name */
    private final a f158023g;

    /* renamed from: h, reason: collision with root package name */
    private final b f158024h;

    /* renamed from: i, reason: collision with root package name */
    private final float f158025i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f158026j;

    public enum a {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap b() {
            int iOrdinal = ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    return Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }
    }

    public enum b {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join b() {
            int iOrdinal = ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        return null;
                    }
                    return Paint.Join.BEVEL;
                }
                return Paint.Join.ROUND;
            }
            return Paint.Join.MITER;
        }
    }

    @Override // q6.c
    public InterfaceC14951c a(com.airbnb.lottie.o oVar, C14478i c14478i, AbstractC16860b abstractC16860b) {
        return new j6.t(oVar, abstractC16860b, this);
    }

    public a b() {
        return this.f158023g;
    }

    public C16406a c() {
        return this.f158020d;
    }

    public C16407b d() {
        return this.f158018b;
    }

    public b e() {
        return this.f158024h;
    }

    public List<C16407b> f() {
        return this.f158019c;
    }

    public float g() {
        return this.f158025i;
    }

    public String h() {
        return this.f158017a;
    }

    public C16409d i() {
        return this.f158021e;
    }

    public C16407b j() {
        return this.f158022f;
    }

    public boolean k() {
        return this.f158026j;
    }

    public s(String str, C16407b c16407b, List<C16407b> list, C16406a c16406a, C16409d c16409d, C16407b c16407b2, a aVar, b bVar, float f10, boolean z10) {
        this.f158017a = str;
        this.f158018b = c16407b;
        this.f158019c = list;
        this.f158020d = c16406a;
        this.f158021e = c16409d;
        this.f158022f = c16407b2;
        this.f158023g = aVar;
        this.f158024h = bVar;
        this.f158025i = f10;
        this.f158026j = z10;
    }
}
