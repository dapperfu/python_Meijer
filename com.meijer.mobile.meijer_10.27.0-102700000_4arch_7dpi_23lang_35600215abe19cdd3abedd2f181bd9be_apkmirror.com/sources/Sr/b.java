package Sr;

import Bj.p;
import Nr.g;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import je.C14886b;
import ru.d;
import yo.C18264a;

/* loaded from: classes11.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final C18264a f34690a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f34691b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC0768b f34692c;

    public interface a {
        C18264a g();
    }

    /* renamed from: Sr.b$b, reason: collision with other inner class name */
    public interface InterfaceC0768b {
        void a();
    }

    public static void b(Context context, InterfaceC0768b interfaceC0768b) {
        new b(context, interfaceC0768b).e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(DialogInterface dialogInterface, int i10) {
        this.f34690a.K(true);
        d();
    }

    private void d() {
        InterfaceC0768b interfaceC0768b = this.f34692c;
        if (interfaceC0768b != null) {
            interfaceC0768b.a();
        }
    }

    private void e() {
        if (this.f34690a.n()) {
            d();
        } else {
            f();
        }
    }

    private void f() {
        new C14886b(this.f34691b, p.f3059c).setCancelable(false).setMessage(g.f22689A).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: Sr.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f34689a.c(dialogInterface, i10);
            }
        }).create().show();
    }

    private b(Context context, InterfaceC0768b interfaceC0768b) {
        this.f34691b = context;
        this.f34692c = interfaceC0768b;
        this.f34690a = ((a) d.a(context.getApplicationContext(), a.class)).g();
    }
}
