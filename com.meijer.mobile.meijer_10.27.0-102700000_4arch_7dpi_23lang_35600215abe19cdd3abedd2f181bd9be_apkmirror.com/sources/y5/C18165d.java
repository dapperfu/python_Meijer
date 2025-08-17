package y5;

import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import androidx.view.c0;
import com.adobe.marketing.mobile.assurance.internal.B;
import com.adobe.marketing.mobile.assurance.internal.C6423e;
import com.adobe.marketing.mobile.assurance.internal.EnumC6425g;
import com.adobe.marketing.mobile.assurance.internal.EnumC6426h;
import com.adobe.marketing.mobile.assurance.internal.X;
import com.adobe.marketing.mobile.assurance.internal.Y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import v5.AbstractC17511c;
import y5.AbstractC18162a;

@Metadata(d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005*\u0001\u001f\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Ly5/d;", "Landroidx/lifecycle/c0;", "", "sessionId", "Lcom/adobe/marketing/mobile/assurance/internal/h;", "environment", "<init>", "(Ljava/lang/String;Lcom/adobe/marketing/mobile/assurance/internal/h;)V", "pin", "", "n", "(Ljava/lang/String;)V", "Ly5/a;", "action", "p", "(Ly5/a;)V", "a", "Ljava/lang/String;", "b", "Lcom/adobe/marketing/mobile/assurance/internal/h;", "Landroidx/compose/runtime/l0;", "Ly5/c;", "c", "Landroidx/compose/runtime/l0;", "_state", "Landroidx/compose/runtime/z1;", "d", "Landroidx/compose/runtime/z1;", "o", "()Landroidx/compose/runtime/z1;", "state", "y5/d$a", "e", "Ly5/d$a;", "assuranceStatusListener", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: y5.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18165d extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String sessionId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final EnumC6426h environment;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0<PinScreenState> _state;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final z1<PinScreenState> state;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a assuranceStatusListener;

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"y5/d$a", "Lcom/adobe/marketing/mobile/assurance/internal/B;", "", "a", "()V", "Lcom/adobe/marketing/mobile/assurance/internal/g;", "error", "b", "(Lcom/adobe/marketing/mobile/assurance/internal/g;)V", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: y5.d$a */
    public static final class a implements B {
        a() {
        }

        @Override // com.adobe.marketing.mobile.assurance.internal.B
        public void a() {
            C18165d.this._state.setValue(PinScreenState.b(C18165d.this.o().getValue(), null, AbstractC17511c.a.f164557a, 1, null));
        }

        @Override // com.adobe.marketing.mobile.assurance.internal.B
        public void b(EnumC6425g error) {
            C18165d.this._state.setValue(PinScreenState.b(C18165d.this.o().getValue(), null, new AbstractC17511c.Disconnected(error), 1, null));
        }
    }

    public C18165d(String sessionId, EnumC6426h environment) {
        Intrinsics.j(sessionId, "sessionId");
        Intrinsics.j(environment, "environment");
        this.sessionId = sessionId;
        this.environment = environment;
        InterfaceC5730l0<PinScreenState> interfaceC5730l0E = t1.e(new PinScreenState(null, null, 3, null), null, 2, null);
        this._state = interfaceC5730l0E;
        this.state = interfaceC5730l0E;
        this.assuranceStatusListener = new a();
    }

    private final void n(String pin) {
        Y yB = C6423e.f62233a.b();
        if (StringsKt.r0(this.sessionId)) {
            this._state.setValue(PinScreenState.b(this.state.getValue(), null, new AbstractC17511c.Disconnected(EnumC6425g.UNEXPECTED_ERROR), 1, null));
            return;
        }
        if (yB != null) {
            yB.b(this.sessionId, pin, this.environment, this.assuranceStatusListener, X.PIN);
        }
        this._state.setValue(PinScreenState.b(this.state.getValue(), null, AbstractC17511c.b.f164558a, 1, null));
    }

    public final z1<PinScreenState> o() {
        return this.state;
    }

    public final void p(AbstractC18162a action) {
        Intrinsics.j(action, "action");
        String pin = this.state.getValue().getPin();
        if (action instanceof AbstractC18162a.Number) {
            if (pin.length() >= 4) {
                return;
            }
            this._state.setValue(PinScreenState.b(this.state.getValue(), pin + ((AbstractC18162a.Number) action).getNumber(), null, 2, null));
            return;
        }
        if (action instanceof AbstractC18162a.c) {
            if (StringsKt.r0(pin)) {
                return;
            }
            this._state.setValue(PinScreenState.b(this.state.getValue(), StringsKt.F1(pin, 1), null, 2, null));
        } else {
            if (action instanceof AbstractC18162a.Connect) {
                n(((AbstractC18162a.Connect) action).getNumber());
                return;
            }
            if (!(action instanceof AbstractC18162a.C2741a)) {
                if (action instanceof AbstractC18162a.e) {
                    this._state.setValue(new PinScreenState(null, null, 3, null));
                }
            } else {
                Y yB = C6423e.f62233a.b();
                if (yB != null) {
                    yB.a();
                }
            }
        }
    }
}
