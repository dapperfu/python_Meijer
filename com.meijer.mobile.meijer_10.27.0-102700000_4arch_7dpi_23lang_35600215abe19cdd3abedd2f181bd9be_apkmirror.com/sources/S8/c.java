package S8;

import androidx.test.espresso.idling.CountingIdlingResource;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0003R\u0014\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\n"}, d2 = {"LS8/c;", "", "<init>", "()V", "", "b", "a", "Landroidx/test/espresso/idling/CountingIdlingResource;", "Landroidx/test/espresso/idling/CountingIdlingResource;", "countingIdlingResource", "core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f33486a = new c();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public static final CountingIdlingResource countingIdlingResource = new CountingIdlingResource("EMARSYS-SDK");

    @JvmStatic
    public static final void a() {
        CountingIdlingResource countingIdlingResource2 = countingIdlingResource;
        if (countingIdlingResource2.c()) {
            return;
        }
        countingIdlingResource2.a();
    }

    @JvmStatic
    public static final void b() {
        countingIdlingResource.b();
    }

    private c() {
    }
}
