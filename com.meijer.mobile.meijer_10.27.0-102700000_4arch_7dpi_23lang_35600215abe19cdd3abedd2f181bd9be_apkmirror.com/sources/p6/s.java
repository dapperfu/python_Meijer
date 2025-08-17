package p6;

import android.graphics.Paint;
import g6.C14209i;
import i6.InterfaceC14692c;
import java.util.List;
import o6.C15997a;
import o6.C15998b;
import o6.C16000d;
import q6.AbstractC16472b;

/* loaded from: classes4.dex */
public class s implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f155613a;

    /* renamed from: b, reason: collision with root package name */
    private final C15998b f155614b;

    /* renamed from: c, reason: collision with root package name */
    private final List<C15998b> f155615c;

    /* renamed from: d, reason: collision with root package name */
    private final C15997a f155616d;

    /* renamed from: e, reason: collision with root package name */
    private final C16000d f155617e;

    /* renamed from: f, reason: collision with root package name */
    private final C15998b f155618f;

    /* renamed from: g, reason: collision with root package name */
    private final a f155619g;

    /* renamed from: h, reason: collision with root package name */
    private final b f155620h;

    /* renamed from: i, reason: collision with root package name */
    private final float f155621i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f155622j;

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

    @Override // p6.c
    public InterfaceC14692c a(com.airbnb.lottie.o oVar, C14209i c14209i, AbstractC16472b abstractC16472b) {
        return new i6.t(oVar, abstractC16472b, this);
    }

    public a b() {
        return this.f155619g;
    }

    public C15997a c() {
        return this.f155616d;
    }

    public C15998b d() {
        return this.f155614b;
    }

    public b e() {
        return this.f155620h;
    }

    public List<C15998b> f() {
        return this.f155615c;
    }

    public float g() {
        return this.f155621i;
    }

    public String h() {
        return this.f155613a;
    }

    public C16000d i() {
        return this.f155617e;
    }

    public C15998b j() {
        return this.f155618f;
    }

    public boolean k() {
        return this.f155622j;
    }

    public s(String str, C15998b c15998b, List<C15998b> list, C15997a c15997a, C16000d c16000d, C15998b c15998b2, a aVar, b bVar, float f10, boolean z10) {
        this.f155613a = str;
        this.f155614b = c15998b;
        this.f155615c = list;
        this.f155616d = c15997a;
        this.f155617e = c16000d;
        this.f155618f = c15998b2;
        this.f155619g = aVar;
        this.f155620h = bVar;
        this.f155621i = f10;
        this.f155622j = z10;
    }
}
