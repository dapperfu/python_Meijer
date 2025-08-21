package com.okta.webauthenticationui;

import Qs.p;
import V2.CreationExtras;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.view.ComponentActivity;
import androidx.view.InterfaceC6131E;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import at.C6295b;
import com.okta.webauthenticationui.ForegroundActivity;
import com.okta.webauthenticationui.b;
import et.C13879c;
import et.C13880d;
import et.C13881e;
import et.C13882f;
import et.C13883g;
import et.C13884h;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0003R!\u0010\u0018\u001a\u00020\u00128FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0017\u0010\u0003\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/okta/webauthenticationui/ForegroundActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/content/Intent;", "intent", "", "s1", "(Landroid/content/Intent;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onPause", "onDestroy", "onNewIntent", "onBackPressed", "Lcom/okta/webauthenticationui/b;", "r", "Lkotlin/Lazy;", "r1", "()Lcom/okta/webauthenticationui/b;", "getViewModel$annotations", "viewModel", "Lat/b;", "s", "Lat/b;", "eventCoordinator", "Landroidx/lifecycle/E;", "Lcom/okta/webauthenticationui/b$c;", "t", "Landroidx/lifecycle/E;", "stateObserver", "u", "a", "web-authentication-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class ForegroundActivity extends AppCompatActivity {

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e0(Reflection.b(com.okta.webauthenticationui.b.class), new c(this), new b(this), new d(null, this));

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final C6295b eventCoordinator = p.f31427a.A();

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6131E<b.c> stateObserver = new InterfaceC6131E() { // from class: et.b
        @Override // androidx.view.InterfaceC6131E
        public final void onChanged(Object obj) {
            ForegroundActivity.t1(this.f130890a, (b.c) obj);
        }
    };

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/okta/webauthenticationui/ForegroundActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "a", "(Landroid/content/Context;)Landroid/content/Intent;", "Landroid/net/Uri;", "uri", "b", "(Landroid/content/Context;Landroid/net/Uri;)Landroid/content/Intent;", "", "ACTION_REDIRECT", "Ljava/lang/String;", "web-authentication-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.okta.webauthenticationui.ForegroundActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Intent a(Context context) {
            Intrinsics.j(context, "context");
            return new Intent(context, (Class<?>) ForegroundActivity.class);
        }

        public final Intent b(Context context, Uri uri) {
            Intrinsics.j(context, "context");
            Intent intent = new Intent(context, (Class<?>) ForegroundActivity.class);
            intent.setAction("com.okta.webauthenticationui.ForegroundActivity.redirect");
            intent.setData(uri);
            intent.addFlags(603979776);
            return intent;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class b extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f120813f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f120813f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f120813f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class c extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f120814f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f120814f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f120814f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class d extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f120815f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f120816g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f120815f = function0;
            this.f120816g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f120815f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f120816g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t1(ForegroundActivity foregroundActivity, b.c state) {
        Intrinsics.j(state, "state");
        if (Intrinsics.e(state, b.c.C1980c.f120866a)) {
            foregroundActivity.finish();
        } else if (state instanceof b.c.d) {
            foregroundActivity.r1().q(foregroundActivity, ((b.c.d) state).getUrlString());
        } else if (!Intrinsics.e(state, b.c.C1979b.f120865a) && !Intrinsics.e(state, b.c.a.f120864a)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        Intrinsics.j(intent, "intent");
        super.onNewIntent(intent);
        this.eventCoordinator.a(C13882f.f130894a);
        s1(intent);
    }

    public final com.okta.webauthenticationui.b r1() {
        return (com.okta.webauthenticationui.b) this.viewModel.getValue();
    }

    private final void s1(Intent intent) {
        if (Intrinsics.e(intent.getAction(), "com.okta.webauthenticationui.ForegroundActivity.redirect")) {
            r1().r(intent.getData());
            finish();
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        this.eventCoordinator.a(C13879c.f130891a);
        r1().o();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.eventCoordinator.a(C13880d.f130892a);
        Intent intent = getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        s1(intent);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.eventCoordinator.a(C13881e.f130893a);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.eventCoordinator.a(C13883g.f130895a);
        r1().p().n(this.stateObserver);
        if (isFinishing()) {
            r1().o();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.eventCoordinator.a(C13884h.f130896a);
        r1().s(this);
        r1().p().i(this, this.stateObserver);
    }
}
