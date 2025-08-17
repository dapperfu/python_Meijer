package com.meijer.mobile.meijer.activity.find;

import Co.ProductFullDetails;
import Go.SearchSuggestions;
import Go.Suggestion;
import Hl.FulfillmentBarDecorator;
import Ji.LocalThemeScope;
import Mn.AbstractC4312z2;
import Ok.Coupon;
import P0.e;
import Pk.a;
import Pp.SearchQuery;
import Qo.FilterFacet;
import Qo.FilterFacetOption;
import Qo.FilterSortOption;
import Qo.l;
import Ul.HomeDepartment;
import V2.CreationExtras;
import Zm.InterfaceC5528a;
import ak.AbstractC5607a;
import android.R;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C6031t;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import androidx.viewpager2.widget.ViewPager2;
import com.fullstory.FS;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.d;
import com.meijer.mobile.meijer.activity.coupons.fragment.CouponsFragment;
import com.meijer.mobile.meijer.activity.find.C12190u0;
import com.meijer.mobile.meijer.activity.find.SearchProductActivity;
import com.meijer.mobile.meijer.activity.find.fragment.ProductsFragment;
import com.meijer.mobile.meijer.activity.find.i1;
import com.meijer.mobile.meijer.activity.find.model.RecentSearchList;
import com.meijer.mobile.meijer.activity.find.viewmodel.AbstractC12287s;
import com.meijer.mobile.meijer.activity.find.viewmodel.AbstractC12290t;
import com.meijer.mobile.meijer.activity.find.viewmodel.I1;
import com.meijer.mobile.meijer.activity.find.viewmodel.M1;
import com.meijer.mobile.meijer.activity.find.viewmodel.OldSearchViewState;
import com.meijer.mobile.meijer.activity.find.viewmodel.RecentSearches;
import com.meijer.mobile.meijer.activity.home.HomeDecorator;
import com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity;
import com.meijer.mobile.meijer.search.Q1;
import e.C13589e;
import g.AbstractC14147c;
import g.C14145a;
import g.InterfaceC14146b;
import hi.AbstractC14481h;
import hi.AbstractC14482i;
import hi.C14476c;
import hi.TrackingData;
import j0.C14801J;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14800I;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import je.C14886b;
import ji.InterfaceC14971y;
import ji.j1;
import ji.q1;
import kotlin.C17917Z;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import mk.l;
import nu.C15949d;
import qv.C16648k;
import qv.InterfaceC16622O;
import tr.C17135b;
import tv.C17154h;
import vs.CartProductListDecorator;
import vs.ProductCarouselDecorator;
import yl.AbstractC18227f;
import ys.C18300a;
import ys.C18301b;

