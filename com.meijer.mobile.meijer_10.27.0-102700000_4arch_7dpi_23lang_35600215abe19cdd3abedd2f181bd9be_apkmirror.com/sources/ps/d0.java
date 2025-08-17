package ps;

import Jk.AppVersion;
import ak.AbstractC5607a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;
import com.meijer.mobile.core.base.ui.textview.FullWordEllipsisTextView;
import com.meijer.mobile.ui.navigation.NavigationViewHeader;
import dj.C13528a;
import ej.ShoppingCart;
import gi.InterfaceC14261a;
import hi.C14476c;
import hi.TrackingData;
import iv.C14764a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ps.EnumC16377G;
import yl.AbstractC18227f;

@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0002¥\u0001\b\u0007\u0018\u0000 \u00ad\u00012\u00020\u00012\u00020\u0002:\u0006WfJV[XB7\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00112\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\"\u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u0014H\u0002¢\u0006\u0004\b%\u0010\u0017J\u0017\u0010&\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u0014H\u0002¢\u0006\u0004\b&\u0010\u0017J\r\u0010'\u001a\u00020\u0011¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0011¢\u0006\u0004\b)\u0010(J\r\u0010*\u001a\u00020\u0011¢\u0006\u0004\b*\u0010(J\u0015\u0010,\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u000f¢\u0006\u0004\b,\u0010\u0013J\u0017\u0010/\u001a\u00020\u00112\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00112\b\u0010.\u001a\u0004\u0018\u000101¢\u0006\u0004\b2\u00103J\u0015\u00105\u001a\u00020\u00112\u0006\u00104\u001a\u00020\u000f¢\u0006\u0004\b5\u0010\u0013J\u0015\u00107\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u000f¢\u0006\u0004\b7\u0010\u0013J\u0019\u0010:\u001a\u00020\u00002\b\u00109\u001a\u0004\u0018\u000108H\u0007¢\u0006\u0004\b:\u0010;J\u0019\u0010=\u001a\u00020\u00002\b\b\u0001\u0010<\u001a\u00020\u0014H\u0007¢\u0006\u0004\b=\u0010>J!\u0010A\u001a\u00020\u00002\b\u00109\u001a\u0004\u0018\u00010?2\u0006\u0010@\u001a\u00020\u000fH\u0007¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u0000H\u0007¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u0014H\u0007¢\u0006\u0004\bF\u0010>J\u0017\u0010G\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\bG\u0010>J\u000f\u0010H\u001a\u00020\u0011H\u0000¢\u0006\u0004\bH\u0010(J\u000f\u0010I\u001a\u00020\u0011H\u0000¢\u0006\u0004\bI\u0010(J\u0017\u0010J\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\u0011H\u0000¢\u0006\u0004\bL\u0010(J\u000f\u0010M\u001a\u00020\u0011H\u0000¢\u0006\u0004\bM\u0010(J\u001f\u0010Q\u001a\u00020\u000f2\u0006\u0010N\u001a\u00020\t2\u0006\u0010P\u001a\u00020OH\u0000¢\u0006\u0004\bQ\u0010RJ\r\u0010S\u001a\u00020\u0011¢\u0006\u0004\bS\u0010(J\u000f\u0010T\u001a\u00020\u0011H\u0000¢\u0006\u0004\bT\u0010(J\u000f\u0010U\u001a\u00020\u0011H\u0000¢\u0006\u0004\bU\u0010(J\u0017\u0010V\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u0014H\u0016¢\u0006\u0004\bV\u0010\u0017J\u000f\u0010W\u001a\u00020\u0011H\u0016¢\u0006\u0004\bW\u0010(J\u000f\u0010X\u001a\u00020\u0011H\u0016¢\u0006\u0004\bX\u0010(J!\u0010[\u001a\u00020\u00112\u0006\u0010Y\u001a\u00020\u00142\b\u0010Z\u001a\u0004\u0018\u00010?H\u0016¢\u0006\u0004\b[\u0010\\J\u000f\u0010]\u001a\u00020\u0011H\u0016¢\u0006\u0004\b]\u0010(R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010^R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010_R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bW\u0010`\u001a\u0004\ba\u0010bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010cR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010dR\u0014\u0010h\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010k\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010jR\u0014\u0010o\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010s\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010w\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010{\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010\u007f\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0018\u0010\u0083\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0087\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001c\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R/\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u008c\u00012\t\u0010\u0010\u001a\u0005\u0018\u00010\u008c\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0095\u0001\u001a\u00030\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001b\u0010\u0098\u0001\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0019\u0010\u009b\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0019\u0010\u009d\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009a\u0001R\u0018\u0010+\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009a\u0001R\u001b\u0010¡\u0001\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u001b\u0010¤\u0001\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u0018\u0010¨\u0001\u001a\u00030¥\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u001a\u0010¬\u0001\u001a\u0005\u0018\u00010©\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bª\u0001\u0010«\u0001¨\u0006®\u0001"}, d2 = {"Lps/d0;", "Lps/e0;", "Lcom/google/android/material/navigation/NavigationView$d;", "Landroid/content/Context;", "context", "Lcom/google/android/material/navigation/NavigationView;", "navigationView", "Landroidx/appcompat/widget/Toolbar;", "appBar", "Landroidx/appcompat/app/AppCompatActivity;", "activityContext", "Landroidx/drawerlayout/widget/DrawerLayout;", "drawer", "<init>", "(Landroid/content/Context;Lcom/google/android/material/navigation/NavigationView;Landroidx/appcompat/widget/Toolbar;Landroidx/appcompat/app/AppCompatActivity;Landroidx/drawerlayout/widget/DrawerLayout;)V", "", "value", "", "L", "(Z)V", "", "checkedNavigationItem", "d0", "(I)V", "Ltk/c;", "Lej/C;", "cartResource", "f0", "(Ltk/c;)V", "Landroid/view/MenuItem;", "item", "N", "(Landroid/view/MenuItem;)I", "drawerLayout", "K", "(Landroidx/drawerlayout/widget/DrawerLayout;)V", "code", "Q", "l0", "U", "()V", "T", "S", "dialogsEnabled", "V", "Lps/d0$e;", "listener", "X", "(Lps/d0$e;)V", "Lps/d0$c;", "W", "(Lps/d0$c;)V", "isLoggedIn", "t0", "isDevMode", "u0", "", "title", "Y", "(Ljava/lang/CharSequence;)Lps/d0;", "resourceId", "G", "(I)Lps/d0;", "", "isCentered", "H", "(Ljava/lang/String;Z)Lps/d0;", "j0", "()Lps/d0;", "upButtonResourceId", "k0", "i0", "g0", "c0", "d", "(Landroid/view/MenuItem;)Z", "I", "h0", "fromActivity", "Landroid/content/Intent;", "toIntent", "P", "(Landroidx/appcompat/app/AppCompatActivity;Landroid/content/Intent;)Z", "J", "e0", "v0", "e", "c", "a", "storeId", "storeName", "b", "(ILjava/lang/String;)V", "g", "Landroid/content/Context;", "Lcom/google/android/material/navigation/NavigationView;", "Landroidx/appcompat/widget/Toolbar;", "getAppBar", "()Landroidx/appcompat/widget/Toolbar;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroidx/drawerlayout/widget/DrawerLayout;", "Lyo/k;", "f", "Lyo/k;", "userManager", "Lyl/k;", "Lyl/k;", "featureManager", "Lhl/m;", "h", "Lhl/m;", "cartRepository", "Lyo/f;", "i", "Lyo/f;", "storeManager", "LCl/e;", "j", "LCl/e;", "meijerDeepLinkParser", "Lgi/a;", "k", "Lgi/a;", "analyticsEngine", "LCk/b;", "l", "LCk/b;", "meijerBus", "LTq/j;", "m", "LTq/j;", "storeProvider", "LJk/a;", "n", "LJk/a;", "appVersion", "Lcom/meijer/mobile/ui/navigation/NavigationViewHeader;", "o", "Lcom/meijer/mobile/ui/navigation/NavigationViewHeader;", "header", "Landroidx/appcompat/app/b;", "p", "Landroidx/appcompat/app/b;", "M", "()Landroidx/appcompat/app/b;", "actionBarDrawerToggle", "LNu/a;", "q", "LNu/a;", "disposables", "r", "Landroid/content/Intent;", "activityIntentWaitingToStart", "s", "Z", "isStartActivityForResult", "t", "isHomeScreenNavigationDrawer", "u", "v", "Lps/d0$e;", "onDrawerOpenListener", "w", "Lps/d0$c;", "onLaunchActivityForResultListener", "ps/d0$h", "x", "Lps/d0$h;", "onBackPressedCallback", "Landroidx/appcompat/app/a;", "O", "()Landroidx/appcompat/app/a;", "supportActionBar", "y", "navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class d0 implements e0, NavigationView.d {

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: z, reason: collision with root package name */
    public static final int f156449z = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final NavigationView navigationView;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Toolbar appBar;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AppCompatActivity activityContext;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final DrawerLayout drawer;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final yl.k featureManager;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final hl.m cartRepository;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final yo.f storeManager;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Cl.e meijerDeepLinkParser;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14261a analyticsEngine;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Ck.b meijerBus;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Tq.j storeProvider;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final AppVersion appVersion;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private NavigationViewHeader header;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private androidx.appcompat.app.b actionBarDrawerToggle;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Nu.a disposables;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Intent activityIntentWaitingToStart;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean isStartActivityForResult;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean isHomeScreenNavigationDrawer;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private boolean dialogsEnabled;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private e onDrawerOpenListener;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private c onLaunchActivityForResultListener;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final h onBackPressedCallback;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lps/d0$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/google/android/material/navigation/NavigationView;", "navigationView", "Landroidx/appcompat/widget/Toolbar;", "appBar", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "Landroidx/drawerlayout/widget/DrawerLayout;", "drawerLayout", "Lps/d0;", "a", "(Landroid/content/Context;Lcom/google/android/material/navigation/NavigationView;Landroidx/appcompat/widget/Toolbar;Landroidx/appcompat/app/AppCompatActivity;Landroidx/drawerlayout/widget/DrawerLayout;)Lps/d0;", "", "NAVIGATION_ITEM_NONE", "I", "HEADER_INDEX", "navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ps.d0$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final d0 a(Context context, NavigationView navigationView, Toolbar appBar, AppCompatActivity activity, DrawerLayout drawerLayout) {
            Intrinsics.j(context, "context");
            Intrinsics.j(activity, "activity");
            return new d0(context, navigationView, appBar, activity, drawerLayout, null);
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001b\u0010\u001cø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001dÀ\u0006\u0001"}, d2 = {"Lps/d0$b;", "", "Lyo/k;", "c", "()Lyo/k;", "Lyl/k;", "b", "()Lyl/k;", "Lhl/m;", "h", "()Lhl/m;", "Lyo/f;", "r", "()Lyo/f;", "Lgi/a;", "a", "()Lgi/a;", "LCl/e;", "s", "()LCl/e;", "LCk/b;", "d", "()LCk/b;", "LTq/j;", "f", "()LTq/j;", "LJk/a;", "k", "()LJk/a;", "navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {
        InterfaceC14261a a();

        yl.k b();

        yo.k c();

        Ck.b d();

        Tq.j f();

        hl.m h();

        AppVersion k();

        yo.f r();

        Cl.e s();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lps/d0$c;", "", "Landroid/content/Intent;", "intent", "", "handleLaunchActivityForResult", "(Landroid/content/Intent;)V", "navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface c {
        void handleLaunchActivityForResult(Intent intent);
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lps/d0$d;", "", "navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface d {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lps/d0$e;", "", "", "onNavigationDrawerOpen", "()V", "navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface e {
        void onNavigationDrawerOpen();
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lps/d0$f;", "", "navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface f {
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"ps/d0$g", "Landroidx/appcompat/app/b;", "Landroid/view/View;", "drawerView", "", "b", "(Landroid/view/View;)V", "a", "", "offset", "d", "(Landroid/view/View;F)V", "navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g extends androidx.appcompat.app.b {

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ DrawerLayout f156474l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ d0 f156475m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(DrawerLayout drawerLayout, d0 d0Var, AppCompatActivity appCompatActivity, Toolbar toolbar, int i10, int i11) {
            super(appCompatActivity, drawerLayout, toolbar, i10, i11);
            this.f156474l = drawerLayout;
            this.f156475m = d0Var;
        }

        @Override // androidx.appcompat.app.b, androidx.drawerlayout.widget.DrawerLayout.d
        public void a(View drawerView) {
            Menu menu;
            MenuItem menuItemFindItem;
            Intrinsics.j(drawerView, "drawerView");
            super.a(drawerView);
            this.f156475m.v0();
            d0 d0Var = this.f156475m;
            d0Var.t0(d0Var.userManager.b());
            this.f156475m.g0();
            this.f156475m.c0();
            this.f156475m.h0();
            this.f156475m.I();
            d0 d0Var2 = this.f156475m;
            d0Var2.u0(d0Var2.appVersion.getIsDevMode());
            e eVar = this.f156475m.onDrawerOpenListener;
            if (eVar != null) {
                eVar.onNavigationDrawerOpen();
            }
            this.f156475m.onBackPressedCallback.setEnabled(true);
            NavigationView navigationView = this.f156475m.navigationView;
            if (navigationView == null || (menu = navigationView.getMenu()) == null || (menuItemFindItem = menu.findItem(g0.f156511H)) == null) {
                return;
            }
            d0 d0Var3 = this.f156475m;
            menuItemFindItem.setVisible(d0Var3.appVersion.getIsDevMode());
            menuItemFindItem.setTitle(d0Var3.appVersion.getVersionName());
        }

        @Override // androidx.appcompat.app.b, androidx.drawerlayout.widget.DrawerLayout.d
        public void b(View drawerView) {
            Intrinsics.j(drawerView, "drawerView");
            super.b(drawerView);
            DrawerLayout drawerLayout = this.f156474l;
            if (drawerLayout != null) {
                drawerLayout.announceForAccessibility(this.f156475m.context.getString(j0.f156556f));
            }
            d0.x(this.f156475m);
            Intent intent = this.f156475m.activityIntentWaitingToStart;
            if (intent != null) {
                d0 d0Var = this.f156475m;
                if (d0Var.P(d0Var.activityContext, intent)) {
                    if (d0Var.isStartActivityForResult && d0Var.isHomeScreenNavigationDrawer) {
                        c cVar = d0Var.onLaunchActivityForResultListener;
                        if (cVar != null) {
                            cVar.handleLaunchActivityForResult(intent);
                        }
                    } else {
                        d0Var.activityContext.startActivity(intent, androidx.core.app.d.a().e());
                    }
                }
            }
            this.f156475m.isStartActivityForResult = false;
            this.f156475m.activityIntentWaitingToStart = null;
            this.f156475m.onBackPressedCallback.setEnabled(false);
        }

        @Override // androidx.appcompat.app.b, androidx.drawerlayout.widget.DrawerLayout.d
        public void d(View drawerView, float offset) {
            Intrinsics.j(drawerView, "drawerView");
            super.d(drawerView, offset);
            this.f156475m.e0();
            d0.z(this.f156475m);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"ps/d0$h", "Landroidx/activity/F;", "", "handleOnBackPressed", "()V", "navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class h extends androidx.view.F {
        h() {
            super(false);
        }

        @Override // androidx.view.F
        public void handleOnBackPressed() {
            d0.this.J();
        }
    }

    public /* synthetic */ d0(Context context, NavigationView navigationView, Toolbar toolbar, AppCompatActivity appCompatActivity, DrawerLayout drawerLayout, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, navigationView, toolbar, appCompatActivity, drawerLayout);
    }

    public final void S() {
        V(false);
        this.disposables.d();
    }

    public final void T() {
    }

    public final void U() {
        V(true);
    }

    public final d0 i0(int checkedNavigationItem) {
        this.isHomeScreenNavigationDrawer = checkedNavigationItem == 0;
        androidx.appcompat.app.a aVarO = O();
        if (aVarO != null) {
            aVarO.z(true);
            aVarO.s(false);
        }
        Toolbar toolbar = this.appBar;
        if (toolbar != null) {
            toolbar.setNavigationIcon(f0.f156490m);
        }
        d0(checkedNavigationItem);
        L(true);
        return this;
    }

    public final d0 j0() {
        return k0(0);
    }

    private d0(Context context, NavigationView navigationView, Toolbar toolbar, AppCompatActivity appCompatActivity, DrawerLayout drawerLayout) {
        this.context = context;
        this.navigationView = navigationView;
        this.appBar = toolbar;
        this.activityContext = appCompatActivity;
        this.drawer = drawerLayout;
        this.disposables = new Nu.a();
        h hVar = new h();
        this.onBackPressedCallback = hVar;
        b bVar = (b) ru.d.a(context, b.class);
        yo.k kVarC = bVar.c();
        this.userManager = kVarC;
        this.featureManager = bVar.b();
        this.cartRepository = bVar.h();
        this.storeManager = bVar.r();
        this.meijerDeepLinkParser = bVar.s();
        this.analyticsEngine = bVar.a();
        this.meijerBus = bVar.d();
        Tq.j jVarF = bVar.f();
        this.storeProvider = jVarF;
        this.appVersion = bVar.k();
        View viewN = navigationView != null ? navigationView.n(0) : null;
        NavigationViewHeader navigationViewHeader = viewN instanceof NavigationViewHeader ? (NavigationViewHeader) viewN : null;
        if (navigationViewHeader != null) {
            navigationViewHeader.B(this, kVarC, jVarF);
        }
        appCompatActivity.setSupportActionBar(toolbar);
        appCompatActivity.getOnBackPressedDispatcher().h(hVar);
    }

    private final void K(DrawerLayout drawerLayout) {
        g gVar = new g(drawerLayout, this, this.activityContext, this.appBar, j0.f156554d, j0.f156553c);
        if (drawerLayout != null) {
            drawerLayout.c(gVar);
        }
        this.actionBarDrawerToggle = gVar;
    }

    private final void L(boolean value) {
        DrawerLayout drawerLayout = this.drawer;
        if (drawerLayout != null) {
            drawerLayout.setDrawerLockMode(!value ? 1 : 0);
        }
    }

    private final int N(MenuItem item) {
        return EnumC16377G.INSTANCE.b(item.getItemId()).getIntentCode();
    }

    private final androidx.appcompat.app.a O() {
        return this.activityContext.getSupportActionBar();
    }

    private final void Q(int code) {
        int i10;
        Intent intentE;
        if (code == 800) {
            i10 = code;
            intentE = Al.k.f672a.e(this.activityContext, false);
        } else if (code != 5100) {
            String str = code != 1700 ? code != 1901 ? code != 268436157 ? null : "event: menu manage account" : "event: menu hearing aids" : "event: menu pharmacy website";
            if (str != null) {
                this.analyticsEngine.h(C14476c.a(str), new Function1() { // from class: ps.S
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return d0.R((TrackingData) obj);
                    }
                });
            }
            if (code == 268436157 && this.featureManager.e(AbstractC18227f.h0.f170581h)) {
                intentE = Al.u.f695a.a(this.context);
                i10 = code;
            } else {
                i10 = code;
                intentE = Cl.e.t(this.meijerDeepLinkParser, this.activityContext, i10, null, 4, null);
            }
        } else {
            i10 = code;
            Cl.e eVar = this.meijerDeepLinkParser;
            Context context = this.context;
            String string = context.getString(Al.n.f682f);
            Intrinsics.i(string, "getString(...)");
            intentE = eVar.M(context, string);
        }
        if (intentE != null) {
            if (intentE.hasExtra("com.meijer.intent.extra.EXTERNAL_APPLICATION")) {
                intentE.removeExtra("com.meijer.intent.extra.EXTERNAL_APPLICATION");
            } else {
                Intrinsics.g(intentE.addFlags(536870912));
            }
            intentE.putExtra("com.meijer.intent.extra.FROM_NAV_MENU", true);
            l0(i10);
            this.activityIntentWaitingToStart = intentE;
            this.isStartActivityForResult = i10 == 165;
        }
        DrawerLayout drawerLayout = this.drawer;
        if (drawerLayout != null) {
            drawerLayout.f(8388611);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("menu");
        track.v("menu");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit a0(ps.d0 r4, android.widget.ImageView r5, android.widget.TextView r6, tk.c r7) {
        /*
            java.lang.String r0 = "shoppingCartResource"
            kotlin.jvm.internal.Intrinsics.j(r7, r0)
            r4.f0(r7)
            java.lang.Object r0 = r7.a()
            ej.C r0 = (ej.ShoppingCart) r0
            r1 = 0
            if (r0 == 0) goto L1c
            ej.h r0 = r0.getDeliveryMode()
            if (r0 == 0) goto L1c
            java.lang.String r0 = r0.getCode()
            goto L1d
        L1c:
            r0 = r1
        L1d:
            java.lang.String r2 = "pickup"
            boolean r0 = kotlin.jvm.internal.Intrinsics.e(r0, r2)
            java.lang.String r2 = ""
            if (r0 == 0) goto L58
            int r0 = Bj.i.f2738f2
            com.fullstory.FS.Resources_setImageResource(r5, r0)
            android.content.Context r4 = r4.context
            ak.a$a r5 = ak.AbstractC5607a.INSTANCE
            int r0 = Hl.h.f12762J
            java.lang.Object r7 = r7.a()
            ej.C r7 = (ej.ShoppingCart) r7
            if (r7 == 0) goto L44
            Tq.c r7 = r7.getPointOfService()
            if (r7 == 0) goto L44
            java.lang.String r1 = r7.getDisplayName()
        L44:
            if (r1 != 0) goto L47
            goto L48
        L47:
            r2 = r1
        L48:
            java.lang.Object[] r7 = new java.lang.Object[]{r2}
            ak.a r5 = r5.d(r0, r7)
            java.lang.String r4 = bk.d.a(r4, r5)
            r6.setText(r4)
            goto Lba
        L58:
            java.lang.Object r0 = r7.a()
            ej.C r0 = (ej.ShoppingCart) r0
            if (r0 == 0) goto L6b
            ej.h r0 = r0.getDeliveryMode()
            if (r0 == 0) goto L6b
            java.lang.String r0 = r0.getCode()
            goto L6c
        L6b:
            r0 = r1
        L6c:
            java.lang.String r3 = "delivery"
            boolean r0 = kotlin.jvm.internal.Intrinsics.e(r0, r3)
            if (r0 == 0) goto Lb5
            java.lang.Object r0 = r7.a()
            ej.C r0 = (ej.ShoppingCart) r0
            if (r0 == 0) goto L81
            ci.c r0 = r0.getDeliveryAddress()
            goto L82
        L81:
            r0 = r1
        L82:
            if (r0 == 0) goto Lb5
            int r0 = Bj.i.f2730d2
            com.fullstory.FS.Resources_setImageResource(r5, r0)
            android.content.Context r4 = r4.context
            ak.a$a r5 = ak.AbstractC5607a.INSTANCE
            int r0 = Hl.h.f12810u
            java.lang.Object r7 = r7.a()
            ej.C r7 = (ej.ShoppingCart) r7
            if (r7 == 0) goto La1
            ci.c r7 = r7.getDeliveryAddress()
            if (r7 == 0) goto La1
            java.lang.String r1 = r7.getLine1()
        La1:
            if (r1 != 0) goto La4
            goto La5
        La4:
            r2 = r1
        La5:
            java.lang.Object[] r7 = new java.lang.Object[]{r2}
            ak.a r5 = r5.d(r0, r7)
            java.lang.String r4 = bk.d.a(r4, r5)
            r6.setText(r4)
            goto Lba
        Lb5:
            int r4 = Hl.h.f12764L
            r6.setText(r4)
        Lba:
            kotlin.Unit r4 = kotlin.Unit.f142422a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ps.d0.a0(ps.d0, android.widget.ImageView, android.widget.TextView, tk.c):kotlin.Unit");
    }

    private final void d0(int checkedNavigationItem) {
        if (this.actionBarDrawerToggle != null) {
            return;
        }
        DrawerLayout drawerLayout = this.drawer;
        if (drawerLayout == null) {
            throw new IllegalArgumentException(this.activityContext.getClass().getName() + " layout does not contain a DrawerLayout with id " + this.context.getResources().getResourceName(g0.f156510G) + '.');
        }
        NavigationView navigationView = this.navigationView;
        if (navigationView == null) {
            throw new IllegalArgumentException((this.activityContext.getClass().getName() + " must have a " + NavigationView.class.getCanonicalName() + " with id " + this.context.getResources().getResourceName(g0.f156509F) + '.').toString());
        }
        navigationView.setNavigationItemSelectedListener(this);
        Integer numValueOf = Integer.valueOf(EnumC16377G.INSTANCE.a(checkedNavigationItem).getResId());
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            this.navigationView.getMenu().findItem(numValueOf.intValue()).setChecked(true);
        }
        g0();
        K(drawerLayout);
    }

    private final void f0(tk.c<ShoppingCart> cartResource) {
        Menu menu;
        MenuItem menuItemFindItem;
        NavigationView navigationView = this.navigationView;
        if (navigationView == null || (menu = navigationView.getMenu()) == null || (menuItemFindItem = menu.findItem(g0.f156519h)) == null) {
            return;
        }
        View actionView = menuItemFindItem.getActionView();
        TextView textView = actionView != null ? (TextView) actionView.findViewById(g0.f156513b) : null;
        ShoppingCart shoppingCartA = cartResource.a();
        if (shoppingCartA != null) {
            int iIntValue = Integer.valueOf(shoppingCartA.getTotalItems()).intValue();
            if (textView != null) {
                bk.d.g(textView, AbstractC5607a.INSTANCE.b(i0.f156549a, iIntValue, new Object[0]));
            }
        }
        menuItemFindItem.setVisible(this.userManager.b());
    }

    private final void l0(int code) {
        if (code == 165) {
            this.analyticsEngine.h(C14476c.a("event: menu rewards"), new Function1() { // from class: ps.Z
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return d0.o0((TrackingData) obj);
                }
            });
            return;
        }
        if (code == 180) {
            this.analyticsEngine.h(C14476c.a("shopDepartmentMenu"), new Function1() { // from class: ps.X
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return d0.m0((TrackingData) obj);
                }
            });
            return;
        }
        if (code == 200) {
            this.analyticsEngine.h(C14476c.a("event: menu shopping List"), new Function1() { // from class: ps.b0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return d0.q0((TrackingData) obj);
                }
            });
            return;
        }
        if (code == 1000) {
            this.analyticsEngine.h(C14476c.a("event: menu receipts & savings"), new Function1() { // from class: ps.a0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return d0.p0((TrackingData) obj);
                }
            });
            return;
        }
        if (code == 1200) {
            this.analyticsEngine.h(C14476c.a("event: menu mcard"), new Function1() { // from class: ps.c0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return d0.r0((TrackingData) obj);
                }
            });
        } else if (code == 9000) {
            this.analyticsEngine.h(C14476c.a("event: menu help"), new Function1() { // from class: ps.T
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return d0.s0((TrackingData) obj);
                }
            });
        } else {
            if (code != 536871032) {
                return;
            }
            this.analyticsEngine.h(C14476c.a("event: menu coupons"), new Function1() { // from class: ps.Y
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return d0.n0((TrackingData) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m0(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("menu");
        track.h("siteSection", "menu");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n0(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("menu");
        track.v("menu");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o0(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("menu");
        track.v("menu");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p0(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("menu");
        track.v("menu");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q0(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("menu");
        track.v("menu");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r0(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("menu");
        track.v("menu");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s0(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("menu");
        track.v("menu");
        return Unit.f142422a;
    }

    public final d0 H(String title, boolean isCentered) throws PackageManager.NameNotFoundException {
        FullWordEllipsisTextView fullWordEllipsisTextView = new FullWordEllipsisTextView(this.activityContext, null, 0, 6, null);
        fullWordEllipsisTextView.setText(title);
        fullWordEllipsisTextView.setMaxLines(1);
        fullWordEllipsisTextView.setEllipsize(TextUtils.TruncateAt.END);
        fullWordEllipsisTextView.setGravity(17);
        a.C0955a c0955a = new a.C0955a(-1, -2, 17);
        ((ViewGroup.MarginLayoutParams) c0955a).rightMargin = (int) ((72 * this.context.getResources().getDisplayMetrics().density) + 0.5f);
        if (!isCentered) {
            c0955a = new a.C0955a(16);
        }
        fullWordEllipsisTextView.setLayoutParams(c0955a);
        zj.c.a(fullWordEllipsisTextView, true);
        try {
            ActivityInfo activityInfo = this.activityContext.getPackageManager().getActivityInfo(this.activityContext.getComponentName(), 128);
            Intrinsics.i(activityInfo, "getActivityInfo(...)");
            if (activityInfo.theme == Bj.p.f3063g) {
                C13528a.b(fullWordEllipsisTextView, k0.f156572b);
            } else {
                C13528a.b(fullWordEllipsisTextView, k0.f156571a);
            }
        } catch (PackageManager.NameNotFoundException e10) {
            uw.a.INSTANCE.e(e10);
        }
        Toolbar toolbar = this.appBar;
        if (toolbar != null) {
            toolbar.addView(fullWordEllipsisTextView);
        }
        return this;
    }

    public final void I() {
        Menu menu;
        MenuItem menuItemFindItem;
        Menu menu2;
        MenuItem menuItemFindItem2;
        EnumC16377G.Companion companion = EnumC16377G.INSTANCE;
        Integer numValueOf = Integer.valueOf(companion.a(16385).getResId());
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            NavigationView navigationView = this.navigationView;
            if (navigationView != null && (menu2 = navigationView.getMenu()) != null && (menuItemFindItem2 = menu2.findItem(iIntValue)) != null) {
                menuItemFindItem2.setVisible(this.featureManager.e(AbstractC18227f.C18238l.f170588h));
            }
        }
        Integer numValueOf2 = Integer.valueOf(companion.a(268440656).getResId());
        Integer num = numValueOf2.intValue() != 0 ? numValueOf2 : null;
        if (num != null) {
            int iIntValue2 = num.intValue();
            NavigationView navigationView2 = this.navigationView;
            if (navigationView2 == null || (menu = navigationView2.getMenu()) == null || (menuItemFindItem = menu.findItem(iIntValue2)) == null) {
                return;
            }
            menuItemFindItem.setVisible(this.featureManager.e(AbstractC18227f.p0.f170595h));
        }
    }

    public final void J() {
        DrawerLayout drawerLayout = this.drawer;
        if (drawerLayout != null) {
            drawerLayout.f(8388611);
        }
        DrawerLayout drawerLayout2 = this.drawer;
        if (drawerLayout2 != null) {
            drawerLayout2.announceForAccessibility(this.context.getString(j0.f156556f));
        }
    }

    /* renamed from: M, reason: from getter */
    public final androidx.appcompat.app.b getActionBarDrawerToggle() {
        return this.actionBarDrawerToggle;
    }

    public final boolean P(AppCompatActivity fromActivity, Intent toIntent) {
        Intrinsics.j(fromActivity, "fromActivity");
        Intrinsics.j(toIntent, "toIntent");
        ComponentName component = toIntent.getComponent();
        return component == null || !Intrinsics.e(fromActivity.getClass().getName(), component.getClassName());
    }

    public final void V(boolean dialogsEnabled) {
        this.dialogsEnabled = dialogsEnabled;
    }

    public final void W(c listener) {
        this.onLaunchActivityForResultListener = listener;
    }

    public final void X(e listener) {
        this.onDrawerOpenListener = listener;
    }

    public final void c0() {
        NavigationView navigationView = this.navigationView;
        View viewN = navigationView != null ? navigationView.n(0) : null;
        NavigationViewHeader navigationViewHeader = viewN instanceof NavigationViewHeader ? (NavigationViewHeader) viewN : null;
        if (navigationViewHeader == null) {
            return;
        }
        ImageButton imageButton = (ImageButton) navigationViewHeader.findViewById(g0.f156514c);
        if (imageButton != null) {
            imageButton.setOnClickListener(new View.OnClickListener() { // from class: ps.U
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d0.Z(this.f156430a, view);
                }
            });
        }
        if (this.userManager.b()) {
            ConstraintLayout constraintLayout = (ConstraintLayout) navigationViewHeader.findViewById(g0.f156525n);
            final ImageView imageView = (ImageView) constraintLayout.findViewById(g0.f156516e);
            final TextView textView = (TextView) constraintLayout.findViewById(g0.f156515d);
            constraintLayout.setVisibility(0);
            io.reactivex.l<tk.c<ShoppingCart>> lVarObserveOn = this.cartRepository.c().distinctUntilChanged().subscribeOn(C14764a.b()).observeOn(Mu.a.a());
            final Function1 function1 = new Function1() { // from class: ps.V
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return d0.a0(this.f156431a, imageView, textView, (tk.c) obj);
                }
            };
            Ck.a.a(lVarObserveOn.subscribe(new Pu.g() { // from class: ps.W
                @Override // Pu.g
                public final void accept(Object obj) {
                    d0.b0(function1, obj);
                }
            }), this.disposables);
        }
    }

    @Override // com.google.android.material.navigation.NavigationView.d
    public boolean d(MenuItem item) {
        Intrinsics.j(item, "item");
        Q(N(item));
        return false;
    }

    public final void e0() {
        Menu menu;
        NavigationView navigationView = this.navigationView;
        if (navigationView == null || (menu = navigationView.getMenu()) == null) {
            return;
        }
        menu.findItem(g0.f156531t).setTitle(this.context.getString(Bj.o.f3003Y));
        menu.findItem(g0.f156536y).setTitle(this.context.getString(Bj.o.f3008b0));
    }

    public final void g0() {
        Menu menu;
        MenuItem menuItemFindItem;
        Menu menu2;
        MenuItem menuItemFindItem2;
        NavigationView navigationView = this.navigationView;
        if (navigationView != null && (menu2 = navigationView.getMenu()) != null && (menuItemFindItem2 = menu2.findItem(g0.f156523l)) != null) {
            menuItemFindItem2.setVisible(this.userManager.b());
        }
        NavigationView navigationView2 = this.navigationView;
        if (navigationView2 == null || (menu = navigationView2.getMenu()) == null || (menuItemFindItem = menu.findItem(g0.f156506C)) == null) {
            return;
        }
        if (!this.featureManager.e(AbstractC18227f.O.f170554h)) {
            menuItemFindItem = null;
        }
        if (menuItemFindItem != null) {
            menuItemFindItem.setIcon(Bj.i.f2693S1);
        }
    }

    public final void h0() {
        Menu menu;
        MenuItem menuItemFindItem;
        Integer numValueOf = Integer.valueOf(EnumC16377G.INSTANCE.a(8266).getResId());
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            NavigationView navigationView = this.navigationView;
            if (navigationView == null || (menu = navigationView.getMenu()) == null || (menuItemFindItem = menu.findItem(iIntValue)) == null) {
                return;
            }
            menuItemFindItem.setVisible(this.featureManager.e(AbstractC18227f.H.f170547h));
        }
    }

    public final void t0(boolean isLoggedIn) {
        Menu menu;
        MenuItem menuItemFindItem;
        NavigationView navigationView = this.navigationView;
        if (navigationView == null || (menu = navigationView.getMenu()) == null || (menuItemFindItem = menu.findItem(g0.f156507D)) == null) {
            return;
        }
        menuItemFindItem.setVisible(isLoggedIn);
    }

    public final void u0(boolean isDevMode) {
        Menu menu;
        MenuItem menuItemFindItem;
        Menu menu2;
        MenuItem menuItemFindItem2;
        Menu menu3;
        MenuItem menuItemFindItem3;
        NavigationView navigationView = this.navigationView;
        if (navigationView != null && (menu3 = navigationView.getMenu()) != null && (menuItemFindItem3 = menu3.findItem(g0.f156524m)) != null) {
            menuItemFindItem3.setVisible(isDevMode);
        }
        NavigationView navigationView2 = this.navigationView;
        if (navigationView2 != null && (menu2 = navigationView2.getMenu()) != null && (menuItemFindItem2 = menu2.findItem(g0.f156512a)) != null) {
            menuItemFindItem2.setVisible(isDevMode);
        }
        NavigationView navigationView3 = this.navigationView;
        if (navigationView3 == null || (menu = navigationView3.getMenu()) == null || (menuItemFindItem = menu.findItem(g0.f156522k)) == null) {
            return;
        }
        menuItemFindItem.setVisible(isDevMode);
    }

    public final void v0() {
        NavigationView navigationView = this.navigationView;
        if (navigationView != null) {
            View viewN = navigationView.n(0);
            NavigationViewHeader navigationViewHeader = viewN instanceof NavigationViewHeader ? (NavigationViewHeader) viewN : null;
            if (navigationViewHeader == null) {
                return;
            }
            this.header = navigationViewHeader;
            navigationViewHeader.C();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(d0 d0Var, View view) {
        d0Var.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final /* synthetic */ d x(d0 d0Var) {
        d0Var.getClass();
        return null;
    }

    public static final /* synthetic */ f z(d0 d0Var) {
        d0Var.getClass();
        return null;
    }

    public final d0 G(int resourceId) {
        androidx.appcompat.app.a aVarO = O();
        if (aVarO != null) {
            aVarO.t(false);
        }
        return H(this.context.getResources().getString(resourceId), false);
    }

    public final d0 Y(CharSequence title) {
        androidx.appcompat.app.a aVarO = O();
        if (aVarO != null) {
            aVarO.B(title);
            aVarO.u(false);
            aVarO.t(true);
        }
        return this;
    }

    @Override // ps.e0
    public void a() {
        J();
        this.activityContext.startActivity(Al.k.b(this.context, false, null, null, null, null, null, 126, null));
    }

    @Override // ps.e0
    public void b(int storeId, String storeName) {
        J();
        this.activityContext.startActivity(Al.s.d(this.context, storeId, storeName, ok.i.f153984b, false, 16, null));
    }

    @Override // ps.e0
    public void c() {
        J();
        this.activityContext.startActivity(Al.f.f666a.a(this.context, this.featureManager.e(AbstractC18227f.h0.f170581h)));
    }

    @Override // ps.e0
    public void e(int code) {
        Q(code);
    }

    @Override // ps.e0
    public void g() {
        J();
        this.activityContext.startActivity(Al.l.f673a.c(this.context));
    }

    public final d0 k0(int upButtonResourceId) {
        androidx.appcompat.app.a aVarO = O();
        if (aVarO != null) {
            aVarO.z(true);
            aVarO.s(true);
            aVarO.x(upButtonResourceId);
        }
        L(false);
        return this;
    }
}
