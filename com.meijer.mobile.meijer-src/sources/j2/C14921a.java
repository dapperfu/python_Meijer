package j2;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lj2/a;", "", "<init>", "()V", "Landroid/os/Bundle;", "bundle", "", "key", "Landroid/util/Size;", "value", "", "a", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/util/Size;)V", "Landroid/util/SizeF;", "b", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/util/SizeF;)V", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: j2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C14921a {

    /* renamed from: a, reason: collision with root package name */
    public static final C14921a f139759a = new C14921a();

    private C14921a() {
    }

    @JvmStatic
    public static final void a(Bundle bundle, String key, Size value) {
        bundle.putSize(key, value);
    }

    @JvmStatic
    public static final void b(Bundle bundle, String key, SizeF value) {
        bundle.putSizeF(key, value);
    }
}
