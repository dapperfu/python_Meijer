package androidx.compose.foundation.text;

import android.view.KeyEvent;
import com.medallia.digital.mobilesdk.l3;
import e1.C13751c;
import e1.C13752d;
import java.util.List;
import kotlin.C17777P;
import kotlin.C17778Q;
import kotlin.C17781U;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import z1.C18428k;
import z1.C18431n;
import z1.CommitTextCommand;
import z1.DeleteSurroundingTextCommand;
import z1.InterfaceC18417E;
import z1.InterfaceC18426i;
import z1.TextFieldValue;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b$\b\u0000\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u0016*\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020\u0016*\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u001c\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010#\u001a\u00020\"H\u0002ø\u0001\u0000¢\u0006\u0004\b%\u0010&J(\u0010*\u001a\u00020\u00162\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0002\b(H\u0002¢\u0006\u0004\b*\u0010+J\u0018\u0010,\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"ø\u0001\u0000¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010;\u001a\u0004\b>\u0010=R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b \u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b*\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b4\u0010E\u001a\u0004\bF\u0010GR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010HR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010IR \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010JR\u001a\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b,\u0010K\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006L"}, d2 = {"Landroidx/compose/foundation/text/X;", "", "Landroidx/compose/foundation/text/B;", "state", "Lw0/Q;", "selectionManager", "Lz1/M;", "value", "", "editable", "singleLine", "Lw0/U;", "preparedSelectionState", "Lz1/E;", "offsetMapping", "Landroidx/compose/foundation/text/s0;", "undoManager", "Landroidx/compose/foundation/text/l;", "keyCombiner", "Landroidx/compose/foundation/text/u;", "keyMapping", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/text/input/a;", "imeAction", "<init>", "(Landroidx/compose/foundation/text/B;Lw0/Q;Lz1/M;ZZLw0/U;Lz1/E;Landroidx/compose/foundation/text/s0;Landroidx/compose/foundation/text/l;Landroidx/compose/foundation/text/u;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "Lz1/i;", "e", "(Ljava/util/List;)V", "f", "(Lz1/i;)V", "Le1/b;", "event", "Lz1/a;", "m", "(Landroid/view/KeyEvent;)Lz1/a;", "Lw0/P;", "Lkotlin/ExtensionFunctionType;", "block", "g", "(Lkotlin/jvm/functions/Function1;)V", "l", "(Landroid/view/KeyEvent;)Z", "a", "Landroidx/compose/foundation/text/B;", "j", "()Landroidx/compose/foundation/text/B;", "b", "Lw0/Q;", "h", "()Lw0/Q;", "c", "Lz1/M;", "getValue", "()Lz1/M;", "d", "Z", "getEditable", "()Z", "i", "Lw0/U;", "getPreparedSelectionState", "()Lw0/U;", "Lz1/E;", "getOffsetMapping", "()Lz1/E;", "Landroidx/compose/foundation/text/s0;", "k", "()Landroidx/compose/foundation/text/s0;", "Landroidx/compose/foundation/text/l;", "Landroidx/compose/foundation/text/u;", "Lkotlin/jvm/functions/Function1;", "I", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final B state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C17778Q selectionManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final TextFieldValue value;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean editable;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean singleLine;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final C17781U preparedSelectionState;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC18417E offsetMapping;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final s0 undoManager;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final C5822l keyCombiner;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5830u keyMapping;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Function1<TextFieldValue, Unit> onValueChange;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final int imeAction;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lz1/M;", "it", "", "a", "(Lz1/M;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<TextFieldValue, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f49507f = new a();

        a() {
            super(1);
        }

        public final void a(TextFieldValue textFieldValue) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
            a(textFieldValue);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw0/P;", "", "a", "(Lw0/P;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class b extends Lambda implements Function1<C17777P, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ EnumC5828s f49508f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ X f49509g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f49510h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw0/P;", "", "a", "(Lw0/P;)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends Lambda implements Function1<C17777P, Unit> {

            /* renamed from: f, reason: collision with root package name */
            public static final a f49511f = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C17777P c17777p) {
                a(c17777p);
                return Unit.f143329a;
            }

            public final void a(C17777P c17777p) {
                c17777p.A();
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw0/P;", "", "a", "(Lw0/P;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.foundation.text.X$b$b, reason: collision with other inner class name */
        static final class C1026b extends Lambda implements Function1<C17777P, Unit> {

            /* renamed from: f, reason: collision with root package name */
            public static final C1026b f49512f = new C1026b();

            C1026b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C17777P c17777p) {
                a(c17777p);
                return Unit.f143329a;
            }

            public final void a(C17777P c17777p) {
                c17777p.I();
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw0/P;", "Lz1/i;", "a", "(Lw0/P;)Lz1/i;"}, k = 3, mv = {1, 9, 0})
        static final class c extends Lambda implements Function1<C17777P, InterfaceC18426i> {

            /* renamed from: f, reason: collision with root package name */
            public static final c f49513f = new c();

            c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC18426i invoke(C17777P c17777p) {
                return new DeleteSurroundingTextCommand(androidx.compose.ui.text.y.i(c17777p.getSelection()) - c17777p.q(), 0);
            }
        }

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class i {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC5828s.values().length];
                try {
                    iArr[EnumC5828s.f49987r.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC5828s.f49988s.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC5828s.f49989t.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC5828s.f49971b.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC5828s.f49972c.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EnumC5828s.f49974e.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[EnumC5828s.f49973d.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[EnumC5828s.f49976g.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[EnumC5828s.f49975f.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[EnumC5828s.f49981l.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[EnumC5828s.f49982m.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[EnumC5828s.f49983n.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[EnumC5828s.f49984o.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[EnumC5828s.f49977h.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[EnumC5828s.f49978i.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[EnumC5828s.f49979j.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[EnumC5828s.f49980k.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[EnumC5828s.f49985p.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[EnumC5828s.f49986q.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[EnumC5828s.f49990u.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[EnumC5828s.f49991v.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[EnumC5828s.f49992w.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[EnumC5828s.f49993x.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[EnumC5828s.f49994y.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[EnumC5828s.f49995z.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[EnumC5828s.f49964S.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[EnumC5828s.f49965T.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[EnumC5828s.f49946A.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[EnumC5828s.f49947B.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr[EnumC5828s.f49948C.ordinal()] = 30;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr[EnumC5828s.f49955J.ordinal()] = 31;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr[EnumC5828s.f49956K.ordinal()] = 32;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr[EnumC5828s.f49958M.ordinal()] = 33;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr[EnumC5828s.f49957L.ordinal()] = 34;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr[EnumC5828s.f49959N.ordinal()] = 35;
                } catch (NoSuchFieldError unused35) {
                }
                try {
                    iArr[EnumC5828s.f49960O.ordinal()] = 36;
                } catch (NoSuchFieldError unused36) {
                }
                try {
                    iArr[EnumC5828s.f49961P.ordinal()] = 37;
                } catch (NoSuchFieldError unused37) {
                }
                try {
                    iArr[EnumC5828s.f49962Q.ordinal()] = 38;
                } catch (NoSuchFieldError unused38) {
                }
                try {
                    iArr[EnumC5828s.f49949D.ordinal()] = 39;
                } catch (NoSuchFieldError unused39) {
                }
                try {
                    iArr[EnumC5828s.f49950E.ordinal()] = 40;
                } catch (NoSuchFieldError unused40) {
                }
                try {
                    iArr[EnumC5828s.f49951F.ordinal()] = 41;
                } catch (NoSuchFieldError unused41) {
                }
                try {
                    iArr[EnumC5828s.f49952G.ordinal()] = 42;
                } catch (NoSuchFieldError unused42) {
                }
                try {
                    iArr[EnumC5828s.f49953H.ordinal()] = 43;
                } catch (NoSuchFieldError unused43) {
                }
                try {
                    iArr[EnumC5828s.f49954I.ordinal()] = 44;
                } catch (NoSuchFieldError unused44) {
                }
                try {
                    iArr[EnumC5828s.f49963R.ordinal()] = 45;
                } catch (NoSuchFieldError unused45) {
                }
                try {
                    iArr[EnumC5828s.f49966U.ordinal()] = 46;
                } catch (NoSuchFieldError unused46) {
                }
                try {
                    iArr[EnumC5828s.f49967V.ordinal()] = 47;
                } catch (NoSuchFieldError unused47) {
                }
                try {
                    iArr[EnumC5828s.f49968W.ordinal()] = 48;
                } catch (NoSuchFieldError unused48) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(EnumC5828s enumC5828s, X x10, Ref.BooleanRef booleanRef) {
            super(1);
            this.f49508f = enumC5828s;
            this.f49509g = x10;
            this.f49510h = booleanRef;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw0/P;", "Lz1/i;", "a", "(Lw0/P;)Lz1/i;"}, k = 3, mv = {1, 9, 0})
        static final class d extends Lambda implements Function1<C17777P, InterfaceC18426i> {

            /* renamed from: f, reason: collision with root package name */
            public static final d f49514f = new d();

            d() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC18426i invoke(C17777P c17777p) {
                int iL = c17777p.l();
                if (iL != -1) {
                    return new DeleteSurroundingTextCommand(0, iL - androidx.compose.ui.text.y.i(c17777p.getSelection()));
                }
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw0/P;", "Lz1/i;", "a", "(Lw0/P;)Lz1/i;"}, k = 3, mv = {1, 9, 0})
        static final class e extends Lambda implements Function1<C17777P, InterfaceC18426i> {

            /* renamed from: f, reason: collision with root package name */
            public static final e f49515f = new e();

            e() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC18426i invoke(C17777P c17777p) {
                Integer numT = c17777p.t();
                if (numT != null) {
                    return new DeleteSurroundingTextCommand(androidx.compose.ui.text.y.i(c17777p.getSelection()) - numT.intValue(), 0);
                }
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw0/P;", "Lz1/i;", "a", "(Lw0/P;)Lz1/i;"}, k = 3, mv = {1, 9, 0})
        static final class f extends Lambda implements Function1<C17777P, InterfaceC18426i> {

            /* renamed from: f, reason: collision with root package name */
            public static final f f49516f = new f();

            f() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC18426i invoke(C17777P c17777p) {
                Integer numM = c17777p.m();
                if (numM != null) {
                    return new DeleteSurroundingTextCommand(0, numM.intValue() - androidx.compose.ui.text.y.i(c17777p.getSelection()));
                }
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw0/P;", "Lz1/i;", "a", "(Lw0/P;)Lz1/i;"}, k = 3, mv = {1, 9, 0})
        static final class g extends Lambda implements Function1<C17777P, InterfaceC18426i> {

            /* renamed from: f, reason: collision with root package name */
            public static final g f49517f = new g();

            g() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC18426i invoke(C17777P c17777p) {
                Integer numI = c17777p.i();
                if (numI != null) {
                    return new DeleteSurroundingTextCommand(androidx.compose.ui.text.y.i(c17777p.getSelection()) - numI.intValue(), 0);
                }
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lw0/P;", "Lz1/i;", "a", "(Lw0/P;)Lz1/i;"}, k = 3, mv = {1, 9, 0})
        static final class h extends Lambda implements Function1<C17777P, InterfaceC18426i> {

            /* renamed from: f, reason: collision with root package name */
            public static final h f49518f = new h();

            h() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC18426i invoke(C17777P c17777p) {
                Integer numF = c17777p.f();
                if (numF != null) {
                    return new DeleteSurroundingTextCommand(0, numF.intValue() - androidx.compose.ui.text.y.i(c17777p.getSelection()));
                }
                return null;
            }
        }

        public final void a(C17777P c17777p) {
            TextFieldValue textFieldValueG;
            TextFieldValue textFieldValueC;
            switch (i.$EnumSwitchMapping$0[this.f49508f.ordinal()]) {
                case 1:
                    this.f49509g.getSelectionManager().q(false);
                    break;
                case 2:
                    this.f49509g.getSelectionManager().Z();
                    break;
                case 3:
                    this.f49509g.getSelectionManager().u();
                    break;
                case 4:
                    c17777p.b(a.f49511f);
                    break;
                case 5:
                    c17777p.c(C1026b.f49512f);
                    break;
                case 6:
                    c17777p.B();
                    break;
                case 7:
                    c17777p.J();
                    break;
                case 8:
                    c17777p.G();
                    break;
                case 9:
                    c17777p.D();
                    break;
                case 10:
                    c17777p.Q();
                    break;
                case 11:
                    c17777p.z();
                    break;
                case 12:
                    c17777p.c0();
                    break;
                case 13:
                    c17777p.b0();
                    break;
                case 14:
                    c17777p.P();
                    break;
                case 15:
                    c17777p.M();
                    break;
                case 16:
                    c17777p.N();
                    break;
                case 17:
                    c17777p.O();
                    break;
                case 18:
                    c17777p.L();
                    break;
                case 19:
                    c17777p.K();
                    break;
                case 20:
                    List<InterfaceC18426i> listY = c17777p.Y(c.f49513f);
                    if (listY != null) {
                        this.f49509g.e(listY);
                        break;
                    }
                    break;
                case 21:
                    List<InterfaceC18426i> listY2 = c17777p.Y(d.f49514f);
                    if (listY2 != null) {
                        this.f49509g.e(listY2);
                        break;
                    }
                    break;
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                    List<InterfaceC18426i> listY3 = c17777p.Y(e.f49515f);
                    if (listY3 != null) {
                        this.f49509g.e(listY3);
                        break;
                    }
                    break;
                case 23:
                    List<InterfaceC18426i> listY4 = c17777p.Y(f.f49516f);
                    if (listY4 != null) {
                        this.f49509g.e(listY4);
                        break;
                    }
                    break;
                case 24:
                    List<InterfaceC18426i> listY5 = c17777p.Y(g.f49517f);
                    if (listY5 != null) {
                        this.f49509g.e(listY5);
                        break;
                    }
                    break;
                case 25:
                    List<InterfaceC18426i> listY6 = c17777p.Y(h.f49518f);
                    if (listY6 != null) {
                        this.f49509g.e(listY6);
                        break;
                    }
                    break;
                case 26:
                    if (!this.f49509g.getSingleLine()) {
                        this.f49509g.f(new CommitTextCommand("\n", 1));
                        break;
                    } else {
                        this.f49509g.getState().n().invoke(androidx.compose.ui.text.input.a.j(this.f49509g.imeAction));
                        break;
                    }
                case 27:
                    if (!this.f49509g.getSingleLine()) {
                        this.f49509g.f(new CommitTextCommand("\t", 1));
                        break;
                    } else {
                        this.f49510h.f143735a = false;
                        break;
                    }
                case 28:
                    c17777p.R();
                    break;
                case 29:
                    c17777p.A().S();
                    break;
                case 30:
                    c17777p.I().S();
                    break;
                case 31:
                    c17777p.B().S();
                    break;
                case l3.f93325e /* 32 */:
                    c17777p.J().S();
                    break;
                case 33:
                    c17777p.G().S();
                    break;
                case 34:
                    c17777p.D().S();
                    break;
                case 35:
                    c17777p.P().S();
                    break;
                case 36:
                    c17777p.M().S();
                    break;
                case 37:
                    c17777p.N().S();
                    break;
                case 38:
                    c17777p.O().S();
                    break;
                case 39:
                    c17777p.Q().S();
                    break;
                case 40:
                    c17777p.z().S();
                    break;
                case 41:
                    c17777p.c0().S();
                    break;
                case 42:
                    c17777p.b0().S();
                    break;
                case 43:
                    c17777p.L().S();
                    break;
                case 44:
                    c17777p.K().S();
                    break;
                case 45:
                    c17777p.d();
                    break;
                case 46:
                    s0 undoManager = this.f49509g.getUndoManager();
                    if (undoManager != null) {
                        undoManager.b(c17777p.Z());
                    }
                    s0 undoManager2 = this.f49509g.getUndoManager();
                    if (undoManager2 != null && (textFieldValueG = undoManager2.g()) != null) {
                        this.f49509g.onValueChange.invoke(textFieldValueG);
                        break;
                    }
                    break;
                case 47:
                    s0 undoManager3 = this.f49509g.getUndoManager();
                    if (undoManager3 != null && (textFieldValueC = undoManager3.c()) != null) {
                        this.f49509g.onValueChange.invoke(textFieldValueC);
                        break;
                    }
                    break;
                case 48:
                    C5829t.b();
                    break;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C17777P c17777p) {
            a(c17777p);
            return Unit.f143329a;
        }
    }

    public /* synthetic */ X(B b10, C17778Q c17778q, TextFieldValue textFieldValue, boolean z10, boolean z11, C17781U c17781u, InterfaceC18417E interfaceC18417E, s0 s0Var, C5822l c5822l, InterfaceC5830u interfaceC5830u, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(b10, c17778q, textFieldValue, z10, z11, c17781u, interfaceC18417E, s0Var, c5822l, interfaceC5830u, function1, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private X(B b10, C17778Q c17778q, TextFieldValue textFieldValue, boolean z10, boolean z11, C17781U c17781u, InterfaceC18417E interfaceC18417E, s0 s0Var, C5822l c5822l, InterfaceC5830u interfaceC5830u, Function1<? super TextFieldValue, Unit> function1, int i10) {
        this.state = b10;
        this.selectionManager = c17778q;
        this.value = textFieldValue;
        this.editable = z10;
        this.singleLine = z11;
        this.preparedSelectionState = c17781u;
        this.offsetMapping = interfaceC18417E;
        this.undoManager = s0Var;
        this.keyCombiner = c5822l;
        this.keyMapping = interfaceC5830u;
        this.onValueChange = function1;
        this.imeAction = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(List<? extends InterfaceC18426i> list) {
        C18428k processor = this.state.getProcessor();
        List<? extends InterfaceC18426i> listM1 = CollectionsKt.m1(list);
        listM1.add(0, new C18431n());
        this.onValueChange.invoke(processor.b(listM1));
    }

    private final void g(Function1<? super C17777P, Unit> block) {
        C17777P c17777p = new C17777P(this.value, this.offsetMapping, this.state.l(), this.preparedSelectionState);
        block.invoke(c17777p);
        if (androidx.compose.ui.text.y.g(c17777p.getSelection(), this.value.getSelection()) && Intrinsics.e(c17777p.getAnnotatedString(), this.value.getText())) {
            return;
        }
        this.onValueChange.invoke(c17777p.Z());
    }

    /* renamed from: h, reason: from getter */
    public final C17778Q getSelectionManager() {
        return this.selectionManager;
    }

    /* renamed from: i, reason: from getter */
    public final boolean getSingleLine() {
        return this.singleLine;
    }

    /* renamed from: j, reason: from getter */
    public final B getState() {
        return this.state;
    }

    /* renamed from: k, reason: from getter */
    public final s0 getUndoManager() {
        return this.undoManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(InterfaceC18426i interfaceC18426i) {
        e(CollectionsKt.e(interfaceC18426i));
    }

    private final CommitTextCommand m(KeyEvent event) {
        Integer numA;
        if (!Z.a(event) || (numA = this.keyCombiner.a(event)) == null) {
            return null;
        }
        return new CommitTextCommand(J.a(new StringBuilder(), numA.intValue()).toString(), 1);
    }

    public final boolean l(KeyEvent event) {
        EnumC5828s enumC5828sA;
        CommitTextCommand commitTextCommandM = m(event);
        if (commitTextCommandM != null) {
            if (!this.editable) {
                return false;
            }
            f(commitTextCommandM);
            this.preparedSelectionState.b();
            return true;
        }
        if (!C13751c.e(C13752d.b(event), C13751c.INSTANCE.a()) || (enumC5828sA = this.keyMapping.a(event)) == null || (enumC5828sA.getEditsText() && !this.editable)) {
            return false;
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.f143735a = true;
        g(new b(enumC5828sA, this, booleanRef));
        s0 s0Var = this.undoManager;
        if (s0Var != null) {
            s0Var.a();
        }
        return booleanRef.f143735a;
    }

    public /* synthetic */ X(B b10, C17778Q c17778q, TextFieldValue textFieldValue, boolean z10, boolean z11, C17781U c17781u, InterfaceC18417E interfaceC18417E, s0 s0Var, C5822l c5822l, InterfaceC5830u interfaceC5830u, Function1 function1, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(b10, c17778q, (i11 & 4) != 0 ? new TextFieldValue((String) null, 0L, (androidx.compose.ui.text.y) null, 7, (DefaultConstructorMarker) null) : textFieldValue, (i11 & 8) != 0 ? true : z10, (i11 & 16) != 0 ? false : z11, c17781u, (i11 & 64) != 0 ? InterfaceC18417E.INSTANCE.a() : interfaceC18417E, (i11 & 128) != 0 ? null : s0Var, c5822l, (i11 & 512) != 0 ? C5832w.a() : interfaceC5830u, (i11 & 1024) != 0 ? a.f49507f : function1, i10, null);
    }
}
