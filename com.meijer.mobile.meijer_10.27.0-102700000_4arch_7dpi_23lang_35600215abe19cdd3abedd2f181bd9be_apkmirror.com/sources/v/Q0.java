package v;

import C.AbstractC2973p;
import F.InterfaceC3628z;
import androidx.view.AbstractC5985A;
import androidx.view.C5988D;
import java.util.Objects;

/* loaded from: classes.dex */
class Q0 {

    /* renamed from: a, reason: collision with root package name */
    private final F.E f163852a;

    /* renamed from: b, reason: collision with root package name */
    private final C5988D<AbstractC2973p> f163853b;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f163854a;

        static {
            int[] iArr = new int[InterfaceC3628z.a.values().length];
            f163854a = iArr;
            try {
                iArr[InterfaceC3628z.a.PENDING_OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f163854a[InterfaceC3628z.a.OPENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f163854a[InterfaceC3628z.a.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f163854a[InterfaceC3628z.a.CONFIGURED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f163854a[InterfaceC3628z.a.CLOSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f163854a[InterfaceC3628z.a.RELEASING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f163854a[InterfaceC3628z.a.CLOSED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f163854a[InterfaceC3628z.a.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private AbstractC2973p b() {
        return this.f163852a.c() ? AbstractC2973p.a(AbstractC2973p.b.OPENING) : AbstractC2973p.a(AbstractC2973p.b.PENDING_OPEN);
    }

    public AbstractC5985A<AbstractC2973p> a() {
        return this.f163853b;
    }

    public void c(InterfaceC3628z.a aVar, AbstractC2973p.a aVar2) {
        AbstractC2973p abstractC2973pB;
        switch (a.f163854a[aVar.ordinal()]) {
            case 1:
                abstractC2973pB = b();
                break;
            case 2:
                abstractC2973pB = AbstractC2973p.b(AbstractC2973p.b.OPENING, aVar2);
                break;
            case 3:
            case 4:
                abstractC2973pB = AbstractC2973p.b(AbstractC2973p.b.OPEN, aVar2);
                break;
            case 5:
            case 6:
                abstractC2973pB = AbstractC2973p.b(AbstractC2973p.b.CLOSING, aVar2);
                break;
            case 7:
            case 8:
                abstractC2973pB = AbstractC2973p.b(AbstractC2973p.b.CLOSED, aVar2);
                break;
            default:
                throw new IllegalStateException("Unknown internal camera state: " + aVar);
        }
        C.P.a("CameraStateMachine", "New public camera state " + abstractC2973pB + " from " + aVar + " and " + aVar2);
        if (Objects.equals(this.f163853b.e(), abstractC2973pB)) {
            return;
        }
        C.P.a("CameraStateMachine", "Publishing new public camera state " + abstractC2973pB);
        this.f163853b.m(abstractC2973pB);
    }

    Q0(F.E e10) {
        this.f163852a = e10;
        C5988D<AbstractC2973p> c5988d = new C5988D<>();
        this.f163853b = c5988d;
        c5988d.m(AbstractC2973p.a(AbstractC2973p.b.CLOSED));
    }
}
