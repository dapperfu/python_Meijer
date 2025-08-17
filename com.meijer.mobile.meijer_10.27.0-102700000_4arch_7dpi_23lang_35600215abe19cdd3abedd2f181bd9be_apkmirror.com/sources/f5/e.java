package f5;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import c5.C6360f;
import c5.EnumC6361g;
import c5.t;
import f5.i;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kw.w;
import l5.C15376l;
import m5.AbstractC15553c;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013¨\u0006\u0014"}, d2 = {"Lf5/e;", "Lf5/i;", "Landroid/net/Uri;", "data", "Ll5/l;", "options", "<init>", "(Landroid/net/Uri;Ll5/l;)V", "Landroid/os/Bundle;", "d", "()Landroid/os/Bundle;", "Lf5/h;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "b", "(Landroid/net/Uri;)Z", "c", "Landroid/net/Uri;", "Ll5/l;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class e implements i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Uri data;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C15376l options;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lf5/e$a;", "Lf5/i$a;", "Landroid/net/Uri;", "<init>", "()V", "data", "", "c", "(Landroid/net/Uri;)Z", "Ll5/l;", "options", "LZ4/h;", "imageLoader", "Lf5/i;", "b", "(Landroid/net/Uri;Ll5/l;LZ4/h;)Lf5/i;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements i.a<Uri> {
        private final boolean c(Uri data) {
            return Intrinsics.e(data.getScheme(), "content");
        }

        @Override // f5.i.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(Uri data, C15376l options, Z4.h imageLoader) {
            if (!c(data)) {
                return null;
            }
            return new e(data, options);
        }
    }

    private final Bundle d() {
        AbstractC15553c width = this.options.getSize().getWidth();
        AbstractC15553c.a aVar = width instanceof AbstractC15553c.a ? (AbstractC15553c.a) width : null;
        if (aVar == null) {
            return null;
        }
        int i10 = aVar.px;
        AbstractC15553c height = this.options.getSize().getHeight();
        AbstractC15553c.a aVar2 = height instanceof AbstractC15553c.a ? (AbstractC15553c.a) height : null;
        if (aVar2 == null) {
            return null;
        }
        int i11 = aVar2.px;
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("android.content.extra.SIZE", new Point(i10, i11));
        return bundle;
    }

    @Override // f5.i
    public Object a(Continuation<? super h> continuation) throws FileNotFoundException {
        InputStream inputStreamOpenInputStream;
        ContentResolver contentResolver = this.options.getContext().getContentResolver();
        if (b(this.data)) {
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(this.data, "r");
            inputStreamOpenInputStream = assetFileDescriptorOpenAssetFileDescriptor != null ? assetFileDescriptorOpenAssetFileDescriptor.createInputStream() : null;
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + this.data + "'.").toString());
            }
        } else if (Build.VERSION.SDK_INT < 29 || !c(this.data)) {
            inputStreamOpenInputStream = contentResolver.openInputStream(this.data);
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to open '" + this.data + "'.").toString());
            }
        } else {
            AssetFileDescriptor assetFileDescriptorOpenTypedAssetFile = contentResolver.openTypedAssetFile(this.data, "image/*", d(), null);
            inputStreamOpenInputStream = assetFileDescriptorOpenTypedAssetFile != null ? assetFileDescriptorOpenTypedAssetFile.createInputStream() : null;
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + this.data + "'.").toString());
            }
        }
        return new m(t.f(w.d(w.k(inputStreamOpenInputStream)), this.options.getContext(), new C6360f(this.data)), contentResolver.getType(this.data), EnumC6361g.f61480c);
    }

    public e(Uri uri, C15376l c15376l) {
        this.data = uri;
        this.options = c15376l;
    }

    public final boolean b(Uri data) {
        if (Intrinsics.e(data.getAuthority(), "com.android.contacts") && Intrinsics.e(data.getLastPathSegment(), "display_photo")) {
            return true;
        }
        return false;
    }

    public final boolean c(Uri data) {
        List<String> pathSegments;
        int size;
        if (!Intrinsics.e(data.getAuthority(), "media") || (size = (pathSegments = data.getPathSegments()).size()) < 3 || !Intrinsics.e(pathSegments.get(size - 3), "audio") || !Intrinsics.e(pathSegments.get(size - 2), "albums")) {
            return false;
        }
        return true;
    }
}