@Metadata(d1 = {"\u0000Ì\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 Ú\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0002Û\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u001e\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJC\u0010%\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020$2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u0019\u0010,\u001a\u00020\u000f2\b\u0010+\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0004\b,\u0010*J!\u0010/\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u001a2\b\b\u0002\u0010.\u001a\u00020\u001cH\u0002¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u0012H\u0002¢\u0006\u0004\b2\u0010\u0015J)\u00103\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b3\u00104J#\u00108\u001a\u00020\u000f2\u0006\u00106\u001a\u0002052\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b8\u00109J\u001f\u0010>\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u000fH\u0002¢\u0006\u0004\bD\u0010\nJ'\u0010H\u001a\u00020\u000f2\u0006\u0010E\u001a\u00020\u00122\u0006\u0010F\u001a\u00020\u001a2\u0006\u0010G\u001a\u00020\u001aH\u0002¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020\u000f2\u0006\u0010J\u001a\u00020\u001aH\u0002¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u000fH\u0002¢\u0006\u0004\bM\u0010\nJ\u0017\u0010P\u001a\u00020\u000f2\u0006\u0010O\u001a\u00020NH\u0002¢\u0006\u0004\bP\u0010QJ\u0017\u0010S\u001a\u00020\u000f2\u0006\u0010O\u001a\u00020RH\u0002¢\u0006\u0004\bS\u0010TJ\u0019\u0010W\u001a\u00020\u000f2\b\u0010V\u001a\u0004\u0018\u00010UH\u0014¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\u000fH\u0016¢\u0006\u0004\bY\u0010\nJ\u000f\u0010Z\u001a\u00020\u000fH\u0016¢\u0006\u0004\bZ\u0010\nJ!\u0010]\u001a\u00020\u000f2\u0012\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u000f0[¢\u0006\u0004\b]\u0010^J\u0019\u0010a\u001a\u00020\u001c2\b\u0010`\u001a\u0004\u0018\u00010_H\u0016¢\u0006\u0004\ba\u0010bJ\u000f\u0010c\u001a\u00020\u000fH\u0014¢\u0006\u0004\bc\u0010\nJ\u000f\u0010d\u001a\u00020\u000fH\u0014¢\u0006\u0004\bd\u0010\nJ1\u0010i\u001a\u00020\u000f2\b\u0010f\u001a\u0004\u0018\u00010e2\u0006\u0010g\u001a\u00020\u00122\u0006\u00101\u001a\u00020\u00122\u0006\u0010h\u001a\u00020\u0012H\u0016¢\u0006\u0004\bi\u0010jJ\u0019\u0010l\u001a\u00020\u000f2\b\u0010f\u001a\u0004\u0018\u00010kH\u0016¢\u0006\u0004\bl\u0010mJ1\u0010o\u001a\u00020\u000f2\b\u0010f\u001a\u0004\u0018\u00010e2\u0006\u0010g\u001a\u00020\u00122\u0006\u0010n\u001a\u00020\u00122\u0006\u00101\u001a\u00020\u0012H\u0016¢\u0006\u0004\bo\u0010jJ'\u0010s\u001a\u00020\u000f2\u0006\u0010p\u001a\u00020\u00122\u0006\u0010q\u001a\u00020\u00122\u0006\u0010r\u001a\u00020\u0012H\u0016¢\u0006\u0004\bs\u0010tJ\u0017\u0010u\u001a\u00020\u000f2\u0006\u0010J\u001a\u00020\u001aH\u0016¢\u0006\u0004\bu\u0010LJ\u001f\u0010x\u001a\u00020\u000f2\u0006\u0010v\u001a\u00020\u001a2\u0006\u0010w\u001a\u00020\u001aH\u0016¢\u0006\u0004\bx\u0010yJ\u0017\u0010z\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u0012H\u0016¢\u0006\u0004\bz\u0010\u0015J\u0017\u0010{\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b{\u0010*J\u0017\u0010}\u001a\u00020\u000f2\u0006\u0010|\u001a\u00020\u001cH\u0016¢\u0006\u0004\b}\u0010~J\u0017\u0010\u007f\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u007f\u0010\u0015J\u0018\u0010\u0080\u0001\u001a\u00020e2\u0006\u0010E\u001a\u00020\u0012¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J'\u0010\u0085\u0001\u001a\u00020\u000f2\n\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0082\u00012\u0007\u0010\u0084\u0001\u001a\u00020\u001cH\u0016¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001R)\u0010\u008d\u0001\u001a\u00030\u0087\u00018\u0000@\u0000X\u0081.¢\u0006\u0017\n\u0005\bf\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R*\u0010\u0095\u0001\u001a\u00030\u008e\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R*\u0010\u009d\u0001\u001a\u00030\u0096\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R!\u0010¢\u0001\u001a\u00030\u009e\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001R!\u0010§\u0001\u001a\u00030£\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¤\u0001\u0010\u009f\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001R!\u0010¬\u0001\u001a\n\u0012\u0005\u0012\u00030©\u00010¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R!\u0010®\u0001\u001a\n\u0012\u0005\u0012\u00030©\u00010¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u00ad\u0001\u0010«\u0001R\u001a\u0010²\u0001\u001a\u00030¯\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u001a\u0010´\u0001\u001a\u00030¯\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b³\u0001\u0010±\u0001R\u0019\u0010·\u0001\u001a\u00030µ\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\bx\u0010¶\u0001R\u001a\u0010»\u0001\u001a\u00030¸\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R\u0019\u0010¾\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u001b\u0010+\u001a\u0005\u0018\u00010¿\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u0019\u0010Ã\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0001\u0010½\u0001R\u001a\u0010Ç\u0001\u001a\u00030Ä\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R\u001a\u0010Ë\u0001\u001a\u00030È\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R\u001f\u0010Ð\u0001\u001a\n\u0012\u0005\u0012\u00030Í\u00010Ì\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÎ\u0001\u0010Ï\u0001R\u001e\u0010Ò\u0001\u001a\t\u0012\u0004\u0012\u00020'0Ì\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÑ\u0001\u0010Ï\u0001R\u001d\u0010Ö\u0001\u001a\u00030Í\u0001*\u00030Ó\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÔ\u0001\u0010Õ\u0001R\u0018\u0010Ù\u0001\u001a\u00030×\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010Ø\u0001¨\u0006Ü\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/SearchProductActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "Landroid/text/TextWatcher;", "Lcom/meijer/mobile/meijer/activity/find/fragment/ProductsFragment$b;", "Lcom/meijer/mobile/meijer/activity/coupons/fragment/CouponsFragment$b;", "LZm/x0;", "LAj/b;", "Landroid/view/View$OnFocusChangeListener;", "LPj/g;", "<init>", "()V", "LOk/c;", "coupon", "Lhi/f;", "trackingData", "", "j3", "(LOk/c;Lhi/f;)V", "", "errorMessageId", "g3", "(I)V", "Landroid/net/Uri;", "uri", "Lhi/h;", "trackingState", "", "carouselTitle", "", "isFromSeeMoreItems", "Y2", "(Landroid/net/Uri;Lhi/h;Ljava/lang/String;Z)V", "titleResId", "messageResId", "positiveButtonResId", "negativeButtonResId", "LOk/a;", "d3", "(IIIILOk/a;Lhi/f;)V", "LQo/l$k;", "query", "F2", "(LQo/l$k;)V", "searchQuery", "C2", "searchTerm", "isScannedUPC", "R2", "(Ljava/lang/String;Z)V", "count", "m3", "o3", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Lmk/f;", "productId", "previousTrackAction", "k3", "(Lmk/f;Ljava/lang/String;)V", "LCo/h;", "product", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "state", "T2", "(LCo/h;Lcom/meijer/mobile/core/design/widget/stepperview/a;)V", "Lg/a;", "result", "D2", "(Lg/a;)V", "b3", "position", "pageTitle", "contentDesc", "n3", "(ILjava/lang/String;Ljava/lang/String;)V", "firstItemDescription", "l3", "(Ljava/lang/String;)V", "Z2", "Lcom/meijer/mobile/meijer/activity/find/i1$a;", "action", "W2", "(Lcom/meijer/mobile/meijer/activity/find/i1$a;)V", "Lcom/meijer/mobile/meijer/activity/find/u0$a$a;", "U2", "(Lcom/meijer/mobile/meijer/activity/find/u0$a$a;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onCreateAccount", "onSignIn", "Lkotlin/Function1;", "collector", "w2", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "onResume", "onDestroy", "", "s", "start", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "before", "onTextChanged", "totalResults", "tokenMatchCount", "embeddingsCount", "J0", "(III)V", "h0", "suggestionTerm", "originalTerm", "B", "(Ljava/lang/String;Ljava/lang/String;)V", "M", "N", "itemSelected", "T", "(Z)V", "K0", "z2", "(I)Ljava/lang/CharSequence;", "Landroid/view/View;", "v", "hasFocus", "onFocusChange", "(Landroid/view/View;Z)V", "LTq/j;", "LTq/j;", "getStoreProvider$Meijer_playstoreRelease", "()LTq/j;", "setStoreProvider$Meijer_playstoreRelease", "(LTq/j;)V", "storeProvider", "LRo/a;", "t", "LRo/a;", "A2", "()LRo/a;", "setProductAnalytics", "(LRo/a;)V", "productAnalytics", "LCl/e;", "u", "LCl/e;", "y2", "()LCl/e;", "setMIntent", "(LCl/e;)V", "mIntent", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/I1;", "Lkotlin/Lazy;", "B2", "()Lcom/meijer/mobile/meijer/activity/find/viewmodel/I1;", "viewModel", "LHl/b;", "w", "getFulfillmentBarViewModel", "()LHl/b;", "fulfillmentBarViewModel", "Lnu/d;", "Lnu/g;", "x", "Lnu/d;", "suggestionsAdapter", "y", "recentsAdapter", "Lnu/l;", "z", "Lnu/l;", "suggestionsSection", "A", "recentsSection", "Lcom/meijer/mobile/meijer/activity/find/fragment/n;", "Lcom/meijer/mobile/meijer/activity/find/fragment/n;", "searchResultPagerAdapter", "LPp/b;", "C", "LPp/b;", "searchType", "D", "Ljava/lang/String;", "trackingSearchMethod", "LPp/a;", "E", "LPp/a;", "F", "sortOption", "Lcom/meijer/mobile/meijer/activity/find/model/RecentSearchList;", "G", "Lcom/meijer/mobile/meijer/activity/find/model/RecentSearchList;", "recentSearchesList", "LMn/T;", "H", "LMn/T;", "binding", "Lg/c;", "Landroid/content/Intent;", "I", "Lg/c;", "scannerResultLauncher", "J", "filterResultRegistration", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/u;", "x2", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/u;)Landroid/content/Intent;", "fulfillmentBarIntent", "Landroidx/appcompat/widget/Toolbar;", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "K", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class SearchProductActivity extends Hilt_SearchProductActivity implements TextWatcher, ProductsFragment.b, CouponsFragment.b, Zm.x0, Aj.b, View.OnFocusChangeListener, Pj.g {

    /* renamed from: L, reason: collision with root package name */
    public static final int f106511L = 8;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private nu.l recentsSection;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private com.meijer.mobile.meijer.activity.find.fragment.n searchResultPagerAdapter;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private SearchQuery searchQuery;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private RecentSearchList recentSearchesList;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private Mn.T binding;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public Tq.j storeProvider;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public Ro.a productAnalytics;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public Cl.e mIntent;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private C15949d<nu.g> suggestionsAdapter;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private C15949d<nu.g> recentsAdapter;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private nu.l suggestionsSection;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new androidx.view.e0(Reflection.b(I1.class), new j(this), new i(this), new k(null, this));

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Lazy fulfillmentBarViewModel = new androidx.view.e0(Reflection.b(Hl.b.class), new m(this), new l(this), new n(null, this));

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private Pp.b searchType = Pp.b.f28356a;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private String trackingSearchMethod = "Typed Search";

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private String sortOption = "Most Relevant";

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<Intent> scannerResultLauncher = registerForActivityResult(new h.i(), new h());

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<l.k> filterResultRegistration = registerForActivityResult(new com.meijer.mobile.meijer.activity.find.filter.g(), new b());

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b implements InterfaceC14146b, FunctionAdapter {
        b() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14146b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, SearchProductActivity.this, SearchProductActivity.class, "handleFilterAndSortResult", "handleFilterAndSortResult(Lcom/meijer/mobile/product/model/search/query/ProductQuery$SortableAndFilterable;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(l.k kVar) {
            SearchProductActivity.this.C2(kVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ SearchProductActivity f106532a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.find.SearchProductActivity$c$a$a, reason: collision with other inner class name */
            static final class C1600a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ SearchProductActivity f106533a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f106534b;

                C1600a(SearchProductActivity searchProductActivity, LocalThemeScope localThemeScope) {
                    this.f106533a = searchProductActivity;
                    this.f106534b = localThemeScope;
                }

                public final void a(Composer composer, int i10) {
                    Composer composer2;
                    float f10;
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1102287594, i10, -1, "com.meijer.mobile.meijer.activity.find.SearchProductActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchProductActivity.kt:236)");
                    }
                    if (this.f106533a.B2().E0().getValue().booleanValue()) {
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierD = androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.h(androidx.compose.foundation.b.d(FullStoryAnnotationsKt.fsUnmask(companion), this.f106534b.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null), 0.0f, 1, null), null, false, 3, null);
                        C5658d c5658d = C5658d.f48555a;
                        C5658d.f fVarB = c5658d.b();
                        e.Companion companion2 = P0.e.INSTANCE;
                        e.b bVarG = companion2.g();
                        SearchProductActivity searchProductActivity = this.f106533a;
                        LocalThemeScope localThemeScope = this.f106534b;
                        MeasurePolicy measurePolicyA = C5665k.a(fVarB, bVarG, composer, 54);
                        int iA = C5717f.a(composer, 0);
                        InterfaceC5742s interfaceC5742sR = composer.r();
                        Modifier modifierE = androidx.compose.ui.b.e(composer, modifierD);
                        InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
                        Function0<InterfaceC5811g> function0A = companion3.a();
                        if (composer.k() == null) {
                            C5717f.c();
                        }
                        composer.F();
                        if (composer.getInserting()) {
                            composer.I(function0A);
                        } else {
                            composer.s();
                        }
                        Composer composerA = D1.a(composer);
                        D1.c(composerA, measurePolicyA, companion3.e());
                        D1.c(composerA, interfaceC5742sR, companion3.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        D1.c(composerA, modifierE, companion3.f());
                        C14815g c14815g = C14815g.f139108a;
                        composer.startReplaceGroup(-1973623523);
                        if (searchProductActivity.getUserManager().b()) {
                            composer2 = composer;
                        } else {
                            C17917Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
                            composer2 = composer;
                        }
                        composer2.P();
                        float f11 = 24;
                        C14802K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f11)), composer2, 6);
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer2, 0);
                        int iA2 = C5717f.a(composer2, 0);
                        InterfaceC5742s interfaceC5742sR2 = composer2.r();
                        Modifier modifierE2 = androidx.compose.ui.b.e(composer2, companion);
                        Function0<InterfaceC5811g> function0A2 = companion3.a();
                        if (composer2.k() == null) {
                            C5717f.c();
                        }
                        composer2.F();
                        if (composer2.getInserting()) {
                            composer2.I(function0A2);
                        } else {
                            composer2.s();
                        }
                        Composer composerA2 = D1.a(composer2);
                        D1.c(composerA2, measurePolicyB, companion3.e());
                        D1.c(composerA2, interfaceC5742sR2, companion3.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
                        if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                            composerA2.t(Integer.valueOf(iA2));
                            composerA2.n(Integer.valueOf(iA2), function2B2);
                        }
                        D1.c(composerA2, modifierE2, companion3.f());
                        C14801J c14801j = C14801J.f139030a;
                        C14802K.a(InterfaceC14800I.b(c14801j, companion, 0.1125f, false, 2, null), composer2, 0);
                        String value = searchProductActivity.B2().y0().getValue();
                        Modifier modifierB = InterfaceC14800I.b(c14801j, companion, 0.775f, false, 2, null);
                        int i11 = LocalThemeScope.f15770g;
                        Composer composer3 = composer2;
                        Q1.A(localThemeScope, modifierB, value, composer3, i11, 0);
                        Composer composer4 = composer3;
                        Modifier.Companion companion4 = companion;
                        C14802K.a(InterfaceC14800I.b(c14801j, companion4, 0.1125f, false, 2, null), composer4, 0);
                        composer4.v();
                        composer4.startReplaceGroup(-1973598435);
                        if (searchProductActivity.B2().D0().getValue().booleanValue()) {
                            f10 = f11;
                            C14802K.a(androidx.compose.foundation.layout.D.m(companion4, 0.0f, 0.0f, 0.0f, H1.h.p(8), 7, null), composer4, 6);
                            MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer4, 0);
                            int iA3 = C5717f.a(composer4, 0);
                            InterfaceC5742s interfaceC5742sR3 = composer4.r();
                            Modifier modifierE3 = androidx.compose.ui.b.e(composer4, companion4);
                            Function0<InterfaceC5811g> function0A3 = companion3.a();
                            if (composer4.k() == null) {
                                C5717f.c();
                            }
                            composer4.F();
                            if (composer4.getInserting()) {
                                composer4.I(function0A3);
                            } else {
                                composer4.s();
                            }
                            Composer composerA3 = D1.a(composer4);
                            D1.c(composerA3, measurePolicyB2, companion3.e());
                            D1.c(composerA3, interfaceC5742sR3, companion3.g());
                            Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
                            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                                composerA3.t(Integer.valueOf(iA3));
                                composerA3.n(Integer.valueOf(iA3), function2B3);
                            }
                            D1.c(composerA3, modifierE3, companion3.f());
                            C14802K.a(InterfaceC14800I.b(c14801j, companion4, 0.15555556f, false, 2, null), composer4, 0);
                            Q1.x(localThemeScope, InterfaceC14800I.b(c14801j, companion4, 0.6888889f, false, 2, null), searchProductActivity.B2().x0().getValue(), composer4, i11, 0);
                            composer4 = composer4;
                            companion4 = companion4;
                            C14802K.a(InterfaceC14800I.b(c14801j, companion4, 0.15555556f, false, 2, null), composer4, 0);
                            composer4.v();
                        } else {
                            f10 = f11;
                        }
                        composer4.P();
                        C14802K.a(androidx.compose.foundation.layout.J.i(companion4, H1.h.p(f10)), composer4, 6);
                        C17917Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
                        composer.v();
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    a(composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ SearchProductActivity f106535a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f106536b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.find.SearchProductActivity$c$a$b$a, reason: collision with other inner class name */
                static final class C1601a implements Function3<j1, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f106537a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ SearchProductActivity f106538b;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.meijer.mobile.meijer.activity.find.SearchProductActivity$c$a$b$a$a, reason: collision with other inner class name */
                    static final class C1602a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ LocalThemeScope f106539a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ SearchProductActivity f106540b;

                        C1602a(LocalThemeScope localThemeScope, SearchProductActivity searchProductActivity) {
                            this.f106539a = localThemeScope;
                            this.f106540b = searchProductActivity;
                        }

                        public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                            Intrinsics.j(AdsButton, "$this$AdsButton");
                            if ((i10 & 17) == 16 && composer.j()) {
                                composer.K();
                                return;
                            }
                            if (ComposerKt.M()) {
                                ComposerKt.U(1888083118, i10, -1, "com.meijer.mobile.meijer.activity.find.SearchProductActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchProductActivity.kt:301)");
                            }
                            LocalThemeScope localThemeScope = this.f106539a;
                            ri.j.h(localThemeScope, new q1.Label(null, this.f106539a.getAdsColors().getAdsColorEnabled01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null), this.f106540b.B2().u0().getValue(), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                            if (ComposerKt.M()) {
                                ComposerKt.T();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                            a(interfaceC14800I, composer, num.intValue());
                            return Unit.f142422a;
                        }
                    }

                    C1601a(LocalThemeScope localThemeScope, SearchProductActivity searchProductActivity) {
                        this.f106537a = localThemeScope;
                        this.f106538b = searchProductActivity;
                    }

                    public final void b(j1 Assemble, Composer composer, int i10) {
                        Intrinsics.j(Assemble, "$this$Assemble");
                        if (ComposerKt.M()) {
                            ComposerKt.U(1385068929, i10, -1, "com.meijer.mobile.meijer.activity.find.SearchProductActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchProductActivity.kt:293)");
                        }
                        LocalThemeScope localThemeScope = this.f106537a;
                        q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, Modifier.INSTANCE, false, null, 895, null);
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(this.f106538b);
                        final SearchProductActivity searchProductActivity = this.f106538b;
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.S0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SearchProductActivity.c.a.b.C1601a.c(searchProductActivity);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        ni.E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(1888083118, true, new C1602a(this.f106537a, this.f106538b), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
                        b(j1Var, composer, num.intValue());
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit c(SearchProductActivity searchProductActivity) {
                        searchProductActivity.B2().O0(AbstractC12290t.j.f109002a);
                        return Unit.f142422a;
                    }
                }

                b(SearchProductActivity searchProductActivity, LocalThemeScope localThemeScope) {
                    this.f106535a = searchProductActivity;
                    this.f106536b = localThemeScope;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1292979597, i10, -1, "com.meijer.mobile.meijer.activity.find.SearchProductActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchProductActivity.kt:277)");
                    }
                    if (this.f106535a.B2().F0().getValue().booleanValue()) {
                        LocalThemeScope localThemeScope = this.f106536b;
                        SearchProductActivity searchProductActivity = this.f106535a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        C5658d c5658d = C5658d.f48555a;
                        C5658d.m mVarH = c5658d.h();
                        e.Companion companion2 = P0.e.INSTANCE;
                        MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion2.k(), composer, 0);
                        int iA = C5717f.a(composer, 0);
                        InterfaceC5742s interfaceC5742sR = composer.r();
                        Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                        InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
                        Function0<InterfaceC5811g> function0A = companion3.a();
                        if (composer.k() == null) {
                            C5717f.c();
                        }
                        composer.F();
                        if (composer.getInserting()) {
                            composer.I(function0A);
                        } else {
                            composer.s();
                        }
                        Composer composerA = D1.a(composer);
                        D1.c(composerA, measurePolicyA, companion3.e());
                        D1.c(composerA, interfaceC5742sR, companion3.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        D1.c(composerA, modifierE, companion3.f());
                        C14815g c14815g = C14815g.f139108a;
                        Modifier modifierB = androidx.compose.foundation.layout.J.b(androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), null, false, 3, null), 0.0f, H1.h.p(48), 1, null);
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.i(), composer, 48);
                        int iA2 = C5717f.a(composer, 0);
                        InterfaceC5742s interfaceC5742sR2 = composer.r();
                        Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierB);
                        Function0<InterfaceC5811g> function0A2 = companion3.a();
                        if (composer.k() == null) {
                            C5717f.c();
                        }
                        composer.F();
                        if (composer.getInserting()) {
                            composer.I(function0A2);
                        } else {
                            composer.s();
                        }
                        Composer composerA2 = D1.a(composer);
                        D1.c(composerA2, measurePolicyB, companion3.e());
                        D1.c(composerA2, interfaceC5742sR2, companion3.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
                        if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                            composerA2.t(Integer.valueOf(iA2));
                            composerA2.n(Integer.valueOf(iA2), function2B2);
                        }
                        D1.c(composerA2, modifierE2, companion3.f());
                        C14801J c14801j = C14801J.f139030a;
                        C14802K.a(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, H1.h.p(16), 0.0f, 11, null), composer, 6);
                        String value = searchProductActivity.B2().z0().getValue();
                        int i11 = LocalThemeScope.f15770g;
                        Q1.D(localThemeScope, value, composer, i11);
                        C14802K.a(InterfaceC14800I.b(c14801j, companion, 1.0f, false, 2, null), composer, 0);
                        composer.startReplaceGroup(2090855683);
                        if (searchProductActivity.B2().C0().getValue().booleanValue()) {
                            Ji.Q.e(localThemeScope, InterfaceC14971y.a.c.f140290a, ComposableLambdaKt.c(1385068929, true, new C1601a(localThemeScope, searchProductActivity), composer, 54), composer, i11 | 384 | (InterfaceC14971y.a.c.f140291b << 3));
                        }
                        composer.P();
                        C14802K.a(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, H1.h.p(8), 0.0f, 11, null), composer, 6);
                        composer.v();
                        C17917Z.a(null, localThemeScope.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
                        composer.v();
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    a(composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.find.SearchProductActivity$c$a$c, reason: collision with other inner class name */
            static final class C1603c implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ SearchProductActivity f106541a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f106542b;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.SearchProductActivity$onCreate$1$1$1$1$3$1$1", f = "SearchProductActivity.kt", l = {}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.meijer.activity.find.SearchProductActivity$c$a$c$a, reason: collision with other inner class name */
                static final class C1604a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f106543a;

                    /* renamed from: b, reason: collision with root package name */
                    private /* synthetic */ Object f106544b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ SearchProductActivity f106545c;

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.SearchProductActivity$onCreate$1$1$1$1$3$1$1$1", f = "SearchProductActivity.kt", l = {}, m = "invokeSuspend")
                    /* renamed from: com.meijer.mobile.meijer.activity.find.SearchProductActivity$c$a$c$a$a, reason: collision with other inner class name */
                    static final class C1605a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                        /* renamed from: a, reason: collision with root package name */
                        int f106546a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ SearchProductActivity f106547b;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C1605a(SearchProductActivity searchProductActivity, Continuation<? super C1605a> continuation) {
                            super(2, continuation);
                            this.f106547b = searchProductActivity;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C1605a(this.f106547b, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                            return ((C1605a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.f();
                            if (this.f106546a == 0) {
                                ResultKt.b(obj);
                                this.f106547b.B2().O0(AbstractC12290t.i.f109001a);
                                this.f106547b.B2().O0(AbstractC12290t.h.f109000a);
                                return Unit.f142422a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1604a(SearchProductActivity searchProductActivity, Continuation<? super C1604a> continuation) {
                        super(2, continuation);
                        this.f106545c = searchProductActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C1604a c1604a = new C1604a(this.f106545c, continuation);
                        c1604a.f106544b = obj;
                        return c1604a;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                        return ((C1604a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.f();
                        if (this.f106543a == 0) {
                            ResultKt.b(obj);
                            C16648k.d((InterfaceC16622O) this.f106544b, null, null, new C1605a(this.f106545c, null), 3, null);
                            return Unit.f142422a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.find.SearchProductActivity$c$a$c$b */
                /* synthetic */ class b extends FunctionReferenceImpl implements Function2<ProductFullDetails, com.meijer.mobile.core.design.widget.stepperview.a, Unit> {
                    b(Object obj) {
                        super(2, obj, SearchProductActivity.class, "onStepperStateChanged", "onStepperStateChanged(Lcom/meijer/mobile/product/model/fulldetails/ProductFullDetails;Lcom/meijer/mobile/core/design/widget/stepperview/ControlState;)V", 0);
                    }

                    public final void a(ProductFullDetails p02, com.meijer.mobile.core.design.widget.stepperview.a p12) {
                        Intrinsics.j(p02, "p0");
                        Intrinsics.j(p12, "p1");
                        ((SearchProductActivity) this.receiver).T2(p02, p12);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(ProductFullDetails productFullDetails, com.meijer.mobile.core.design.widget.stepperview.a aVar) {
                        a(productFullDetails, aVar);
                        return Unit.f142422a;
                    }
                }

                C1603c(SearchProductActivity searchProductActivity, LocalThemeScope localThemeScope) {
                    this.f106541a = searchProductActivity;
                    this.f106542b = localThemeScope;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit l(SearchProductActivity searchProductActivity, HomeDepartment department) {
                    Intrinsics.j(department, "department");
                    searchProductActivity.B2().O0(new AbstractC12290t.DepartmentItemClicked(department.getDeeplink(), department.getName()));
                    searchProductActivity.startActivity(searchProductActivity.y2().n(searchProductActivity, department.getDeeplink()));
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit o(SearchProductActivity searchProductActivity, ProductCarouselDecorator decorator) {
                    Intrinsics.j(decorator, "decorator");
                    String strK = decorator.getUri();
                    if (strK == null) {
                        strK = "";
                    }
                    String strC = decorator.getCarouselTitle();
                    searchProductActivity.o3(strK, strC != null ? strC : "", false);
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit p(SearchProductActivity searchProductActivity, ProductFullDetails product, String str) {
                    Intrinsics.j(product, "product");
                    searchProductActivity.k3(product, str);
                    return Unit.f142422a;
                }

                public final void g(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1061716878, i10, -1, "com.meijer.mobile.meijer.activity.find.SearchProductActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchProductActivity.kt:320)");
                    }
                    if (this.f106541a.B2().G0().getValue().booleanValue()) {
                        Boolean value = this.f106541a.B2().G0().getValue();
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(this.f106541a);
                        SearchProductActivity searchProductActivity = this.f106541a;
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new C1604a(searchProductActivity, null);
                            composer.t(objB);
                        }
                        composer.P();
                        androidx.compose.runtime.J.g(value, (Function2) objB, composer, 0);
                        LocalThemeScope localThemeScope = this.f106542b;
                        HomeDecorator value2 = this.f106541a.B2().v0().getValue();
                        boolean zBooleanValue = this.f106541a.B2().H0().getValue().booleanValue();
                        boolean zB = this.f106541a.getUserManager().b();
                        composer.startReplaceGroup(5004770);
                        boolean zD2 = composer.D(this.f106541a);
                        final SearchProductActivity searchProductActivity2 = this.f106541a;
                        Object objB2 = composer.B();
                        if (zD2 || objB2 == Composer.INSTANCE.a()) {
                            objB2 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.T0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return SearchProductActivity.c.a.C1603c.o(searchProductActivity2, (ProductCarouselDecorator) obj);
                                }
                            };
                            composer.t(objB2);
                        }
                        Function1 function1 = (Function1) objB2;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD3 = composer.D(this.f106541a);
                        final SearchProductActivity searchProductActivity3 = this.f106541a;
                        Object objB3 = composer.B();
                        if (zD3 || objB3 == Composer.INSTANCE.a()) {
                            objB3 = new Function2() { // from class: com.meijer.mobile.meijer.activity.find.U0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return SearchProductActivity.c.a.C1603c.p(searchProductActivity3, (ProductFullDetails) obj, (String) obj2);
                                }
                            };
                            composer.t(objB3);
                        }
                        Function2 function2 = (Function2) objB3;
                        composer.P();
                        SearchProductActivity searchProductActivity4 = this.f106541a;
                        composer.startReplaceGroup(5004770);
                        boolean zD4 = composer.D(searchProductActivity4);
                        Object objB4 = composer.B();
                        if (zD4 || objB4 == Composer.INSTANCE.a()) {
                            objB4 = new b(searchProductActivity4);
                            composer.t(objB4);
                        }
                        composer.P();
                        Function2 function22 = (Function2) ((KFunction) objB4);
                        composer.startReplaceGroup(5004770);
                        boolean zD5 = composer.D(this.f106541a);
                        final SearchProductActivity searchProductActivity5 = this.f106541a;
                        Object objB5 = composer.B();
                        if (zD5 || objB5 == Composer.INSTANCE.a()) {
                            objB5 = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.V0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SearchProductActivity.c.a.C1603c.q(searchProductActivity5);
                                }
                            };
                            composer.t(objB5);
                        }
                        Function0 function0 = (Function0) objB5;
                        composer.P();
                        Oj.a value3 = this.f106541a.B2().t0().getValue();
                        List<HomeDepartment> value4 = this.f106541a.B2().s0().getValue();
                        composer.startReplaceGroup(5004770);
                        boolean zD6 = composer.D(this.f106541a);
                        final SearchProductActivity searchProductActivity6 = this.f106541a;
                        Object objB6 = composer.B();
                        if (zD6 || objB6 == Composer.INSTANCE.a()) {
                            objB6 = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.W0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SearchProductActivity.c.a.C1603c.r(searchProductActivity6);
                                }
                            };
                            composer.t(objB6);
                        }
                        Function0 function02 = (Function0) objB6;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD7 = composer.D(this.f106541a);
                        final SearchProductActivity searchProductActivity7 = this.f106541a;
                        Object objB7 = composer.B();
                        if (zD7 || objB7 == Composer.INSTANCE.a()) {
                            objB7 = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.X0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SearchProductActivity.c.a.C1603c.k(searchProductActivity7);
                                }
                            };
                            composer.t(objB7);
                        }
                        Function0 function03 = (Function0) objB7;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD8 = composer.D(this.f106541a);
                        final SearchProductActivity searchProductActivity8 = this.f106541a;
                        Object objB8 = composer.B();
                        if (zD8 || objB8 == Composer.INSTANCE.a()) {
                            objB8 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.Y0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return SearchProductActivity.c.a.C1603c.l(searchProductActivity8, (HomeDepartment) obj);
                                }
                            };
                            composer.t(objB8);
                        }
                        composer.P();
                        Q1.G(localThemeScope, value2, zBooleanValue, zB, function1, function2, function22, function0, value3, value4, function02, function03, (Function1) objB8, null, this.f106541a.B2().A0().getValue(), composer, LocalThemeScope.f15770g | (Oj.a.f23966c << 24), AbstractC5607a.f45514b << 12, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    g(composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit k(SearchProductActivity searchProductActivity) {
                    searchProductActivity.B2().O0(AbstractC12290t.h.f109000a);
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit q(SearchProductActivity searchProductActivity) {
                    searchProductActivity.B2().O0(AbstractC12290t.i.f109001a);
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit r(SearchProductActivity searchProductActivity) {
                    searchProductActivity.B2().O0(AbstractC12290t.f.f108998a);
                    searchProductActivity.startActivity(Al.g.B(searchProductActivity.getFeatureEntryPoint(), null, 1, null));
                    return Unit.f142422a;
                }
            }

            a(SearchProductActivity searchProductActivity) {
                this.f106532a = searchProductActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Mn.T d(SearchProductActivity searchProductActivity, LocalThemeScope localThemeScope, LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
                Intrinsics.j(layoutInflater, "<unused var>");
                Intrinsics.j(viewGroup, "<unused var>");
                Mn.T t10 = searchProductActivity.binding;
                if (t10 == null) {
                    Intrinsics.y("binding");
                    t10 = null;
                }
                ((ComposeView) Zr.a.j(t10.f20322D, false, 1, null)).setContent(ComposableLambdaKt.composableLambdaInstance(-1102287594, true, new C1600a(searchProductActivity, localThemeScope)));
                Mn.T t11 = searchProductActivity.binding;
                if (t11 == null) {
                    Intrinsics.y("binding");
                    t11 = null;
                }
                t11.f20321C.setContent(ComposableLambdaKt.composableLambdaInstance(1292979597, true, new b(searchProductActivity, localThemeScope)));
                Mn.T t12 = searchProductActivity.binding;
                if (t12 == null) {
                    Intrinsics.y("binding");
                    t12 = null;
                }
                t12.f20333O.setContent(ComposableLambdaKt.composableLambdaInstance(1061716878, true, new C1603c(searchProductActivity, localThemeScope)));
                Mn.T t13 = searchProductActivity.binding;
                if (t13 != null) {
                    return t13;
                }
                Intrinsics.y("binding");
                return null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(Mn.T AndroidViewBinding) {
                Intrinsics.j(AndroidViewBinding, "$this$AndroidViewBinding");
                return Unit.f142422a;
            }

            public final void c(final LocalThemeScope AdsTheme, Composer composer, int i10) {
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-2031119702, i10, -1, "com.meijer.mobile.meijer.activity.find.SearchProductActivity.onCreate.<anonymous>.<anonymous> (SearchProductActivity.kt:223)");
                }
                composer.startReplaceGroup(-1633490746);
                boolean zD = ((i10 & 14) == 4 || ((i10 & 8) != 0 && composer.D(AdsTheme))) | composer.D(this.f106532a);
                final SearchProductActivity searchProductActivity = this.f106532a;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function3() { // from class: com.meijer.mobile.meijer.activity.find.Q0
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return SearchProductActivity.c.a.d(searchProductActivity, AdsTheme, (LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
                        }
                    };
                    composer.t(objB);
                }
                Function3 function3 = (Function3) objB;
                composer.P();
                Modifier modifierF = androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null);
                composer.startReplaceGroup(1849434622);
                Object objB2 = composer.B();
                if (objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.R0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SearchProductActivity.c.a.e((Mn.T) obj);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                androidx.compose.ui.viewinterop.a.a(function3, modifierF, (Function1) objB2, composer, 432, 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                c(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        c() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(787465435, i10, -1, "com.meijer.mobile.meijer.activity.find.SearchProductActivity.onCreate.<anonymous> (SearchProductActivity.kt:218)");
            }
            Ji.K.b(null, ComposableLambdaKt.c(-2031119702, true, new a(SearchProductActivity.this), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/meijer/mobile/meijer/activity/find/SearchProductActivity$d", "Landroid/widget/TextView$OnEditorActionListener;", "Landroid/widget/TextView;", "v", "", "actionId", "Landroid/view/KeyEvent;", "event", "", "onEditorAction", "(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements TextView.OnEditorActionListener {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(TextView textView, TrackingData stageEvent) {
            Intrinsics.j(stageEvent, "$this$stageEvent");
            stageEvent.h("trackState", "Search icon action triggered on tap");
            stageEvent.h("searchTerm", textView.getText().toString());
            stageEvent.h("searchMethod", "Typed Search");
            return Unit.f142422a;
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(final TextView v10, int actionId, KeyEvent event) {
            if (v10 == null) {
                return false;
            }
            SearchProductActivity searchProductActivity = SearchProductActivity.this;
            CharSequence text = v10.getText();
            Intrinsics.i(text, "getText(...)");
            if ((StringsKt.r0(text) || actionId != 3) && actionId != 6) {
                return false;
            }
            searchProductActivity.trackingSearchMethod = "Typed Search";
            searchProductActivity.B2().O0(new AbstractC12290t.CompleteSearchAction(v10.getText().toString(), null, false, false, 14, null));
            com.meijer.mobile.meijer.activity.find.fragment.n nVar = searchProductActivity.searchResultPagerAdapter;
            if (nVar == null) {
                Intrinsics.y("searchResultPagerAdapter");
                nVar = null;
            }
            nVar.k();
            searchProductActivity.getAnalyticsEngine().i(C14476c.h("Product Search Page"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.Z0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchProductActivity.d.b(v10, (TrackingData) obj);
                }
            });
            return true;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ z1<FulfillmentBarDecorator> f106553a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ SearchProductActivity f106554b;

            a(z1<FulfillmentBarDecorator> z1Var, SearchProductActivity searchProductActivity) {
                this.f106553a = z1Var;
                this.f106554b = searchProductActivity;
            }

            public final void b(LocalThemeScope AdsTheme, Composer composer, int i10) {
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(477530336, i10, -1, "com.meijer.mobile.meijer.activity.find.SearchProductActivity.onCreate.<anonymous>.<anonymous> (SearchProductActivity.kt:673)");
                }
                FulfillmentBarDecorator value = this.f106553a.getValue();
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(this.f106554b);
                final SearchProductActivity searchProductActivity = this.f106554b;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.d1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SearchProductActivity.f.a.c(searchProductActivity);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Hl.g.b(AdsTheme, value, null, (Function0) objB, composer, (i10 & 14) | LocalThemeScope.f15770g | (FulfillmentBarDecorator.f12698m << 3), 2);
                C17917Z.a(null, AdsTheme.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                b(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(SearchProductActivity searchProductActivity) {
                searchProductActivity.startActivity(searchProductActivity.x2(searchProductActivity.B2().B0().getValue()));
                return Unit.f142422a;
            }
        }

        f() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-986516783, i10, -1, "com.meijer.mobile.meijer.activity.find.SearchProductActivity.onCreate.<anonymous> (SearchProductActivity.kt:671)");
            }
            Ji.K.b(null, ComposableLambdaKt.c(477530336, true, new a(o1.b(SearchProductActivity.this.getFulfillmentBarViewModel().n(), null, composer, 0, 1), SearchProductActivity.this), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class h implements InterfaceC14146b, FunctionAdapter {
        h() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14146b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, SearchProductActivity.this, SearchProductActivity.class, "handleScannerResult", "handleScannerResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14145a p02) {
            Intrinsics.j(p02, "p0");
            SearchProductActivity.this.D2(p02);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class i extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f106559f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f106559f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f106559f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class j extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f106560f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentActivity componentActivity) {
            super(0);
            this.f106560f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f106560f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class k extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f106561f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f106562g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f106561f = function0;
            this.f106562g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f106561f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f106562g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class l extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f106563f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentActivity componentActivity) {
            super(0);
            this.f106563f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f106563f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class m extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f106564f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentActivity componentActivity) {
            super(0);
            this.f106564f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f106564f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class n extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f106565f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f106566g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f106565f = function0;
            this.f106566g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f106565f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f106566g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence s10, int start, int count, int after) {
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/u;", "viewState", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/u;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.SearchProductActivity$onCreate$20", f = "SearchProductActivity.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class e extends SuspendLambda implements Function2<OldSearchViewState, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f106549a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f106550b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class a extends FunctionReferenceImpl implements Function1<i1.a, Unit> {
            a(Object obj) {
                super(1, obj, SearchProductActivity.class, "onSuggestionAction", "onSuggestionAction(Lcom/meijer/mobile/meijer/activity/find/SearchSuggestionItem$SuggestionItemAction;)V", 0);
            }

            public final void a(i1.a p02) {
                Intrinsics.j(p02, "p0");
                ((SearchProductActivity) this.receiver).W2(p02);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(i1.a aVar) {
                a(aVar);
                return Unit.f142422a;
            }
        }

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = SearchProductActivity.this.new e(continuation);
            eVar.f106550b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public final Object invoke(OldSearchViewState c12293u, Continuation<? super Unit> continuation) {
            return ((e) create(c12293u, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(SearchProductActivity searchProductActivity, C12190u0.a.Submit submit) {
            searchProductActivity.U2(submit);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(SearchProductActivity searchProductActivity) {
            searchProductActivity.B2().O0(AbstractC12290t.b.f108990a);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(SearchProductActivity searchProductActivity) {
            searchProductActivity.B2().O0(AbstractC12290t.b.f108990a);
            return Unit.f142422a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            int i10;
            String string;
            boolean z11;
            int i11;
            boolean z12;
            int i12;
            boolean z13;
            int i13;
            boolean z14;
            int i14;
            boolean z15;
            int i15;
            boolean z16;
            int i16;
            boolean z17;
            int i17;
            boolean z18;
            int i18;
            IntrinsicsKt.f();
            if (this.f106549a == 0) {
                ResultKt.b(obj);
                OldSearchViewState c12293u = (OldSearchViewState) this.f106550b;
                Mn.T t10 = SearchProductActivity.this.binding;
                Mn.T t11 = null;
                if (t10 == null) {
                    Intrinsics.y("binding");
                    t10 = null;
                }
                ImageButton imageButton = t10.f20324F.f21169H;
                SearchProductActivity searchProductActivity = SearchProductActivity.this;
                Intrinsics.g(imageButton);
                boolean z19 = true;
                int i19 = 0;
                if (c12293u.getCartDecorator().getIsAvailable() && searchProductActivity.searchType != Pp.b.f28358c && searchProductActivity.searchType != Pp.b.f28359d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                imageButton.setVisibility(i10);
                Qj.a.e(imageButton, c12293u.getCartDecorator().getItemCount());
                bk.d.e(imageButton, AbstractC5607a.INSTANCE.b(com.meijer.mobile.meijer.X.f99453l, c12293u.getCartDecorator().getItemCount(), new Object[0]));
                Mn.T t12 = SearchProductActivity.this.binding;
                if (t12 == null) {
                    Intrinsics.y("binding");
                    t12 = null;
                }
                EditText editText = t12.f20324F.f21167F;
                Editable text = editText.getText();
                if (text != null) {
                    string = text.toString();
                } else {
                    string = null;
                }
                if (Intrinsics.e(string, c12293u.getSearchTerm())) {
                    editText = null;
                }
                if (editText != null) {
                    editText.setText(c12293u.getSearchTerm());
                    editText.setSelection(c12293u.getSearchTerm().length());
                }
                Mn.T t13 = SearchProductActivity.this.binding;
                if (t13 == null) {
                    Intrinsics.y("binding");
                    t13 = null;
                }
                ImageButton searchBarcode = t13.f20324F.f21165D;
                Intrinsics.i(searchBarcode, "searchBarcode");
                if (c12293u.getSearchTerm().length() == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                searchBarcode.setVisibility(i11);
                Mn.T t14 = SearchProductActivity.this.binding;
                if (t14 == null) {
                    Intrinsics.y("binding");
                    t14 = null;
                }
                ImageButton searchClear = t14.f20324F.f21166E;
                Intrinsics.i(searchClear, "searchClear");
                if (c12293u.getSearchTerm().length() > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                searchClear.setVisibility(i12);
                SearchSuggestions searchSuggestionsI = c12293u.getSearchSuggestions();
                RecentSearches recentSearchesG = c12293u.getRecentSearches();
                if (c12293u.getQuerySubmitted()) {
                    SearchProductActivity.this.R2(c12293u.getSearchTerm(), c12293u.getIsScannedUpc());
                } else if (c12293u.getSearchState() == M1.f108081a) {
                    List<Suggestion> listA = searchSuggestionsI.a();
                    SearchProductActivity searchProductActivity2 = SearchProductActivity.this;
                    ArrayList arrayList = new ArrayList(CollectionsKt.x(listA, 10));
                    Iterator<T> it = listA.iterator();
                    while (it.hasNext()) {
                        String strB = ((Suggestion) it.next()).b();
                        Mn.T t15 = searchProductActivity2.binding;
                        if (t15 == null) {
                            Intrinsics.y("binding");
                            t15 = null;
                        }
                        arrayList.add(new i1(strB, StringsKt.y1(t15.f20324F.f21167F.getText().toString()).toString(), new a(searchProductActivity2)));
                    }
                    SearchProductActivity searchProductActivity3 = SearchProductActivity.this;
                    Mn.T t16 = searchProductActivity3.binding;
                    if (t16 == null) {
                        Intrinsics.y("binding");
                        t16 = null;
                    }
                    t16.f20331M.setVisibility(0);
                    t16.f20326H.setVisibility(4);
                    t16.f20327I.setVisibility(4);
                    AbstractC4312z2 abstractC4312z2 = t16.f20324F;
                    MaterialButton browseDeptsButton = abstractC4312z2.f21162A;
                    Intrinsics.i(browseDeptsButton, "browseDeptsButton");
                    Pp.b bVar = searchProductActivity3.searchType;
                    Pp.b bVar2 = Pp.b.f28356a;
                    if (bVar == bVar2) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (z17) {
                        i17 = 0;
                    } else {
                        i17 = 8;
                    }
                    browseDeptsButton.setVisibility(i17);
                    MaterialButton viewFavoritesButton = abstractC4312z2.f21170I;
                    Intrinsics.i(viewFavoritesButton, "viewFavoritesButton");
                    if (searchProductActivity3.getFeatureManager().e(AbstractC18227f.A.f170542h) && searchProductActivity3.getUserManager().b() && searchProductActivity3.searchType == bVar2) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (z18) {
                        i18 = 0;
                    } else {
                        i18 = 8;
                    }
                    viewFavoritesButton.setVisibility(i18);
                    t16.f20331M.announceForAccessibility(searchProductActivity3.getString(C18301b.f171290p));
                    nu.l lVar = searchProductActivity3.suggestionsSection;
                    if (lVar == null) {
                        Intrinsics.y("suggestionsSection");
                        lVar = null;
                    }
                    lVar.R(arrayList);
                } else if (c12293u.getSearchState() == M1.f108082b) {
                    nu.l lVar2 = SearchProductActivity.this.recentsSection;
                    if (lVar2 == null) {
                        Intrinsics.y("recentsSection");
                        lVar2 = null;
                    }
                    final SearchProductActivity searchProductActivity4 = SearchProductActivity.this;
                    Mn.T t17 = searchProductActivity4.binding;
                    if (t17 == null) {
                        Intrinsics.y("binding");
                        t17 = null;
                    }
                    t17.f20327I.setVisibility(4);
                    t17.f20331M.setVisibility(4);
                    t17.f20326H.setVisibility(0);
                    MaterialButton browseDeptsButton2 = t17.f20324F.f21162A;
                    Intrinsics.i(browseDeptsButton2, "browseDeptsButton");
                    Pp.b bVar3 = searchProductActivity4.searchType;
                    Pp.b bVar4 = Pp.b.f28356a;
                    if (bVar3 == bVar4) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        i15 = 0;
                    } else {
                        i15 = 8;
                    }
                    browseDeptsButton2.setVisibility(i15);
                    MaterialButton viewFavoritesButton2 = t17.f20324F.f21170I;
                    Intrinsics.i(viewFavoritesButton2, "viewFavoritesButton");
                    if (searchProductActivity4.getFeatureManager().e(AbstractC18227f.A.f170542h) && searchProductActivity4.getUserManager().b() && searchProductActivity4.searchType == bVar4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (z16) {
                        i16 = 0;
                    } else {
                        i16 = 8;
                    }
                    viewFavoritesButton2.setVisibility(i16);
                    t17.f20326H.announceForAccessibility(searchProductActivity4.getString(C18301b.f171285k));
                    lVar2.N(new C12186s0(true, new Function0() { // from class: com.meijer.mobile.meijer.activity.find.a1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SearchProductActivity.e.p(searchProductActivity4);
                        }
                    }));
                    List<String> listA2 = recentSearchesG.a();
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.x(listA2, 10));
                    Iterator<T> it2 = listA2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new C12190u0((String) it2.next(), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.b1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return SearchProductActivity.e.o(searchProductActivity4, (C12190u0.a.Submit) obj2);
                            }
                        }));
                    }
                    lVar2.R(arrayList2);
                    lVar2.L();
                } else if (c12293u.getSearchState() == M1.f108083c) {
                    nu.l lVar3 = SearchProductActivity.this.recentsSection;
                    if (lVar3 == null) {
                        Intrinsics.y("recentsSection");
                        lVar3 = null;
                    }
                    final SearchProductActivity searchProductActivity5 = SearchProductActivity.this;
                    RecentSearchList recentSearchList = searchProductActivity5.recentSearchesList;
                    if (recentSearchList == null) {
                        Intrinsics.y("recentSearchesList");
                        recentSearchList = null;
                    }
                    recentSearchList.clear();
                    Mn.T t18 = searchProductActivity5.binding;
                    if (t18 == null) {
                        Intrinsics.y("binding");
                        t18 = null;
                    }
                    t18.f20331M.setVisibility(4);
                    t18.f20326H.setVisibility(0);
                    t18.f20327I.setVisibility(4);
                    MaterialButton browseDeptsButton3 = t18.f20324F.f21162A;
                    Intrinsics.i(browseDeptsButton3, "browseDeptsButton");
                    Pp.b bVar5 = searchProductActivity5.searchType;
                    Pp.b bVar6 = Pp.b.f28356a;
                    if (bVar5 == bVar6) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        i13 = 0;
                    } else {
                        i13 = 8;
                    }
                    browseDeptsButton3.setVisibility(i13);
                    MaterialButton viewFavoritesButton3 = t18.f20324F.f21170I;
                    Intrinsics.i(viewFavoritesButton3, "viewFavoritesButton");
                    if (searchProductActivity5.getFeatureManager().e(AbstractC18227f.A.f170542h) && searchProductActivity5.getUserManager().b() && searchProductActivity5.searchType == bVar6) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        i14 = 0;
                    } else {
                        i14 = 8;
                    }
                    viewFavoritesButton3.setVisibility(i14);
                    lVar3.N(new C12186s0(false, new Function0() { // from class: com.meijer.mobile.meijer.activity.find.c1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SearchProductActivity.e.q(searchProductActivity5);
                        }
                    }));
                    C15949d c15949d = searchProductActivity5.recentsAdapter;
                    if (c15949d == null) {
                        Intrinsics.y("recentsAdapter");
                        c15949d = null;
                    }
                    if (!(c15949d.j(1) instanceof C12183q0)) {
                        lVar3.R(CollectionsKt.m());
                        lVar3.M(new C12183q0());
                    }
                }
                if (SearchProductActivity.this.searchType == Pp.b.f28358c || SearchProductActivity.this.searchType == Pp.b.f28359d) {
                    Mn.T t19 = SearchProductActivity.this.binding;
                    if (t19 == null) {
                        Intrinsics.y("binding");
                        t19 = null;
                    }
                    FrameLayout buttonContainer = t19.f20334z;
                    Intrinsics.i(buttonContainer, "buttonContainer");
                    Mn.T t20 = SearchProductActivity.this.binding;
                    if (t20 == null) {
                        Intrinsics.y("binding");
                    } else {
                        t11 = t20;
                    }
                    LinearLayout searchResultsContainer = t11.f20327I;
                    Intrinsics.i(searchResultsContainer, "searchResultsContainer");
                    if (searchResultsContainer.getVisibility() != 0) {
                        z19 = false;
                    }
                    if (!z19) {
                        i19 = 8;
                    }
                    buttonContainer.setVisibility(i19);
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/s;", "it", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/s;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.SearchProductActivity$onCreate$22", f = "SearchProductActivity.kt", l = {}, m = "invokeSuspend")
    static final class g extends SuspendLambda implements Function2<AbstractC12287s, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f106555a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f106556b;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            g gVar = SearchProductActivity.this.new g(continuation);
            gVar.f106556b = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC12287s abstractC12287s, Continuation<? super Unit> continuation) {
            return ((g) create(abstractC12287s, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f106555a == 0) {
                ResultKt.b(obj);
                AbstractC12287s abstractC12287s = (AbstractC12287s) this.f106556b;
                if (Intrinsics.e(abstractC12287s, AbstractC12287s.e.f108977a)) {
                    AbstractC14147c abstractC14147c = SearchProductActivity.this.scannerResultLauncher;
                    SearchProductActivity searchProductActivity = SearchProductActivity.this;
                    abstractC14147c.a(Al.h.k(searchProductActivity, true, true, searchProductActivity.getFeatureManager().e(AbstractC18227f.L.f170551h)));
                } else if (abstractC12287s instanceof AbstractC12287s.ToggleKeyboardEvent) {
                    Mn.T t10 = null;
                    if (((AbstractC12287s.ToggleKeyboardEvent) abstractC12287s).getShouldShow()) {
                        Mn.T t11 = SearchProductActivity.this.binding;
                        if (t11 == null) {
                            Intrinsics.y("binding");
                            t11 = null;
                        }
                        t11.f20324F.f21167F.requestFocus();
                        Mn.T t12 = SearchProductActivity.this.binding;
                        if (t12 == null) {
                            Intrinsics.y("binding");
                        } else {
                            t10 = t12;
                        }
                        Ds.p.e(t10.f20324F.f21167F);
                    } else {
                        Mn.T t13 = SearchProductActivity.this.binding;
                        if (t13 == null) {
                            Intrinsics.y("binding");
                        } else {
                            t10 = t13;
                        }
                        Ds.p.c(t10.f20324F.f21167F);
                    }
                } else if (Intrinsics.e(abstractC12287s, AbstractC12287s.b.f108974a)) {
                    SearchProductActivity.this.finish();
                    bk.c.b(SearchProductActivity.this, 1, R.anim.fade_in, R.anim.fade_out, 0, 8, null);
                } else if (abstractC12287s instanceof AbstractC12287s.f) {
                    SearchProductActivity searchProductActivity2 = SearchProductActivity.this;
                    searchProductActivity2.startActivity(searchProductActivity2.getFeatureEntryPoint().d());
                } else if (abstractC12287s instanceof AbstractC12287s.LaunchFilterAndSort) {
                    SearchProductActivity.this.F2(((AbstractC12287s.LaunchFilterAndSort) abstractC12287s).getFilterAndSortState());
                } else if (abstractC12287s instanceof AbstractC12287s.ClipCouponFailedEvent) {
                    AbstractC12287s.ClipCouponFailedEvent clipCouponFailedEvent = (AbstractC12287s.ClipCouponFailedEvent) abstractC12287s;
                    SearchProductActivity.this.d3(clipCouponFailedEvent.getTitleResId(), clipCouponFailedEvent.getMessageResId(), clipCouponFailedEvent.getPositiveButtonResId(), clipCouponFailedEvent.getNegativeButtonResId(), clipCouponFailedEvent.getCoupon(), clipCouponFailedEvent.getTrackingData());
                } else if (abstractC12287s instanceof AbstractC12287s.ViewCouponDetails) {
                    AbstractC12287s.ViewCouponDetails viewCouponDetails = (AbstractC12287s.ViewCouponDetails) abstractC12287s;
                    SearchProductActivity.this.j3(viewCouponDetails.getCoupon(), viewCouponDetails.getTrackingData());
                } else if (abstractC12287s instanceof AbstractC12287s.ViewPersonalizedProducts) {
                    AbstractC12287s.ViewPersonalizedProducts viewPersonalizedProducts = (AbstractC12287s.ViewPersonalizedProducts) abstractC12287s;
                    SearchProductActivity.this.Y2(viewPersonalizedProducts.getUri(), viewPersonalizedProducts.getTrackingState(), viewPersonalizedProducts.getCarouselTitle(), viewPersonalizedProducts.getIsFromSeeMoreItems());
                } else if (abstractC12287s instanceof AbstractC12287s.LoginRequiredEvent) {
                    SearchProductActivity.this.g3(((AbstractC12287s.LoginRequiredEvent) abstractC12287s).getErrorMessageId());
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final I1 B2() {
        return (I1) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C2(l.k searchQuery) {
        String displayName;
        if (searchQuery != null) {
            AbstractC12290t.UpdateFacetBuffer updateFacetBuffer = new AbstractC12290t.UpdateFacetBuffer(searchQuery, false, 2, null);
            B2().O0(AbstractC12290t.UpdateFacetBuffer.b(updateFacetBuffer, null, true, 1, null));
            FilterSortOption selectedSort = updateFacetBuffer.getQuery().getSelectedSort();
            if (selectedSort == null || (displayName = selectedSort.getDisplayName()) == null) {
                displayName = "Most Relevant";
            }
            this.sortOption = displayName;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E2(String str, TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.h("searchTerm", str);
        stageEvent.h("searchMethod", "Barcode Search");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F2(l.k query) {
        this.filterResultRegistration.a(query);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G2(int i10, TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.c(Qk.b.f30831a.k(i10));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H2(TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.h("searchLocation", "coupons");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q2(SearchProductActivity searchProductActivity, View view) {
        com.meijer.mobile.meijer.activity.find.fragment.n nVar = searchProductActivity.searchResultPagerAdapter;
        if (nVar == null) {
            Intrinsics.y("searchResultPagerAdapter");
            nVar = null;
        }
        InterfaceC5528a productsFragment = nVar.getProductsFragment();
        if (productsFragment != null) {
            productsFragment.C();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R2(String searchTerm, boolean isScannedUPC) {
        Mn.T t10 = this.binding;
        Mn.T t11 = null;
        if (t10 == null) {
            Intrinsics.y("binding");
            t10 = null;
        }
        RecyclerView searchSuggestions = t10.f20331M;
        Intrinsics.i(searchSuggestions, "searchSuggestions");
        searchSuggestions.setVisibility(4);
        Mn.T t12 = this.binding;
        if (t12 == null) {
            Intrinsics.y("binding");
            t12 = null;
        }
        RecyclerView searchRecents = t12.f20326H;
        Intrinsics.i(searchRecents, "searchRecents");
        searchRecents.setVisibility(4);
        Mn.T t13 = this.binding;
        if (t13 == null) {
            Intrinsics.y("binding");
            t13 = null;
        }
        MaterialButton browseDeptsButton = t13.f20324F.f21162A;
        Intrinsics.i(browseDeptsButton, "browseDeptsButton");
        browseDeptsButton.setVisibility(8);
        Mn.T t14 = this.binding;
        if (t14 == null) {
            Intrinsics.y("binding");
            t14 = null;
        }
        MaterialButton viewFavoritesButton = t14.f20324F.f21170I;
        Intrinsics.i(viewFavoritesButton, "viewFavoritesButton");
        viewFavoritesButton.setVisibility(8);
        Mn.T t15 = this.binding;
        if (t15 == null) {
            Intrinsics.y("binding");
            t15 = null;
        }
        LinearLayout searchResultsContainer = t15.f20327I;
        Intrinsics.i(searchResultsContainer, "searchResultsContainer");
        searchResultsContainer.setVisibility(0);
        Mn.T t16 = this.binding;
        if (t16 == null) {
            Intrinsics.y("binding");
            t16 = null;
        }
        TabLayout searchResultsTab = t16.f20328J;
        Intrinsics.i(searchResultsTab, "searchResultsTab");
        searchResultsTab.setVisibility(8);
        B2().C0().setValue(Boolean.TRUE);
        this.searchQuery = new SearchQuery(searchTerm, this.searchType, isScannedUPC);
        com.meijer.mobile.meijer.activity.find.fragment.n nVar = this.searchResultPagerAdapter;
        if (nVar == null) {
            Intrinsics.y("searchResultPagerAdapter");
            nVar = null;
        }
        SearchQuery searchQuery = this.searchQuery;
        Intrinsics.g(searchQuery);
        nVar.n(searchQuery, this.trackingSearchMethod);
        if (this.searchType == Pp.b.f28357b) {
            Mn.T t17 = this.binding;
            if (t17 == null) {
                Intrinsics.y("binding");
                t17 = null;
            }
            TabLayout tabLayout = t17.f20328J;
            Mn.T t18 = this.binding;
            if (t18 == null) {
                Intrinsics.y("binding");
                t18 = null;
            }
            tabLayout.K(t18.f20328J.B(1));
            B2().C0().setValue(Boolean.FALSE);
            Mn.T t19 = this.binding;
            if (t19 == null) {
                Intrinsics.y("binding");
            } else {
                t11 = t19;
            }
            t11.f20329K.postDelayed(new Runnable() { // from class: com.meijer.mobile.meijer.activity.find.H0
                @Override // java.lang.Runnable
                public final void run() {
                    SearchProductActivity.S2(this.f106458a);
                }
            }, 100L);
        }
        Z2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S2(SearchProductActivity searchProductActivity) {
        Mn.T t10 = searchProductActivity.binding;
        if (t10 == null) {
            Intrinsics.y("binding");
            t10 = null;
        }
        t10.f20329K.j(1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U2(final C12190u0.a.Submit action) {
        this.trackingSearchMethod = "Recent Search";
        B2().O0(new AbstractC12290t.CompleteSearchAction(action.getTerm(), null, false, false, 14, null));
        getAnalyticsEngine().i(C14476c.h("Product Search Page"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.E0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchProductActivity.V2(action, (TrackingData) obj);
            }
        });
        com.meijer.mobile.meijer.activity.find.fragment.n nVar = this.searchResultPagerAdapter;
        if (nVar == null) {
            Intrinsics.y("searchResultPagerAdapter");
            nVar = null;
        }
        nVar.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V2(C12190u0.a.Submit submit, TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.h("searchTerm", submit.getTerm());
        stageEvent.h("searchMethod", "Recent Search");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W2(final i1.a action) {
        if (action instanceof i1.a.Fill) {
            i1.a.Fill fill = (i1.a.Fill) action;
            B2().O0(new AbstractC12290t.AutoFillSearchAction(fill.getSuggestion(), fill.getOriginalTerm()));
            return;
        }
        if (!(action instanceof i1.a.Submit)) {
            throw new NoWhenBranchMatchedException();
        }
        this.trackingSearchMethod = "Search Suggestions";
        i1.a.Submit submit = (i1.a.Submit) action;
        B2().O0(new AbstractC12290t.CompleteSearchAction(submit.getOriginalTerm(), submit.getSuggestion(), false, true, 4, null));
        getAnalyticsEngine().i(C14476c.h("Product Search Page"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.F0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchProductActivity.X2(action, (TrackingData) obj);
            }
        });
        com.meijer.mobile.meijer.activity.find.fragment.n nVar = this.searchResultPagerAdapter;
        if (nVar == null) {
            Intrinsics.y("searchResultPagerAdapter");
            nVar = null;
        }
        nVar.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X2(i1.a aVar, TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.h("searchTerm", ((i1.a.Submit) aVar).getSuggestion());
        stageEvent.h("searchMethod", "Search Suggestions");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a3(SearchProductActivity searchProductActivity, TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.v("search");
        stageEvent.h("productSortBy", searchProductActivity.sortOption);
        return Unit.f142422a;
    }

    private final void b3() {
        Mn.T t10 = this.binding;
        Mn.T t11 = null;
        if (t10 == null) {
            Intrinsics.y("binding");
            t10 = null;
        }
        TabLayout tabLayout = t10.f20328J;
        Mn.T t12 = this.binding;
        if (t12 == null) {
            Intrinsics.y("binding");
        } else {
            t11 = t12;
        }
        new com.google.android.material.tabs.d(tabLayout, t11.f20329K, new d.b() { // from class: com.meijer.mobile.meijer.activity.find.z0
            @Override // com.google.android.material.tabs.d.b
            public final void onConfigureTab(TabLayout.f fVar, int i10) {
                SearchProductActivity.c3(this.f109073a, fVar, i10);
            }
        }).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c3(SearchProductActivity searchProductActivity, TabLayout.f tab, int i10) {
        Intrinsics.j(tab, "tab");
        tab.r(searchProductActivity.z2(i10));
        int i11 = i10 + 1;
        com.meijer.mobile.meijer.activity.find.fragment.n nVar = searchProductActivity.searchResultPagerAdapter;
        if (nVar == null) {
            Intrinsics.y("searchResultPagerAdapter");
            nVar = null;
        }
        bk.d.d(tab, AbstractC5607a.INSTANCE.b(i10 == 0 ? C18300a.f171273g : C18300a.f171272f, 0, Integer.valueOf(i11), Integer.valueOf(nVar.getTotalNumberOfTabs())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d3(int titleResId, int messageResId, int positiveButtonResId, int negativeButtonResId, final Coupon coupon, final TrackingData trackingData) {
        new C14886b(this).setTitle(titleResId).setMessage(messageResId).setPositiveButton(positiveButtonResId, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.C0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                SearchProductActivity.e3(this.f106331a, coupon, trackingData, dialogInterface, i10);
            }
        }).setNegativeButton(negativeButtonResId, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.D0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                SearchProductActivity.f3(dialogInterface, i10);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g3(int errorMessageId) {
        new C14886b(this).setMessage(errorMessageId).setPositiveButton(Bj.o.f2971F0, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.A0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                SearchProductActivity.h3(this.f106328a, dialogInterface, i10);
            }
        }).setNegativeButton(Bj.o.f3045u, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.B0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                SearchProductActivity.i3(this.f106330a, dialogInterface, i10);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Hl.b getFulfillmentBarViewModel() {
        return (Hl.b) this.fulfillmentBarViewModel.getValue();
    }

    private final void l3(String firstItemDescription) {
        SearchQuery searchQuery = this.searchQuery;
        RecentSearchList recentSearchList = null;
        String queryString = searchQuery != null ? searchQuery.getQueryString() : null;
        if (queryString == null) {
            queryString = "";
        }
        String strQ = StringsKt.Q((!Ds.j.d(queryString) || StringsKt.r0(firstItemDescription)) ? queryString : firstItemDescription, ",", " ", false, 4, null);
        if (StringsKt.y1(strQ).toString().length() > 0) {
            RecentSearchList recentSearchList2 = this.recentSearchesList;
            if (recentSearchList2 == null) {
                Intrinsics.y("recentSearchesList");
                recentSearchList2 = null;
            }
            recentSearchList2.add(strQ);
            yo.k userManager = getUserManager();
            RecentSearchList recentSearchList3 = this.recentSearchesList;
            if (recentSearchList3 == null) {
                Intrinsics.y("recentSearchesList");
            } else {
                recentSearchList = recentSearchList3;
            }
            userManager.M(recentSearchList, false);
        }
        B2().O0(AbstractC12290t.r.f109014a);
    }

    private final void n3(int position, String pageTitle, String contentDesc) {
        Mn.T t10 = this.binding;
        if (t10 == null) {
            Intrinsics.y("binding");
            t10 = null;
        }
        TabLayout.f fVarB = t10.f20328J.B(position);
        if (fVarB != null) {
            fVarB.r(pageTitle);
        }
        if (fVarB != null) {
            fVarB.m(contentDesc);
        }
    }

    public final Ro.a A2() {
        Ro.a aVar = this.productAnalytics;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.y("productAnalytics");
        return null;
    }

    @Override // com.meijer.mobile.meijer.activity.find.fragment.ProductsFragment.b
    public void B(String suggestionTerm, String originalTerm) {
        Intrinsics.j(suggestionTerm, "suggestionTerm");
        Intrinsics.j(originalTerm, "originalTerm");
        B2().O0(new AbstractC12290t.CompleteSearchAction(originalTerm, suggestionTerm, false, false, 12, null));
    }

    @Override // com.meijer.mobile.meijer.activity.find.fragment.ProductsFragment.b
    public void N(l.k query) {
        int size;
        String string;
        Collection<List<FilterFacetOption>> collectionValues;
        Map<FilterFacet, List<FilterFacetOption>> mapG3;
        Intrinsics.j(query, "query");
        InterfaceC5730l0<Boolean> interfaceC5730l0C0 = B2().C0();
        boolean z10 = true;
        if (query.u3().isEmpty() && query.getSelectedSort() == null && (((mapG3 = query.G3()) == null || !(!mapG3.isEmpty())) && query.c1().isEmpty() && query.u3().isEmpty())) {
            z10 = false;
        }
        interfaceC5730l0C0.setValue(Boolean.valueOf(z10));
        Map<FilterFacet, List<FilterFacetOption>> mapG32 = query.G3();
        if (mapG32 == null || (collectionValues = mapG32.values()) == null) {
            size = 0;
        } else {
            Iterator<T> it = collectionValues.iterator();
            size = 0;
            while (it.hasNext()) {
                size += ((List) it.next()).size();
            }
        }
        InterfaceC5730l0<String> interfaceC5730l0U0 = B2().u0();
        if (size == 0) {
            string = getString(C18301b.f171276b, "");
            Intrinsics.g(string);
        } else {
            string = getString(C18301b.f171276b, " (" + size + ')');
            Intrinsics.g(string);
        }
        interfaceC5730l0U0.setValue(string);
        B2().O0(new AbstractC12290t.UpdateFacetBuffer(query, false, 2, null));
    }

    @Override // com.meijer.mobile.meijer.activity.find.fragment.ProductsFragment.b
    public void T(boolean itemSelected) {
        Mn.T t10 = this.binding;
        if (t10 == null) {
            Intrinsics.y("binding");
            t10 = null;
        }
        t10.f20330L.setEnabled(itemSelected);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable s10) {
        if (s10 == null || s10.toString().length() != 0) {
            return;
        }
        B2().O0(AbstractC12290t.c.f108991a);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent ev2) {
        com.meijer.mobile.meijer.activity.find.fragment.n nVar = this.searchResultPagerAdapter;
        if (nVar == null) {
            Intrinsics.y("searchResultPagerAdapter");
            nVar = null;
        }
        nVar.h(ev2);
        return super.dispatchTouchEvent(ev2);
    }

    @Override // com.meijer.mobile.meijer.activity.find.fragment.ProductsFragment.b
    public void h0(String firstItemDescription) {
        Intrinsics.j(firstItemDescription, "firstItemDescription");
        l3(firstItemDescription);
    }

    @Override // Pj.g
    public void onCreateAccount() {
        startActivity(Al.f.f666a.a(this, getFeatureManager().e(AbstractC18227f.h0.f170581h)));
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        Mn.T t10 = this.binding;
        if (t10 == null) {
            Intrinsics.y("binding");
            t10 = null;
        }
        t10.f20324F.f21167F.removeTextChangedListener(this);
        getLifecycle().d(B2());
        super.onDestroy();
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View v10, boolean hasFocus) {
        if ((v10 instanceof EditText) && hasFocus) {
            A2().f(((EditText) v10).getText().toString());
        }
    }

    @Override // Pj.g
    public void onSignIn() {
        startActivity(Al.k.b(this, false, null, null, null, null, null, 126, null));
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence s10, int start, int before, int count) {
        if (s10 == null || s10.length() <= 0) {
            return;
        }
        B2().O0(new AbstractC12290t.SearchStartedAction(s10.toString()));
    }

    @Override // Aj.b
    public Toolbar v() {
        Mn.T t10 = this.binding;
        if (t10 == null) {
            Intrinsics.y("binding");
            t10 = null;
        }
        MaterialToolbar substituteToolbar = t10.f20332N;
        Intrinsics.i(substituteToolbar, "substituteToolbar");
        return substituteToolbar;
    }

    public final void w2(Function1<? super l.k, Unit> collector) {
        Intrinsics.j(collector, "collector");
        B2().O0(new AbstractC12290t.FilterAndSortCollectorForSharedFlow(collector));
    }

    public final Cl.e y2() {
        Cl.e eVar = this.mIntent;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.y("mIntent");
        return null;
    }

    public final CharSequence z2(int position) {
        if (position == 0) {
            String string = getString(com.meijer.mobile.meijer.Y.f99726O5);
            Intrinsics.i(string, "getString(...)");
            return string;
        }
        if (position != 1) {
            return "";
        }
        String string2 = getString(com.meijer.mobile.meijer.Y.f99817T1);
        Intrinsics.i(string2, "getString(...)");
        return string2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D2(C14145a result) {
        String stringExtra;
        if (result.getResultCode() == -1) {
            Intent data = result.getData();
            if (data != null) {
                stringExtra = data.getStringExtra("barcode");
            } else {
                stringExtra = null;
            }
            if (stringExtra == null) {
                stringExtra = "";
            }
            final String str = stringExtra;
            if (StringsKt.r0(str)) {
                new Pj.j(this, Aq.b.f1470O, new Object[0]).g();
                getIntent().removeExtra("com.meijer.intent.extra.PRODUCT_SCAN");
                return;
            } else {
                this.trackingSearchMethod = "Barcode Search";
                B2().O0(new AbstractC12290t.CompleteSearchAction(str, null, true, false, 10, null));
                getAnalyticsEngine().i(C14476c.h("Product Search Page"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.v0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SearchProductActivity.E2(str, (TrackingData) obj);
                    }
                });
            }
        } else if (result.getResultCode() == 0 && getIntent().hasExtra("com.meijer.intent.extra.PRODUCT_SCAN")) {
            finish();
        }
        getIntent().removeExtra("com.meijer.intent.extra.PRODUCT_SCAN");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I2(SearchProductActivity searchProductActivity) {
        searchProductActivity.B2().O0(AbstractC12290t.b.f108990a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(SearchProductActivity searchProductActivity, View view) {
        searchProductActivity.B2().O0(AbstractC12290t.g.f108999a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K2(SearchProductActivity searchProductActivity, View view) {
        searchProductActivity.B2().O0(AbstractC12290t.m.f109007a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L2(SearchProductActivity searchProductActivity, View view) {
        searchProductActivity.B2().O0(AbstractC12290t.c.f108991a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M2(SearchProductActivity searchProductActivity) {
        if (!searchProductActivity.onNavigateUp()) {
            searchProductActivity.finish();
        }
        bk.c.b(searchProductActivity, 1, 0, 0, 0, 8, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N2(SearchProductActivity searchProductActivity, View view) {
        searchProductActivity.B2().O0(AbstractC12290t.o.f109009a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O2(SearchProductActivity searchProductActivity, View view) {
        searchProductActivity.getAnalyticsEngine().b(C14476c.a("shopDepartmentMenu"), new AbstractC14482i[0]);
        searchProductActivity.startActivity(Al.g.B(searchProductActivity.getFeatureEntryPoint(), null, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P2(SearchProductActivity searchProductActivity, View view) {
        searchProductActivity.getAnalyticsEngine().b(C14476c.a("viewFavoritesMenu"), new AbstractC14482i[0]);
        searchProductActivity.startActivity(searchProductActivity.getFeatureEntryPoint().K(l.d.f150146a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T2(ProductFullDetails product, com.meijer.mobile.core.design.widget.stepperview.a state) {
        B2().O0(new AbstractC12290t.UpdateEntryAction(product, state.getValueState().getQuantity()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y2(android.net.Uri r10, hi.AbstractC14481h r11, java.lang.String r12, boolean r13) {
        /*
            r9 = this;
            Cl.e r0 = r9.y2()
            if (r10 != 0) goto L9
            android.net.Uri r1 = android.net.Uri.EMPTY
            goto La
        L9:
            r1 = r10
        La:
            kotlin.jvm.internal.Intrinsics.g(r1)
            int r5 = r0.O(r1)
            Cl.e r2 = r9.y2()
            if (r10 != 0) goto L19
            android.net.Uri r10 = android.net.Uri.EMPTY
        L19:
            r4 = r10
            kotlin.jvm.internal.Intrinsics.g(r4)
            r7 = 8
            r8 = 0
            r6 = 0
            r3 = r9
            android.content.Intent r10 = Cl.e.S(r2, r3, r4, r5, r6, r7, r8)
            if (r10 == 0) goto L92
            java.lang.String r0 = "com.meijer.mobile.meijer.activity.find.FilteredProductsActivity.EXTRA_PRODUCT_QUERY_INTENT"
            boolean r1 = r10.hasExtra(r0)
            java.lang.String r2 = "com.meijer.intent.extra.PREVIOUS_TRACK_ACTION"
            java.lang.Class<Qo.l> r4 = Qo.l.class
            r5 = 33
            r6 = 0
            if (r1 == 0) goto L5b
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r5) goto L42
            java.lang.Object r1 = ta.d.a(r10, r0, r4)
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            goto L4d
        L42:
            android.os.Parcelable r1 = r10.getParcelableExtra(r0)
            boolean r7 = r1 instanceof Qo.l
            if (r7 != 0) goto L4b
            r1 = r6
        L4b:
            Qo.l r1 = (Qo.l) r1
        L4d:
            boolean r1 = r1 instanceof Qo.l.Department
            if (r1 == 0) goto L5b
            if (r11 == 0) goto L57
            java.lang.String r6 = r11.getValue()
        L57:
            r10.putExtra(r2, r6)
            goto L8f
        L5b:
            boolean r1 = r10.hasExtra(r0)
            if (r1 == 0) goto L86
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r5) goto L6c
            java.lang.Object r0 = ta.d.a(r10, r0, r4)
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            goto L77
        L6c:
            android.os.Parcelable r0 = r10.getParcelableExtra(r0)
            boolean r1 = r0 instanceof Qo.l
            if (r1 != 0) goto L75
            r0 = r6
        L75:
            Qo.l r0 = (Qo.l) r0
        L77:
            boolean r0 = r0 instanceof Qo.l.BrowseCollection
            if (r0 == 0) goto L86
            java.lang.String r11 = "KEY_CURATED_CAROUSEL"
            r10.putExtra(r11, r12)
            java.lang.String r11 = "SEE_MORE_ITEMS"
            r10.putExtra(r11, r13)
            goto L8f
        L86:
            if (r11 == 0) goto L8c
            java.lang.String r6 = r11.getValue()
        L8c:
            r10.putExtra(r2, r6)
        L8f:
            r9.startActivity(r10)
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.SearchProductActivity.Y2(android.net.Uri, hi.h, java.lang.String, boolean):void");
    }

    private final void Z2() {
        getAnalyticsEngine().i(C14476c.h("Product Search Page"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.y0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchProductActivity.a3(this.f109070a, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e3(SearchProductActivity searchProductActivity, Coupon coupon, TrackingData trackingData, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        searchProductActivity.B2().onAction(new a.Clip(coupon, trackingData));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f3(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h3(SearchProductActivity searchProductActivity, DialogInterface dialogInterface, int i10) {
        searchProductActivity.onSignIn();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i3(SearchProductActivity searchProductActivity, DialogInterface dialogInterface, int i10) {
        searchProductActivity.onCreateAccount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j3(Ok.c coupon, TrackingData trackingData) {
        String value;
        AbstractC14481h event;
        Cl.e eVarY2 = y2();
        if (trackingData != null && (event = trackingData.getEvent()) != null) {
            value = event.getValue();
        } else {
            value = null;
        }
        startActivity(eVarY2.f(coupon, true, true, false, value));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k3(mk.f productId, String previousTrackAction) {
        startActivity(getFeatureEntryPoint().s(productId, false, true, previousTrackAction));
    }

    private final void m3(int count) {
        I1 i1B2 = B2();
        InterfaceC5730l0<Boolean> interfaceC5730l0F0 = i1B2.F0();
        I1.h hVar = I1.h.f108005a;
        interfaceC5730l0F0.setValue(Boolean.valueOf(i1B2.X0(hVar)));
        i1B2.G0().setValue(Boolean.valueOf(i1B2.Y0(hVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o3(String uri, String carouselTitle, boolean isFromSeeMoreItems) {
        B2().O0(new AbstractC12290t.PersonalizedProductListClicked(uri, carouselTitle, isFromSeeMoreItems));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Intent x2(OldSearchViewState c12293u) {
        Intent intentD = getFeatureEntryPoint().d();
        if (!c12293u.getIsOrderUnderModification()) {
            intentD = null;
        }
        if (intentD == null) {
            return OrderOptionsActivity.INSTANCE.b(this, "search: search page");
        }
        return intentD;
    }

    @Override // Zm.x0
    public void J0(int totalResults, int tokenMatchCount, int embeddingsCount) {
        int i10;
        I1 i1B2 = B2();
        I1.h hVarJ0 = i1B2.j0(tokenMatchCount, embeddingsCount);
        int iK0 = i1B2.k0(hVarJ0, totalResults, tokenMatchCount, embeddingsCount);
        AbstractC5607a abstractC5607aH0 = i1B2.h0(hVarJ0, i1B2.B0().getValue().getSearchTerm());
        if (abstractC5607aH0 != null) {
            i1B2.y0().setValue(abstractC5607aH0.b(this));
        }
        AbstractC5607a abstractC5607aG0 = i1B2.g0(hVarJ0, tokenMatchCount, embeddingsCount, i1B2.B0().getValue().getSearchTerm());
        if (abstractC5607aG0 != null) {
            i1B2.x0().setValue(abstractC5607aG0.b(this));
        }
        AbstractC5607a abstractC5607aI0 = i1B2.i0(hVarJ0, iK0);
        if (abstractC5607aI0 != null) {
            i1B2.z0().setValue(abstractC5607aI0.b(this));
        }
        i1B2.E0().setValue(Boolean.valueOf(i1B2.W0(hVarJ0)));
        i1B2.D0().setValue(Boolean.valueOf(i1B2.V0(hVarJ0)));
        i1B2.F0().setValue(Boolean.valueOf(i1B2.X0(hVarJ0)));
        InterfaceC5730l0<Boolean> interfaceC5730l0G0 = i1B2.G0();
        boolean zY0 = i1B2.Y0(hVarJ0);
        Boolean boolValueOf = Boolean.valueOf(zY0);
        com.meijer.mobile.meijer.activity.find.fragment.n nVar = this.searchResultPagerAdapter;
        Mn.T t10 = null;
        if (nVar == null) {
            Intrinsics.y("searchResultPagerAdapter");
            nVar = null;
        }
        InterfaceC5528a productsFragment = nVar.getProductsFragment();
        if (productsFragment != null) {
            productsFragment.z(zY0);
        }
        interfaceC5730l0G0.setValue(boolValueOf);
        Mn.T t11 = this.binding;
        if (t11 == null) {
            Intrinsics.y("binding");
        } else {
            t10 = t11;
        }
        ViewPager2 searchResultsViewpager = t10.f20329K;
        Intrinsics.i(searchResultsViewpager, "searchResultsViewpager");
        if (B2().G0().getValue().booleanValue()) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        searchResultsViewpager.setVisibility(i10);
    }

    @Override // com.meijer.mobile.meijer.activity.coupons.fragment.CouponsFragment.b
    public void K0(final int count) {
        m3(count);
        getAnalyticsEngine().i(C14476c.h("Product Search Page"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.x0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchProductActivity.G2(count, (TrackingData) obj);
            }
        });
        String string = getString(C18301b.f171291q, Integer.valueOf(count));
        Intrinsics.i(string, "getString(...)");
        n3(1, string, AbstractC5607a.INSTANCE.b(C18300a.f171273g, count, 2, 2).b(this));
    }

    @Override // com.meijer.mobile.meijer.activity.find.fragment.ProductsFragment.b
    public void M(int count) {
        TabLayout.TabView tabView;
        m3(count);
        String string = getString(C18301b.f171292r, Integer.valueOf(count));
        Intrinsics.i(string, "getString(...)");
        String strB = AbstractC5607a.INSTANCE.b(C18300a.f171273g, count, 1, 2).b(this);
        Mn.T t10 = this.binding;
        if (t10 == null) {
            Intrinsics.y("binding");
            t10 = null;
        }
        TabLayout.f fVarB = t10.f20328J.B(0);
        if (fVarB != null && (tabView = fVarB.f87668i) != null) {
            tabView.setPadding(0, 0, 0, 0);
        }
        n3(0, string, strB);
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Object serializableExtra;
        boolean z10;
        int i10;
        Parcelable parcelable;
        boolean z11;
        Object serializableExtra2;
        Pp.b bVar;
        super.onCreate(savedInstanceState);
        bk.c.b(this, 0, R.anim.fade_in, R.anim.fade_out, 0, 8, null);
        getLifecycle().a(B2());
        Mn.T tK0 = Mn.T.K0(getLayoutInflater());
        this.binding = tK0;
        Serializable serializable = null;
        if (tK0 == null) {
            Intrinsics.y("binding");
            tK0 = null;
        }
        int i11 = 0;
        setContentView(Zr.a.j(tK0.getRoot(), false, 1, null));
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(787465435, true, new c()), 1, null);
        this.recentSearchesList = new RecentSearchList(getUserManager().v(), 6);
        Intent intent = getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 33) {
            serializableExtra = intent.getSerializableExtra("com.meijer.intent.extra.SEARCH_TYPE", Pp.b.class);
        } else {
            Object serializableExtra3 = intent.getSerializableExtra("com.meijer.intent.extra.SEARCH_TYPE");
            if (!(serializableExtra3 instanceof Pp.b)) {
                serializableExtra3 = null;
            }
            serializableExtra = (Pp.b) serializableExtra3;
        }
        Pp.b bVar2 = (Pp.b) serializableExtra;
        if (bVar2 != null) {
            this.searchType = bVar2;
        }
        Pp.b bVar3 = this.searchType;
        if (bVar3 == Pp.b.f28357b) {
            getAnalyticsEngine().i(C14476c.h("Product Search Page"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.J0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchProductActivity.H2((TrackingData) obj);
                }
            });
        } else if (bVar3 == Pp.b.f28358c || bVar3 == Pp.b.f28359d) {
            Mn.T t10 = this.binding;
            if (t10 == null) {
                Intrinsics.y("binding");
                t10 = null;
            }
            ImageButton searchToCart = t10.f20324F.f21169H;
            Intrinsics.i(searchToCart, "searchToCart");
            searchToCart.setVisibility(8);
            Mn.T t11 = this.binding;
            if (t11 == null) {
                Intrinsics.y("binding");
                t11 = null;
            }
            AppBarLayout searchAppBar = t11.f20323E;
            Intrinsics.i(searchAppBar, "searchAppBar");
            searchAppBar.setVisibility(0);
            Mn.T t12 = this.binding;
            if (t12 == null) {
                Intrinsics.y("binding");
                t12 = null;
            }
            MaterialButton browseDeptsButton = t12.f20324F.f21162A;
            Intrinsics.i(browseDeptsButton, "browseDeptsButton");
            browseDeptsButton.setVisibility(8);
            Mn.T t13 = this.binding;
            if (t13 == null) {
                Intrinsics.y("binding");
                t13 = null;
            }
            MaterialButton viewFavoritesButton = t13.f20324F.f21170I;
            Intrinsics.i(viewFavoritesButton, "viewFavoritesButton");
            viewFavoritesButton.setVisibility(8);
        }
        Pp.b bVar4 = this.searchType;
        Pp.b bVar5 = Pp.b.f28359d;
        if (bVar4 == bVar5) {
            Mn.T t14 = this.binding;
            if (t14 == null) {
                Intrinsics.y("binding");
                t14 = null;
            }
            t14.f20332N.setTitle(C17135b.f162028j0);
            Mn.T t15 = this.binding;
            if (t15 == null) {
                Intrinsics.y("binding");
                t15 = null;
            }
            t15.f20330L.setText(C17135b.f161991O0);
        }
        Aj.b.O0(this, 0, 0, new Function0() { // from class: com.meijer.mobile.meijer.activity.find.K0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchProductActivity.M2(this.f106493a);
            }
        }, 3, null);
        Mn.T t16 = this.binding;
        if (t16 == null) {
            Intrinsics.y("binding");
            t16 = null;
        }
        t16.f20324F.f21162A.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.L0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchProductActivity.O2(this.f106494a, view);
            }
        });
        boolean zE = getFeatureManager().e(AbstractC18227f.A.f170542h);
        Mn.T t17 = this.binding;
        if (t17 == null) {
            Intrinsics.y("binding");
            t17 = null;
        }
        MaterialButton materialButton = t17.f20324F.f21170I;
        Intrinsics.g(materialButton);
        if (getUserManager().b() && zE && this.searchType == Pp.b.f28356a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        materialButton.setVisibility(i10);
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.M0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchProductActivity.P2(this.f106496a, view);
            }
        });
        Mn.T t18 = this.binding;
        if (t18 == null) {
            Intrinsics.y("binding");
            t18 = null;
        }
        t18.f20330L.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.N0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchProductActivity.Q2(this.f106498a, view);
            }
        });
        com.meijer.mobile.meijer.activity.find.fragment.n nVar = new com.meijer.mobile.meijer.activity.find.fragment.n(this, getFeatureManager().e(AbstractC18227f.T.f170559h));
        this.searchResultPagerAdapter = nVar;
        nVar.p(this.searchType);
        com.meijer.mobile.meijer.activity.find.fragment.n nVar2 = this.searchResultPagerAdapter;
        if (nVar2 == null) {
            Intrinsics.y("searchResultPagerAdapter");
            nVar2 = null;
        }
        Intent intent2 = getIntent();
        Intrinsics.i(intent2, "getIntent(...)");
        if (i12 >= 33) {
            parcelable = (Parcelable) intent2.getParcelableExtra("selected.product", CartProductListDecorator.class);
        } else {
            Parcelable parcelableExtra = intent2.getParcelableExtra("selected.product");
            if (!(parcelableExtra instanceof CartProductListDecorator)) {
                parcelableExtra = null;
            }
            parcelable = (CartProductListDecorator) parcelableExtra;
        }
        nVar2.o((CartProductListDecorator) parcelable);
        Mn.T t19 = this.binding;
        if (t19 == null) {
            Intrinsics.y("binding");
            t19 = null;
        }
        ViewPager2 viewPager2 = t19.f20329K;
        viewPager2.setOffscreenPageLimit(1);
        com.meijer.mobile.meijer.activity.find.fragment.n nVar3 = this.searchResultPagerAdapter;
        if (nVar3 == null) {
            Intrinsics.y("searchResultPagerAdapter");
            nVar3 = null;
        }
        viewPager2.setAdapter(nVar3);
        b3();
        nu.l lVar = new nu.l();
        lVar.O(true);
        this.suggestionsSection = lVar;
        nu.l lVar2 = new nu.l();
        lVar2.N(new C12186s0(false, new Function0() { // from class: com.meijer.mobile.meijer.activity.find.O0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchProductActivity.I2(this.f106500a);
            }
        }));
        lVar2.M(new C12183q0());
        this.recentsSection = lVar2;
        C15949d<nu.g> c15949d = new C15949d<>();
        nu.l lVar3 = this.suggestionsSection;
        if (lVar3 == null) {
            Intrinsics.y("suggestionsSection");
            lVar3 = null;
        }
        c15949d.c(lVar3);
        this.suggestionsAdapter = c15949d;
        C15949d<nu.g> c15949d2 = new C15949d<>();
        nu.l lVar4 = this.recentsSection;
        if (lVar4 == null) {
            Intrinsics.y("recentsSection");
            lVar4 = null;
        }
        c15949d2.c(lVar4);
        this.recentsAdapter = c15949d2;
        Mn.T t20 = this.binding;
        if (t20 == null) {
            Intrinsics.y("binding");
            t20 = null;
        }
        RecyclerView recyclerView = t20.f20331M;
        C15949d<nu.g> c15949d3 = this.suggestionsAdapter;
        if (c15949d3 == null) {
            Intrinsics.y("suggestionsAdapter");
            c15949d3 = null;
        }
        recyclerView.setAdapter(c15949d3);
        recyclerView.addItemDecoration(new androidx.recyclerview.widget.i(this, 1));
        Mn.T t21 = this.binding;
        if (t21 == null) {
            Intrinsics.y("binding");
            t21 = null;
        }
        RecyclerView recyclerView2 = t21.f20326H;
        C15949d<nu.g> c15949d4 = this.recentsAdapter;
        if (c15949d4 == null) {
            Intrinsics.y("recentsAdapter");
            c15949d4 = null;
        }
        recyclerView2.setAdapter(c15949d4);
        Mn.T t22 = this.binding;
        if (t22 == null) {
            Intrinsics.y("binding");
            t22 = null;
        }
        t22.f20324F.f21167F.addTextChangedListener(this);
        Mn.T t23 = this.binding;
        if (t23 == null) {
            Intrinsics.y("binding");
            t23 = null;
        }
        t23.f20324F.f21167F.setOnFocusChangeListener(this);
        Mn.T t24 = this.binding;
        if (t24 == null) {
            Intrinsics.y("binding");
            t24 = null;
        }
        t24.f20324F.f21167F.setOnEditorActionListener(new d());
        Mn.T t25 = this.binding;
        if (t25 == null) {
            Intrinsics.y("binding");
            t25 = null;
        }
        t25.f20324F.f21164C.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.P0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchProductActivity.J2(this.f106503a, view);
            }
        });
        Mn.T t26 = this.binding;
        if (t26 == null) {
            Intrinsics.y("binding");
            t26 = null;
        }
        t26.f20324F.f21165D.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchProductActivity.K2(this.f109065a, view);
            }
        });
        Mn.T t27 = this.binding;
        if (t27 == null) {
            Intrinsics.y("binding");
            t27 = null;
        }
        t27.f20324F.f21166E.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.G0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchProductActivity.L2(this.f106455a, view);
            }
        });
        Mn.T t28 = this.binding;
        if (t28 == null) {
            Intrinsics.y("binding");
            t28 = null;
        }
        t28.f20324F.f21169H.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.I0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchProductActivity.N2(this.f106473a, view);
            }
        });
        C17154h.J(C17154h.O(B2().B0(), new e(null)), C6031t.a(this));
        Mn.T t29 = this.binding;
        if (t29 == null) {
            Intrinsics.y("binding");
            t29 = null;
        }
        ComposeView fulfillmentBarSearch = t29.f20319A;
        Intrinsics.i(fulfillmentBarSearch, "fulfillmentBarSearch");
        if (getUserManager().b() && (bVar = this.searchType) != Pp.b.f28358c && bVar != bVar5) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            i11 = 8;
        }
        fulfillmentBarSearch.setVisibility(i11);
        Mn.T t30 = this.binding;
        if (t30 == null) {
            Intrinsics.y("binding");
            t30 = null;
        }
        t30.f20319A.setContent(ComposableLambdaKt.composableLambdaInstance(-986516783, true, new f()));
        C17154h.J(C17154h.O(B2().getEvents(), new g(null)), C6031t.a(this));
        Intent intent3 = getIntent();
        Intrinsics.i(intent3, "getIntent(...)");
        if (i12 >= 33) {
            serializableExtra2 = intent3.getSerializableExtra("com.meijer.intent.extra.IS_DEEPLINK", Boolean.class);
        } else {
            Serializable serializableExtra4 = intent3.getSerializableExtra("com.meijer.intent.extra.IS_DEEPLINK");
            if (serializableExtra4 instanceof Boolean) {
                serializable = serializableExtra4;
            }
            serializableExtra2 = (Boolean) serializable;
        }
        if (!Intrinsics.e(serializableExtra2, Boolean.TRUE)) {
            B2().Z0();
        }
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        String stringExtra;
        Parcelable parcelable;
        String queryParameter;
        l.k kVarC;
        super.onResume();
        Z2();
        FS.page("Product Search Results Page").start();
        if (getIntent().getBooleanExtra("com.meijer.intent.extra.PRODUCT_SCAN", false)) {
            B2().O0(AbstractC12290t.m.f109007a);
        } else if (getIntent().hasExtra("unauth_search_term") && (stringExtra = getIntent().getStringExtra("unauth_search_term")) != null) {
            B2().O0(new AbstractC12290t.CompleteSearchAction(stringExtra, null, false, false, 14, null));
            getIntent().removeExtra("unauth_search_term");
        }
        Mn.T t10 = this.binding;
        Parcelable parcelable2 = null;
        if (t10 == null) {
            Intrinsics.y("binding");
            t10 = null;
        }
        Editable text = t10.f20324F.f21167F.getText();
        if (text != null && !StringsKt.r0(text)) {
            getWindow().setSoftInputMode(3);
        } else {
            getWindow().setSoftInputMode(4);
        }
        com.meijer.mobile.meijer.activity.find.fragment.n nVar = this.searchResultPagerAdapter;
        if (nVar == null) {
            Intrinsics.y("searchResultPagerAdapter");
            nVar = null;
        }
        nVar.m(1);
        if (this.searchType == Pp.b.f28357b) {
            com.meijer.mobile.meijer.activity.find.fragment.n nVar2 = this.searchResultPagerAdapter;
            if (nVar2 == null) {
                Intrinsics.y("searchResultPagerAdapter");
                nVar2 = null;
            }
            nVar2.q(true);
        }
        b3();
        Intent intent = getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) intent.getParcelableExtra("product_sort_filter_deeplink", Uri.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("product_sort_filter_deeplink");
            if (parcelableExtra instanceof Uri) {
                parcelable2 = parcelableExtra;
            }
            parcelable = (Uri) parcelable2;
        }
        Uri uri = (Uri) parcelable;
        if (uri != null && (queryParameter = uri.getQueryParameter("text")) != null && (kVarC = Qo.K.c(new l.Search(queryParameter), uri)) != null) {
            B2().U0(kVarC);
            getIntent().removeExtra("product_sort_filter_deeplink");
        }
    }
}
