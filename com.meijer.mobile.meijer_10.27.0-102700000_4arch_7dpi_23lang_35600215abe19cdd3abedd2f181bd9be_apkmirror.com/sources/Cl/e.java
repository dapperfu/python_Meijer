package Cl;

import Al.h;
import Al.l;
import Al.m;
import Al.n;
import Al.o;
import Al.p;
import Al.s;
import Bj.r;
import Jk.AppVersion;
import Js.WeeklyAdItem;
import Rk.CouponOptions;
import Tq.j;
import ae.C5597b;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.UriMatcher;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.a;
import androidx.browser.customtabs.d;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.medallia.digital.mobilesdk.MDExternalError;
import com.medallia.digital.mobilesdk.MDResultCallback;
import com.medallia.digital.mobilesdk.MedalliaDigital;
import com.meijer.mobile.core.models.coupon.CouponAd;
import com.meijer.mobile.featurenavigation.content.DailyAlarmService;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import mk.l;
import ok.i;
import yl.AbstractC18227f;
import yl.k;

@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 [2\u00020\u0001:\u0001;B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0018\u001a\u00020\u0017*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J5\u0010 \u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\"\u0010#J\u001b\u0010$\u001a\u0004\u0018\u00010\u00172\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b(\u0010'J\u001f\u0010*\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u001eH\u0002¢\u0006\u0004\b*\u0010+J9\u00100\u001a\u0004\u0018\u00010\u001e2\b\u0010,\u001a\u0004\u0018\u00010\u00152\b\u0010-\u001a\u0004\u0018\u00010\u00152\b\u0010.\u001a\u0004\u0018\u00010\u00152\b\u0010/\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u0015¢\u0006\u0004\b2\u00103J\u0015\u00104\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u001e¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b6\u0010\u0014J\u0015\u00108\u001a\u00020\u00122\u0006\u00107\u001a\u00020\u0015¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u001e2\b\u0010:\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b;\u0010<J!\u0010=\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010)\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b=\u0010>J1\u0010?\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b?\u0010@J\u001f\u0010B\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010A\u001a\u00020\u0015¢\u0006\u0004\bB\u0010CJ'\u0010D\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\bD\u0010EJ+\u0010F\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\bF\u0010GJ\u001d\u0010I\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010H\u001a\u00020\u0012¢\u0006\u0004\bI\u0010JJ%\u0010M\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010K\u001a\u00020\u00122\u0006\u0010L\u001a\u00020\u0012¢\u0006\u0004\bM\u0010NJ)\u0010Q\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010P\u001a\u00020O2\b\b\u0002\u0010L\u001a\u00020\u0012H\u0007¢\u0006\u0004\bQ\u0010RJ%\u0010U\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010T\u001a\u00020S2\u0006\u0010L\u001a\u00020\u0012¢\u0006\u0004\bU\u0010VJ%\u0010Y\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010X\u001a\u00020W2\u0006\u0010L\u001a\u00020\u0012¢\u0006\u0004\bY\u0010ZJ\u0015\u0010[\u001a\u00020\u00172\u0006\u0010P\u001a\u00020O¢\u0006\u0004\b[\u0010\\J9\u0010b\u001a\u00020\u00172\u0006\u0010P\u001a\u00020]2\u0006\u0010^\u001a\u00020\u00122\u0006\u0010_\u001a\u00020\u00122\u0006\u0010`\u001a\u00020\u00122\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\bb\u0010cJ-\u0010i\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010e\u001a\u00020d2\u0006\u0010g\u001a\u00020f2\u0006\u0010h\u001a\u00020\u0012¢\u0006\u0004\bi\u0010jJ5\u0010l\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010k\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\u00152\u0006\u0010h\u001a\u00020\u0012¢\u0006\u0004\bl\u0010mJ=\u0010r\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010o\u001a\u00020n2\b\b\u0002\u0010h\u001a\u00020\u00122\b\b\u0002\u0010p\u001a\u00020\u00122\b\b\u0002\u0010q\u001a\u00020\u0010¢\u0006\u0004\br\u0010sJ\u0015\u0010t\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\bt\u0010'J\u0015\u0010u\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\bu\u0010\u0014J)\u0010v\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010)\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\bv\u0010wJ\u0017\u0010y\u001a\u00020\u00172\u0006\u0010x\u001a\u00020\u0015H\u0007¢\u0006\u0004\by\u0010zJ\u001d\u0010|\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010{\u001a\u00020\u0010¢\u0006\u0004\b|\u0010}J*\u0010\u0080\u0001\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010~\u001a\u00020\u00122\b\u0010\u007f\u001a\u0004\u0018\u00010\u0015¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u001f\u0010\u0082\u0001\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010~\u001a\u00020\u0012¢\u0006\u0005\b\u0082\u0001\u0010JJ\u0017\u0010\u0083\u0001\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0005\b\u0083\u0001\u0010'J\u001f\u0010\u0084\u0001\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u00107\u001a\u00020\u0015¢\u0006\u0005\b\u0084\u0001\u0010>J\u0017\u0010\u0085\u0001\u001a\u00020\u00172\u0006\u00107\u001a\u00020\u0015¢\u0006\u0005\b\u0085\u0001\u0010zJB\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010,\u001a\u0004\u0018\u00010\u00152\b\u0010-\u001a\u0004\u0018\u00010\u00152\b\u0010.\u001a\u0004\u0018\u00010\u00152\b\u0010/\u001a\u0004\u0018\u00010\u0015¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J!\u0010\u0089\u0001\u001a\u00030\u0088\u00012\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u00107\u001a\u00020\u0015¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u001f\u0010\u008b\u0001\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u00107\u001a\u00020\u0015¢\u0006\u0005\b\u008b\u0001\u0010>J\u0019\u0010\u008d\u0001\u001a\u00030\u008c\u00012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u0019\u0010\u008f\u0001\u001a\u00030\u0088\u00012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u0019\u0010\u0091\u0001\u001a\u00030\u0088\u00012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0006\b\u0091\u0001\u0010\u0090\u0001J\u0019\u0010\u0092\u0001\u001a\u00030\u0088\u00012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0006\b\u0092\u0001\u0010\u0090\u0001J\u0017\u0010\u0093\u0001\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0005\b\u0093\u0001\u0010'J\u0017\u0010\u0094\u0001\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0005\b\u0094\u0001\u0010'J\u0019\u0010\u0095\u0001\u001a\u00020\u00172\u0006\u0010x\u001a\u00020\u0015H\u0007¢\u0006\u0005\b\u0095\u0001\u0010zJ\u0019\u0010\u0097\u0001\u001a\u00030\u0096\u00012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u0019\u0010\u0099\u0001\u001a\u00030\u0096\u00012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0006\b\u0099\u0001\u0010\u0098\u0001J\u0017\u0010\u009a\u0001\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0005\b\u009a\u0001\u0010'J\u0017\u0010\u009b\u0001\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0005\b\u009b\u0001\u0010'J\u0018\u0010\u009c\u0001\u001a\u00020\u00172\u0006\u0010X\u001a\u00020W¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u000f\u0010\u009e\u0001\u001a\u00020\u0017¢\u0006\u0005\b\u009e\u0001\u0010#J\u000f\u0010\u009f\u0001\u001a\u00020\u0017¢\u0006\u0005\b\u009f\u0001\u0010#R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b;\u0010 \u0001R\u0016\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010¡\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b \u0010¢\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b&\u0010£\u0001R\u001a\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\u000f\n\u0005\bi\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bb\u0010§\u0001R\u0018\u0010«\u0001\u001a\u00030¨\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001¨\u0006¬\u0001"}, d2 = {"LCl/e;", "", "Lyl/k;", "featureManager", "LTq/j;", "storeProvider", "Lyo/k;", "userManager", "LAl/g;", "featureEntryPoint", "LCl/g;", "mPerksLinkParser", "LJk/a;", "appVersion", "<init>", "(Lyl/k;LTq/j;Lyo/k;LAl/g;LCl/g;LJk/a;)V", "", "code", "", "h0", "(I)Z", "", "carouselTitle", "Landroid/content/Intent;", "g0", "(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;", "Landroid/content/Context;", "context", "Landroid/os/Bundle;", "bundle", "Landroid/net/Uri;", "originalUri", "c", "(Landroid/content/Context;ILandroid/os/Bundle;Landroid/net/Uri;)Landroid/content/Intent;", "j0", "()Landroid/content/Intent;", "K", "(Landroid/net/Uri;)Landroid/content/Intent;", "d", "(Landroid/content/Context;)Landroid/content/Intent;", "y", "uri", "c0", "(Landroid/content/Context;Landroid/net/Uri;)Z", "streetAddress", "city", "state", "zip", "T", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;", "P", "(Ljava/lang/String;)I", "O", "(Landroid/net/Uri;)I", "i0", "url", "b0", "(Ljava/lang/String;)Z", "universalDeepLink", "a", "(Landroid/net/Uri;)Landroid/net/Uri;", "n", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;", "R", "(Landroid/content/Context;Landroid/net/Uri;ILjava/lang/String;)Landroid/content/Intent;", "departmentName", "Z", "(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;", "Y", "(Landroid/net/Uri;Landroid/content/Context;I)Landroid/content/Intent;", "s", "(Landroid/content/Context;ILandroid/os/Bundle;)Landroid/content/Intent;", "isNewFeatureEnabled", "D", "(Landroid/content/Context;Z)Landroid/content/Intent;", "fromShopAndScan", "newShoppingList", "C", "(Landroid/content/Context;ZZ)Landroid/content/Intent;", "Lmk/l$b;", "coupon", "F", "(Landroid/content/Context;Lmk/l$b;Z)Landroid/content/Intent;", "LJs/b;", "weeklyAdItem", "E", "(Landroid/content/Context;LJs/b;Z)Landroid/content/Intent;", "Lmk/f;", "product", "G", "(Landroid/content/Context;Lmk/f;Z)Landroid/content/Intent;", "h", "(Lmk/l$b;)Landroid/content/Intent;", "LOk/c;", "showPrimary", "showSecondary", "cdpFromSearch", "previousTrackAction", "f", "(LOk/c;ZZZLjava/lang/String;)Landroid/content/Intent;", "Lcom/meijer/mobile/core/models/coupon/CouponAd;", "couponAd", "LRk/a;", "couponOptions", "isNewCouponListPageEnabled", "e", "(Landroid/content/Context;Lcom/meijer/mobile/core/models/coupon/CouponAd;LRk/a;Z)Landroid/content/Intent;", "specialOffersUrl", "k", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Landroid/content/Intent;", "LPk/c;", "defaultPage", "isNewCouponsDashboard", "newCouponListPageTabIndex", "i", "(Landroid/content/Context;LPk/c;ZZI)Landroid/content/Intent;", "w", "a0", "L", "(Landroid/content/Context;ILandroid/net/Uri;)Landroid/content/Intent;", "phoneNumber", "A", "(Ljava/lang/String;)Landroid/content/Intent;", "phoneNumberResourceID", "z", "(Landroid/content/Context;I)Landroid/content/Intent;", "afterLogin", "shortcutID", "q", "(Landroid/content/Context;ZLjava/lang/String;)Landroid/content/Intent;", "p", "b", "o", "r", "x", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;", "", "d0", "(Landroid/content/Context;Ljava/lang/String;)V", "M", "Landroidx/browser/customtabs/d;", "m", "(Landroid/content/Context;)Landroidx/browser/customtabs/d;", "e0", "(Landroid/content/Context;)V", "f0", "v", "J", "B", "N", "Landroid/app/PendingIntent;", "Q", "(Landroid/content/Context;)Landroid/app/PendingIntent;", "V", "W", "X", "I", "(Lmk/f;)Landroid/content/Intent;", "H", "u", "Lyl/k;", "LTq/j;", "Lyo/k;", "LAl/g;", "LCl/g;", "U", "()LCl/g;", "LJk/a;", "Landroid/content/UriMatcher;", "g", "Landroid/content/UriMatcher;", "uriMatcher", "featurenavigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k featureManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j storeProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Al.g featureEntryPoint;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final g mPerksLinkParser;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final AppVersion appVersion;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final UriMatcher uriMatcher;

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Cl/e$b", "Lcom/medallia/digital/mobilesdk/MDResultCallback;", "", "onSuccess", "()V", "Lcom/medallia/digital/mobilesdk/MDExternalError;", "error", "onError", "(Lcom/medallia/digital/mobilesdk/MDExternalError;)V", "featurenavigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements MDResultCallback {
        @Override // com.medallia.digital.mobilesdk.MDResultCallback
        public void onError(MDExternalError error) {
            Intrinsics.j(error, "error");
            uw.a.INSTANCE.d(error.getMessage(), new Object[0]);
        }

        @Override // com.medallia.digital.mobilesdk.MDResultCallback
        public void onSuccess() {
            uw.a.INSTANCE.a("Success Showing Medallia Form", new Object[0]);
        }

        b() {
        }
    }

    private final Intent c(Context context, int code, Bundle bundle, Uri originalUri) {
        if (code != -1 && code != 0) {
            if (code == 164) {
                return p.f690a.c(context, this.userManager.b(), 164);
            }
            if (code == 165) {
                return p.f690a.c(context, this.userManager.b(), 165);
            }
            if (code == 168) {
                return p.f690a.c(context, this.userManager.b(), 168);
            }
            if (code == 169) {
                return p.f690a.a(context);
            }
            if (code == 400) {
                return s.f(context, i.f153985c, null, false, false, 0, null, false, 252, null);
            }
            if (code == 401) {
                return s.d(context, 0, null, i.f153985c, false, 16, null);
            }
            if (code == 1000) {
                return Al.d.f664a.d(context);
            }
            if (code == 1001) {
                return Al.d.b(context, true, 0, 4, null);
            }
            if (code == 1200) {
                Intent intent = m(context).f47181a;
                String string = context.getString(n.f683g);
                Intrinsics.i(string, "getString(...)");
                return intent.setData(Uri.parse(string));
            }
            if (code == 1201) {
                Intent intent2 = m(context).f47181a;
                String string2 = context.getString(n.f686j);
                Intrinsics.i(string2, "getString(...)");
                return intent2.setData(Uri.parse(string2));
            }
            if (code == 1500) {
                Intent intent3 = m(context).f47181a;
                String string3 = context.getString(n.f679c);
                Intrinsics.i(string3, "getString(...)");
                return intent3.setData(Uri.parse(string3));
            }
            if (code == 1501) {
                return this.featureEntryPoint.q();
            }
            if (code == 8100) {
                return Al.j.a(context, "action.com.meijer.mobile.theme_catalog");
            }
            if (code == 8101) {
                return this.featureEntryPoint.a();
            }
            if (code == 9000) {
                return Al.a.f661a.c(context, false);
            }
            if (code != 9001) {
                switch (code) {
                    case 160:
                        return p.f690a.c(context, this.userManager.b(), 160);
                    case 180:
                        return Al.g.B(this.featureEntryPoint, null, 1, null);
                    case HttpResponseStatus.SUCCESS_OK /* 200 */:
                        return D(context, this.featureManager.e(AbstractC18227f.O.f170554h));
                    case 700:
                        return Al.k.b(context, false, null, null, null, null, null, 126, null);
                    case 1100:
                        Intent intent4 = m(context).f47181a;
                        String string4 = context.getString(n.f685i);
                        Intrinsics.i(string4, "getString(...)");
                        intent4.setData(Uri.parse(string4));
                        return intent4;
                    case 1700:
                        Intent intent5 = m(context).f47181a;
                        Intrinsics.i(intent5, "intent");
                        String string5 = context.getString(n.f684h);
                        Intrinsics.i(string5, "getString(...)");
                        intent5.setData(Uri.parse(string5));
                        return intent5;
                    case 1901:
                        Intent intent6 = m(context).f47181a;
                        Intrinsics.i(intent6, "intent");
                        String string6 = context.getString(n.f681e);
                        Intrinsics.i(string6, "getString(...)");
                        intent6.setData(Uri.parse(string6));
                        return intent6;
                    case 7256:
                        return this.featureEntryPoint.i();
                    case 8266:
                        MedalliaDigital.setCustomParameter("HOME_STORE_NAME", this.storeProvider.e());
                        MedalliaDigital.showForm("9234", new b());
                        return null;
                    case 16385:
                        return Al.j.a(context, "action.com.meijer.mobile.chatbot");
                    case 268436157:
                        return Al.a.f661a.h(context, this.featureManager.e(AbstractC18227f.C18228a.f170566h));
                    case 268436158:
                        return Al.a.e(Al.a.f661a, context, false, false, 6, null);
                    case 268436159:
                        return Al.a.f661a.i(context);
                    case 268436160:
                        return Al.a.f661a.a(context);
                    case 268436161:
                        return Al.a.f661a.b(context);
                    case 268437056:
                        return d(context);
                    case 268437456:
                        return l(this, context, null, null, this.featureManager.e(AbstractC18227f.M.f170552h), 6, null);
                    case 268437756:
                        return j0();
                    case 268437856:
                        return this.featureEntryPoint.d();
                    case 268437956:
                        return l.f(l.f673a, context, false, 2, null);
                    case 268437957:
                        return l.f673a.e(context, true);
                    case 268440656:
                        return K(originalUri);
                    case 268440657:
                        return o.f(o.f689a, context, null, 2, null);
                    case 536871013:
                    case 536871032:
                        return j(this, context, Pk.c.f28328d, this.featureManager.e(AbstractC18227f.M.f170552h), this.featureManager.e(AbstractC18227f.N.f170553h), 0, 16, null);
                    case 536871042:
                        return j(this, context, Pk.c.f28329e, this.featureManager.e(AbstractC18227f.M.f170552h), this.featureManager.e(AbstractC18227f.N.f170553h), 0, 16, null);
                    case 536871412:
                        return bundle != null ? this.featureEntryPoint.F(0, bundle.getInt("com.meijer.mobile.meijer.activity.weeklyad.product")) : Al.g.G(this.featureEntryPoint, 0, 0, 3, null);
                    case 536871812:
                        return s.f(context, null, null, true, false, 0, null, false, 244, null);
                    case 536871862:
                        return this.featureManager.e(AbstractC18227f.t0.f170605h) ? h.c(context, null, null, null, false, null, 60, null) : h.g(context, null, null, null, false, null, 60, null);
                    case 536872912:
                        return this.featureManager.e(AbstractC18227f.t0.f170605h) ? h.c(context, Pp.b.f28356a, bundle, null, false, null, 56, null) : h.g(context, Pp.b.f28356a, bundle, null, false, null, 56, null);
                    case 536873012:
                        return this.featureManager.e(AbstractC18227f.t0.f170605h) ? h.e(context, false, 2, null) : h.i(context, false, 2, null);
                    case 805309268:
                        return l.f673a.c(context);
                    case 805309368:
                        return y(context);
                    case 805309371:
                        return y(context);
                    default:
                        return null;
                }
            }
        }
        return p(context, false);
    }

    public e(k featureManager, j storeProvider, yo.k userManager, Al.g featureEntryPoint, g mPerksLinkParser, AppVersion appVersion) {
        Intrinsics.j(featureManager, "featureManager");
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(featureEntryPoint, "featureEntryPoint");
        Intrinsics.j(mPerksLinkParser, "mPerksLinkParser");
        Intrinsics.j(appVersion, "appVersion");
        this.featureManager = featureManager;
        this.storeProvider = storeProvider;
        this.userManager = userManager;
        this.featureEntryPoint = featureEntryPoint;
        this.mPerksLinkParser = mPerksLinkParser;
        this.appVersion = appVersion;
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI("login", null, 268435456);
        uriMatcher.addURI("accounts", null, 268436157);
        uriMatcher.addURI("accounts", "profile", 268436158);
        uriMatcher.addURI("accounts", "preferences", 268436159);
        uriMatcher.addURI("accounts", "addresses", 268436160);
        uriMatcher.addURI("accounts", "payments", 268436161);
        uriMatcher.addURI("accounts", "general", 268436157);
        uriMatcher.addURI("dashboard", null, 0);
        uriMatcher.addURI("mperks", null, 536871013);
        uriMatcher.addURI("mperks", "coupons", 536871032);
        uriMatcher.addURI("mperks", "coupons/available", 536871022);
        uriMatcher.addURI("mperks", "coupons/clipped", 536871042);
        uriMatcher.addURI("mperks", "bundle", 536871062);
        uriMatcher.addURI("mperks", "coupons/bundles", 536871052);
        uriMatcher.addURI("mperks", "shopping/coupons", 536871052);
        uriMatcher.addURI("mperks", "shopping/coupons/bundles", 536871052);
        uriMatcher.addURI("mperks", "personal/#", 164);
        uriMatcher.addURI("mperks", "wallet/coupons", 536871042);
        uriMatcher.addURI("mperks", "wallet/rewards", 164);
        uriMatcher.addURI("mperks", "wallet/rewards/#", 164);
        uriMatcher.addURI("mperks", "tabId", 160);
        uriMatcher.addURI("mperks", "rewards", 160);
        uriMatcher.addURI("mperks", "rewards/inprogress", 164);
        uriMatcher.addURI("mperks", "rewards/available", 168);
        uriMatcher.addURI("mperks", "rewards/rewards", 160);
        uriMatcher.addURI("mperks", "rewards/earned", 164);
        uriMatcher.addURI("mperks", "rewards/earn", 164);
        uriMatcher.addURI("mperks", "rewards/claim", 165);
        uriMatcher.addURI("mperks", "specialoffers", 268437456);
        uriMatcher.addURI("mperks", "receipts", 1000);
        uriMatcher.addURI("mperks", "learntoearnmperks", 169);
        uriMatcher.addURI("shopandscan", null, 268437756);
        uriMatcher.addURI(PlaceTypes.PHARMACY, null, 160);
        uriMatcher.addURI("mcardrewards", null, 160);
        uriMatcher.addURI("creditcard", null, 160);
        uriMatcher.addURI("weeklyad", null, 536871412);
        uriMatcher.addURI("receipts", null, 1000);
        uriMatcher.addURI("receipts", "addreceipt", 1001);
        uriMatcher.addURI("personal", null, 164);
        uriMatcher.addURI("shoppinglist", null, HttpResponseStatus.SUCCESS_OK);
        uriMatcher.addURI("findstore", null, HttpResponseStatus.ERROR_BAD_REQUEST);
        uriMatcher.addURI("mcardrewardterms", null, 1500);
        uriMatcher.addURI("mcardrewardoptin", null, 1501);
        uriMatcher.addURI("settings", "barcode", 268437056);
        uriMatcher.addURI("scan", null, 536873012);
        uriMatcher.addURI("mperkscoupons", null, 536871032);
        uriMatcher.addURI("orderhistory", null, 268437956);
        uriMatcher.addURI("orderhistory", "in-store receipts", 268437957);
        uriMatcher.addURI("mperks", "/services/more-ways-to-meijer", 805309268);
        uriMatcher.addURI("mperks", "shop/en/my-account/order/#", 268438056);
        uriMatcher.addURI("mperks", "shop/en/cart", 268437856);
        uriMatcher.addURI("mperks", "shopping/cart", 268437856);
        uriMatcher.addURI("products", "detail", 536873712);
        uriMatcher.addURI("products", "personalized", 805309368);
        uriMatcher.addURI("plp", "upc", 805309371);
        uriMatcher.addURI("productlist", null, 536873612);
        uriMatcher.addURI("mperks", "content/meijer-tracker/en/home", 805309369);
        uriMatcher.addURI("mperks", "c", 805309370);
        uriMatcher.addURI("mperks", "adobe/griffon", 9001);
        uriMatcher.addURI("products", "collections", 4100);
        uriMatcher.addURI("shopdepartments", "products", 4000);
        uriMatcher.addURI("departments", null, 4200);
        uriMatcher.addURI("shopdepartments", null, 4200);
        uriMatcher.addURI("teacherlists", null, 268440656);
        this.uriMatcher = uriMatcher;
    }

    private final Intent K(Uri originalUri) {
        Intent intentZ = this.featureEntryPoint.z();
        String queryParameter = originalUri != null ? originalUri.getQueryParameter("cmpid") : null;
        if (queryParameter != null && queryParameter.length() != 0) {
            intentZ.putExtra("cmpid", originalUri != null ? originalUri.getQueryParameter("cmpid") : null);
        }
        return intentZ;
    }

    public static /* synthetic */ Intent S(e eVar, Context context, Uri uri, int i10, String str, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str = "";
        }
        return eVar.R(context, uri, i10, str);
    }

    private final boolean c0(Context context, Uri uri) {
        return context.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", uri), 0) != null;
    }

    private final Intent d(Context context) {
        Intent intentPutExtra = Al.g.m(this.featureEntryPoint, false, 1, null).putExtra("com.meijer.intent.extra.mperks_barcode", true);
        Intrinsics.i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    public static /* synthetic */ Intent g(e eVar, Ok.c cVar, boolean z10, boolean z11, boolean z12, String str, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            str = null;
        }
        return eVar.f(cVar, z10, z11, z12, str);
    }

    private final Intent g0(String str, String str2) {
        Intent intentK = this.featureEntryPoint.K(new l.Recommendations(str));
        intentK.putExtra("CAROUSEL_TITLE", str2);
        return intentK;
    }

    private final boolean h0(int code) {
        return ((code & 268435456) == 0 || this.userManager.b()) ? false : true;
    }

    public static /* synthetic */ Intent j(e eVar, Context context, Pk.c cVar, boolean z10, boolean z11, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            cVar = Pk.c.f28328d;
        }
        return eVar.i(context, cVar, (i11 & 4) != 0 ? false : z10, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? 0 : i10);
    }

    private final Intent j0() {
        return this.featureEntryPoint.L(false);
    }

    public static /* synthetic */ Intent l(e eVar, Context context, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        return eVar.k(context, str, str2, z10);
    }

    public static /* synthetic */ Intent t(e eVar, Context context, int i10, Bundle bundle, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            bundle = null;
        }
        return eVar.s(context, i10, bundle);
    }

    private final Intent y(Context context) {
        return Al.g.m(this.featureEntryPoint, false, 1, null);
    }

    public final Intent A(String phoneNumber) {
        Intrinsics.j(phoneNumber, "phoneNumber");
        StringCompanionObject stringCompanionObject = StringCompanionObject.f142841a;
        String str = String.format("tel:%s", Arrays.copyOf(new Object[]{phoneNumber}, 1));
        Intrinsics.i(str, "format(...)");
        return new Intent("android.intent.action.DIAL", Uri.parse(str));
    }

    public final Intent B(Context context) {
        Intrinsics.j(context, "context");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("message/rfc822");
        intent.putExtra("android.intent.extra.EMAIL", new String[]{context.getString(n.f688l)});
        intent.putExtra("android.intent.extra.SUBJECT", context.getString(n.f687k, this.appVersion.getVersionName()));
        intent.setFlags(268435456);
        return intent;
    }

    public final Intent C(Context context, boolean fromShopAndScan, boolean newShoppingList) {
        Intrinsics.j(context, "context");
        Intent intentPutExtra = D(context, newShoppingList).putExtra("com.meijer.intent.extra.SHOPPING_LIST_FROM_SHOP_AND_SCAN", fromShopAndScan);
        Intrinsics.i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    public final Intent D(Context context, boolean isNewFeatureEnabled) {
        Intrinsics.j(context, "context");
        return isNewFeatureEnabled ? this.featureEntryPoint.w() : this.featureEntryPoint.p();
    }

    public final Intent E(Context context, WeeklyAdItem weeklyAdItem, boolean newShoppingList) {
        Intrinsics.j(context, "context");
        Intrinsics.j(weeklyAdItem, "weeklyAdItem");
        Intent intentPutExtra = D(context, newShoppingList).putExtra("com.meijer.intent.extra.SHOPPING_LIST_AD", weeklyAdItem);
        Intrinsics.i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    @JvmOverloads
    public final Intent F(Context context, l.Coupon coupon, boolean newShoppingList) {
        Intrinsics.j(context, "context");
        Intrinsics.j(coupon, "coupon");
        Intent intentPutExtra = D(context, newShoppingList).putExtra("com.meijer.intent.extra.SHOPPING_LIST_COUPON", coupon);
        Intrinsics.i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    public final Intent G(Context context, mk.f product, boolean newShoppingList) {
        Intrinsics.j(context, "context");
        Intrinsics.j(product, "product");
        Intent intentPutExtra = D(context, newShoppingList).putExtra("com.meijer.intent.extra.SHOPPING_LIST_PRODUCT", product);
        Intrinsics.i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    public final Intent H() {
        return this.featureEntryPoint.x();
    }

    public final Intent I(mk.f product) {
        Intrinsics.j(product, "product");
        return this.featureEntryPoint.y(product);
    }

    public final Intent J(Context context) {
        Intrinsics.j(context, "context");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("message/rfc822");
        intent.putExtra("android.intent.extra.EMAIL", new String[]{context.getString(n.f688l)});
        intent.putExtra("android.intent.extra.SUBJECT", context.getString(n.f680d, this.appVersion.getVersionName()));
        return intent;
    }

    public final Intent L(Context context, int code, Uri uri) {
        Intrinsics.j(context, "context");
        if (h0(code)) {
            return uri == null ? Al.k.b(context, false, null, Integer.valueOf(code), null, null, null, 118, null) : Al.k.d(context, false, null, uri.toString(), null, null, null, 118, null);
        }
        if (i0(code)) {
            new Bl.a(context, code, uri).g();
        }
        return null;
    }

    public final Intent M(Context context, String url) {
        Intrinsics.j(context, "context");
        Intrinsics.j(url, "url");
        Intent intent = new Intent("action.com.meijer.mobile.webview.bypass.universallink").setPackage(context.getPackageName());
        Intrinsics.i(intent, "setPackage(...)");
        intent.putExtra("extra.bypass.universal.link.url", url);
        return intent;
    }

    public final Intent N(String phoneNumber) {
        Intrinsics.j(phoneNumber, "phoneNumber");
        return new Intent("android.intent.action.DIAL", Uri.parse("tel:" + phoneNumber));
    }

    public final int O(Uri uri) {
        Intrinsics.j(uri, "uri");
        return this.uriMatcher.match(uri);
    }

    public final int P(String uri) {
        Intrinsics.j(uri, "uri");
        UriMatcher uriMatcher = this.uriMatcher;
        Locale locale = Locale.getDefault();
        Intrinsics.i(locale, "getDefault(...)");
        String lowerCase = uri.toLowerCase(locale);
        Intrinsics.i(lowerCase, "toLowerCase(...)");
        return uriMatcher.match(Uri.parse(lowerCase));
    }

    public final PendingIntent Q(Context context) {
        Intrinsics.j(context, "context");
        PendingIntent service = PendingIntent.getService(context, 0, new Intent(context, (Class<?>) DailyAlarmService.class), 201326592);
        Intrinsics.i(service, "getService(...)");
        return service;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.Intent R(android.content.Context r13, android.net.Uri r14, int r15, java.lang.String r16) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Cl.e.R(android.content.Context, android.net.Uri, int, java.lang.String):android.content.Intent");
    }

    /* renamed from: U, reason: from getter */
    public final g getMPerksLinkParser() {
        return this.mPerksLinkParser;
    }

    public final PendingIntent V(Context context) {
        Intrinsics.j(context, "context");
        PendingIntent activity = PendingIntent.getActivity(context, 0, W(context), 201326592);
        Intrinsics.i(activity, "getActivity(...)");
        return activity;
    }

    public final Intent W(Context context) {
        Intrinsics.j(context, "context");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("market://details?id=" + context.getPackageName()));
        return intent;
    }

    public final Intent X(Context context) {
        Intrinsics.j(context, "context");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=" + context.getPackageName()));
        return intent;
    }

    public final Intent Y(Uri originalUri, Context context, int code) {
        String strG;
        List listA1;
        String str;
        Intrinsics.j(originalUri, "originalUri");
        Intrinsics.j(context, "context");
        String queryParameter = originalUri.getQueryParameter("collectionId");
        if (queryParameter == null) {
            queryParameter = "";
        }
        String str2 = queryParameter;
        if (str2.length() <= 0) {
            return c(context, code, null, originalUri);
        }
        Al.g gVar = this.featureEntryPoint;
        String queryParameter2 = originalUri.getQueryParameter("icid");
        if (queryParameter2 == null || (listA1 = StringsKt.a1(queryParameter2, new String[]{":"}, false, 0, 6, null)) == null || (str = (String) CollectionsKt.F0(listA1)) == null || (strG = Fk.e.e(str, null, 1, null)) == null) {
            strG = Fk.e.g(StringsKt.Q(str2, "-", " ", false, 4, null));
        }
        Intent intentK = Al.g.k(gVar, new l.BrowseCollection(str2, strG), null, null, null, null, 30, null);
        String queryParameter3 = originalUri.getQueryParameter("cmpid");
        if (queryParameter3 != null && queryParameter3.length() != 0) {
            intentK.putExtra("cmpid", originalUri.getQueryParameter("cmpid"));
        }
        if (originalUri.getQueryParameter("sort_order") != null) {
            intentK.putExtra("product_sort_filter_deeplink", originalUri);
        }
        return intentK;
    }

    public final Intent Z(Uri originalUri, String departmentName) {
        Intrinsics.j(originalUri, "originalUri");
        Intrinsics.j(departmentName, "departmentName");
        String queryParameter = originalUri.getQueryParameter("department");
        if (queryParameter == null) {
            queryParameter = "";
        }
        String strP = StringsKt.P(queryParameter, 'T', 'L', false, 4, null);
        if (StringsKt.r0(strP)) {
            return null;
        }
        return Al.g.k(this.featureEntryPoint, new l.Department(strP, departmentName), null, null, null, null, 30, null);
    }

    public final Uri a(Uri universalDeepLink) {
        return this.mPerksLinkParser.b(universalDeepLink);
    }

    public final Intent b(Context context) {
        Intrinsics.j(context, "context");
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        intent.setFlags(270532608);
        return intent;
    }

    public final boolean b0(String url) {
        Intrinsics.j(url, "url");
        return StringsKt.W(url, "meijerapp", false, 2, null);
    }

    public final void d0(Context context, String url) {
        Intrinsics.j(context, "context");
        Intrinsics.j(url, "url");
        m(context).a(context, Uri.parse(url));
    }

    public final Intent e(Context context, CouponAd couponAd, CouponOptions couponOptions, boolean isNewCouponListPageEnabled) {
        Intrinsics.j(context, "context");
        Intrinsics.j(couponAd, "couponAd");
        Intrinsics.j(couponOptions, "couponOptions");
        if (!isNewCouponListPageEnabled) {
            Intent intentPutExtra = Al.j.a(context, "action.com.meijer.mobile.coupon.coupons_feature").putExtra("com.meijer.intent.extra.EXTRA_COUPON_ACTIVE_PAGE", Pk.c.f28334j).putExtra("com.meijer.intent.extra.EXTRA_COUPON_OPTIONS", couponOptions).putExtra("com.meijer.intent.extra.EXTRA_COUPON_AD_PAGE_URL", couponAd.getImageURL()).putExtra("com.meijer.intent.extra.EXTRA_COUPON_AD_PAGE_TITLE", couponAd.getTitle()).putExtra("com.meijer.intent.extra.EXTRA_COUPON_AD_PAGE_DESCRIPTION", couponAd.getImageDescription());
            Intrinsics.g(intentPutExtra);
            return intentPutExtra;
        }
        Intent intentG = this.featureEntryPoint.g();
        intentG.putExtra("com.meijer.intent.extra.EXTRA_COUPON_ACTIVE_PAGE", Pk.c.f28334j);
        intentG.putExtra("com.meijer.intent.extra.EXTRA_COUPON_OPTIONS", couponOptions);
        intentG.putExtra("com.meijer.intent.extra.EXTRA_COUPON_AD_PAGE_URL", couponAd.getImageURL());
        intentG.putExtra("com.meijer.intent.extra.EXTRA_COUPON_AD_PAGE_TITLE", couponAd.getTitle());
        intentG.putExtra("com.meijer.intent.extra.EXTRA_COUPON_AD_PAGE_DESCRIPTION", couponAd.getImageDescription());
        return intentG;
    }

    public final void e0(Context context) {
        Intrinsics.j(context, "context");
        String string = context.getString(n.f677a);
        Intrinsics.i(string, "getString(...)");
        d0(context, string);
    }

    public final Intent f(Ok.c coupon, boolean showPrimary, boolean showSecondary, boolean cdpFromSearch, String previousTrackAction) {
        Intrinsics.j(coupon, "coupon");
        Intent intentPutExtra = this.featureEntryPoint.f(coupon).putExtra("com.meijer.intent.extra.EXTRA_PREVIOUS_TRACK_ACTION", previousTrackAction).putExtra("com.meijer.intent.extra.EXTRA_COUPON_DETAIL_SHOW_PRIMARY", showPrimary).putExtra("com.meijer.intent.extra.EXTRA_COUPON_DETAIL_SHOW_SECONDARY", showSecondary).putExtra("CDPfromsearch", cdpFromSearch);
        Intrinsics.i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    public final void f0(Context context) {
        Intrinsics.j(context, "context");
        String string = context.getString(n.f678b);
        Intrinsics.i(string, "getString(...)");
        d0(context, string);
    }

    public final Intent h(l.Coupon coupon) {
        Intrinsics.j(coupon, "coupon");
        Intent intentPutExtra = g(this, coupon.getCoupon(), false, false, false, null, 16, null).putExtra("com.meijer.intent.extra.EXTRA_COUPON_DETAIL_FROM_SHOPPINGLIST", true);
        Intrinsics.i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    public final Intent i(Context context, Pk.c defaultPage, boolean isNewCouponListPageEnabled, boolean isNewCouponsDashboard, int newCouponListPageTabIndex) {
        Intrinsics.j(context, "context");
        Intrinsics.j(defaultPage, "defaultPage");
        if (isNewCouponsDashboard) {
            return this.featureEntryPoint.e();
        }
        if (isNewCouponListPageEnabled) {
            Intent intentPutExtra = this.featureEntryPoint.h().putExtra("com.meijer.intent.extra.EXTRA_COUPONS_LIST_TAB_INDEX", newCouponListPageTabIndex);
            Intrinsics.g(intentPutExtra);
            return intentPutExtra;
        }
        Intent intent = new Intent("action.com.meijer.mobile.coupon").setPackage(context.getPackageName());
        Intrinsics.i(intent, "setPackage(...)");
        intent.putExtra("com.meijer.intent.extra.COUPONS_DEFAULT_TAB", defaultPage);
        return intent;
    }

    public final boolean i0(int code) {
        return ((code & 536870912) == 0 || this.storeProvider.d()) ? false : true;
    }

    public final Intent k(Context context, String specialOffersUrl, String previousTrackAction, boolean isNewCouponListPageEnabled) {
        Intrinsics.j(context, "context");
        if (isNewCouponListPageEnabled) {
            Intent intentPutExtra = this.featureEntryPoint.g().putExtra("com.meijer.intent.extra.EXTRA_COUPON_ACTIVE_PAGE", Pk.c.f28336l);
            Intrinsics.g(intentPutExtra);
            return intentPutExtra;
        }
        Intent intentPutExtra2 = new Intent("action.com.meijer.mobile.coupon.special_offers").setPackage(context.getPackageName()).putExtra("com.meijer.intent.extra.EXTRA_SPECIAL_OFFERS_URL", specialOffersUrl).putExtra("com.meijer.intent.extra.EXTRA_PREVIOUS_TRACK_ACTION", previousTrackAction);
        Intrinsics.g(intentPutExtra2);
        return intentPutExtra2;
    }

    public final androidx.browser.customtabs.d m(Context context) {
        Intrinsics.j(context, "context");
        d.C0965d c0965d = new d.C0965d();
        c0965d.c(new a.C0962a().b(r.b(context, C5597b.f44537q, null, false, 6, null)).c(r.b(context, C5597b.f44537q, null, false, 6, null)).a());
        c0965d.h(context, m.f675b, m.f674a);
        c0965d.d(context, 0, m.f676c);
        androidx.browser.customtabs.d dVarA = c0965d.a();
        Intrinsics.i(dVarA, "build(...)");
        return dVarA;
    }

    public final Intent n(Context context, String uri) {
        Intrinsics.j(context, "context");
        if (uri == null || StringsKt.r0(uri)) {
            return null;
        }
        Uri uri2 = Uri.parse(uri);
        UriMatcher uriMatcher = this.uriMatcher;
        Locale locale = Locale.getDefault();
        Intrinsics.i(locale, "getDefault(...)");
        String lowerCase = uri.toLowerCase(locale);
        Intrinsics.i(lowerCase, "toLowerCase(...)");
        return S(this, context, uri2, uriMatcher.match(Uri.parse(lowerCase)), null, 8, null);
    }

    public final Intent o(Context context, String url) {
        Intrinsics.j(context, "context");
        Intrinsics.j(url, "url");
        Intent intent = m(context).f47181a;
        Intrinsics.i(intent, "intent");
        intent.setData(Uri.parse(url));
        return intent;
    }

    public final Intent p(Context context, boolean afterLogin) {
        Intrinsics.j(context, "context");
        Intent intentM = Al.g.m(this.featureEntryPoint, false, 1, null);
        if (afterLogin) {
            intentM.setFlags(268468224);
        }
        intentM.putExtra("com.meijer.intent.extra.AFTER_LOGIN", afterLogin);
        return intentM;
    }

    public final Intent q(Context context, boolean afterLogin, String shortcutID) {
        Intrinsics.j(context, "context");
        Intent intentP = p(context, afterLogin);
        intentP.putExtra("com.meijer.intent.extra.EXTRA_SHORTCUT_ID", shortcutID);
        return intentP;
    }

    public final Intent r(String url) {
        Intrinsics.j(url, "url");
        return new Intent("android.intent.action.VIEW", Uri.parse(url));
    }

    public final Intent s(Context context, int code, Bundle bundle) {
        Intrinsics.j(context, "context");
        return a0(code) ? c(context, code, bundle, null) : L(context, code, null);
    }

    public final Intent u() {
        return this.featureEntryPoint.n();
    }

    public final void v(Context context) {
        Intrinsics.j(context, "context");
        String string = context.getString(n.f679c);
        Intrinsics.i(string, "getString(...)");
        d0(context, string);
    }

    public final Intent w(Context context) {
        Intrinsics.j(context, "context");
        return p.f(p.f690a, context, false, false, false, false, 30, null);
    }

    public final Intent x(Context context, String streetAddress, String city, String state, String zip) {
        Intrinsics.j(context, "context");
        Uri uriT = T(streetAddress, city, state, zip);
        if (uriT == null || !c0(context, uriT)) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW", uriT);
        intent.setPackage("com.google.android.apps.maps");
        return intent;
    }

    public final Intent z(Context context, int phoneNumberResourceID) {
        Intrinsics.j(context, "context");
        String string = context.getString(phoneNumberResourceID);
        Intrinsics.i(string, "getString(...)");
        return A(string);
    }

    private final Uri T(String streetAddress, String city, String state, String zip) {
        List listR = CollectionsKt.r(streetAddress, city, state, zip);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listR) {
            if (!StringsKt.r0((String) obj)) {
                arrayList.add(obj);
            }
        }
        String strB0 = CollectionsKt.B0(arrayList, "+", null, null, 0, null, null, 62, null);
        if (StringsKt.r0(strB0)) {
            strB0 = null;
        }
        if (strB0 == null) {
            return null;
        }
        return Uri.parse("google.navigation:q=" + strB0);
    }

    public final boolean a0(int code) {
        if (!h0(code) && !i0(code)) {
            return true;
        }
        return false;
    }
}
