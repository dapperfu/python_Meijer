package Sr;

import Cj.p;
import Nr.g;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import le.C15485b;
import nu.d;
import yo.C18335a;

/* loaded from: classes12.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final C18335a f35756a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f35757b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC0789b f35758c;

    public interface a {
        C18335a g();
    }

    /* renamed from: Sr.b$b, reason: collision with other inner class name */
    public interface InterfaceC0789b {
        void a();
    }

    public static void b(Context context, InterfaceC0789b interfaceC0789b) {
        new b(context, interfaceC0789b).e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(DialogInterface dialogInterface, int i10) {
        this.f35756a.K(true);
        d();
    }

    private void d() {
        InterfaceC0789b interfaceC0789b = this.f35758c;
        if (interfaceC0789b != null) {
            interfaceC0789b.a();
        }
    }

    private void e() {
        if (this.f35756a.n()) {
            d();
        } else {
            f();
        }
    }

    private void f() {
        new C15485b(this.f35757b, p.f5104c).setCancelable(false).setMessage(g.f22645A).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: Sr.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f35755a.c(dialogInterface, i10);
            }
        }).create().show();
    }

    private b(Context context, InterfaceC0789b interfaceC0789b) {
        this.f35757b = context;
        this.f35758c = interfaceC0789b;
        this.f35756a = ((a) d.a(context.getApplicationContext(), a.class)).g();
    }
}
