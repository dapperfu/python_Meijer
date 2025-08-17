package h;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import g.C14152h;
import h.AbstractC14314a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0016\u0018\u0000 \u00142\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0006\u0014\u0015\u0016\n\r\u0012B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lh/f;", "Lh/a;", "Lg/h;", "Landroid/net/Uri;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "d", "(Landroid/content/Context;Lg/h;)Landroid/content/Intent;", "Lh/a$a;", "e", "(Landroid/content/Context;Lg/h;)Lh/a$a;", "", "resultCode", "intent", "f", "(ILandroid/content/Intent;)Landroid/net/Uri;", "a", "b", "c", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: h.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C14319f extends AbstractC14314a<C14152h, Uri> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00108\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lh/f$a;", "", "<init>", "()V", "", "d", "()Z", "Landroid/content/Context;", "context", "c", "(Landroid/content/Context;)Z", "Landroid/content/pm/ResolveInfo;", "a", "(Landroid/content/Context;)Landroid/content/pm/ResolveInfo;", "Lh/f$f;", "input", "", "b", "(Lh/f$f;)Ljava/lang/String;", "GMS_ACTION_PICK_IMAGES", "Ljava/lang/String;", "GMS_EXTRA_PICK_IMAGES_MAX", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: h.f$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ResolveInfo a(Context context) {
            Intrinsics.j(context, "context");
            return context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
        }

        public final String b(InterfaceC2119f input) {
            Intrinsics.j(input, "input");
            if (input instanceof d) {
                return "image/*";
            }
            if (input instanceof e) {
                return ((e) input).getMimeType();
            }
            if (input instanceof c) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }

        @JvmStatic
        public final boolean c(Context context) {
            Intrinsics.j(context, "context");
            return a(context) != null;
        }

        @JvmStatic
        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        public final boolean d() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                return true;
            }
            return i10 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lh/f$b;", "", "<init>", "()V", "", "a", "()I", "value", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: h.f$b */
    public static abstract class b {

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lh/f$b$a;", "Lh/f$b;", "<init>", "()V", "", "b", "I", "a", "()I", "value", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: h.f$b$a */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f134139a = new a();

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private static final int value = 1;

            private a() {
                super(null);
            }

            @Override // h.C14319f.b
            public int a() {
                return value;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract int a();

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, d2 = {"Lh/f$e;", "Lh/f$f;", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "mimeType", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: h.f$e */
    public static final class e implements InterfaceC2119f {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String mimeType;

        /* renamed from: a, reason: from getter */
        public final String getMimeType() {
            return this.mimeType;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lh/f$f;", "", "Lh/f$c;", "Lh/f$d;", "Lh/f$e;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: h.f$f, reason: collision with other inner class name */
    public interface InterfaceC2119f {
    }

    @Override // h.AbstractC14314a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final AbstractC14314a.C2118a<Uri> b(Context context, C14152h input) {
        Intrinsics.j(context, "context");
        Intrinsics.j(input, "input");
        return null;
    }

    @Override // h.AbstractC14314a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Uri c(int resultCode, Intent intent) {
        if (resultCode != -1) {
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        Uri data = intent.getData();
        return data == null ? (Uri) CollectionsKt.u0(C14315b.INSTANCE.a(intent)) : data;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh/f$c;", "Lh/f$f;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: h.f$c */
    public static final class c implements InterfaceC2119f {

        /* renamed from: a, reason: collision with root package name */
        public static final c f134141a = new c();

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh/f$d;", "Lh/f$f;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: h.f$d */
    public static final class d implements InterfaceC2119f {

        /* renamed from: a, reason: collision with root package name */
        public static final d f134142a = new d();

        private d() {
        }
    }

    @Override // h.AbstractC14314a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, C14152h input) {
        Intrinsics.j(context, "context");
        Intrinsics.j(input, "input");
        Companion companion = INSTANCE;
        if (companion.d()) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(companion.b(input.getMediaType()));
            intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", input.getDefaultTab().a());
            if (input.getIsCustomAccentColorApplied()) {
                intent.putExtra("android.provider.extra.PICK_IMAGES_ACCENT_COLOR", input.getAccentColor());
            }
            return intent;
        }
        if (!companion.c(context)) {
            Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent2.setType(companion.b(input.getMediaType()));
            if (intent2.getType() == null) {
                intent2.setType("*/*");
                intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            }
            return intent2;
        }
        ResolveInfo resolveInfoA = companion.a(context);
        if (resolveInfoA == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ActivityInfo activityInfo = resolveInfoA.activityInfo;
        Intent intent3 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
        intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
        intent3.setType(companion.b(input.getMediaType()));
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", input.getDefaultTab().a());
        if (input.getIsCustomAccentColorApplied()) {
            intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_ACCENT_COLOR", input.getAccentColor());
        }
        return intent3;
    }
}
