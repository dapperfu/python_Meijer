package com.adobe.marketing.mobile.assurance.internal;

import Q5.InterfaceC5070b;
import android.app.Activity;
import android.content.Intent;
import com.adobe.marketing.mobile.assurance.internal.C6419a;
import com.adobe.marketing.mobile.assurance.internal.G;
import com.adobe.marketing.mobile.assurance.internal.ui.AssuranceActivity;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import x5.C18018a;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001cB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\tH\u0001¢\u0006\u0004\b\u001a\u0010\rJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\"\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0001¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010$R\u0014\u0010&\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010%¨\u0006'"}, d2 = {"Lcom/adobe/marketing/mobile/assurance/internal/A;", "", "Lcom/adobe/marketing/mobile/assurance/internal/X;", "authorizingPresentationType", "<init>", "(Lcom/adobe/marketing/mobile/assurance/internal/X;)V", "Lx5/a;", "assuranceFloatingButton", "(Lcom/adobe/marketing/mobile/assurance/internal/X;Lx5/a;)V", "Landroid/app/Activity;", "currentActivity", "", "h", "(Landroid/app/Activity;)V", "d", "()V", "", "closeCode", "e", "(I)V", "f", "Lcom/adobe/marketing/mobile/assurance/internal/G$c;", "newState", "g", "(Lcom/adobe/marketing/mobile/assurance/internal/G$c;)V", "activity", "c", "", "a", "()Z", "Lcom/adobe/marketing/mobile/assurance/internal/k;", "visibility", "", "message", "b", "(Lcom/adobe/marketing/mobile/assurance/internal/k;Ljava/lang/String;)V", "Lcom/adobe/marketing/mobile/assurance/internal/X;", "Lx5/a;", "button", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final X authorizingPresentationType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C18018a button;

    /* JADX WARN: Illegal instructions before constructor call */
    public A(X authorizingPresentationType) {
        Intrinsics.j(authorizingPresentationType, "authorizingPresentationType");
        InterfaceC5070b interfaceC5070bA = Q5.K.f().a();
        Intrinsics.i(interfaceC5070bA, "getInstance().appContextService");
        this(authorizingPresentationType, new C18018a(interfaceC5070bA));
    }

    private final void h(Activity currentActivity) {
        if (currentActivity == null || (currentActivity instanceof AssuranceActivity)) {
            return;
        }
        Intent intent = new Intent(currentActivity, (Class<?>) AssuranceActivity.class);
        intent.addFlags(65536);
        intent.addFlags(131072);
        currentActivity.startActivity(intent);
    }

    @JvmName
    public final boolean a() {
        C6419a.b value = C6423e.appState.b().getValue();
        if (value instanceof C6419a.b.Authorizing) {
            return (this.authorizingPresentationType == X.PIN && (((C6419a.b.Authorizing) value).getAssuranceAuthorization() instanceof C6419a.AbstractC1229a.PinConnect)) || (this.authorizingPresentationType == X.QUICK_CONNECT && (((C6419a.b.Authorizing) value).getAssuranceAuthorization() instanceof C6419a.AbstractC1229a.QuickConnect));
        }
        return false;
    }

    @JvmName
    public final void b(EnumC6429k visibility, String message) {
        if (visibility == null || message == null) {
            return;
        }
        C6423e.appState.d(visibility, message);
    }

    @JvmName
    public final void c(Activity activity) {
        Intrinsics.j(activity, "activity");
        if (F.f(activity)) {
            if (this.button.c()) {
                this.button.b();
            }
        } else if (this.button.c()) {
            this.button.e();
        }
        if (a()) {
            h(activity);
        }
    }

    @JvmName
    public final void d() {
        C6423e.appState.e(C6419a.b.C1232b.f62223a);
        C18018a c18018a = this.button;
        c18018a.e();
        c18018a.f(true);
        b(EnumC6429k.LOW, "Assurance connection established.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmName
    public final void e(int closeCode) {
        this.button.d();
        EnumC6425g enumC6425gA = C6428j.a(closeCode);
        boolean z10 = false;
        if (enumC6425gA == null) {
            C6423e.appState.e(new C6419a.b.Disconnected(null, z10, 3, 0 == true ? 1 : 0));
            b(EnumC6429k.LOW, "Assurance disconnected.");
        } else {
            if (a()) {
                return;
            }
            C6423e.appState.e(new C6419a.b.Disconnected(enumC6425gA, false));
            h(Q5.K.f().a().c());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmName
    public final void f() {
        C18018a c18018a = this.button;
        c18018a.e();
        c18018a.f(false);
        b(EnumC6429k.HIGH, "Assurance disconnected, attempting to reconnect ...");
        C6423e.appState.e(new C6419a.b.Disconnected(null, true, 1 == true ? 1 : 0, 0 == true ? 1 : 0));
    }

    @JvmName
    public final void g(G.c newState) {
        Intrinsics.j(newState, "newState");
        this.button.f(newState == G.c.OPEN);
    }

    public A(X authorizingPresentationType, C18018a assuranceFloatingButton) {
        Intrinsics.j(authorizingPresentationType, "authorizingPresentationType");
        Intrinsics.j(assuranceFloatingButton, "assuranceFloatingButton");
        this.authorizingPresentationType = authorizingPresentationType;
        this.button = assuranceFloatingButton;
    }
}
