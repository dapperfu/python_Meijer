package v;

import C.AbstractC3031p;
import F.InterfaceC3290z;
import androidx.view.AbstractC6127A;
import androidx.view.C6130D;
import java.util.Objects;

/* loaded from: classes.dex */
class Q0 {

    /* renamed from: a, reason: collision with root package name */
    private final F.E f164886a;

    /* renamed from: b, reason: collision with root package name */
    private final C6130D<AbstractC3031p> f164887b;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f164888a;

        static {
            int[] iArr = new int[InterfaceC3290z.a.values().length];
            f164888a = iArr;
            try {
                iArr[InterfaceC3290z.a.PENDING_OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f164888a[InterfaceC3290z.a.OPENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f164888a[InterfaceC3290z.a.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f164888a[InterfaceC3290z.a.CONFIGURED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f164888a[InterfaceC3290z.a.CLOSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f164888a[InterfaceC3290z.a.RELEASING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f164888a[InterfaceC3290z.a.CLOSED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f164888a[InterfaceC3290z.a.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private AbstractC3031p b() {
        return this.f164886a.c() ? AbstractC3031p.a(AbstractC3031p.b.OPENING) : AbstractC3031p.a(AbstractC3031p.b.PENDING_OPEN);
    }

    public AbstractC6127A<AbstractC3031p> a() {
        return this.f164887b;
    }

    public void c(InterfaceC3290z.a aVar, AbstractC3031p.a aVar2) {
        AbstractC3031p abstractC3031pB;
        switch (a.f164888a[aVar.ordinal()]) {
            case 1:
                abstractC3031pB = b();
                break;
            case 2:
                abstractC3031pB = AbstractC3031p.b(AbstractC3031p.b.OPENING, aVar2);
                break;
            case 3:
            case 4:
                abstractC3031pB = AbstractC3031p.b(AbstractC3031p.b.OPEN, aVar2);
                break;
            case 5:
            case 6:
                abstractC3031pB = AbstractC3031p.b(AbstractC3031p.b.CLOSING, aVar2);
                break;
            case 7:
            case 8:
                abstractC3031pB = AbstractC3031p.b(AbstractC3031p.b.CLOSED, aVar2);
                break;
            default:
                throw new IllegalStateException("Unknown internal camera state: " + aVar);
        }
        C.P.a("CameraStateMachine", "New public camera state " + abstractC3031pB + " from " + aVar + " and " + aVar2);
        if (Objects.equals(this.f164887b.e(), abstractC3031pB)) {
            return;
        }
        C.P.a("CameraStateMachine", "Publishing new public camera state " + abstractC3031pB);
        this.f164887b.m(abstractC3031pB);
    }

    Q0(F.E e10) {
        this.f164886a = e10;
        C6130D<AbstractC3031p> c6130d = new C6130D<>();
        this.f164887b = c6130d;
        c6130d.m(AbstractC3031p.a(AbstractC3031p.b.CLOSED));
    }
}
