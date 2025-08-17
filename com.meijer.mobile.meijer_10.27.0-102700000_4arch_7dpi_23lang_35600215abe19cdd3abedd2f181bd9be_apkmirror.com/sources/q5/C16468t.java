package q5;

import android.content.Context;
import d5.InterfaceC13485a;
import kotlin.Metadata;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lq5/t;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ld5/a;", "a", "(Landroid/content/Context;)Ld5/a;", "b", "Ld5/a;", "instance", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: q5.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16468t {

    /* renamed from: a, reason: collision with root package name */
    public static final C16468t f156806a = new C16468t();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static InterfaceC13485a instance;

    public final synchronized InterfaceC13485a a(Context context) {
        InterfaceC13485a interfaceC13485aA;
        interfaceC13485aA = instance;
        if (interfaceC13485aA == null) {
            interfaceC13485aA = new InterfaceC13485a.C2001a().b(FilesKt.r(C16458j.n(context), "image_cache")).a();
            instance = interfaceC13485aA;
        }
        return interfaceC13485aA;
    }

    private C16468t() {
    }
}
