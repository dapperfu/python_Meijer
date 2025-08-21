package h;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.provider.MediaStore;
import com.google.android.gms.common.api.a;
import g.C14281h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00062\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u00030\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lh/d;", "Lh/a;", "Lg/h;", "", "Landroid/net/Uri;", "Lkotlin/jvm/JvmSuppressWildcards;", "a", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: h.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C14430d extends AbstractC14427a<C14281h, List<Uri>> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lh/d$a;", "", "<init>", "()V", "", "a", "()I", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: h.d$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        public final int a() {
            return C14432f.INSTANCE.d() ? MediaStore.getPickImagesMaxLimit() : a.e.API_PRIORITY_OTHER;
        }
    }
}
