package qb;

import android.content.Context;
import android.content.DialogInterface;
import cb.C6380a;
import cb.C6381b;

/* renamed from: qb.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16487a {

    /* renamed from: a, reason: collision with root package name */
    private static final C6380a f156986a = C6381b.a(C16487a.class.getName());

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qb.a$a, reason: collision with other inner class name */
    class DialogInterfaceOnCancelListenerC2432a implements DialogInterface.OnCancelListener, DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final Context f156987a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC16488b f156988b;

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (i10 == -2) {
                C6380a unused = C16487a.f156986a;
                this.f156988b.b(this.f156987a);
            } else {
                if (i10 != -1) {
                    return;
                }
                C6380a unused2 = C16487a.f156986a;
                this.f156988b.a(this.f156987a);
            }
        }

        public DialogInterfaceOnCancelListenerC2432a(Context context, InterfaceC16488b interfaceC16488b) {
            this.f156987a = context;
            this.f156988b = interfaceC16488b;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            C6380a unused = C16487a.f156986a;
        }
    }
}
