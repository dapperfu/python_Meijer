package com.meijer.mobile.meijer.activity.find;

import Co.ProductFullDetails;
import Go.SearchSuggestions;
import Go.Suggestion;
import Il.FulfillmentBarDecorator;
import Ki.LocalThemeScope;
import Nn.AbstractC4317z2;
import P0.e;
import Pk.Coupon;
import Pp.SearchQuery;
import Qk.a;
import Qo.FilterFacet;
import Qo.FilterFacetOption;
import Qo.FilterSortOption;
import Qo.l;
import V2.CreationExtras;
import Vl.HomeDepartment;
import an.InterfaceC5728a;
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
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C6173t;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import androidx.viewpager2.widget.ViewPager2;
import bk.AbstractC6392a;
import com.fullstory.FS;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.d;
import com.meijer.mobile.meijer.activity.coupons.fragment.CouponsFragment;
import com.meijer.mobile.meijer.activity.find.C12315u0;
import com.meijer.mobile.meijer.activity.find.SearchProductActivity;
import com.meijer.mobile.meijer.activity.find.fragment.ProductsFragment;
import com.meijer.mobile.meijer.activity.find.i1;
import com.meijer.mobile.meijer.activity.find.model.RecentSearchList;
import com.meijer.mobile.meijer.activity.find.viewmodel.AbstractC12412s;
import com.meijer.mobile.meijer.activity.find.viewmodel.AbstractC12415t;
import com.meijer.mobile.meijer.activity.find.viewmodel.I1;
import com.meijer.mobile.meijer.activity.find.viewmodel.M1;
import com.meijer.mobile.meijer.activity.find.viewmodel.OldSearchViewState;
import com.meijer.mobile.meijer.activity.find.viewmodel.RecentSearches;
import com.meijer.mobile.meijer.activity.home.HomeDecorator;
import com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity;
import com.meijer.mobile.meijer.search.Q1;
import e.C13737e;
import g.AbstractC14276c;
import g.C14274a;
import g.InterfaceC14275b;
import ii.AbstractC14761h;
import ii.AbstractC14762i;
import ii.C14756c;
import ii.TrackingData;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14888I;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ju.C15069d;
import ki.InterfaceC15205y;
import ki.j1;
import ki.q1;
import kotlin.C17983Z;
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
import le.C15485b;
import mv.C15809k;
import mv.InterfaceC15783O;
import nk.l;
import pv.C16563h;
import tr.C17284b;
import vs.CartProductListDecorator;
import vs.ProductCarouselDecorator;
import ys.C18371a;
import ys.C18372b;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000Ì\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 Ú\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0002Û\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u001e\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJC\u0010%\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020$2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u0019\u0010,\u001a\u00020\u000f2\b\u0010+\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0004\b,\u0010*J!\u0010/\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u001a2\b\b\u0002\u0010.\u001a\u00020\u001cH\u0002¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u0012H\u0002¢\u0006\u0004\b2\u0010\u0015J)\u00103\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b3\u00104J#\u00108\u001a\u00020\u000f2\u0006\u00106\u001a\u0002052\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b8\u00109J\u001f\u0010>\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u000fH\u0002¢\u0006\u0004\bD\u0010\nJ'\u0010H\u001a\u00020\u000f2\u0006\u0010E\u001a\u00020\u00122\u0006\u0010F\u001a\u00020\u001a2\u0006\u0010G\u001a\u00020\u001aH\u0002¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020\u000f2\u0006\u0010J\u001a\u00020\u001aH\u0002¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u000fH\u0002¢\u0006\u0004\bM\u0010\nJ\u0017\u0010P\u001a\u00020\u000f2\u0006\u0010O\u001a\u00020NH\u0002¢\u0006\u0004\bP\u0010QJ\u0017\u0010S\u001a\u00020\u000f2\u0006\u0010O\u001a\u00020RH\u0002¢\u0006\u0004\bS\u0010TJ\u0019\u0010W\u001a\u00020\u000f2\b\u0010V\u001a\u0004\u0018\u00010UH\u0014¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\u000fH\u0016¢\u0006\u0004\bY\u0010\nJ\u000f\u0010Z\u001a\u00020\u000fH\u0016¢\u0006\u0004\bZ\u0010\nJ!\u0010]\u001a\u00020\u000f2\u0012\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u000f0[¢\u0006\u0004\b]\u0010^J\u0019\u0010a\u001a\u00020\u001c2\b\u0010`\u001a\u0004\u0018\u00010_H\u0016¢\u0006\u0004\ba\u0010bJ\u000f\u0010c\u001a\u00020\u000fH\u0014¢\u0006\u0004\bc\u0010\nJ\u000f\u0010d\u001a\u00020\u000fH\u0014¢\u0006\u0004\bd\u0010\nJ1\u0010i\u001a\u00020\u000f2\b\u0010f\u001a\u0004\u0018\u00010e2\u0006\u0010g\u001a\u00020\u00122\u0006\u00101\u001a\u00020\u00122\u0006\u0010h\u001a\u00020\u0012H\u0016¢\u0006\u0004\bi\u0010jJ\u0019\u0010l\u001a\u00020\u000f2\b\u0010f\u001a\u0004\u0018\u00010kH\u0016¢\u0006\u0004\bl\u0010mJ1\u0010o\u001a\u00020\u000f2\b\u0010f\u001a\u0004\u0018\u00010e2\u0006\u0010g\u001a\u00020\u00122\u0006\u0010n\u001a\u00020\u00122\u0006\u00101\u001a\u00020\u0012H\u0016¢\u0006\u0004\bo\u0010jJ'\u0010s\u001a\u00020\u000f2\u0006\u0010p\u001a\u00020\u00122\u0006\u0010q\u001a\u00020\u00122\u0006\u0010r\u001a\u00020\u0012H\u0016¢\u0006\u0004\bs\u0010tJ\u0017\u0010u\u001a\u00020\u000f2\u0006\u0010J\u001a\u00020\u001aH\u0016¢\u0006\u0004\bu\u0010LJ\u001f\u0010x\u001a\u00020\u000f2\u0006\u0010v\u001a\u00020\u001a2\u0006\u0010w\u001a\u00020\u001aH\u0016¢\u0006\u0004\bx\u0010yJ\u0017\u0010z\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u0012H\u0016¢\u0006\u0004\bz\u0010\u0015J\u0017\u0010{\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b{\u0010*J\u0017\u0010}\u001a\u00020\u000f2\u0006\u0010|\u001a\u00020\u001cH\u0016¢\u0006\u0004\b}\u0010~J\u0017\u0010\u007f\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u007f\u0010\u0015J\u0018\u0010\u0080\u0001\u001a\u00020e2\u0006\u0010E\u001a\u00020\u0012¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J'\u0010\u0085\u0001\u001a\u00020\u000f2\n\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0082\u00012\u0007\u0010\u0084\u0001\u001a\u00020\u001cH\u0016¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001R)\u0010\u008d\u0001\u001a\u00030\u0087\u00018\u0000@\u0000X\u0081.¢\u0006\u0017\n\u0005\bf\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R*\u0010\u0095\u0001\u001a\u00030\u008e\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R*\u0010\u009d\u0001\u001a\u00030\u0096\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R!\u0010¢\u0001\u001a\u00030\u009e\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001R!\u0010§\u0001\u001a\u00030£\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¤\u0001\u0010\u009f\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001R!\u0010¬\u0001\u001a\n\u0012\u0005\u0012\u00030©\u00010¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R!\u0010®\u0001\u001a\n\u0012\u0005\u0012\u00030©\u00010¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u00ad\u0001\u0010«\u0001R\u001a\u0010²\u0001\u001a\u00030¯\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u001a\u0010´\u0001\u001a\u00030¯\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b³\u0001\u0010±\u0001R\u001a\u0010¸\u0001\u001a\u00030µ\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R\u001a\u0010¼\u0001\u001a\u00030¹\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u0019\u0010¿\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R\u001a\u0010+\u001a\u0005\u0018\u00010À\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bx\u0010Á\u0001R\u0019\u0010Ã\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0001\u0010¾\u0001R\u001a\u0010Ç\u0001\u001a\u00030Ä\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R\u001a\u0010Ë\u0001\u001a\u00030È\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R\u001f\u0010Ð\u0001\u001a\n\u0012\u0005\u0012\u00030Í\u00010Ì\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÎ\u0001\u0010Ï\u0001R\u001e\u0010Ò\u0001\u001a\t\u0012\u0004\u0012\u00020'0Ì\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÑ\u0001\u0010Ï\u0001R\u001d\u0010Ö\u0001\u001a\u00030Í\u0001*\u00030Ó\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÔ\u0001\u0010Õ\u0001R\u0018\u0010Ù\u0001\u001a\u00030×\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u00ad\u0001\u0010Ø\u0001¨\u0006Ü\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/SearchProductActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "Landroid/text/TextWatcher;", "Lcom/meijer/mobile/meijer/activity/find/fragment/ProductsFragment$b;", "Lcom/meijer/mobile/meijer/activity/coupons/fragment/CouponsFragment$b;", "Lan/x0;", "LBj/b;", "Landroid/view/View$OnFocusChangeListener;", "LQj/g;", "<init>", "()V", "LPk/c;", "coupon", "Lii/f;", "trackingData", "", "j3", "(LPk/c;Lii/f;)V", "", "errorMessageId", "g3", "(I)V", "Landroid/net/Uri;", "uri", "Lii/h;", "trackingState", "", "carouselTitle", "", "isFromSeeMoreItems", "Y2", "(Landroid/net/Uri;Lii/h;Ljava/lang/String;Z)V", "titleResId", "messageResId", "positiveButtonResId", "negativeButtonResId", "LPk/a;", "d3", "(IIIILPk/a;Lii/f;)V", "LQo/l$k;", "query", "F2", "(LQo/l$k;)V", "searchQuery", "C2", "searchTerm", "isScannedUPC", "R2", "(Ljava/lang/String;Z)V", "count", "m3", "o3", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Lnk/f;", "productId", "previousTrackAction", "k3", "(Lnk/f;Ljava/lang/String;)V", "LCo/h;", "product", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "state", "T2", "(LCo/h;Lcom/meijer/mobile/core/design/widget/stepperview/a;)V", "Lg/a;", "result", "D2", "(Lg/a;)V", "b3", "position", "pageTitle", "contentDesc", "n3", "(ILjava/lang/String;Ljava/lang/String;)V", "firstItemDescription", "l3", "(Ljava/lang/String;)V", "Z2", "Lcom/meijer/mobile/meijer/activity/find/i1$a;", "action", "W2", "(Lcom/meijer/mobile/meijer/activity/find/i1$a;)V", "Lcom/meijer/mobile/meijer/activity/find/u0$a$a;", "U2", "(Lcom/meijer/mobile/meijer/activity/find/u0$a$a;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onCreateAccount", "onSignIn", "Lkotlin/Function1;", "collector", "w2", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "onResume", "onDestroy", "", "s", "start", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "before", "onTextChanged", "totalResults", "tokenMatchCount", "embeddingsCount", "K0", "(III)V", "j0", "suggestionTerm", "originalTerm", "E", "(Ljava/lang/String;Ljava/lang/String;)V", "N", "O", "itemSelected", "U", "(Z)V", "L0", "z2", "(I)Ljava/lang/CharSequence;", "Landroid/view/View;", "v", "hasFocus", "onFocusChange", "(Landroid/view/View;Z)V", "LTq/j;", "LTq/j;", "getStoreProvider$Meijer_playstoreRelease", "()LTq/j;", "setStoreProvider$Meijer_playstoreRelease", "(LTq/j;)V", "storeProvider", "LRo/a;", "t", "LRo/a;", "A2", "()LRo/a;", "setProductAnalytics", "(LRo/a;)V", "productAnalytics", "LDl/e;", "u", "LDl/e;", "y2", "()LDl/e;", "setMIntent", "(LDl/e;)V", "mIntent", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/I1;", "Lkotlin/Lazy;", "B2", "()Lcom/meijer/mobile/meijer/activity/find/viewmodel/I1;", "viewModel", "LIl/b;", "w", "getFulfillmentBarViewModel", "()LIl/b;", "fulfillmentBarViewModel", "Lju/d;", "Lju/g;", "x", "Lju/d;", "suggestionsAdapter", "y", "recentsAdapter", "Lju/l;", "z", "Lju/l;", "suggestionsSection", "A", "recentsSection", "Lcom/meijer/mobile/meijer/activity/find/fragment/n;", "B", "Lcom/meijer/mobile/meijer/activity/find/fragment/n;", "searchResultPagerAdapter", "LPp/b;", "C", "LPp/b;", "searchType", "D", "Ljava/lang/String;", "trackingSearchMethod", "LPp/a;", "LPp/a;", "F", "sortOption", "Lcom/meijer/mobile/meijer/activity/find/model/RecentSearchList;", "G", "Lcom/meijer/mobile/meijer/activity/find/model/RecentSearchList;", "recentSearchesList", "LNn/T;", "H", "LNn/T;", "binding", "Lg/c;", "Landroid/content/Intent;", "I", "Lg/c;", "scannerResultLauncher", "J", "filterResultRegistration", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/u;", "x2", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/u;)Landroid/content/Intent;", "fulfillmentBarIntent", "Landroidx/appcompat/widget/Toolbar;", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "K", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SearchProductActivity extends Hilt_SearchProductActivity implements TextWatcher, ProductsFragment.b, CouponsFragment.b, an.x0, Bj.b, View.OnFocusChangeListener, Qj.g {

    /* renamed from: L, reason: collision with root package name */
    public static final int f107367L = 8;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private ju.l recentsSection;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private com.meijer.mobile.meijer.activity.find.fragment.n searchResultPagerAdapter;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private SearchQuery searchQuery;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private RecentSearchList recentSearchesList;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private Nn.T binding;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public Tq.j storeProvider;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public Ro.a productAnalytics;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public Dl.e mIntent;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private C15069d<ju.g> suggestionsAdapter;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private C15069d<ju.g> recentsAdapter;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private ju.l suggestionsSection;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new androidx.view.e0(Reflection.b(I1.class), new j(this), new i(this), new k(null, this));

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Lazy fulfillmentBarViewModel = new androidx.view.e0(Reflection.b(Il.b.class), new m(this), new l(this), new n(null, this));

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private Pp.b searchType = Pp.b.f26238a;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private String trackingSearchMethod = "Typed Search";

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private String sortOption = "Most Relevant";

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<Intent> scannerResultLauncher = registerForActivityResult(new h.i(), new h());

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<l.k> filterResultRegistration = registerForActivityResult(new com.meijer.mobile.meijer.activity.find.filter.g(), new b());

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b implements InterfaceC14275b, FunctionAdapter {
        b() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14275b) && (obj instanceof FunctionAdapter)) {
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

        @Override // g.InterfaceC14275b
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
            final /* synthetic */ SearchProductActivity f107388a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.find.SearchProductActivity$c$a$a, reason: collision with other inner class name */
            static final class C1609a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ SearchProductActivity f107389a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f107390b;

                C1609a(SearchProductActivity searchProductActivity, LocalThemeScope localThemeScope) {
                    this.f107389a = searchProductActivity;
                    this.f107390b = localThemeScope;
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
                    if (this.f107389a.B2().E0().getValue().booleanValue()) {
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierD = androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.h(androidx.compose.foundation.b.d(FullStoryAnnotationsKt.fsUnmask(companion), this.f107390b.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null), 0.0f, 1, null), null, false, 3, null);
                        C5800d c5800d = C5800d.f48779a;
                        C5800d.f fVarB = c5800d.b();
                        e.Companion companion2 = P0.e.INSTANCE;
                        e.b bVarG = companion2.g();
                        SearchProductActivity searchProductActivity = this.f107389a;
                        LocalThemeScope localThemeScope = this.f107390b;
                        MeasurePolicy measurePolicyA = C5807k.a(fVarB, bVarG, composer, 54);
                        int iA = C5859f.a(composer, 0);
                        InterfaceC5884s interfaceC5884sR = composer.r();
                        Modifier modifierE = androidx.compose.ui.b.e(composer, modifierD);
                        InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
                        Function0<InterfaceC5953g> function0A = companion3.a();
                        if (composer.k() == null) {
                            C5859f.c();
                        }
                        composer.F();
                        if (composer.getInserting()) {
                            composer.I(function0A);
                        } else {
                            composer.s();
                        }
                        Composer composerA = D1.a(composer);
                        D1.c(composerA, measurePolicyA, companion3.e());
                        D1.c(composerA, interfaceC5884sR, companion3.g());
                        Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        D1.c(composerA, modifierE, companion3.f());
                        C14903g c14903g = C14903g.f139698a;
                        composer.startReplaceGroup(-1973623523);
                        if (searchProductActivity.getUserManager().b()) {
                            composer2 = composer;
                        } else {
                            C17983Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
                            composer2 = composer;
                        }
                        composer2.P();
                        float f11 = 24;
                        C14890K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f11)), composer2, 6);
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composer2, 0);
                        int iA2 = C5859f.a(composer2, 0);
                        InterfaceC5884s interfaceC5884sR2 = composer2.r();
                        Modifier modifierE2 = androidx.compose.ui.b.e(composer2, companion);
                        Function0<InterfaceC5953g> function0A2 = companion3.a();
                        if (composer2.k() == null) {
                            C5859f.c();
                        }
                        composer2.F();
                        if (composer2.getInserting()) {
                            composer2.I(function0A2);
                        } else {
                            composer2.s();
                        }
                        Composer composerA2 = D1.a(composer2);
                        D1.c(composerA2, measurePolicyB, companion3.e());
                        D1.c(composerA2, interfaceC5884sR2, companion3.g());
                        Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
                        if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                            composerA2.t(Integer.valueOf(iA2));
                            composerA2.n(Integer.valueOf(iA2), function2B2);
                        }
                        D1.c(composerA2, modifierE2, companion3.f());
                        C14889J c14889j = C14889J.f139620a;
                        C14890K.a(InterfaceC14888I.b(c14889j, companion, 0.1125f, false, 2, null), composer2, 0);
                        String value = searchProductActivity.B2().x0().getValue();
                        Modifier modifierB = InterfaceC14888I.b(c14889j, companion, 0.775f, false, 2, null);
                        int i11 = LocalThemeScope.f17314g;
                        Composer composer3 = composer2;
                        Q1.A(localThemeScope, modifierB, value, composer3, i11, 0);
                        Composer composer4 = composer3;
                        Modifier.Companion companion4 = companion;
                        C14890K.a(InterfaceC14888I.b(c14889j, companion4, 0.1125f, false, 2, null), composer4, 0);
                        composer4.v();
                        composer4.startReplaceGroup(-1973598435);
                        if (searchProductActivity.B2().C0().getValue().booleanValue()) {
                            f10 = f11;
                            C14890K.a(androidx.compose.foundation.layout.D.m(companion4, 0.0f, 0.0f, 0.0f, H1.h.p(8), 7, null), composer4, 6);
                            MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composer4, 0);
                            int iA3 = C5859f.a(composer4, 0);
                            InterfaceC5884s interfaceC5884sR3 = composer4.r();
                            Modifier modifierE3 = androidx.compose.ui.b.e(composer4, companion4);
                            Function0<InterfaceC5953g> function0A3 = companion3.a();
                            if (composer4.k() == null) {
                                C5859f.c();
                            }
                            composer4.F();
                            if (composer4.getInserting()) {
                                composer4.I(function0A3);
                            } else {
                                composer4.s();
                            }
                            Composer composerA3 = D1.a(composer4);
                            D1.c(composerA3, measurePolicyB2, companion3.e());
                            D1.c(composerA3, interfaceC5884sR3, companion3.g());
                            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
                            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                                composerA3.t(Integer.valueOf(iA3));
                                composerA3.n(Integer.valueOf(iA3), function2B3);
                            }
                            D1.c(composerA3, modifierE3, companion3.f());
                            C14890K.a(InterfaceC14888I.b(c14889j, companion4, 0.15555556f, false, 2, null), composer4, 0);
                            Q1.x(localThemeScope, InterfaceC14888I.b(c14889j, companion4, 0.6888889f, false, 2, null), searchProductActivity.B2().w0().getValue(), composer4, i11, 0);
                            composer4 = composer4;
                            companion4 = companion4;
                            C14890K.a(InterfaceC14888I.b(c14889j, companion4, 0.15555556f, false, 2, null), composer4, 0);
                            composer4.v();
                        } else {
                            f10 = f11;
                        }
                        composer4.P();
                        C14890K.a(androidx.compose.foundation.layout.J.i(companion4, H1.h.p(f10)), composer4, 6);
                        C17983Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
                        composer.v();
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    a(composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ SearchProductActivity f107391a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f107392b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.find.SearchProductActivity$c$a$b$a, reason: collision with other inner class name */
                static final class C1610a implements Function3<j1, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f107393a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ SearchProductActivity f107394b;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.meijer.mobile.meijer.activity.find.SearchProductActivity$c$a$b$a$a, reason: collision with other inner class name */
                    static final class C1611a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                        /* renamed from: a, reason: collision with root package name */
                        final /* synthetic */ LocalThemeScope f107395a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ SearchProductActivity f107396b;

                        C1611a(LocalThemeScope localThemeScope, SearchProductActivity searchProductActivity) {
                            this.f107395a = localThemeScope;
                            this.f107396b = searchProductActivity;
                        }

                        public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                            Intrinsics.j(AdsButton, "$this$AdsButton");
                            if ((i10 & 17) == 16 && composer.j()) {
                                composer.K();
                                return;
                            }
                            if (ComposerKt.M()) {
                                ComposerKt.U(1888083118, i10, -1, "com.meijer.mobile.meijer.activity.find.SearchProductActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchProductActivity.kt:301)");
                            }
                            LocalThemeScope localThemeScope = this.f107395a;
                            si.j.h(localThemeScope, new q1.Label(null, this.f107395a.getAdsColors().getAdsColorEnabled01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null), this.f107396b.B2().u0().getValue(), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                            if (ComposerKt.M()) {
                                ComposerKt.T();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                            a(interfaceC14888I, composer, num.intValue());
                            return Unit.f143329a;
                        }
                    }

                    C1610a(LocalThemeScope localThemeScope, SearchProductActivity searchProductActivity) {
                        this.f107393a = localThemeScope;
                        this.f107394b = searchProductActivity;
                    }

                    public final void b(j1 Assemble, Composer composer, int i10) {
                        Intrinsics.j(Assemble, "$this$Assemble");
                        if (ComposerKt.M()) {
                            ComposerKt.U(1385068929, i10, -1, "com.meijer.mobile.meijer.activity.find.SearchProductActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchProductActivity.kt:293)");
                        }
                        LocalThemeScope localThemeScope = this.f107393a;
                        q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, Modifier.INSTANCE, false, null, 895, null);
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(this.f107394b);
                        final SearchProductActivity searchProductActivity = this.f107394b;
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.S0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SearchProductActivity.c.a.b.C1610a.c(searchProductActivity);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        oi.E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(1888083118, true, new C1611a(this.f107393a, this.f107394b), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
                        b(j1Var, composer, num.intValue());
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit c(SearchProductActivity searchProductActivity) {
                        searchProductActivity.B2().O0(AbstractC12415t.j.f109863a);
                        return Unit.f143329a;
                    }
                }

                b(SearchProductActivity searchProductActivity, LocalThemeScope localThemeScope) {
                    this.f107391a = searchProductActivity;
                    this.f107392b = localThemeScope;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1292979597, i10, -1, "com.meijer.mobile.meijer.activity.find.SearchProductActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchProductActivity.kt:277)");
                    }
                    if (this.f107391a.B2().F0().getValue().booleanValue()) {
                        LocalThemeScope localThemeScope = this.f107392b;
                        SearchProductActivity searchProductActivity = this.f107391a;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        C5800d c5800d = C5800d.f48779a;
                        C5800d.m mVarH = c5800d.h();
                        e.Companion companion2 = P0.e.INSTANCE;
                        MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion2.k(), composer, 0);
                        int iA = C5859f.a(composer, 0);
                        InterfaceC5884s interfaceC5884sR = composer.r();
                        Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                        InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
                        Function0<InterfaceC5953g> function0A = companion3.a();
                        if (composer.k() == null) {
                            C5859f.c();
                        }
                        composer.F();
                        if (composer.getInserting()) {
                            composer.I(function0A);
                        } else {
                            composer.s();
                        }
                        Composer composerA = D1.a(composer);
                        D1.c(composerA, measurePolicyA, companion3.e());
                        D1.c(composerA, interfaceC5884sR, companion3.g());
                        Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        D1.c(composerA, modifierE, companion3.f());
                        C14903g c14903g = C14903g.f139698a;
                        Modifier modifierB = androidx.compose.foundation.layout.J.b(androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), null, false, 3, null), 0.0f, H1.h.p(48), 1, null);
                        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.i(), composer, 48);
                        int iA2 = C5859f.a(composer, 0);
                        InterfaceC5884s interfaceC5884sR2 = composer.r();
                        Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierB);
                        Function0<InterfaceC5953g> function0A2 = companion3.a();
                        if (composer.k() == null) {
                            C5859f.c();
                        }
                        composer.F();
                        if (composer.getInserting()) {
                            composer.I(function0A2);
                        } else {
                            composer.s();
                        }
                        Composer composerA2 = D1.a(composer);
                        D1.c(composerA2, measurePolicyB, companion3.e());
                        D1.c(composerA2, interfaceC5884sR2, companion3.g());
                        Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
                        if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                            composerA2.t(Integer.valueOf(iA2));
                            composerA2.n(Integer.valueOf(iA2), function2B2);
                        }
                        D1.c(composerA2, modifierE2, companion3.f());
                        C14889J c14889j = C14889J.f139620a;
                        C14890K.a(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, H1.h.p(16), 0.0f, 11, null), composer, 6);
                        String value = searchProductActivity.B2().y0().getValue();
                        int i11 = LocalThemeScope.f17314g;
                        Q1.D(localThemeScope, value, composer, i11);
                        C14890K.a(InterfaceC14888I.b(c14889j, companion, 1.0f, false, 2, null), composer, 0);
                        composer.startReplaceGroup(2090855683);
                        if (searchProductActivity.B2().B0().getValue().booleanValue()) {
                            Ki.Q.e(localThemeScope, InterfaceC15205y.a.c.f142545a, ComposableLambdaKt.c(1385068929, true, new C1610a(localThemeScope, searchProductActivity), composer, 54), composer, i11 | 384 | (InterfaceC15205y.a.c.f142546b << 3));
                        }
                        composer.P();
                        C14890K.a(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, H1.h.p(8), 0.0f, 11, null), composer, 6);
                        composer.v();
                        C17983Z.a(null, localThemeScope.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
                        composer.v();
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    a(composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.find.SearchProductActivity$c$a$c, reason: collision with other inner class name */
            static final class C1612c implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ SearchProductActivity f107397a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f107398b;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.SearchProductActivity$onCreate$1$1$1$1$3$1$1", f = "SearchProductActivity.kt", l = {}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.meijer.activity.find.SearchProductActivity$c$a$c$a, reason: collision with other inner class name */
                static final class C1613a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f107399a;

                    /* renamed from: b, reason: collision with root package name */
                    private /* synthetic */ Object f107400b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ SearchProductActivity f107401c;

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
                    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.SearchProductActivity$onCreate$1$1$1$1$3$1$1$1", f = "SearchProductActivity.kt", l = {}, m = "invokeSuspend")
                    /* renamed from: com.meijer.mobile.meijer.activity.find.SearchProductActivity$c$a$c$a$a, reason: collision with other inner class name */
                    static final class C1614a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                        /* renamed from: a, reason: collision with root package name */
                        int f107402a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ SearchProductActivity f107403b;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C1614a(SearchProductActivity searchProductActivity, Continuation<? super C1614a> continuation) {
                            super(2, continuation);
                            this.f107403b = searchProductActivity;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C1614a(this.f107403b, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                            return ((C1614a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.f();
                            if (this.f107402a == 0) {
                                ResultKt.b(obj);
                                this.f107403b.B2().O0(AbstractC12415t.i.f109862a);
                                this.f107403b.B2().O0(AbstractC12415t.h.f109861a);
                                return Unit.f143329a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1613a(SearchProductActivity searchProductActivity, Continuation<? super C1613a> continuation) {
                        super(2, continuation);
                        this.f107401c = searchProductActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C1613a c1613a = new C1613a(this.f107401c, continuation);
                        c1613a.f107400b = obj;
                        return c1613a;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                        return ((C1613a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.f();
                        if (this.f107399a == 0) {
                            ResultKt.b(obj);
                            C15809k.d((InterfaceC15783O) this.f107400b, null, null, new C1614a(this.f107401c, null), 3, null);
                            return Unit.f143329a;
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
                        return Unit.f143329a;
                    }
                }

                C1612c(SearchProductActivity searchProductActivity, LocalThemeScope localThemeScope) {
                    this.f107397a = searchProductActivity;
                    this.f107398b = localThemeScope;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit l(SearchProductActivity searchProductActivity, HomeDepartment department) {
                    Intrinsics.j(department, "department");
                    searchProductActivity.B2().O0(new AbstractC12415t.DepartmentItemClicked(department.getDeeplink(), department.getName()));
                    searchProductActivity.startActivity(searchProductActivity.y2().n(searchProductActivity, department.getDeeplink()));
                    return Unit.f143329a;
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
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit p(SearchProductActivity searchProductActivity, ProductFullDetails product, String str) {
                    Intrinsics.j(product, "product");
                    searchProductActivity.k3(product, str);
                    return Unit.f143329a;
                }

                public final void g(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1061716878, i10, -1, "com.meijer.mobile.meijer.activity.find.SearchProductActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchProductActivity.kt:320)");
                    }
                    if (this.f107397a.B2().G0().getValue().booleanValue()) {
                        Boolean value = this.f107397a.B2().G0().getValue();
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(this.f107397a);
                        SearchProductActivity searchProductActivity = this.f107397a;
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new C1613a(searchProductActivity, null);
                            composer.t(objB);
                        }
                        composer.P();
                        androidx.compose.runtime.J.g(value, (Function2) objB, composer, 0);
                        LocalThemeScope localThemeScope = this.f107398b;
                        HomeDecorator value2 = this.f107397a.B2().v0().getValue();
                        boolean zBooleanValue = this.f107397a.B2().H0().getValue().booleanValue();
                        boolean zB = this.f107397a.getUserManager().b();
                        composer.startReplaceGroup(5004770);
                        boolean zD2 = composer.D(this.f107397a);
                        final SearchProductActivity searchProductActivity2 = this.f107397a;
                        Object objB2 = composer.B();
                        if (zD2 || objB2 == Composer.INSTANCE.a()) {
                            objB2 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.T0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return SearchProductActivity.c.a.C1612c.o(searchProductActivity2, (ProductCarouselDecorator) obj);
                                }
                            };
                            composer.t(objB2);
                        }
                        Function1 function1 = (Function1) objB2;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD3 = composer.D(this.f107397a);
                        final SearchProductActivity searchProductActivity3 = this.f107397a;
                        Object objB3 = composer.B();
                        if (zD3 || objB3 == Composer.INSTANCE.a()) {
                            objB3 = new Function2() { // from class: com.meijer.mobile.meijer.activity.find.U0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return SearchProductActivity.c.a.C1612c.p(searchProductActivity3, (ProductFullDetails) obj, (String) obj2);
                                }
                            };
                            composer.t(objB3);
                        }
                        Function2 function2 = (Function2) objB3;
                        composer.P();
                        SearchProductActivity searchProductActivity4 = this.f107397a;
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
                        boolean zD5 = composer.D(this.f107397a);
                        final SearchProductActivity searchProductActivity5 = this.f107397a;
                        Object objB5 = composer.B();
                        if (zD5 || objB5 == Composer.INSTANCE.a()) {
                            objB5 = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.V0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SearchProductActivity.c.a.C1612c.q(searchProductActivity5);
                                }
                            };
                            composer.t(objB5);
                        }
                        Function0 function0 = (Function0) objB5;
                        composer.P();
                        Pj.a value3 = this.f107397a.B2().t0().getValue();
                        List<HomeDepartment> value4 = this.f107397a.B2().s0().getValue();
                        composer.startReplaceGroup(5004770);
                        boolean zD6 = composer.D(this.f107397a);
                        final SearchProductActivity searchProductActivity6 = this.f107397a;
                        Object objB6 = composer.B();
                        if (zD6 || objB6 == Composer.INSTANCE.a()) {
                            objB6 = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.W0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SearchProductActivity.c.a.C1612c.r(searchProductActivity6);
                                }
                            };
                            composer.t(objB6);
                        }
                        Function0 function02 = (Function0) objB6;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD7 = composer.D(this.f107397a);
                        final SearchProductActivity searchProductActivity7 = this.f107397a;
                        Object objB7 = composer.B();
                        if (zD7 || objB7 == Composer.INSTANCE.a()) {
                            objB7 = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.X0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SearchProductActivity.c.a.C1612c.k(searchProductActivity7);
                                }
                            };
                            composer.t(objB7);
                        }
                        Function0 function03 = (Function0) objB7;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD8 = composer.D(this.f107397a);
                        final SearchProductActivity searchProductActivity8 = this.f107397a;
                        Object objB8 = composer.B();
                        if (zD8 || objB8 == Composer.INSTANCE.a()) {
                            objB8 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.Y0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return SearchProductActivity.c.a.C1612c.l(searchProductActivity8, (HomeDepartment) obj);
                                }
                            };
                            composer.t(objB8);
                        }
                        composer.P();
                        Q1.G(localThemeScope, value2, zBooleanValue, zB, function1, function2, function22, function0, value3, value4, function02, function03, (Function1) objB8, null, this.f107397a.B2().z0().getValue(), composer, LocalThemeScope.f17314g | (Pj.a.f26096c << 24), AbstractC6392a.f60445b << 12, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    g(composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit k(SearchProductActivity searchProductActivity) {
                    searchProductActivity.B2().O0(AbstractC12415t.h.f109861a);
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit q(SearchProductActivity searchProductActivity) {
                    searchProductActivity.B2().O0(AbstractC12415t.i.f109862a);
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit r(SearchProductActivity searchProductActivity) {
                    searchProductActivity.B2().O0(AbstractC12415t.f.f109859a);
                    searchProductActivity.startActivity(Bl.g.B(searchProductActivity.getFeatureEntryPoint(), null, 1, null));
                    return Unit.f143329a;
                }
            }

            a(SearchProductActivity searchProductActivity) {
                this.f107388a = searchProductActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Nn.T d(SearchProductActivity searchProductActivity, LocalThemeScope localThemeScope, LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
                Intrinsics.j(layoutInflater, "<unused var>");
                Intrinsics.j(viewGroup, "<unused var>");
                Nn.T t10 = searchProductActivity.binding;
                if (t10 == null) {
                    Intrinsics.x("binding");
                    t10 = null;
                }
                ((ComposeView) Zr.a.j(t10.f21654D, false, 1, null)).setContent(ComposableLambdaKt.composableLambdaInstance(-1102287594, true, new C1609a(searchProductActivity, localThemeScope)));
                Nn.T t11 = searchProductActivity.binding;
                if (t11 == null) {
                    Intrinsics.x("binding");
                    t11 = null;
                }
                t11.f21653C.setContent(ComposableLambdaKt.composableLambdaInstance(1292979597, true, new b(searchProductActivity, localThemeScope)));
                Nn.T t12 = searchProductActivity.binding;
                if (t12 == null) {
                    Intrinsics.x("binding");
                    t12 = null;
                }
                t12.f21665O.setContent(ComposableLambdaKt.composableLambdaInstance(1061716878, true, new C1612c(searchProductActivity, localThemeScope)));
                Nn.T t13 = searchProductActivity.binding;
                if (t13 != null) {
                    return t13;
                }
                Intrinsics.x("binding");
                return null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(Nn.T AndroidViewBinding) {
                Intrinsics.j(AndroidViewBinding, "$this$AndroidViewBinding");
                return Unit.f143329a;
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
                boolean zD = ((i10 & 14) == 4 || ((i10 & 8) != 0 && composer.D(AdsTheme))) | composer.D(this.f107388a);
                final SearchProductActivity searchProductActivity = this.f107388a;
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
                            return SearchProductActivity.c.a.e((Nn.T) obj);
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
                return Unit.f143329a;
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
            Ki.K.b(null, ComposableLambdaKt.c(-2031119702, true, new a(SearchProductActivity.this), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
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
            return Unit.f143329a;
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(final TextView v10, int actionId, KeyEvent event) {
            if (v10 == null) {
                return false;
            }
            SearchProductActivity searchProductActivity = SearchProductActivity.this;
            CharSequence text = v10.getText();
            Intrinsics.i(text, "getText(...)");
            if ((StringsKt.s0(text) || actionId != 3) && actionId != 6) {
                return false;
            }
            searchProductActivity.trackingSearchMethod = "Typed Search";
            searchProductActivity.B2().O0(new AbstractC12415t.CompleteSearchAction(v10.getText().toString(), null, false, false, 14, null));
            com.meijer.mobile.meijer.activity.find.fragment.n nVar = searchProductActivity.searchResultPagerAdapter;
            if (nVar == null) {
                Intrinsics.x("searchResultPagerAdapter");
                nVar = null;
            }
            nVar.k();
            searchProductActivity.getAnalyticsEngine().g(C14756c.h("Product Search Page"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.Z0
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
            final /* synthetic */ z1<FulfillmentBarDecorator> f107409a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ SearchProductActivity f107410b;

            a(z1<FulfillmentBarDecorator> z1Var, SearchProductActivity searchProductActivity) {
                this.f107409a = z1Var;
                this.f107410b = searchProductActivity;
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
                FulfillmentBarDecorator value = this.f107409a.getValue();
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(this.f107410b);
                final SearchProductActivity searchProductActivity = this.f107410b;
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
                Il.g.b(AdsTheme, value, null, (Function0) objB, composer, (i10 & 14) | LocalThemeScope.f17314g | (FulfillmentBarDecorator.f14849m << 3), 2);
                C17983Z.a(null, AdsTheme.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 13);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                b(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(SearchProductActivity searchProductActivity) {
                searchProductActivity.startActivity(searchProductActivity.x2(searchProductActivity.B2().A0().getValue()));
                return Unit.f143329a;
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
            Ki.K.b(null, ComposableLambdaKt.c(477530336, true, new a(o1.b(SearchProductActivity.this.getFulfillmentBarViewModel().n(), null, composer, 0, 1), SearchProductActivity.this), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class h implements InterfaceC14275b, FunctionAdapter {
        h() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14275b) && (obj instanceof FunctionAdapter)) {
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

        @Override // g.InterfaceC14275b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14274a p02) {
            Intrinsics.j(p02, "p0");
            SearchProductActivity.this.D2(p02);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class i extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f107415f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f107415f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f107415f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class j extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f107416f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentActivity componentActivity) {
            super(0);
            this.f107416f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f107416f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class k extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f107417f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f107418g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f107417f = function0;
            this.f107418g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f107417f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f107418g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class l extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f107419f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentActivity componentActivity) {
            super(0);
            this.f107419f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f107419f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class m extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f107420f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentActivity componentActivity) {
            super(0);
            this.f107420f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f107420f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class n extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f107421f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f107422g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f107421f = function0;
            this.f107422g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f107421f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f107422g.getDefaultViewModelCreationExtras() : creationExtras;
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
        int f107405a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f107406b;

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
                return Unit.f143329a;
            }
        }

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = SearchProductActivity.this.new e(continuation);
            eVar.f107406b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public final Object invoke(OldSearchViewState c12418u, Continuation<? super Unit> continuation) {
            return ((e) create(c12418u, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(SearchProductActivity searchProductActivity, C12315u0.a.Submit submit) {
            searchProductActivity.U2(submit);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(SearchProductActivity searchProductActivity) {
            searchProductActivity.B2().O0(AbstractC12415t.b.f109851a);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(SearchProductActivity searchProductActivity) {
            searchProductActivity.B2().O0(AbstractC12415t.b.f109851a);
            return Unit.f143329a;
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
            if (this.f107405a == 0) {
                ResultKt.b(obj);
                OldSearchViewState c12418u = (OldSearchViewState) this.f107406b;
                Nn.T t10 = SearchProductActivity.this.binding;
                Nn.T t11 = null;
                if (t10 == null) {
                    Intrinsics.x("binding");
                    t10 = null;
                }
                ImageButton imageButton = t10.f21656F.f22501H;
                SearchProductActivity searchProductActivity = SearchProductActivity.this;
                Intrinsics.g(imageButton);
                boolean z19 = true;
                int i19 = 0;
                if (c12418u.getCartDecorator().getIsAvailable() && searchProductActivity.searchType != Pp.b.f26240c && searchProductActivity.searchType != Pp.b.f26241d) {
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
                Rj.a.e(imageButton, c12418u.getCartDecorator().getItemCount());
                ck.d.e(imageButton, AbstractC6392a.INSTANCE.b(com.meijer.mobile.meijer.X.f100310m, c12418u.getCartDecorator().getItemCount(), new Object[0]));
                Nn.T t12 = SearchProductActivity.this.binding;
                if (t12 == null) {
                    Intrinsics.x("binding");
                    t12 = null;
                }
                EditText editText = t12.f21656F.f22499F;
                Editable text = editText.getText();
                if (text != null) {
                    string = text.toString();
                } else {
                    string = null;
                }
                if (Intrinsics.e(string, c12418u.getSearchTerm())) {
                    editText = null;
                }
                if (editText != null) {
                    editText.setText(c12418u.getSearchTerm());
                    editText.setSelection(c12418u.getSearchTerm().length());
                }
                Nn.T t13 = SearchProductActivity.this.binding;
                if (t13 == null) {
                    Intrinsics.x("binding");
                    t13 = null;
                }
                ImageButton searchBarcode = t13.f21656F.f22497D;
                Intrinsics.i(searchBarcode, "searchBarcode");
                if (c12418u.getSearchTerm().length() == 0) {
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
                Nn.T t14 = SearchProductActivity.this.binding;
                if (t14 == null) {
                    Intrinsics.x("binding");
                    t14 = null;
                }
                ImageButton searchClear = t14.f21656F.f22498E;
                Intrinsics.i(searchClear, "searchClear");
                if (c12418u.getSearchTerm().length() > 0) {
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
                SearchSuggestions searchSuggestionsI = c12418u.getSearchSuggestions();
                RecentSearches recentSearchesG = c12418u.getRecentSearches();
                if (c12418u.getQuerySubmitted()) {
                    SearchProductActivity.this.R2(c12418u.getSearchTerm(), c12418u.getIsScannedUpc());
                } else if (c12418u.getSearchState() == M1.f108939a) {
                    List<Suggestion> listA = searchSuggestionsI.a();
                    SearchProductActivity searchProductActivity2 = SearchProductActivity.this;
                    ArrayList arrayList = new ArrayList(CollectionsKt.x(listA, 10));
                    Iterator<T> it = listA.iterator();
                    while (it.hasNext()) {
                        String strB = ((Suggestion) it.next()).b();
                        Nn.T t15 = searchProductActivity2.binding;
                        if (t15 == null) {
                            Intrinsics.x("binding");
                            t15 = null;
                        }
                        arrayList.add(new i1(strB, StringsKt.C1(t15.f21656F.f22499F.getText().toString()).toString(), new a(searchProductActivity2)));
                    }
                    SearchProductActivity searchProductActivity3 = SearchProductActivity.this;
                    Nn.T t16 = searchProductActivity3.binding;
                    if (t16 == null) {
                        Intrinsics.x("binding");
                        t16 = null;
                    }
                    t16.f21663M.setVisibility(0);
                    t16.f21658H.setVisibility(4);
                    t16.f21659I.setVisibility(4);
                    AbstractC4317z2 abstractC4317z2 = t16.f21656F;
                    MaterialButton browseDeptsButton = abstractC4317z2.f22494A;
                    Intrinsics.i(browseDeptsButton, "browseDeptsButton");
                    Pp.b bVar = searchProductActivity3.searchType;
                    Pp.b bVar2 = Pp.b.f26238a;
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
                    MaterialButton viewFavoritesButton = abstractC4317z2.f22502I;
                    Intrinsics.i(viewFavoritesButton, "viewFavoritesButton");
                    if (searchProductActivity3.getFeatureManager().e(AbstractC18503f.A.f172842h) && searchProductActivity3.getUserManager().b() && searchProductActivity3.searchType == bVar2) {
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
                    t16.f21663M.announceForAccessibility(searchProductActivity3.getString(C18372b.f172065p));
                    ju.l lVar = searchProductActivity3.suggestionsSection;
                    if (lVar == null) {
                        Intrinsics.x("suggestionsSection");
                        lVar = null;
                    }
                    lVar.R(arrayList);
                } else if (c12418u.getSearchState() == M1.f108940b) {
                    ju.l lVar2 = SearchProductActivity.this.recentsSection;
                    if (lVar2 == null) {
                        Intrinsics.x("recentsSection");
                        lVar2 = null;
                    }
                    final SearchProductActivity searchProductActivity4 = SearchProductActivity.this;
                    Nn.T t17 = searchProductActivity4.binding;
                    if (t17 == null) {
                        Intrinsics.x("binding");
                        t17 = null;
                    }
                    t17.f21659I.setVisibility(4);
                    t17.f21663M.setVisibility(4);
                    t17.f21658H.setVisibility(0);
                    MaterialButton browseDeptsButton2 = t17.f21656F.f22494A;
                    Intrinsics.i(browseDeptsButton2, "browseDeptsButton");
                    Pp.b bVar3 = searchProductActivity4.searchType;
                    Pp.b bVar4 = Pp.b.f26238a;
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
                    MaterialButton viewFavoritesButton2 = t17.f21656F.f22502I;
                    Intrinsics.i(viewFavoritesButton2, "viewFavoritesButton");
                    if (searchProductActivity4.getFeatureManager().e(AbstractC18503f.A.f172842h) && searchProductActivity4.getUserManager().b() && searchProductActivity4.searchType == bVar4) {
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
                    t17.f21658H.announceForAccessibility(searchProductActivity4.getString(C18372b.f172060k));
                    lVar2.N(new C12311s0(true, new Function0() { // from class: com.meijer.mobile.meijer.activity.find.a1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SearchProductActivity.e.p(searchProductActivity4);
                        }
                    }));
                    List<String> listA2 = recentSearchesG.a();
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.x(listA2, 10));
                    Iterator<T> it2 = listA2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new C12315u0((String) it2.next(), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.b1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return SearchProductActivity.e.o(searchProductActivity4, (C12315u0.a.Submit) obj2);
                            }
                        }));
                    }
                    lVar2.R(arrayList2);
                    lVar2.L();
                } else if (c12418u.getSearchState() == M1.f108941c) {
                    ju.l lVar3 = SearchProductActivity.this.recentsSection;
                    if (lVar3 == null) {
                        Intrinsics.x("recentsSection");
                        lVar3 = null;
                    }
                    final SearchProductActivity searchProductActivity5 = SearchProductActivity.this;
                    RecentSearchList recentSearchList = searchProductActivity5.recentSearchesList;
                    if (recentSearchList == null) {
                        Intrinsics.x("recentSearchesList");
                        recentSearchList = null;
                    }
                    recentSearchList.clear();
                    Nn.T t18 = searchProductActivity5.binding;
                    if (t18 == null) {
                        Intrinsics.x("binding");
                        t18 = null;
                    }
                    t18.f21663M.setVisibility(4);
                    t18.f21658H.setVisibility(0);
                    t18.f21659I.setVisibility(4);
                    MaterialButton browseDeptsButton3 = t18.f21656F.f22494A;
                    Intrinsics.i(browseDeptsButton3, "browseDeptsButton");
                    Pp.b bVar5 = searchProductActivity5.searchType;
                    Pp.b bVar6 = Pp.b.f26238a;
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
                    MaterialButton viewFavoritesButton3 = t18.f21656F.f22502I;
                    Intrinsics.i(viewFavoritesButton3, "viewFavoritesButton");
                    if (searchProductActivity5.getFeatureManager().e(AbstractC18503f.A.f172842h) && searchProductActivity5.getUserManager().b() && searchProductActivity5.searchType == bVar6) {
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
                    lVar3.N(new C12311s0(false, new Function0() { // from class: com.meijer.mobile.meijer.activity.find.c1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SearchProductActivity.e.q(searchProductActivity5);
                        }
                    }));
                    C15069d c15069d = searchProductActivity5.recentsAdapter;
                    if (c15069d == null) {
                        Intrinsics.x("recentsAdapter");
                        c15069d = null;
                    }
                    if (!(c15069d.j(1) instanceof C12308q0)) {
                        lVar3.R(CollectionsKt.m());
                        lVar3.M(new C12308q0());
                    }
                }
                if (SearchProductActivity.this.searchType == Pp.b.f26240c || SearchProductActivity.this.searchType == Pp.b.f26241d) {
                    Nn.T t19 = SearchProductActivity.this.binding;
                    if (t19 == null) {
                        Intrinsics.x("binding");
                        t19 = null;
                    }
                    FrameLayout buttonContainer = t19.f21666z;
                    Intrinsics.i(buttonContainer, "buttonContainer");
                    Nn.T t20 = SearchProductActivity.this.binding;
                    if (t20 == null) {
                        Intrinsics.x("binding");
                    } else {
                        t11 = t20;
                    }
                    LinearLayout searchResultsContainer = t11.f21659I;
                    Intrinsics.i(searchResultsContainer, "searchResultsContainer");
                    if (searchResultsContainer.getVisibility() != 0) {
                        z19 = false;
                    }
                    if (!z19) {
                        i19 = 8;
                    }
                    buttonContainer.setVisibility(i19);
                }
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/s;", "it", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/s;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.SearchProductActivity$onCreate$22", f = "SearchProductActivity.kt", l = {}, m = "invokeSuspend")
    static final class g extends SuspendLambda implements Function2<AbstractC12412s, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f107411a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f107412b;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            g gVar = SearchProductActivity.this.new g(continuation);
            gVar.f107412b = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC12412s abstractC12412s, Continuation<? super Unit> continuation) {
            return ((g) create(abstractC12412s, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f107411a == 0) {
                ResultKt.b(obj);
                AbstractC12412s abstractC12412s = (AbstractC12412s) this.f107412b;
                if (Intrinsics.e(abstractC12412s, AbstractC12412s.e.f109838a)) {
                    AbstractC14276c abstractC14276c = SearchProductActivity.this.scannerResultLauncher;
                    SearchProductActivity searchProductActivity = SearchProductActivity.this;
                    abstractC14276c.a(Bl.h.k(searchProductActivity, true, true, searchProductActivity.getFeatureManager().e(AbstractC18503f.L.f172851h)));
                } else if (abstractC12412s instanceof AbstractC12412s.ToggleKeyboardEvent) {
                    Nn.T t10 = null;
                    if (((AbstractC12412s.ToggleKeyboardEvent) abstractC12412s).getShouldShow()) {
                        Nn.T t11 = SearchProductActivity.this.binding;
                        if (t11 == null) {
                            Intrinsics.x("binding");
                            t11 = null;
                        }
                        t11.f21656F.f22499F.requestFocus();
                        Nn.T t12 = SearchProductActivity.this.binding;
                        if (t12 == null) {
                            Intrinsics.x("binding");
                        } else {
                            t10 = t12;
                        }
                        Ds.p.e(t10.f21656F.f22499F);
                    } else {
                        Nn.T t13 = SearchProductActivity.this.binding;
                        if (t13 == null) {
                            Intrinsics.x("binding");
                        } else {
                            t10 = t13;
                        }
                        Ds.p.c(t10.f21656F.f22499F);
                    }
                } else if (Intrinsics.e(abstractC12412s, AbstractC12412s.b.f109835a)) {
                    SearchProductActivity.this.finish();
                    ck.c.b(SearchProductActivity.this, 1, R.anim.fade_in, R.anim.fade_out, 0, 8, null);
                } else if (abstractC12412s instanceof AbstractC12412s.f) {
                    SearchProductActivity searchProductActivity2 = SearchProductActivity.this;
                    searchProductActivity2.startActivity(searchProductActivity2.getFeatureEntryPoint().d());
                } else if (abstractC12412s instanceof AbstractC12412s.LaunchFilterAndSort) {
                    SearchProductActivity.this.F2(((AbstractC12412s.LaunchFilterAndSort) abstractC12412s).getFilterAndSortState());
                } else if (abstractC12412s instanceof AbstractC12412s.ClipCouponFailedEvent) {
                    AbstractC12412s.ClipCouponFailedEvent clipCouponFailedEvent = (AbstractC12412s.ClipCouponFailedEvent) abstractC12412s;
                    SearchProductActivity.this.d3(clipCouponFailedEvent.getTitleResId(), clipCouponFailedEvent.getMessageResId(), clipCouponFailedEvent.getPositiveButtonResId(), clipCouponFailedEvent.getNegativeButtonResId(), clipCouponFailedEvent.getCoupon(), clipCouponFailedEvent.getTrackingData());
                } else if (abstractC12412s instanceof AbstractC12412s.ViewCouponDetails) {
                    AbstractC12412s.ViewCouponDetails viewCouponDetails = (AbstractC12412s.ViewCouponDetails) abstractC12412s;
                    SearchProductActivity.this.j3(viewCouponDetails.getCoupon(), viewCouponDetails.getTrackingData());
                } else if (abstractC12412s instanceof AbstractC12412s.ViewPersonalizedProducts) {
                    AbstractC12412s.ViewPersonalizedProducts viewPersonalizedProducts = (AbstractC12412s.ViewPersonalizedProducts) abstractC12412s;
                    SearchProductActivity.this.Y2(viewPersonalizedProducts.getUri(), viewPersonalizedProducts.getTrackingState(), viewPersonalizedProducts.getCarouselTitle(), viewPersonalizedProducts.getIsFromSeeMoreItems());
                } else if (abstractC12412s instanceof AbstractC12412s.LoginRequiredEvent) {
                    SearchProductActivity.this.g3(((AbstractC12412s.LoginRequiredEvent) abstractC12412s).getErrorMessageId());
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f143329a;
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
            AbstractC12415t.UpdateFacetBuffer updateFacetBuffer = new AbstractC12415t.UpdateFacetBuffer(searchQuery, false, 2, null);
            B2().O0(AbstractC12415t.UpdateFacetBuffer.b(updateFacetBuffer, null, true, 1, null));
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
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F2(l.k query) {
        this.filterResultRegistration.a(query);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G2(int i10, TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.c(Rk.b.f33418a.k(i10));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H2(TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.h("searchLocation", "coupons");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q2(SearchProductActivity searchProductActivity, View view) {
        com.meijer.mobile.meijer.activity.find.fragment.n nVar = searchProductActivity.searchResultPagerAdapter;
        if (nVar == null) {
            Intrinsics.x("searchResultPagerAdapter");
            nVar = null;
        }
        InterfaceC5728a productsFragment = nVar.getProductsFragment();
        if (productsFragment != null) {
            productsFragment.F();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R2(String searchTerm, boolean isScannedUPC) {
        Nn.T t10 = this.binding;
        Nn.T t11 = null;
        if (t10 == null) {
            Intrinsics.x("binding");
            t10 = null;
        }
        RecyclerView searchSuggestions = t10.f21663M;
        Intrinsics.i(searchSuggestions, "searchSuggestions");
        searchSuggestions.setVisibility(4);
        Nn.T t12 = this.binding;
        if (t12 == null) {
            Intrinsics.x("binding");
            t12 = null;
        }
        RecyclerView searchRecents = t12.f21658H;
        Intrinsics.i(searchRecents, "searchRecents");
        searchRecents.setVisibility(4);
        Nn.T t13 = this.binding;
        if (t13 == null) {
            Intrinsics.x("binding");
            t13 = null;
        }
        MaterialButton browseDeptsButton = t13.f21656F.f22494A;
        Intrinsics.i(browseDeptsButton, "browseDeptsButton");
        browseDeptsButton.setVisibility(8);
        Nn.T t14 = this.binding;
        if (t14 == null) {
            Intrinsics.x("binding");
            t14 = null;
        }
        MaterialButton viewFavoritesButton = t14.f21656F.f22502I;
        Intrinsics.i(viewFavoritesButton, "viewFavoritesButton");
        viewFavoritesButton.setVisibility(8);
        Nn.T t15 = this.binding;
        if (t15 == null) {
            Intrinsics.x("binding");
            t15 = null;
        }
        LinearLayout searchResultsContainer = t15.f21659I;
        Intrinsics.i(searchResultsContainer, "searchResultsContainer");
        searchResultsContainer.setVisibility(0);
        Nn.T t16 = this.binding;
        if (t16 == null) {
            Intrinsics.x("binding");
            t16 = null;
        }
        TabLayout searchResultsTab = t16.f21660J;
        Intrinsics.i(searchResultsTab, "searchResultsTab");
        searchResultsTab.setVisibility(8);
        B2().B0().setValue(Boolean.TRUE);
        this.searchQuery = new SearchQuery(searchTerm, this.searchType, isScannedUPC);
        com.meijer.mobile.meijer.activity.find.fragment.n nVar = this.searchResultPagerAdapter;
        if (nVar == null) {
            Intrinsics.x("searchResultPagerAdapter");
            nVar = null;
        }
        SearchQuery searchQuery = this.searchQuery;
        Intrinsics.g(searchQuery);
        nVar.n(searchQuery, this.trackingSearchMethod);
        if (this.searchType == Pp.b.f26239b) {
            Nn.T t17 = this.binding;
            if (t17 == null) {
                Intrinsics.x("binding");
                t17 = null;
            }
            TabLayout tabLayout = t17.f21660J;
            Nn.T t18 = this.binding;
            if (t18 == null) {
                Intrinsics.x("binding");
                t18 = null;
            }
            tabLayout.K(t18.f21660J.B(1));
            B2().B0().setValue(Boolean.FALSE);
            Nn.T t19 = this.binding;
            if (t19 == null) {
                Intrinsics.x("binding");
            } else {
                t11 = t19;
            }
            t11.f21661K.postDelayed(new Runnable() { // from class: com.meijer.mobile.meijer.activity.find.H0
                @Override // java.lang.Runnable
                public final void run() {
                    SearchProductActivity.S2(this.f107314a);
                }
            }, 100L);
        }
        Z2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S2(SearchProductActivity searchProductActivity) {
        Nn.T t10 = searchProductActivity.binding;
        if (t10 == null) {
            Intrinsics.x("binding");
            t10 = null;
        }
        t10.f21661K.j(1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U2(final C12315u0.a.Submit action) {
        this.trackingSearchMethod = "Recent Search";
        B2().O0(new AbstractC12415t.CompleteSearchAction(action.getTerm(), null, false, false, 14, null));
        getAnalyticsEngine().g(C14756c.h("Product Search Page"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.E0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchProductActivity.V2(action, (TrackingData) obj);
            }
        });
        com.meijer.mobile.meijer.activity.find.fragment.n nVar = this.searchResultPagerAdapter;
        if (nVar == null) {
            Intrinsics.x("searchResultPagerAdapter");
            nVar = null;
        }
        nVar.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V2(C12315u0.a.Submit submit, TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.h("searchTerm", submit.getTerm());
        stageEvent.h("searchMethod", "Recent Search");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W2(final i1.a action) {
        if (action instanceof i1.a.Fill) {
            i1.a.Fill fill = (i1.a.Fill) action;
            B2().O0(new AbstractC12415t.AutoFillSearchAction(fill.getSuggestion(), fill.getOriginalTerm()));
            return;
        }
        if (!(action instanceof i1.a.Submit)) {
            throw new NoWhenBranchMatchedException();
        }
        this.trackingSearchMethod = "Search Suggestions";
        i1.a.Submit submit = (i1.a.Submit) action;
        B2().O0(new AbstractC12415t.CompleteSearchAction(submit.getOriginalTerm(), submit.getSuggestion(), false, true, 4, null));
        getAnalyticsEngine().g(C14756c.h("Product Search Page"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.F0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchProductActivity.X2(action, (TrackingData) obj);
            }
        });
        com.meijer.mobile.meijer.activity.find.fragment.n nVar = this.searchResultPagerAdapter;
        if (nVar == null) {
            Intrinsics.x("searchResultPagerAdapter");
            nVar = null;
        }
        nVar.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X2(i1.a aVar, TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.h("searchTerm", ((i1.a.Submit) aVar).getSuggestion());
        stageEvent.h("searchMethod", "Search Suggestions");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a3(SearchProductActivity searchProductActivity, TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.v("search");
        stageEvent.h("productSortBy", searchProductActivity.sortOption);
        return Unit.f143329a;
    }

    private final void b3() {
        Nn.T t10 = this.binding;
        Nn.T t11 = null;
        if (t10 == null) {
            Intrinsics.x("binding");
            t10 = null;
        }
        TabLayout tabLayout = t10.f21660J;
        Nn.T t12 = this.binding;
        if (t12 == null) {
            Intrinsics.x("binding");
        } else {
            t11 = t12;
        }
        new com.google.android.material.tabs.d(tabLayout, t11.f21661K, new d.b() { // from class: com.meijer.mobile.meijer.activity.find.z0
            @Override // com.google.android.material.tabs.d.b
            public final void onConfigureTab(TabLayout.f fVar, int i10) {
                SearchProductActivity.c3(this.f109934a, fVar, i10);
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
            Intrinsics.x("searchResultPagerAdapter");
            nVar = null;
        }
        ck.d.d(tab, AbstractC6392a.INSTANCE.b(i10 == 0 ? C18371a.f172048g : C18371a.f172047f, 0, Integer.valueOf(i11), Integer.valueOf(nVar.getTotalNumberOfTabs())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d3(int titleResId, int messageResId, int positiveButtonResId, int negativeButtonResId, final Coupon coupon, final TrackingData trackingData) {
        new C15485b(this).setTitle(titleResId).setMessage(messageResId).setPositiveButton(positiveButtonResId, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.C0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                SearchProductActivity.e3(this.f107186a, coupon, trackingData, dialogInterface, i10);
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
        new C15485b(this).setMessage(errorMessageId).setPositiveButton(Cj.o.f5016F0, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.A0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                SearchProductActivity.h3(this.f107183a, dialogInterface, i10);
            }
        }).setNegativeButton(Cj.o.f5090u, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.B0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                SearchProductActivity.i3(this.f107185a, dialogInterface, i10);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Il.b getFulfillmentBarViewModel() {
        return (Il.b) this.fulfillmentBarViewModel.getValue();
    }

    private final void l3(String firstItemDescription) {
        SearchQuery searchQuery = this.searchQuery;
        RecentSearchList recentSearchList = null;
        String queryString = searchQuery != null ? searchQuery.getQueryString() : null;
        if (queryString == null) {
            queryString = "";
        }
        String strQ = StringsKt.Q((!Ds.j.d(queryString) || StringsKt.s0(firstItemDescription)) ? queryString : firstItemDescription, ",", " ", false, 4, null);
        if (StringsKt.C1(strQ).toString().length() > 0) {
            RecentSearchList recentSearchList2 = this.recentSearchesList;
            if (recentSearchList2 == null) {
                Intrinsics.x("recentSearchesList");
                recentSearchList2 = null;
            }
            recentSearchList2.add(strQ);
            yo.k userManager = getUserManager();
            RecentSearchList recentSearchList3 = this.recentSearchesList;
            if (recentSearchList3 == null) {
                Intrinsics.x("recentSearchesList");
            } else {
                recentSearchList = recentSearchList3;
            }
            userManager.M(recentSearchList, false);
        }
        B2().O0(AbstractC12415t.r.f109875a);
    }

    private final void n3(int position, String pageTitle, String contentDesc) {
        Nn.T t10 = this.binding;
        if (t10 == null) {
            Intrinsics.x("binding");
            t10 = null;
        }
        TabLayout.f fVarB = t10.f21660J.B(position);
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
        Intrinsics.x("productAnalytics");
        return null;
    }

    @Override // com.meijer.mobile.meijer.activity.find.fragment.ProductsFragment.b
    public void E(String suggestionTerm, String originalTerm) {
        Intrinsics.j(suggestionTerm, "suggestionTerm");
        Intrinsics.j(originalTerm, "originalTerm");
        B2().O0(new AbstractC12415t.CompleteSearchAction(originalTerm, suggestionTerm, false, false, 12, null));
    }

    @Override // com.meijer.mobile.meijer.activity.find.fragment.ProductsFragment.b
    public void O(l.k query) {
        int size;
        String string;
        Collection<List<FilterFacetOption>> collectionValues;
        Map<FilterFacet, List<FilterFacetOption>> mapF3;
        Intrinsics.j(query, "query");
        InterfaceC5872l0<Boolean> interfaceC5872l0B0 = B2().B0();
        boolean z10 = true;
        if (query.u3().isEmpty() && query.getSelectedSort() == null && (((mapF3 = query.F3()) == null || !(!mapF3.isEmpty())) && query.c1().isEmpty() && query.u3().isEmpty())) {
            z10 = false;
        }
        interfaceC5872l0B0.setValue(Boolean.valueOf(z10));
        Map<FilterFacet, List<FilterFacetOption>> mapF32 = query.F3();
        if (mapF32 == null || (collectionValues = mapF32.values()) == null) {
            size = 0;
        } else {
            Iterator<T> it = collectionValues.iterator();
            size = 0;
            while (it.hasNext()) {
                size += ((List) it.next()).size();
            }
        }
        InterfaceC5872l0<String> interfaceC5872l0U0 = B2().u0();
        if (size == 0) {
            string = getString(C18372b.f172051b, "");
            Intrinsics.g(string);
        } else {
            string = getString(C18372b.f172051b, " (" + size + ')');
            Intrinsics.g(string);
        }
        interfaceC5872l0U0.setValue(string);
        B2().O0(new AbstractC12415t.UpdateFacetBuffer(query, false, 2, null));
    }

    @Override // com.meijer.mobile.meijer.activity.find.fragment.ProductsFragment.b
    public void U(boolean itemSelected) {
        Nn.T t10 = this.binding;
        if (t10 == null) {
            Intrinsics.x("binding");
            t10 = null;
        }
        t10.f21662L.setEnabled(itemSelected);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable s10) {
        if (s10 == null || s10.toString().length() != 0) {
            return;
        }
        B2().O0(AbstractC12415t.c.f109852a);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent ev2) {
        com.meijer.mobile.meijer.activity.find.fragment.n nVar = this.searchResultPagerAdapter;
        if (nVar == null) {
            Intrinsics.x("searchResultPagerAdapter");
            nVar = null;
        }
        nVar.h(ev2);
        return super.dispatchTouchEvent(ev2);
    }

    @Override // com.meijer.mobile.meijer.activity.find.fragment.ProductsFragment.b
    public void j0(String firstItemDescription) {
        Intrinsics.j(firstItemDescription, "firstItemDescription");
        l3(firstItemDescription);
    }

    @Override // Qj.g
    public void onCreateAccount() {
        startActivity(Bl.f.f3124a.a(this, getFeatureManager().e(AbstractC18503f.h0.f172881h)));
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        Nn.T t10 = this.binding;
        if (t10 == null) {
            Intrinsics.x("binding");
            t10 = null;
        }
        t10.f21656F.f22499F.removeTextChangedListener(this);
        getLifecycle().d(B2());
        super.onDestroy();
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View v10, boolean hasFocus) {
        if ((v10 instanceof EditText) && hasFocus) {
            A2().f(((EditText) v10).getText().toString());
        }
    }

    @Override // Qj.g
    public void onSignIn() {
        startActivity(Bl.k.b(this, false, null, null, null, null, null, 126, null));
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence s10, int start, int before, int count) {
        if (s10 == null || s10.length() <= 0) {
            return;
        }
        B2().O0(new AbstractC12415t.SearchStartedAction(s10.toString()));
    }

    public final void w2(Function1<? super l.k, Unit> collector) {
        Intrinsics.j(collector, "collector");
        B2().O0(new AbstractC12415t.FilterAndSortCollectorForSharedFlow(collector));
    }

    @Override // Bj.b
    public Toolbar y() {
        Nn.T t10 = this.binding;
        if (t10 == null) {
            Intrinsics.x("binding");
            t10 = null;
        }
        MaterialToolbar substituteToolbar = t10.f21664N;
        Intrinsics.i(substituteToolbar, "substituteToolbar");
        return substituteToolbar;
    }

    public final Dl.e y2() {
        Dl.e eVar = this.mIntent;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.x("mIntent");
        return null;
    }

    public final CharSequence z2(int position) {
        if (position == 0) {
            String string = getString(com.meijer.mobile.meijer.Y.f100588O5);
            Intrinsics.i(string, "getString(...)");
            return string;
        }
        if (position != 1) {
            return "";
        }
        String string2 = getString(com.meijer.mobile.meijer.Y.f100679T1);
        Intrinsics.i(string2, "getString(...)");
        return string2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D2(C14274a result) {
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
            if (StringsKt.s0(str)) {
                new Qj.j(this, Aq.b.f1967O, new Object[0]).g();
                getIntent().removeExtra("com.meijer.intent.extra.PRODUCT_SCAN");
                return;
            } else {
                this.trackingSearchMethod = "Barcode Search";
                B2().O0(new AbstractC12415t.CompleteSearchAction(str, null, true, false, 10, null));
                getAnalyticsEngine().g(C14756c.h("Product Search Page"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.v0
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
        searchProductActivity.B2().O0(AbstractC12415t.b.f109851a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(SearchProductActivity searchProductActivity, View view) {
        searchProductActivity.B2().O0(AbstractC12415t.g.f109860a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K2(SearchProductActivity searchProductActivity, View view) {
        searchProductActivity.B2().O0(AbstractC12415t.m.f109868a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L2(SearchProductActivity searchProductActivity, View view) {
        searchProductActivity.B2().O0(AbstractC12415t.c.f109852a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M2(SearchProductActivity searchProductActivity) {
        if (!searchProductActivity.onNavigateUp()) {
            searchProductActivity.finish();
        }
        ck.c.b(searchProductActivity, 1, 0, 0, 0, 8, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N2(SearchProductActivity searchProductActivity, View view) {
        searchProductActivity.B2().O0(AbstractC12415t.o.f109870a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O2(SearchProductActivity searchProductActivity, View view) {
        searchProductActivity.getAnalyticsEngine().h(C14756c.a("shopDepartmentMenu"), new AbstractC14762i[0]);
        searchProductActivity.startActivity(Bl.g.B(searchProductActivity.getFeatureEntryPoint(), null, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P2(SearchProductActivity searchProductActivity, View view) {
        searchProductActivity.getAnalyticsEngine().h(C14756c.a("viewFavoritesMenu"), new AbstractC14762i[0]);
        searchProductActivity.startActivity(searchProductActivity.getFeatureEntryPoint().K(l.d.f152504a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T2(ProductFullDetails product, com.meijer.mobile.core.design.widget.stepperview.a state) {
        B2().O0(new AbstractC12415t.UpdateEntryAction(product, state.getValueState().getQuantity()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y2(android.net.Uri r11, ii.AbstractC14761h r12, java.lang.String r13, boolean r14) {
        /*
            r10 = this;
            Dl.e r0 = r10.y2()
            if (r11 != 0) goto L9
            android.net.Uri r1 = android.net.Uri.EMPTY
            goto La
        L9:
            r1 = r11
        La:
            kotlin.jvm.internal.Intrinsics.g(r1)
            int r5 = r0.O(r1)
            Dl.e r2 = r10.y2()
            if (r11 != 0) goto L19
            android.net.Uri r11 = android.net.Uri.EMPTY
        L19:
            r4 = r11
            kotlin.jvm.internal.Intrinsics.g(r4)
            r8 = 24
            r9 = 0
            r6 = 0
            r7 = 0
            r3 = r10
            android.content.Intent r11 = Dl.e.S(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r11 == 0) goto L93
            java.lang.String r0 = "com.meijer.mobile.meijer.activity.find.FilteredProductsActivity.EXTRA_PRODUCT_QUERY_INTENT"
            boolean r1 = r11.hasExtra(r0)
            java.lang.String r2 = "com.meijer.intent.extra.PREVIOUS_TRACK_ACTION"
            java.lang.Class<Qo.l> r4 = Qo.l.class
            r5 = 33
            r6 = 0
            if (r1 == 0) goto L5c
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r5) goto L43
            java.lang.Object r1 = va.d.a(r11, r0, r4)
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            goto L4e
        L43:
            android.os.Parcelable r1 = r11.getParcelableExtra(r0)
            boolean r7 = r1 instanceof Qo.l
            if (r7 != 0) goto L4c
            r1 = r6
        L4c:
            Qo.l r1 = (Qo.l) r1
        L4e:
            boolean r1 = r1 instanceof Qo.l.Department
            if (r1 == 0) goto L5c
            if (r12 == 0) goto L58
            java.lang.String r6 = r12.getValue()
        L58:
            r11.putExtra(r2, r6)
            goto L90
        L5c:
            boolean r1 = r11.hasExtra(r0)
            if (r1 == 0) goto L87
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r5) goto L6d
            java.lang.Object r0 = va.d.a(r11, r0, r4)
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            goto L78
        L6d:
            android.os.Parcelable r0 = r11.getParcelableExtra(r0)
            boolean r1 = r0 instanceof Qo.l
            if (r1 != 0) goto L76
            r0 = r6
        L76:
            Qo.l r0 = (Qo.l) r0
        L78:
            boolean r0 = r0 instanceof Qo.l.BrowseCollection
            if (r0 == 0) goto L87
            java.lang.String r12 = "KEY_CURATED_CAROUSEL"
            r11.putExtra(r12, r13)
            java.lang.String r12 = "SEE_MORE_ITEMS"
            r11.putExtra(r12, r14)
            goto L90
        L87:
            if (r12 == 0) goto L8d
            java.lang.String r6 = r12.getValue()
        L8d:
            r11.putExtra(r2, r6)
        L90:
            r10.startActivity(r11)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.SearchProductActivity.Y2(android.net.Uri, ii.h, java.lang.String, boolean):void");
    }

    private final void Z2() {
        getAnalyticsEngine().g(C14756c.h("Product Search Page"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.y0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchProductActivity.a3(this.f109931a, (TrackingData) obj);
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
    public final void j3(Pk.c coupon, TrackingData trackingData) {
        String value;
        AbstractC14761h event;
        Dl.e eVarY2 = y2();
        if (trackingData != null && (event = trackingData.getEvent()) != null) {
            value = event.getValue();
        } else {
            value = null;
        }
        startActivity(eVarY2.f(coupon, true, true, false, value));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k3(nk.f productId, String previousTrackAction) {
        startActivity(getFeatureEntryPoint().s(productId, false, true, previousTrackAction));
    }

    private final void m3(int count) {
        I1 i1B2 = B2();
        InterfaceC5872l0<Boolean> interfaceC5872l0F0 = i1B2.F0();
        I1.h hVar = I1.h.f108863a;
        interfaceC5872l0F0.setValue(Boolean.valueOf(i1B2.X0(hVar)));
        i1B2.G0().setValue(Boolean.valueOf(i1B2.Y0(hVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o3(String uri, String carouselTitle, boolean isFromSeeMoreItems) {
        B2().O0(new AbstractC12415t.PersonalizedProductListClicked(uri, carouselTitle, isFromSeeMoreItems));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Intent x2(OldSearchViewState c12418u) {
        Intent intentD = getFeatureEntryPoint().d();
        if (!c12418u.getIsOrderUnderModification()) {
            intentD = null;
        }
        if (intentD == null) {
            return OrderOptionsActivity.INSTANCE.b(this, "search: search page");
        }
        return intentD;
    }

    @Override // an.x0
    public void K0(int totalResults, int tokenMatchCount, int embeddingsCount) {
        int i10;
        I1 i1B2 = B2();
        I1.h hVarJ0 = i1B2.j0(tokenMatchCount, embeddingsCount);
        int iK0 = i1B2.k0(hVarJ0, totalResults, tokenMatchCount, embeddingsCount);
        AbstractC6392a abstractC6392aH0 = i1B2.h0(hVarJ0, i1B2.A0().getValue().getSearchTerm());
        if (abstractC6392aH0 != null) {
            i1B2.x0().setValue(abstractC6392aH0.b(this));
        }
        AbstractC6392a abstractC6392aG0 = i1B2.g0(hVarJ0, tokenMatchCount, embeddingsCount, i1B2.A0().getValue().getSearchTerm());
        if (abstractC6392aG0 != null) {
            i1B2.w0().setValue(abstractC6392aG0.b(this));
        }
        AbstractC6392a abstractC6392aI0 = i1B2.i0(hVarJ0, iK0);
        if (abstractC6392aI0 != null) {
            i1B2.y0().setValue(abstractC6392aI0.b(this));
        }
        i1B2.E0().setValue(Boolean.valueOf(i1B2.W0(hVarJ0)));
        i1B2.C0().setValue(Boolean.valueOf(i1B2.V0(hVarJ0)));
        i1B2.F0().setValue(Boolean.valueOf(i1B2.X0(hVarJ0)));
        InterfaceC5872l0<Boolean> interfaceC5872l0G0 = i1B2.G0();
        boolean zY0 = i1B2.Y0(hVarJ0);
        Boolean boolValueOf = Boolean.valueOf(zY0);
        com.meijer.mobile.meijer.activity.find.fragment.n nVar = this.searchResultPagerAdapter;
        Nn.T t10 = null;
        if (nVar == null) {
            Intrinsics.x("searchResultPagerAdapter");
            nVar = null;
        }
        InterfaceC5728a productsFragment = nVar.getProductsFragment();
        if (productsFragment != null) {
            productsFragment.B(zY0);
        }
        interfaceC5872l0G0.setValue(boolValueOf);
        Nn.T t11 = this.binding;
        if (t11 == null) {
            Intrinsics.x("binding");
        } else {
            t10 = t11;
        }
        ViewPager2 searchResultsViewpager = t10.f21661K;
        Intrinsics.i(searchResultsViewpager, "searchResultsViewpager");
        if (B2().G0().getValue().booleanValue()) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        searchResultsViewpager.setVisibility(i10);
    }

    @Override // com.meijer.mobile.meijer.activity.coupons.fragment.CouponsFragment.b
    public void L0(final int count) {
        m3(count);
        getAnalyticsEngine().g(C14756c.h("Product Search Page"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.x0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchProductActivity.G2(count, (TrackingData) obj);
            }
        });
        String string = getString(C18372b.f172066q, Integer.valueOf(count));
        Intrinsics.i(string, "getString(...)");
        n3(1, string, AbstractC6392a.INSTANCE.b(C18371a.f172048g, count, 2, 2).b(this));
    }

    @Override // com.meijer.mobile.meijer.activity.find.fragment.ProductsFragment.b
    public void N(int count) {
        TabLayout.TabView tabView;
        m3(count);
        String string = getString(C18372b.f172067r, Integer.valueOf(count));
        Intrinsics.i(string, "getString(...)");
        String strB = AbstractC6392a.INSTANCE.b(C18371a.f172048g, count, 1, 2).b(this);
        Nn.T t10 = this.binding;
        if (t10 == null) {
            Intrinsics.x("binding");
            t10 = null;
        }
        TabLayout.f fVarB = t10.f21660J.B(0);
        if (fVarB != null && (tabView = fVarB.f88508i) != null) {
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
        ck.c.b(this, 0, R.anim.fade_in, R.anim.fade_out, 0, 8, null);
        getLifecycle().a(B2());
        Nn.T tM0 = Nn.T.M0(getLayoutInflater());
        this.binding = tM0;
        Serializable serializable = null;
        if (tM0 == null) {
            Intrinsics.x("binding");
            tM0 = null;
        }
        int i11 = 0;
        setContentView(Zr.a.j(tM0.getRoot(), false, 1, null));
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(787465435, true, new c()), 1, null);
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
        if (bVar3 == Pp.b.f26239b) {
            getAnalyticsEngine().g(C14756c.h("Product Search Page"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.J0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchProductActivity.H2((TrackingData) obj);
                }
            });
        } else if (bVar3 == Pp.b.f26240c || bVar3 == Pp.b.f26241d) {
            Nn.T t10 = this.binding;
            if (t10 == null) {
                Intrinsics.x("binding");
                t10 = null;
            }
            ImageButton searchToCart = t10.f21656F.f22501H;
            Intrinsics.i(searchToCart, "searchToCart");
            searchToCart.setVisibility(8);
            Nn.T t11 = this.binding;
            if (t11 == null) {
                Intrinsics.x("binding");
                t11 = null;
            }
            AppBarLayout searchAppBar = t11.f21655E;
            Intrinsics.i(searchAppBar, "searchAppBar");
            searchAppBar.setVisibility(0);
            Nn.T t12 = this.binding;
            if (t12 == null) {
                Intrinsics.x("binding");
                t12 = null;
            }
            MaterialButton browseDeptsButton = t12.f21656F.f22494A;
            Intrinsics.i(browseDeptsButton, "browseDeptsButton");
            browseDeptsButton.setVisibility(8);
            Nn.T t13 = this.binding;
            if (t13 == null) {
                Intrinsics.x("binding");
                t13 = null;
            }
            MaterialButton viewFavoritesButton = t13.f21656F.f22502I;
            Intrinsics.i(viewFavoritesButton, "viewFavoritesButton");
            viewFavoritesButton.setVisibility(8);
        }
        Pp.b bVar4 = this.searchType;
        Pp.b bVar5 = Pp.b.f26241d;
        if (bVar4 == bVar5) {
            Nn.T t14 = this.binding;
            if (t14 == null) {
                Intrinsics.x("binding");
                t14 = null;
            }
            t14.f21664N.setTitle(C17284b.f163328j0);
            Nn.T t15 = this.binding;
            if (t15 == null) {
                Intrinsics.x("binding");
                t15 = null;
            }
            t15.f21662L.setText(C17284b.f163291O0);
        }
        Bj.b.o(this, 0, 0, new Function0() { // from class: com.meijer.mobile.meijer.activity.find.K0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchProductActivity.M2(this.f107349a);
            }
        }, 3, null);
        Nn.T t16 = this.binding;
        if (t16 == null) {
            Intrinsics.x("binding");
            t16 = null;
        }
        t16.f21656F.f22494A.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.L0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchProductActivity.O2(this.f107350a, view);
            }
        });
        boolean zE = getFeatureManager().e(AbstractC18503f.A.f172842h);
        Nn.T t17 = this.binding;
        if (t17 == null) {
            Intrinsics.x("binding");
            t17 = null;
        }
        MaterialButton materialButton = t17.f21656F.f22502I;
        Intrinsics.g(materialButton);
        if (getUserManager().b() && zE && this.searchType == Pp.b.f26238a) {
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
                SearchProductActivity.P2(this.f107352a, view);
            }
        });
        Nn.T t18 = this.binding;
        if (t18 == null) {
            Intrinsics.x("binding");
            t18 = null;
        }
        t18.f21662L.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.N0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchProductActivity.Q2(this.f107354a, view);
            }
        });
        com.meijer.mobile.meijer.activity.find.fragment.n nVar = new com.meijer.mobile.meijer.activity.find.fragment.n(this, getFeatureManager().e(AbstractC18503f.T.f172859h));
        this.searchResultPagerAdapter = nVar;
        nVar.p(this.searchType);
        com.meijer.mobile.meijer.activity.find.fragment.n nVar2 = this.searchResultPagerAdapter;
        if (nVar2 == null) {
            Intrinsics.x("searchResultPagerAdapter");
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
        Nn.T t19 = this.binding;
        if (t19 == null) {
            Intrinsics.x("binding");
            t19 = null;
        }
        ViewPager2 viewPager2 = t19.f21661K;
        viewPager2.setOffscreenPageLimit(1);
        com.meijer.mobile.meijer.activity.find.fragment.n nVar3 = this.searchResultPagerAdapter;
        if (nVar3 == null) {
            Intrinsics.x("searchResultPagerAdapter");
            nVar3 = null;
        }
        viewPager2.setAdapter(nVar3);
        b3();
        ju.l lVar = new ju.l();
        lVar.O(true);
        this.suggestionsSection = lVar;
        ju.l lVar2 = new ju.l();
        lVar2.N(new C12311s0(false, new Function0() { // from class: com.meijer.mobile.meijer.activity.find.O0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchProductActivity.I2(this.f107356a);
            }
        }));
        lVar2.M(new C12308q0());
        this.recentsSection = lVar2;
        C15069d<ju.g> c15069d = new C15069d<>();
        ju.l lVar3 = this.suggestionsSection;
        if (lVar3 == null) {
            Intrinsics.x("suggestionsSection");
            lVar3 = null;
        }
        c15069d.c(lVar3);
        this.suggestionsAdapter = c15069d;
        C15069d<ju.g> c15069d2 = new C15069d<>();
        ju.l lVar4 = this.recentsSection;
        if (lVar4 == null) {
            Intrinsics.x("recentsSection");
            lVar4 = null;
        }
        c15069d2.c(lVar4);
        this.recentsAdapter = c15069d2;
        Nn.T t20 = this.binding;
        if (t20 == null) {
            Intrinsics.x("binding");
            t20 = null;
        }
        RecyclerView recyclerView = t20.f21663M;
        C15069d<ju.g> c15069d3 = this.suggestionsAdapter;
        if (c15069d3 == null) {
            Intrinsics.x("suggestionsAdapter");
            c15069d3 = null;
        }
        recyclerView.setAdapter(c15069d3);
        recyclerView.addItemDecoration(new androidx.recyclerview.widget.i(this, 1));
        Nn.T t21 = this.binding;
        if (t21 == null) {
            Intrinsics.x("binding");
            t21 = null;
        }
        RecyclerView recyclerView2 = t21.f21658H;
        C15069d<ju.g> c15069d4 = this.recentsAdapter;
        if (c15069d4 == null) {
            Intrinsics.x("recentsAdapter");
            c15069d4 = null;
        }
        recyclerView2.setAdapter(c15069d4);
        Nn.T t22 = this.binding;
        if (t22 == null) {
            Intrinsics.x("binding");
            t22 = null;
        }
        t22.f21656F.f22499F.addTextChangedListener(this);
        Nn.T t23 = this.binding;
        if (t23 == null) {
            Intrinsics.x("binding");
            t23 = null;
        }
        t23.f21656F.f22499F.setOnFocusChangeListener(this);
        Nn.T t24 = this.binding;
        if (t24 == null) {
            Intrinsics.x("binding");
            t24 = null;
        }
        t24.f21656F.f22499F.setOnEditorActionListener(new d());
        Nn.T t25 = this.binding;
        if (t25 == null) {
            Intrinsics.x("binding");
            t25 = null;
        }
        t25.f21656F.f22496C.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.P0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchProductActivity.J2(this.f107359a, view);
            }
        });
        Nn.T t26 = this.binding;
        if (t26 == null) {
            Intrinsics.x("binding");
            t26 = null;
        }
        t26.f21656F.f22497D.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchProductActivity.K2(this.f109926a, view);
            }
        });
        Nn.T t27 = this.binding;
        if (t27 == null) {
            Intrinsics.x("binding");
            t27 = null;
        }
        t27.f21656F.f22498E.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.G0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchProductActivity.L2(this.f107311a, view);
            }
        });
        Nn.T t28 = this.binding;
        if (t28 == null) {
            Intrinsics.x("binding");
            t28 = null;
        }
        t28.f21656F.f22501H.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.I0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchProductActivity.N2(this.f107329a, view);
            }
        });
        C16563h.J(C16563h.O(B2().A0(), new e(null)), C6173t.a(this));
        Nn.T t29 = this.binding;
        if (t29 == null) {
            Intrinsics.x("binding");
            t29 = null;
        }
        ComposeView fulfillmentBarSearch = t29.f21651A;
        Intrinsics.i(fulfillmentBarSearch, "fulfillmentBarSearch");
        if (getUserManager().b() && (bVar = this.searchType) != Pp.b.f26240c && bVar != bVar5) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            i11 = 8;
        }
        fulfillmentBarSearch.setVisibility(i11);
        Nn.T t30 = this.binding;
        if (t30 == null) {
            Intrinsics.x("binding");
            t30 = null;
        }
        t30.f21651A.setContent(ComposableLambdaKt.composableLambdaInstance(-986516783, true, new f()));
        C16563h.J(C16563h.O(B2().getEvents(), new g(null)), C6173t.a(this));
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
            B2().O0(AbstractC12415t.m.f109868a);
        } else if (getIntent().hasExtra("unauth_search_term") && (stringExtra = getIntent().getStringExtra("unauth_search_term")) != null) {
            B2().O0(new AbstractC12415t.CompleteSearchAction(stringExtra, null, false, false, 14, null));
            getIntent().removeExtra("unauth_search_term");
        }
        Nn.T t10 = this.binding;
        Parcelable parcelable2 = null;
        if (t10 == null) {
            Intrinsics.x("binding");
            t10 = null;
        }
        Editable text = t10.f21656F.f22499F.getText();
        if (text != null && !StringsKt.s0(text)) {
            getWindow().setSoftInputMode(3);
        } else {
            getWindow().setSoftInputMode(4);
        }
        com.meijer.mobile.meijer.activity.find.fragment.n nVar = this.searchResultPagerAdapter;
        if (nVar == null) {
            Intrinsics.x("searchResultPagerAdapter");
            nVar = null;
        }
        nVar.m(1);
        if (this.searchType == Pp.b.f26239b) {
            com.meijer.mobile.meijer.activity.find.fragment.n nVar2 = this.searchResultPagerAdapter;
            if (nVar2 == null) {
                Intrinsics.x("searchResultPagerAdapter");
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
