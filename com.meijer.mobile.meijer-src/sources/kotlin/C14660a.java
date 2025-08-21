package kotlin;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import com.fullstory.FS;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.AbstractC14656B;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001f \u0016B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Li4/a;", "Li4/B;", "Li4/a$b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "l", "()Li4/a$b;", "", "k", "()Z", "destination", "Landroid/os/Bundle;", "args", "Li4/w;", "navOptions", "Li4/B$a;", "navigatorExtras", "Li4/p;", "m", "(Li4/a$b;Landroid/os/Bundle;Li4/w;Li4/B$a;)Li4/p;", "c", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroid/app/Activity;", "d", "Landroid/app/Activity;", "hostActivity", "e", "a", "b", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@AbstractC14656B.b("activity")
@SourceDebugExtension
/* renamed from: i4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14660a extends AbstractC14656B<b> {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Activity hostActivity;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u0019\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R(\u0010\u001d\u001a\u0004\u0018\u00010\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR(\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u001e8F@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R(\u0010#\u001a\u0004\u0018\u00010\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\t8F@BX\u0086\u000e¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u000b¨\u0006%"}, d2 = {"Li4/a$b;", "Li4/p;", "Li4/B;", "activityNavigator", "<init>", "(Li4/B;)V", "", "G", "()Z", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/content/Intent;", "<set-?>", "l", "Landroid/content/Intent;", "L", "()Landroid/content/Intent;", "intent", "m", "Ljava/lang/String;", "K", "dataPattern", "Landroid/content/ComponentName;", "component", "Landroid/content/ComponentName;", "I", "()Landroid/content/ComponentName;", "action", "H", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: i4.a$b */
    public static class b extends C14675p {

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private Intent intent;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        private String dataPattern;

        @Override // kotlin.C14675p
        public boolean G() {
            return false;
        }

        @Override // kotlin.C14675p
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other != null && (other instanceof b) && super.equals(other)) {
                Intent intent = this.intent;
                if ((intent != null ? intent.filterEquals(((b) other).intent) : ((b) other).intent == null) && Intrinsics.e(this.dataPattern, ((b) other).dataPattern)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC14656B<? extends b> activityNavigator) {
            super(activityNavigator);
            Intrinsics.j(activityNavigator, "activityNavigator");
        }

        public final String H() {
            Intent intent = this.intent;
            if (intent != null) {
                return intent.getAction();
            }
            return null;
        }

        public final ComponentName I() {
            Intent intent = this.intent;
            if (intent != null) {
                return intent.getComponent();
            }
            return null;
        }

        /* renamed from: K, reason: from getter */
        public final String getDataPattern() {
            return this.dataPattern;
        }

        /* renamed from: L, reason: from getter */
        public final Intent getIntent() {
            return this.intent;
        }

        @Override // kotlin.C14675p
        public int hashCode() {
            int iFilterHashCode;
            int iHashCode = super.hashCode() * 31;
            Intent intent = this.intent;
            int iHashCode2 = 0;
            if (intent != null) {
                iFilterHashCode = intent.filterHashCode();
            } else {
                iFilterHashCode = 0;
            }
            int i10 = (iHashCode + iFilterHashCode) * 31;
            String str = this.dataPattern;
            if (str != null) {
                iHashCode2 = str.hashCode();
            }
            return i10 + iHashCode2;
        }

        @Override // kotlin.C14675p
        public String toString() {
            ComponentName componentNameI = I();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            if (componentNameI != null) {
                sb2.append(" class=");
                sb2.append(componentNameI.getClassName());
            } else {
                String strH = H();
                if (strH != null) {
                    sb2.append(" action=");
                    sb2.append(strH);
                }
            }
            String string = sb2.toString();
            Intrinsics.i(string, "sb.toString()");
            return string;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\f"}, d2 = {"Li4/a$c;", "Li4/B$a;", "", "a", "I", "b", "()I", "flags", "Landroidx/core/app/d;", "Landroidx/core/app/d;", "()Landroidx/core/app/d;", "activityOptions", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: i4.a$c */
    public static final class c implements AbstractC14656B.a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int flags;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final androidx.core.app.d activityOptions;

        /* renamed from: a, reason: from getter */
        public final androidx.core.app.d getActivityOptions() {
            return this.activityOptions;
        }

        /* renamed from: b, reason: from getter */
        public final int getFlags() {
            return this.flags;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/content/Context;", "it", "a", "(Landroid/content/Context;)Landroid/content/Context;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: i4.a$d */
    static final class d extends Lambda implements Function1<Context, Context> {

        /* renamed from: f, reason: collision with root package name */
        public static final d f136975f = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Context invoke(Context it) {
            Intrinsics.j(it, "it");
            if (it instanceof ContextWrapper) {
                return ((ContextWrapper) it).getBaseContext();
            }
            return null;
        }
    }

    public C14660a(Context context) {
        Object next;
        Intrinsics.j(context, "context");
        this.context = context;
        Iterator it = SequencesKt.q(context, d.f136975f).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.hostActivity = (Activity) next;
    }

    @Override // kotlin.AbstractC14656B
    public boolean k() {
        Activity activity = this.hostActivity;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    @Override // kotlin.AbstractC14656B
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public b a() {
        return new b(this);
    }

    @Override // kotlin.AbstractC14656B
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public C14675p d(b destination, Bundle args, C14682w navOptions, AbstractC14656B.a navigatorExtras) {
        androidx.core.app.d activityOptions;
        Intent intent;
        int intExtra;
        Intrinsics.j(destination, "destination");
        if (destination.getIntent() == null) {
            throw new IllegalStateException(("Destination " + destination.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String() + " does not have an Intent set.").toString());
        }
        Intent intent2 = new Intent(destination.getIntent());
        if (args != null) {
            intent2.putExtras(args);
            String dataPattern = destination.getDataPattern();
            if (dataPattern != null && dataPattern.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(dataPattern);
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    if (!args.containsKey(strGroup)) {
                        throw new IllegalArgumentException("Could not find " + strGroup + " in " + args + " to fill data pattern " + dataPattern);
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    stringBuffer.append(Uri.encode(String.valueOf(args.get(strGroup))));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        boolean z10 = navigatorExtras instanceof c;
        if (z10) {
            intent2.addFlags(((c) navigatorExtras).getFlags());
        }
        if (this.hostActivity == null) {
            intent2.addFlags(268435456);
        }
        if (navOptions != null && navOptions.getSingleTop()) {
            intent2.addFlags(536870912);
        }
        Activity activity = this.hostActivity;
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", destination.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String());
        Resources resources = this.context.getResources();
        if (navOptions != null) {
            int popEnterAnim = navOptions.getPopEnterAnim();
            int popExitAnim = navOptions.getPopExitAnim();
            if ((popEnterAnim <= 0 || !Intrinsics.e(resources.getResourceTypeName(popEnterAnim), "animator")) && (popExitAnim <= 0 || !Intrinsics.e(resources.getResourceTypeName(popExitAnim), "animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", popEnterAnim);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", popExitAnim);
            } else {
                FS.log_w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(popEnterAnim) + " and popExit resource " + resources.getResourceName(popExitAnim) + " when launching " + destination);
            }
        }
        if (!z10 || (activityOptions = ((c) navigatorExtras).getActivityOptions()) == null) {
            this.context.startActivity(intent2);
        } else {
            Z1.b.o(this.context, intent2, activityOptions.e());
        }
        if (navOptions == null || this.hostActivity == null) {
            return null;
        }
        int enterAnim = navOptions.getEnterAnim();
        int exitAnim = navOptions.getExitAnim();
        if ((enterAnim <= 0 || !Intrinsics.e(resources.getResourceTypeName(enterAnim), "animator")) && (exitAnim <= 0 || !Intrinsics.e(resources.getResourceTypeName(exitAnim), "animator"))) {
            if (enterAnim < 0 && exitAnim < 0) {
                return null;
            }
            this.hostActivity.overridePendingTransition(RangesKt.f(enterAnim, 0), RangesKt.f(exitAnim, 0));
            return null;
        }
        FS.log_w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(enterAnim) + " and exit resource " + resources.getResourceName(exitAnim) + "when launching " + destination);
        return null;
    }
}
