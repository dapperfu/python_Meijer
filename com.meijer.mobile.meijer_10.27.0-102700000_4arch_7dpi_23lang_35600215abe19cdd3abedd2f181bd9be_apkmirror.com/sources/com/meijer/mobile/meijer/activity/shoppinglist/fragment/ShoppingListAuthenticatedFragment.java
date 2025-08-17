package com.meijer.mobile.meijer.activity.shoppinglist.fragment;

import Al.g;
import Al.q;
import Bj.d;
import Cl.e;
import Co.ProductFullDetails;
import Ds.n;
import En.b;
import En.h;
import En.j;
import Eq.a;
import Fq.FavoriteListItem;
import Fq.ShoppingListItem;
import Gn.ShoppingListTypeAheadResultItem;
import Gn.g0;
import Gn.u0;
import Js.WeeklyAdItem;
import Mn.B1;
import Ok.Coupon;
import Pj.m;
import Qn.C5145i;
import Qn.X;
import Tq.j;
import ak.AbstractC5607a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.l;
import cl.C6412d;
import com.google.android.material.appbar.AppBarLayout;
import com.meijer.mobile.core.design.widget.howTo.WalkThroughType;
import com.meijer.mobile.meijer.P;
import com.meijer.mobile.meijer.T;
import com.meijer.mobile.meijer.U;
import com.meijer.mobile.meijer.X;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.shoppinglist.LegacyShoppingListActivity;
import com.meijer.mobile.meijer.activity.shoppinglist.ShoppingListItemDialogFragment;
import com.meijer.mobile.meijer.activity.shoppinglist.fragment.ShoppingListAuthenticatedFragment;
import com.meijer.mobile.meijer.activity.shoppinglist.view.EmptyShoppingListView;
import com.meijer.mobile.meijer.activity.shoppinglist.view.ShoppingListAddItemView;
import g.AbstractC14147c;
import g.C14145a;
import g.InterfaceC14146b;
import gi.InterfaceC14261a;
import h.i;
import hi.C14476c;
import hi.TrackingData;
import j2.C14835c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import ks.AbstractC15310a;
import mk.f;
import mk.l;
import qv.AbstractC16618K;
import rr.C16831b;
import tm.InterfaceC17123b;
import um.C17279b;
import wk.C17829a;
import xl.C18067a;
import yl.AbstractC18227f;
import yo.C18264a;
import yo.k;

@Metadata(d1 = {"\u0000\u009c\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 ·\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0002¸\u0002B\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\n2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\tJ\u000f\u0010\u001c\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\tJ\u001f\u0010\u001f\u001a\u00020\n2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u001f\u0010\u001aJ\u000f\u0010 \u001a\u00020\u0010H\u0002¢\u0006\u0004\b \u0010\u0015J\u000f\u0010!\u001a\u00020\u0010H\u0002¢\u0006\u0004\b!\u0010\u0015J\u000f\u0010\"\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\"\u0010\u0015J\u0017\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u0010H\u0002¢\u0006\u0004\b$\u0010\u0013J\u0019\u0010'\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J+\u0010.\u001a\u00020-2\u0006\u0010*\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b.\u0010/J\u0019\u00100\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010%H\u0017¢\u0006\u0004\b0\u0010(J\u000f\u00101\u001a\u00020\nH\u0016¢\u0006\u0004\b1\u0010\tJ\u000f\u00102\u001a\u00020\nH\u0016¢\u0006\u0004\b2\u0010\tJ\u000f\u00103\u001a\u00020\nH\u0016¢\u0006\u0004\b3\u0010\tJ\u000f\u00104\u001a\u00020\nH\u0016¢\u0006\u0004\b4\u0010\tJ\u001f\u00108\u001a\u00020\n2\u0006\u00106\u001a\u0002052\u0006\u0010*\u001a\u000207H\u0017¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\n2\u0006\u00106\u001a\u000205H\u0017¢\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u00020\u00102\u0006\u0010=\u001a\u00020<H\u0017¢\u0006\u0004\b>\u0010?J\u0015\u0010A\u001a\u00020\n2\u0006\u0010@\u001a\u00020\u0010¢\u0006\u0004\bA\u0010\u0013J\u000f\u0010B\u001a\u00020\nH\u0016¢\u0006\u0004\bB\u0010\tJ\u001f\u0010E\u001a\u00020\n2\u0006\u0010=\u001a\u00020\u00172\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\nH\u0016¢\u0006\u0004\bG\u0010\tJ\u001d\u0010J\u001a\u00020\n2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020H0\u0016H\u0016¢\u0006\u0004\bJ\u0010\u001aJ\u000f\u0010K\u001a\u00020\nH\u0016¢\u0006\u0004\bK\u0010\tJ!\u0010N\u001a\u00020\n2\u0006\u0010L\u001a\u00020\u00102\b\b\u0001\u0010M\u001a\u00020CH\u0016¢\u0006\u0004\bN\u0010OJ%\u0010Q\u001a\u00020\n2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010P\u001a\u00020\u0010H\u0016¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020\n2\u0006\u0010=\u001a\u00020\u0017H\u0016¢\u0006\u0004\bS\u0010TJ\u0017\u0010U\u001a\u00020\n2\u0006\u0010=\u001a\u00020\u0017H\u0016¢\u0006\u0004\bU\u0010TJ\u0017\u0010V\u001a\u00020\n2\u0006\u0010=\u001a\u00020\u0017H\u0016¢\u0006\u0004\bV\u0010TJ\u000f\u0010W\u001a\u00020\nH\u0016¢\u0006\u0004\bW\u0010\tJ\u0017\u0010X\u001a\u00020\n2\u0006\u0010P\u001a\u00020\u0010H\u0016¢\u0006\u0004\bX\u0010\u0013J\u001d\u0010Z\u001a\u00020\n2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0016H\u0016¢\u0006\u0004\bZ\u0010\u001aJ\u000f\u0010[\u001a\u00020\nH\u0016¢\u0006\u0004\b[\u0010\tJ\u000f\u0010\\\u001a\u00020\nH\u0016¢\u0006\u0004\b\\\u0010\tJ\u000f\u0010]\u001a\u00020\nH\u0016¢\u0006\u0004\b]\u0010\tJ\u001f\u0010^\u001a\u00020\n2\u0006\u0010=\u001a\u00020\u00172\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\b^\u0010FJ\u000f\u0010_\u001a\u00020\nH\u0016¢\u0006\u0004\b_\u0010\tJ\u0017\u0010a\u001a\u00020\n2\u0006\u0010`\u001a\u00020CH\u0016¢\u0006\u0004\ba\u0010bJ%\u0010c\u001a\u00020\n2\u0006\u0010=\u001a\u00020\u00172\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0016H\u0016¢\u0006\u0004\bc\u0010dJ\u0017\u0010g\u001a\u00020\n2\u0006\u0010f\u001a\u00020eH\u0016¢\u0006\u0004\bg\u0010hJ\u0017\u0010j\u001a\u00020\n2\u0006\u0010i\u001a\u00020CH\u0016¢\u0006\u0004\bj\u0010bJ\u0017\u0010m\u001a\u00020\n2\u0006\u0010l\u001a\u00020kH\u0016¢\u0006\u0004\bm\u0010nJ\u0017\u0010o\u001a\u00020\n2\u0006\u0010=\u001a\u00020\u0017H\u0016¢\u0006\u0004\bo\u0010TJ\u0019\u0010q\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010pH\u0016¢\u0006\u0004\bq\u0010rJ\u000f\u0010s\u001a\u00020\nH\u0016¢\u0006\u0004\bs\u0010\tJ\u000f\u0010t\u001a\u00020\nH\u0016¢\u0006\u0004\bt\u0010\tJ\u0017\u0010u\u001a\u00020\n2\u0006\u0010=\u001a\u00020\u0017H\u0016¢\u0006\u0004\bu\u0010TJ\u0017\u0010v\u001a\u00020\n2\u0006\u0010=\u001a\u00020\u0017H\u0016¢\u0006\u0004\bv\u0010TJ\u0017\u0010w\u001a\u00020\n2\u0006\u0010=\u001a\u00020\u0017H\u0016¢\u0006\u0004\bw\u0010TJ\u000f\u0010x\u001a\u00020\nH\u0016¢\u0006\u0004\bx\u0010\tJ\u0017\u0010y\u001a\u00020\n2\u0006\u0010=\u001a\u00020\u0017H\u0016¢\u0006\u0004\by\u0010TJ\u000f\u0010z\u001a\u00020\u0010H\u0016¢\u0006\u0004\bz\u0010\u0015J\u0017\u0010|\u001a\u00020\n2\u0006\u0010{\u001a\u00020\u0017H\u0016¢\u0006\u0004\b|\u0010TJ\u0017\u0010~\u001a\u00020\n2\u0006\u0010}\u001a\u00020CH\u0016¢\u0006\u0004\b~\u0010bJ#\u0010\u0081\u0001\u001a\u00020\n2\u0006\u0010\u007f\u001a\u00020C2\u0007\u0010\u0080\u0001\u001a\u00020CH\u0016¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u0019\u0010\u0083\u0001\u001a\u00020\n2\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0005\b\u0083\u0001\u0010bR*\u0010\u008b\u0001\u001a\u00030\u0084\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R*\u0010\u0093\u0001\u001a\u00030\u008c\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R)\u0010\u009a\u0001\u001a\u00030\u0094\u00018\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0005\b|\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R*\u0010¢\u0001\u001a\u00030\u009b\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R*\u0010ª\u0001\u001a\u00030£\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001\"\u0006\b¨\u0001\u0010©\u0001R*\u0010²\u0001\u001a\u00030«\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¬\u0001\u0010\u00ad\u0001\u001a\u0006\b®\u0001\u0010¯\u0001\"\u0006\b°\u0001\u0010±\u0001R*\u0010º\u0001\u001a\u00030³\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b´\u0001\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001\"\u0006\b¸\u0001\u0010¹\u0001R)\u0010Á\u0001\u001a\u00030»\u00018\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0005\bu\u0010¼\u0001\u001a\u0006\b½\u0001\u0010¾\u0001\"\u0006\b¿\u0001\u0010À\u0001R)\u0010È\u0001\u001a\u00030Â\u00018\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0005\bj\u0010Ã\u0001\u001a\u0006\bÄ\u0001\u0010Å\u0001\"\u0006\bÆ\u0001\u0010Ç\u0001R*\u0010Ð\u0001\u001a\u00030É\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÊ\u0001\u0010Ë\u0001\u001a\u0006\bÌ\u0001\u0010Í\u0001\"\u0006\bÎ\u0001\u0010Ï\u0001R)\u0010×\u0001\u001a\u00030Ñ\u00018\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0005\bQ\u0010Ò\u0001\u001a\u0006\bÓ\u0001\u0010Ô\u0001\"\u0006\bÕ\u0001\u0010Ö\u0001R)\u0010Þ\u0001\u001a\u00030Ø\u00018\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0005\bZ\u0010Ù\u0001\u001a\u0006\bÚ\u0001\u0010Û\u0001\"\u0006\bÜ\u0001\u0010Ý\u0001R)\u0010å\u0001\u001a\u00030ß\u00018\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0005\bX\u0010à\u0001\u001a\u0006\bá\u0001\u0010â\u0001\"\u0006\bã\u0001\u0010ä\u0001R*\u0010í\u0001\u001a\u00030æ\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bç\u0001\u0010è\u0001\u001a\u0006\bé\u0001\u0010ê\u0001\"\u0006\bë\u0001\u0010ì\u0001R0\u0010õ\u0001\u001a\u00030î\u00018\u0006@\u0006X\u0087.¢\u0006\u001e\n\u0005\bW\u0010ï\u0001\u0012\u0005\bô\u0001\u0010\t\u001a\u0006\bð\u0001\u0010ñ\u0001\"\u0006\bò\u0001\u0010ó\u0001R\u001c\u0010ø\u0001\u001a\u0005\u0018\u00010ö\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010÷\u0001R\u001c\u0010û\u0001\u001a\u0005\u0018\u00010ù\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010ú\u0001R\u001c\u0010ÿ\u0001\u001a\u0005\u0018\u00010ü\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bý\u0001\u0010þ\u0001R\u001b\u0010\u0082\u0002\u001a\u0005\u0018\u00010\u0080\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b_\u0010\u0081\u0002R\u0018\u0010\u0086\u0002\u001a\u00030\u0083\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0002\u0010\u0085\u0002R\"\u0010\u008a\u0002\u001a\u000b\u0012\u0005\u0012\u00030\u0087\u0002\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0002\u0010\u0089\u0002R\"\u0010\u008e\u0002\u001a\u000b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u008b\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0002\u0010\u008d\u0002R\u001a\u0010\u0092\u0002\u001a\u00030\u008f\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0090\u0002\u0010\u0091\u0002R\u001a\u0010\u0096\u0002\u001a\u00030\u0093\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0094\u0002\u0010\u0095\u0002R\u001b\u0010\u0099\u0002\u001a\u0005\u0018\u00010\u0097\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bx\u0010\u0098\u0002R(\u0010\u009e\u0002\u001a\u0014\u0012\u000f\u0012\r \u009c\u0002*\u0005\u0018\u00010\u009b\u00020\u009b\u00020\u009a\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bm\u0010\u009d\u0002R*\u0010¦\u0002\u001a\u00030\u009f\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b \u0002\u0010¡\u0002\u001a\u0006\b¢\u0002\u0010£\u0002\"\u0006\b¤\u0002\u0010¥\u0002R\u0018\u0010©\u0002\u001a\u00030\u0097\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b§\u0002\u0010¨\u0002R\u001a\u0010\u00ad\u0002\u001a\u0005\u0018\u00010ª\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b«\u0002\u0010¬\u0002R\u001a\u0010±\u0002\u001a\u0005\u0018\u00010®\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b¯\u0002\u0010°\u0002R\u0016\u0010³\u0002\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b²\u0002\u0010\u0015R\u0018\u0010¶\u0002\u001a\u00030´\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b´\u0001\u0010µ\u0002¨\u0006¹\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/shoppinglist/fragment/ShoppingListAuthenticatedFragment;", "Landroidx/fragment/app/Fragment;", "LGn/u0$a;", "LGn/g0$a;", "Lcom/meijer/mobile/meijer/activity/shoppinglist/view/ShoppingListAddItemView$a;", "LEn/b$b;", "Lcom/meijer/mobile/meijer/activity/shoppinglist/ShoppingListItemDialogFragment$c;", "LEn/h$a;", "<init>", "()V", "", "A1", "Lg/a;", "result", "j1", "(Lg/a;)V", "", "completedOnly", "o1", "(Z)V", "H0", "()Z", "", "LFq/c;", "shoppingList", "D1", "(Ljava/util/List;)V", "w1", "l1", "LFq/a;", "favoritesList", "y1", "C1", "k1", "B1", "hasNetworkConnection", "n1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onActivityCreated", "onStart", "onResume", "onPause", "onDestroyView", "Landroid/view/Menu;", "menu", "Landroid/view/MenuInflater;", "onCreateOptionsMenu", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "onPrepareOptionsMenu", "(Landroid/view/Menu;)V", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "enabled", "x1", "f1", "", "position", "G0", "(LFq/c;I)V", "Q0", "LGn/v0;", "typeAheadResults", "f0", "onScan", "isVisible", "textResourceId", "R0", "(ZI)V", "itemDetailsEnabled", "p", "(Ljava/util/List;Z)V", "M0", "(LFq/c;)V", "n0", "V", "t", "r", "favoriteListItems", "q", "x0", "S0", "H", "a1", "x", "errorResId", "u0", "(I)V", "c", "(LFq/c;Ljava/util/List;)V", "LOk/a;", "coupon", "D0", "(LOk/a;)V", "listingId", "n", "Lmk/f;", "productIdentity", "E", "(Lmk/f;)V", "C0", "", "O", "(Ljava/lang/String;)V", "e0", "K", "m", "X", "M", "D", "S", "b", "shoppingListItem", "h", "at", "h0", "from", "to", "v", "(II)V", "u", "Lum/b;", "f", "Lum/b;", "getAppBackgroundManager", "()Lum/b;", "setAppBackgroundManager", "(Lum/b;)V", "appBackgroundManager", "Lyo/k;", "g", "Lyo/k;", "getUserManager", "()Lyo/k;", "setUserManager", "(Lyo/k;)V", "userManager", "Lgi/a;", "Lgi/a;", "getAnalyticsEngine", "()Lgi/a;", "setAnalyticsEngine", "(Lgi/a;)V", "analyticsEngine", "Lyo/a;", "i", "Lyo/a;", "getAppPrefManager", "()Lyo/a;", "setAppPrefManager", "(Lyo/a;)V", "appPrefManager", "LEq/b;", "j", "LEq/b;", "i1", "()LEq/b;", "setShoppingListRepository", "(LEq/b;)V", "shoppingListRepository", "LEq/a;", "k", "LEq/a;", "T0", "()LEq/a;", "setFavoriteListRepository", "(LEq/a;)V", "favoriteListRepository", "LQn/i;", "l", "LQn/i;", "L0", "()LQn/i;", "setConnectionChangeHelper", "(LQn/i;)V", "connectionChangeHelper", "LCk/b;", "LCk/b;", "J0", "()LCk/b;", "setBaseBus", "(LCk/b;)V", "baseBus", "LRo/c;", "LRo/c;", "h1", "()LRo/c;", "setProductsRepository", "(LRo/c;)V", "productsRepository", "LTq/j;", "o", "LTq/j;", "getStoreProvider", "()LTq/j;", "setStoreProvider", "(LTq/j;)V", "storeProvider", "Lyl/k;", "Lyl/k;", "getFeatureManager", "()Lyl/k;", "setFeatureManager", "(Lyl/k;)V", "featureManager", "LAl/g;", "LAl/g;", "getFeatureEntryPoint", "()LAl/g;", "setFeatureEntryPoint", "(LAl/g;)V", "featureEntryPoint", "Lcl/d;", "Lcl/d;", "O0", "()Lcl/d;", "setCouponsRepository", "(Lcl/d;)V", "couponsRepository", "LCl/e;", "s", "LCl/e;", "getMeijerIntent", "()LCl/e;", "setMeijerIntent", "(LCl/e;)V", "meijerIntent", "Lqv/K;", "Lqv/K;", "X0", "()Lqv/K;", "setIoDispatcher", "(Lqv/K;)V", "getIoDispatcher$annotations", "ioDispatcher", "Lcom/meijer/mobile/meijer/activity/shoppinglist/view/EmptyShoppingListView;", "Lcom/meijer/mobile/meijer/activity/shoppinglist/view/EmptyShoppingListView;", "emptyShoppingListView", "LEn/b;", "LEn/b;", "shoppingListAdapter", "Landroidx/recyclerview/widget/l;", "w", "Landroidx/recyclerview/widget/l;", "itemTouchHelper", "LEn/h;", "LEn/h;", "itemTouchHelperCallback", "LNu/a;", "y", "LNu/a;", "disposables", "LCo/h;", "z", "Ljava/util/List;", "scannedItemsToAdd", "LDs/n;", "A", "LDs/n;", "undoDeleteHelper", "LGn/u0;", "B", "LGn/u0;", "shoppingListTypeAheadItem", "LGn/g0;", "C", "LGn/g0;", "viewModel", "LMn/B1;", "LMn/B1;", "_binding", "Lg/c;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "Lg/c;", "scannerResultLauncher", "LGn/g0$c;", "F", "LGn/g0$c;", "g1", "()LGn/g0$c;", "z1", "(LGn/g0$c;)V", "newRelatedCouponListCallBack", "K0", "()LMn/B1;", "binding", "Lcom/meijer/mobile/meijer/activity/shoppinglist/LegacyShoppingListActivity;", "Z0", "()Lcom/meijer/mobile/meijer/activity/shoppinglist/LegacyShoppingListActivity;", "legacyShoppingListActivity", "Lcom/meijer/mobile/meijer/activity/shoppinglist/ShoppingListItemDialogFragment;", "Y0", "()Lcom/meijer/mobile/meijer/activity/shoppinglist/ShoppingListItemDialogFragment;", "itemDetailsDialogFragment", "m1", "isDragging", "Lcom/meijer/mobile/meijer/activity/shoppinglist/ShoppingListItemDialogFragment$b;", "()Lcom/meijer/mobile/meijer/activity/shoppinglist/ShoppingListItemDialogFragment$b;", "shoppingListItemListener", "G", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class ShoppingListAuthenticatedFragment extends Hilt_ShoppingListAuthenticatedFragment implements u0.a, g0.a, ShoppingListAddItemView.a, b.InterfaceC0130b, ShoppingListItemDialogFragment.c, h.a {

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: H, reason: collision with root package name */
    public static final int f112470H = 8;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private n<ShoppingListItem> undoDeleteHelper;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private u0 shoppingListTypeAheadItem;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private g0 viewModel;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private B1 _binding;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14147c<Intent> scannerResultLauncher;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    public g0.c newRelatedCouponListCallBack;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public C17279b appBackgroundManager;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public k userManager;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public InterfaceC14261a analyticsEngine;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public C18264a appPrefManager;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public Eq.b shoppingListRepository;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public a favoriteListRepository;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public C5145i connectionChangeHelper;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public Ck.b baseBus;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public Ro.c productsRepository;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public j storeProvider;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public yl.k featureManager;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public g featureEntryPoint;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public C6412d couponsRepository;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public e meijerIntent;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public AbstractC16618K ioDispatcher;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private EmptyShoppingListView emptyShoppingListView;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private En.b shoppingListAdapter;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private l itemTouchHelper;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private h itemTouchHelperCallback;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final Nu.a disposables = new Nu.a();

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private List<ProductFullDetails> scannedItemsToAdd;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/meijer/mobile/meijer/activity/shoppinglist/fragment/ShoppingListAuthenticatedFragment$a;", "", "<init>", "()V", "Lmk/f;", "product", "LOk/c;", "coupon", "LJs/b;", "weeklyAdItem", "Lcom/meijer/mobile/meijer/activity/shoppinglist/fragment/ShoppingListAuthenticatedFragment;", "a", "(Lmk/f;LOk/c;LJs/b;)Lcom/meijer/mobile/meijer/activity/shoppinglist/fragment/ShoppingListAuthenticatedFragment;", "", "FRAGMENT_TAG_DIALOG_ITEM", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.shoppinglist.fragment.ShoppingListAuthenticatedFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @SuppressLint({"LambdaLast"})
        public final ShoppingListAuthenticatedFragment a(f product, Ok.c coupon, WeeklyAdItem weeklyAdItem) {
            ShoppingListAuthenticatedFragment shoppingListAuthenticatedFragment = new ShoppingListAuthenticatedFragment();
            shoppingListAuthenticatedFragment.setArguments(C14835c.b(TuplesKt.a("com.meijer.intent.extra.SHOPPING_LIST_PRODUCT", product), TuplesKt.a("com.meijer.intent.extra.SHOPPING_LIST_COUPON", coupon), TuplesKt.a("com.meijer.intent.extra.SHOPPING_LIST_AD", weeklyAdItem)));
            return shoppingListAuthenticatedFragment;
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/meijer/mobile/meijer/activity/shoppinglist/fragment/ShoppingListAuthenticatedFragment$b", "Lrr/b;", "", "string", "", "start", "before", "count", "", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends C16831b {
        b() {
        }

        @Override // rr.C16831b, android.text.TextWatcher
        public void onTextChanged(CharSequence string, int start, int before, int count) {
            Intrinsics.j(string, "string");
            u0 u0Var = ShoppingListAuthenticatedFragment.this.shoppingListTypeAheadItem;
            if (u0Var == null) {
                Intrinsics.y("shoppingListTypeAheadItem");
                u0Var = null;
            }
            u0Var.A0(string.toString());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class c implements InterfaceC14146b, FunctionAdapter {
        c() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14146b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, ShoppingListAuthenticatedFragment.this, ShoppingListAuthenticatedFragment.class, "handleScannerResult", "handleScannerResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14145a p02) {
            Intrinsics.j(p02, "p0");
            ShoppingListAuthenticatedFragment.this.j1(p02);
        }
    }

    private final void A1() {
        Context contextRequireContext = requireContext();
        Intrinsics.i(contextRequireContext, "requireContext(...)");
        this.shoppingListAdapter = new En.b(contextRequireContext, this);
        this.itemTouchHelperCallback = new h(requireContext(), this);
        K0().f19909F.setAdapter(this.shoppingListAdapter);
        h hVar = this.itemTouchHelperCallback;
        Intrinsics.g(hVar);
        l lVar = new l(hVar);
        lVar.g(K0().f19909F);
        this.itemTouchHelper = lVar;
        K0().f19909F.addItemDecoration(new j.a(requireContext()).e(P.f98652e).d());
        K0().f19909F.setClipToPadding(false);
    }

    private final boolean B1() {
        En.b bVar = this.shoppingListAdapter;
        return bVar != null && bVar.L();
    }

    private final void D1(List<ShoppingListItem> shoppingList) {
        En.b bVar = this.shoppingListAdapter;
        Intrinsics.g(bVar);
        bVar.P(shoppingList);
        w1();
    }

    private final B1 K0() {
        B1 b12 = this._binding;
        Intrinsics.g(b12);
        return b12;
    }

    private final boolean k1() {
        En.b bVar = this.shoppingListAdapter;
        return bVar != null && bVar.K();
    }

    private final boolean m1() {
        h hVar = this.itemTouchHelperCallback;
        Intrinsics.g(hVar);
        return hVar.D();
    }

    private final void n1(boolean hasNetworkConnection) {
        if (hasNetworkConnection) {
            l lVar = this.itemTouchHelper;
            Intrinsics.g(lVar);
            lVar.g(K0().f19909F);
        } else {
            K0().f19904A.i();
            l lVar2 = this.itemTouchHelper;
            Intrinsics.g(lVar2);
            lVar2.g(null);
        }
        En.b bVar = this.shoppingListAdapter;
        Intrinsics.g(bVar);
        bVar.notifyDataSetChanged();
    }

    private final void o1(final boolean completedOnly) {
        int i10 = completedOnly ? Aq.b.f1467L : Aq.b.f1468M;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.i(fragmentActivityRequireActivity, "requireActivity(...)");
        new m(fragmentActivityRequireActivity, i10, new String[0]).E(new DialogInterface.OnClickListener() { // from class: Fn.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                ShoppingListAuthenticatedFragment.p1(this.f10920a, completedOnly, dialogInterface, i11);
            }
        }).g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p1(ShoppingListAuthenticatedFragment shoppingListAuthenticatedFragment, boolean z10, DialogInterface dialogInterface, int i10) {
        g0 g0Var = shoppingListAuthenticatedFragment.viewModel;
        if (g0Var == null) {
            Intrinsics.y("viewModel");
            g0Var = null;
        }
        g0Var.i2(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q1(ShoppingListAuthenticatedFragment shoppingListAuthenticatedFragment) {
        g0 g0Var = shoppingListAuthenticatedFragment.viewModel;
        if (g0Var == null) {
            Intrinsics.y("viewModel");
            g0Var = null;
        }
        g0Var.D2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r1(ShoppingListAuthenticatedFragment shoppingListAuthenticatedFragment, View view) {
        g0 g0Var = shoppingListAuthenticatedFragment.viewModel;
        if (g0Var == null) {
            Intrinsics.y("viewModel");
            g0Var = null;
        }
        g0Var.D2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s1(ShoppingListAuthenticatedFragment shoppingListAuthenticatedFragment, View view) {
        g0 g0Var = shoppingListAuthenticatedFragment.viewModel;
        if (g0Var == null) {
            Intrinsics.y("viewModel");
            g0Var = null;
        }
        g0Var.D2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t1(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("Shopping List");
        track.v("shopping list");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u1(TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.h("searchLocation", "event: Shopping list home page");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v1(ShoppingListAuthenticatedFragment shoppingListAuthenticatedFragment, C18067a event) {
        Intrinsics.j(event, "event");
        shoppingListAuthenticatedFragment.x1(event.getIsNetworkAvailable());
    }

    private final void y1(List<FavoriteListItem> favoritesList) {
        EmptyShoppingListView emptyShoppingListView = this.emptyShoppingListView;
        Intrinsics.g(emptyShoppingListView);
        emptyShoppingListView.setHasFavoritesList((favoritesList == null || favoritesList.isEmpty()) ? false : true);
    }

    @Override // Gn.g0.a
    public void C0(ShoppingListItem item) {
        Intrinsics.j(item, "item");
        if (getFeatureManager().e(AbstractC18227f.t0.f170605h)) {
            Context contextRequireContext = requireContext();
            Intrinsics.i(contextRequireContext, "requireContext(...)");
            startActivity(Al.h.c(contextRequireContext, Pp.b.f28356a, null, item.getItemDescription(), false, null, 52, null));
        } else {
            Context contextRequireContext2 = requireContext();
            Intrinsics.i(contextRequireContext2, "requireContext(...)");
            startActivity(Al.h.g(contextRequireContext2, Pp.b.f28356a, null, item.getItemDescription(), false, null, 52, null));
        }
        LegacyShoppingListActivity legacyShoppingListActivityZ0 = Z0();
        if (legacyShoppingListActivityZ0 != null) {
            bk.c.b(legacyShoppingListActivityZ0, 0, d.f2593b, d.f2594c, 0, 8, null);
        }
    }

    @Override // En.b.InterfaceC0130b
    public void D() {
        g0 g0Var = this.viewModel;
        if (g0Var == null) {
            Intrinsics.y("viewModel");
            g0Var = null;
        }
        g0Var.g2();
    }

    @Override // Gn.g0.a
    public void D0(Coupon coupon) {
        Intrinsics.j(coupon, "coupon");
        startActivity(getMeijerIntent().h(new l.Coupon(coupon)));
        LegacyShoppingListActivity legacyShoppingListActivityZ0 = Z0();
        if (legacyShoppingListActivityZ0 != null) {
            bk.c.b(legacyShoppingListActivityZ0, 0, d.f2593b, d.f2594c, 0, 8, null);
        }
    }

    @Override // Gn.g0.a
    public void E(f productIdentity) {
        Intrinsics.j(productIdentity, "productIdentity");
        startActivity(g.t(getFeatureEntryPoint(), productIdentity, true, false, null, 12, null));
        LegacyShoppingListActivity legacyShoppingListActivityZ0 = Z0();
        if (legacyShoppingListActivityZ0 != null) {
            bk.c.b(legacyShoppingListActivityZ0, 0, d.f2593b, d.f2594c, 0, 8, null);
        }
    }

    @Override // Gn.g0.a
    public void G0(ShoppingListItem item, int position) throws Resources.NotFoundException {
        Intrinsics.j(item, "item");
        if (this.undoDeleteHelper == null) {
            int integer = requireContext().getResources().getInteger(U.f99310a);
            ConstraintLayout constraintLayout = K0().f19908E;
            AbstractC5607a abstractC5607aB = AbstractC5607a.INSTANCE.b(X.f99445d, 1, new Object[0]);
            Context contextRequireContext = requireContext();
            Intrinsics.i(contextRequireContext, "requireContext(...)");
            String strB = abstractC5607aB.b(contextRequireContext);
            g0 g0Var = this.viewModel;
            if (g0Var == null) {
                Intrinsics.y("viewModel");
                g0Var = null;
            }
            this.undoDeleteHelper = new n<>(integer, constraintLayout, strB, g0Var);
        }
        n<ShoppingListItem> nVar = this.undoDeleteHelper;
        if (nVar != null) {
            nVar.d(item, position);
        }
    }

    public final Ck.b J0() {
        Ck.b bVar = this.baseBus;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.y("baseBus");
        return null;
    }

    @Override // com.meijer.mobile.meijer.activity.shoppinglist.view.ShoppingListAddItemView.a
    public void K() {
        g0 g0Var = this.viewModel;
        if (g0Var == null) {
            Intrinsics.y("viewModel");
            g0Var = null;
        }
        g0Var.B0();
    }

    public final C5145i L0() {
        C5145i c5145i = this.connectionChangeHelper;
        if (c5145i != null) {
            return c5145i;
        }
        Intrinsics.y("connectionChangeHelper");
        return null;
    }

    @Override // En.b.InterfaceC0130b
    public void M(ShoppingListItem item) {
        Intrinsics.j(item, "item");
        if (L0().i()) {
            g0 g0Var = null;
            if (item.s()) {
                g0 g0Var2 = this.viewModel;
                if (g0Var2 == null) {
                    Intrinsics.y("viewModel");
                } else {
                    g0Var = g0Var2;
                }
                g0Var.h3(item);
                return;
            }
            if (item.x()) {
                g0 g0Var3 = this.viewModel;
                if (g0Var3 == null) {
                    Intrinsics.y("viewModel");
                } else {
                    g0Var = g0Var3;
                }
                g0Var.m3(item);
                return;
            }
            if (item.v()) {
                g0 g0Var4 = this.viewModel;
                if (g0Var4 == null) {
                    Intrinsics.y("viewModel");
                } else {
                    g0Var = g0Var4;
                }
                g0Var.k3(item);
                return;
            }
            g0 g0Var5 = this.viewModel;
            if (g0Var5 == null) {
                Intrinsics.y("viewModel");
            } else {
                g0Var = g0Var5;
            }
            g0Var.S2(item);
        }
    }

    @Override // Gn.g0.a
    public void M0(ShoppingListItem item) {
        Intrinsics.j(item, "item");
        En.b bVar = this.shoppingListAdapter;
        Intrinsics.g(bVar);
        bVar.N(item);
    }

    @Override // Gn.g0.a
    public void O(String shoppingList) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        String strH = getUserManager().h();
        if (!StringsKt.r0(strH)) {
            intent.putExtra("android.intent.extra.EMAIL", new String[]{strH});
        }
        intent.putExtra("android.intent.extra.SUBJECT", getString(Aq.b.f1473R));
        if (shoppingList == null) {
            shoppingList = "";
        }
        intent.putExtra("android.intent.extra.TEXT", shoppingList);
        startActivity(Intent.createChooser(intent, getString(Aq.b.f1474S)));
    }

    public final C6412d O0() {
        C6412d c6412d = this.couponsRepository;
        if (c6412d != null) {
            return c6412d;
        }
        Intrinsics.y("couponsRepository");
        return null;
    }

    @Override // Gn.g0.a
    public void Q0() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.i(fragmentActivityRequireActivity, "requireActivity(...)");
        X.a aVar = new X.a(fragmentActivityRequireActivity, WalkThroughType.SHOPPING_LIST);
        g0 g0Var = this.viewModel;
        if (g0Var == null) {
            Intrinsics.y("viewModel");
            g0Var = null;
        }
        aVar.m(g0Var).a().b();
    }

    @Override // Gn.g0.a
    public void S(ShoppingListItem item) {
        Intrinsics.j(item, "item");
        En.b bVar = this.shoppingListAdapter;
        Intrinsics.g(bVar);
        bVar.E(item);
        w1();
    }

    public final a T0() {
        a aVar = this.favoriteListRepository;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.y("favoriteListRepository");
        return null;
    }

    @Override // Gn.g0.a
    public void V(ShoppingListItem item) {
        Intrinsics.j(item, "item");
        En.b bVar = this.shoppingListAdapter;
        Intrinsics.g(bVar);
        bVar.R(item);
        String string = getString(item.getIsComplete() ? Y.f99507Ce : Y.f99526De);
        Intrinsics.i(string, "getString(...)");
        K0().f19909F.announceForAccessibility(string);
    }

    @Override // En.b.InterfaceC0130b
    public void X(ShoppingListItem item) {
        Intrinsics.j(item, "item");
        if (!L0().i() || item.getIsComplete()) {
            return;
        }
        g0 g0Var = this.viewModel;
        if (g0Var == null) {
            Intrinsics.y("viewModel");
            g0Var = null;
        }
        g0Var.j3(item);
    }

    public final AbstractC16618K X0() {
        AbstractC16618K abstractC16618K = this.ioDispatcher;
        if (abstractC16618K != null) {
            return abstractC16618K;
        }
        Intrinsics.y("ioDispatcher");
        return null;
    }

    @Override // Gn.g0.a
    public void a1(ShoppingListItem item, int position) {
        AbstractC15310a.b<ShoppingListItem> bVarG;
        Intrinsics.j(item, "item");
        if (item.getIsComplete()) {
            En.b bVar = this.shoppingListAdapter;
            Intrinsics.g(bVar);
            bVarG = bVar.F();
        } else {
            En.b bVar2 = this.shoppingListAdapter;
            Intrinsics.g(bVar2);
            bVarG = bVar2.G();
        }
        List<ShoppingListItem> listM = bVarG != null ? bVarG.f147937d : null;
        if (listM == null) {
            listM = CollectionsKt.m();
        }
        if (position > listM.size() || position < 0) {
            En.b bVar3 = this.shoppingListAdapter;
            Intrinsics.g(bVar3);
            bVar3.c(bVarG, item);
            List<ShoppingListItem> listM2 = bVarG != null ? bVarG.f147937d : null;
            if (listM2 == null) {
                listM2 = CollectionsKt.m();
            }
            position = CollectionsKt.o(listM2);
        } else {
            En.b bVar4 = this.shoppingListAdapter;
            Intrinsics.g(bVar4);
            bVar4.a(bVarG, position, item);
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) K0().f19909F.getLayoutManager();
        Intrinsics.g(linearLayoutManager);
        int iN2 = linearLayoutManager.n2();
        int iS2 = linearLayoutManager.s2();
        if (position == 0 || position < iN2 || iS2 < position) {
            K0().f19909F.scrollToPosition(position);
        }
        w1();
    }

    @Override // Gn.g0.a
    public void c(ShoppingListItem item, List<FavoriteListItem> favoritesList) {
        Intrinsics.j(item, "item");
        Intrinsics.j(favoritesList, "favoritesList");
        ShoppingListItemDialogFragment shoppingListItemDialogFragmentA = ShoppingListItemDialogFragment.INSTANCE.a(item, favoritesList);
        shoppingListItemDialogFragmentA.setTargetFragment(this, 0);
        C17829a.f166179a.a(shoppingListItemDialogFragmentA, getActivity(), "dialogItem");
    }

    @Override // com.meijer.mobile.meijer.activity.shoppinglist.view.ShoppingListAddItemView.a
    public void e0() {
        g0 g0Var = this.viewModel;
        if (g0Var == null) {
            Intrinsics.y("viewModel");
            g0Var = null;
        }
        g0Var.B0();
    }

    @Override // Gn.u0.a
    public void f0(List<ShoppingListTypeAheadResultItem> typeAheadResults) {
        Intrinsics.j(typeAheadResults, "typeAheadResults");
        K0().f19904A.setTypeAheadResults(typeAheadResults);
    }

    @Override // Gn.g0.a
    public void f1() {
        n<ShoppingListItem> nVar = this.undoDeleteHelper;
        if (nVar != null) {
            nVar.b();
        }
    }

    public final g0.c g1() {
        g0.c cVar = this.newRelatedCouponListCallBack;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.y("newRelatedCouponListCallBack");
        return null;
    }

    public final InterfaceC14261a getAnalyticsEngine() {
        InterfaceC14261a interfaceC14261a = this.analyticsEngine;
        if (interfaceC14261a != null) {
            return interfaceC14261a;
        }
        Intrinsics.y("analyticsEngine");
        return null;
    }

    public final C17279b getAppBackgroundManager() {
        C17279b c17279b = this.appBackgroundManager;
        if (c17279b != null) {
            return c17279b;
        }
        Intrinsics.y("appBackgroundManager");
        return null;
    }

    public final C18264a getAppPrefManager() {
        C18264a c18264a = this.appPrefManager;
        if (c18264a != null) {
            return c18264a;
        }
        Intrinsics.y("appPrefManager");
        return null;
    }

    public final g getFeatureEntryPoint() {
        g gVar = this.featureEntryPoint;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.y("featureEntryPoint");
        return null;
    }

    public final yl.k getFeatureManager() {
        yl.k kVar = this.featureManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.y("featureManager");
        return null;
    }

    public final e getMeijerIntent() {
        e eVar = this.meijerIntent;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.y("meijerIntent");
        return null;
    }

    public final Tq.j getStoreProvider() {
        Tq.j jVar = this.storeProvider;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.y("storeProvider");
        return null;
    }

    public final k getUserManager() {
        k kVar = this.userManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.y("userManager");
        return null;
    }

    @Override // com.meijer.mobile.meijer.activity.shoppinglist.view.ShoppingListAddItemView.a
    public void h(ShoppingListItem shoppingListItem) {
        Intrinsics.j(shoppingListItem, "shoppingListItem");
        g0 g0Var = this.viewModel;
        if (g0Var == null) {
            Intrinsics.y("viewModel");
            g0Var = null;
        }
        g0Var.h(shoppingListItem);
        K0().f19904A.h();
    }

    @Override // En.h.a
    public void h0(int at2) {
        En.b bVar = this.shoppingListAdapter;
        Intrinsics.g(bVar);
        ShoppingListItem shoppingListItemH = bVar.H(at2);
        En.b bVar2 = this.shoppingListAdapter;
        Intrinsics.g(bVar2);
        ShoppingListItem item = bVar2.getItem(at2);
        Intrinsics.g(item);
        ShoppingListItem shoppingListItem = item;
        g0 g0Var = this.viewModel;
        if (g0Var == null) {
            Intrinsics.y("viewModel");
            g0Var = null;
        }
        g0Var.M2(shoppingListItem, shoppingListItemH);
    }

    public final Ro.c h1() {
        Ro.c cVar = this.productsRepository;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.y("productsRepository");
        return null;
    }

    public final Eq.b i1() {
        Eq.b bVar = this.shoppingListRepository;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.y("shoppingListRepository");
        return null;
    }

    @Override // com.meijer.mobile.meijer.activity.shoppinglist.ShoppingListItemDialogFragment.c
    public ShoppingListItemDialogFragment.b l() {
        g0 g0Var = this.viewModel;
        if (g0Var != null) {
            return g0Var;
        }
        Intrinsics.y("viewModel");
        return null;
    }

    @Override // En.b.InterfaceC0130b
    public void m(ShoppingListItem item) {
        Intrinsics.j(item, "item");
        g0 g0Var = this.viewModel;
        if (g0Var == null) {
            Intrinsics.y("viewModel");
            g0Var = null;
        }
        g0Var.F2(item);
    }

    @Override // Gn.g0.a
    public void n0(ShoppingListItem item) {
        Intrinsics.j(item, "item");
        En.b bVar = this.shoppingListAdapter;
        Intrinsics.g(bVar);
        bVar.O(item);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00e7  */
    @Override // androidx.fragment.app.Fragment
    @kotlin.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreateOptionsMenu(android.view.Menu r11, android.view.MenuInflater r12) {
        /*
            r10 = this;
            java.lang.String r0 = "menu"
            kotlin.jvm.internal.Intrinsics.j(r11, r0)
            java.lang.String r0 = "inflater"
            kotlin.jvm.internal.Intrinsics.j(r12, r0)
            int r0 = com.meijer.mobile.meijer.W.f99441c
            r12.inflate(r0, r11)
            int r0 = com.meijer.mobile.meijer.T.f99059d1
            android.view.MenuItem r0 = r11.findItem(r0)
            java.lang.String r1 = "findItem(...)"
            kotlin.jvm.internal.Intrinsics.i(r0, r1)
            int r2 = com.meijer.mobile.meijer.T.f99145l
            android.view.MenuItem r2 = r11.findItem(r2)
            kotlin.jvm.internal.Intrinsics.i(r2, r1)
            int r3 = com.meijer.mobile.meijer.T.f99156m
            android.view.MenuItem r3 = r11.findItem(r3)
            kotlin.jvm.internal.Intrinsics.i(r3, r1)
            int r4 = com.meijer.mobile.meijer.T.f99112i
            android.view.MenuItem r4 = r11.findItem(r4)
            kotlin.jvm.internal.Intrinsics.i(r4, r1)
            int r5 = com.meijer.mobile.meijer.T.f99043b7
            android.view.MenuItem r5 = r11.findItem(r5)
            kotlin.jvm.internal.Intrinsics.i(r5, r1)
            com.meijer.mobile.meijer.activity.shoppinglist.LegacyShoppingListActivity r1 = r10.Z0()
            kotlin.jvm.internal.Intrinsics.g(r1)
            boolean r1 = r1.hasNetworkConnection()
            r6 = 8
            r7 = 0
            if (r1 == 0) goto Le7
            Gn.g0 r1 = r10.viewModel
            r8 = 0
            java.lang.String r9 = "viewModel"
            if (r1 != 0) goto L59
            kotlin.jvm.internal.Intrinsics.y(r9)
            r1 = r8
        L59:
            boolean r1 = r1.V1()
            if (r1 != 0) goto Le7
            Gn.g0 r1 = r10.viewModel
            if (r1 != 0) goto L67
            kotlin.jvm.internal.Intrinsics.y(r9)
            goto L68
        L67:
            r8 = r1
        L68:
            boolean r1 = r8.getIsFetchingShoppingList()
            if (r1 == 0) goto L70
            goto Le7
        L70:
            Mn.B1 r1 = r10.K0()
            com.meijer.mobile.meijer.activity.shoppinglist.view.ShoppingListAddItemView r1 = r1.f19904A
            boolean r1 = r1.n()
            r8 = 1
            if (r1 == 0) goto L9b
            r2.setVisible(r7)
            r3.setVisible(r7)
            r4.setVisible(r7)
            r0.setVisible(r8)
            r5.setVisible(r8)
            com.meijer.mobile.meijer.activity.shoppinglist.LegacyShoppingListActivity r0 = r10.Z0()
            kotlin.jvm.internal.Intrinsics.g(r0)
            androidx.constraintlayout.widget.Group r0 = r0.H1()
            r0.setVisibility(r6)
            goto L104
        L9b:
            boolean r1 = r10.B1()
            if (r1 == 0) goto Lc5
            r2.setVisible(r8)
            r3.setVisible(r8)
            r4.setVisible(r8)
            com.meijer.mobile.meijer.activity.shoppinglist.LegacyShoppingListActivity r1 = r10.Z0()
            kotlin.jvm.internal.Intrinsics.g(r1)
            androidx.constraintlayout.widget.Group r1 = r1.H1()
            yo.k r2 = r10.getUserManager()
            boolean r2 = r2.b()
            if (r2 != 0) goto Lc0
            goto Lc1
        Lc0:
            r6 = r7
        Lc1:
            r1.setVisibility(r6)
            goto Le0
        Lc5:
            r2.setVisible(r8)
            r3.setVisible(r7)
            com.meijer.mobile.meijer.activity.shoppinglist.LegacyShoppingListActivity r1 = r10.Z0()
            kotlin.jvm.internal.Intrinsics.g(r1)
            androidx.constraintlayout.widget.Group r1 = r1.H1()
            r1.setVisibility(r6)
            boolean r1 = r10.C1()
            r4.setVisible(r1)
        Le0:
            r0.setVisible(r7)
            r5.setVisible(r8)
            goto L104
        Le7:
            r2.setVisible(r7)
            r3.setVisible(r7)
            r4.setVisible(r7)
            r0.setVisible(r7)
            r5.setVisible(r7)
            com.meijer.mobile.meijer.activity.shoppinglist.LegacyShoppingListActivity r0 = r10.Z0()
            kotlin.jvm.internal.Intrinsics.g(r0)
            androidx.constraintlayout.widget.Group r0 = r0.H1()
            r0.setVisibility(r6)
        L104:
            super.onCreateOptionsMenu(r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.shoppinglist.fragment.ShoppingListAuthenticatedFragment.onCreateOptionsMenu(android.view.Menu, android.view.MenuInflater):void");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.j(inflater, "inflater");
        this._binding = B1.K0(getLayoutInflater(), container, false);
        Context context = inflater.getContext();
        Intrinsics.i(context, "getContext(...)");
        EmptyShoppingListView emptyShoppingListView = new EmptyShoppingListView(context);
        emptyShoppingListView.setListener(new com.meijer.mobile.meijer.activity.shoppinglist.view.d() { // from class: Fn.d
            @Override // com.meijer.mobile.meijer.activity.shoppinglist.view.d
            public final void a() {
                ShoppingListAuthenticatedFragment.q1(this.f10917a);
            }
        });
        this.emptyShoppingListView = emptyShoppingListView;
        A1();
        K0().f19904A.setListener(this);
        K0().f19911z.setOnClickListener(new View.OnClickListener() { // from class: Fn.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShoppingListAuthenticatedFragment.r1(this.f10918a, view);
            }
        });
        K0().f19905B.setOnClickListener(new View.OnClickListener() { // from class: Fn.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShoppingListAuthenticatedFragment.s1(this.f10919a, view);
            }
        });
        View root = K0().getRoot();
        Intrinsics.i(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        u0 u0Var = this.shoppingListTypeAheadItem;
        if (u0Var == null) {
            Intrinsics.y("shoppingListTypeAheadItem");
            u0Var = null;
        }
        u0Var.P();
        g0 g0Var = this.viewModel;
        if (g0Var == null) {
            Intrinsics.y("viewModel");
            g0Var = null;
        }
        g0Var.P();
        this._binding = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    @Deprecated
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.j(item, "item");
        int itemId = item.getItemId();
        if (itemId == T.f99145l) {
            H();
            return true;
        }
        if (itemId == T.f99156m) {
            g0 g0Var = this.viewModel;
            if (g0Var == null) {
                Intrinsics.y("viewModel");
                g0Var = null;
            }
            g0Var.U2();
            return true;
        }
        if (itemId == T.f99112i) {
            f1();
            o1(false);
            getAnalyticsEngine().h(C14476c.a("event: clear list"), new Function1() { // from class: Fn.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ShoppingListAuthenticatedFragment.t1((TrackingData) obj);
                }
            });
            return true;
        }
        if (itemId == T.f99059d1) {
            K0().f19904A.i();
            LegacyShoppingListActivity legacyShoppingListActivityZ0 = Z0();
            if (legacyShoppingListActivityZ0 != null) {
                legacyShoppingListActivityZ0.invalidateOptionsMenu();
            }
            return true;
        }
        if (itemId != T.f99043b7) {
            return super.onOptionsItemSelected(item);
        }
        getAnalyticsEngine().i(C14476c.h("Product Search Page"), new Function1() { // from class: Fn.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShoppingListAuthenticatedFragment.u1((TrackingData) obj);
            }
        });
        if (getFeatureManager().e(AbstractC18227f.t0.f170605h)) {
            Context contextRequireContext = requireContext();
            Intrinsics.i(contextRequireContext, "requireContext(...)");
            startActivity(Al.h.c(contextRequireContext, Pp.b.f28356a, null, null, false, null, 60, null));
        } else {
            Context contextRequireContext2 = requireContext();
            Intrinsics.i(contextRequireContext2, "requireContext(...)");
            startActivity(Al.h.g(contextRequireContext2, Pp.b.f28356a, null, null, false, null, 60, null));
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        g0 g0Var = this.viewModel;
        if (g0Var == null) {
            Intrinsics.y("viewModel");
            g0Var = null;
        }
        g0Var.r3();
        super.onPause();
        n<ShoppingListItem> nVar = this.undoDeleteHelper;
        if (nVar != null) {
            nVar.b();
        }
        this.undoDeleteHelper = null;
        this.disposables.d();
    }

    @Override // androidx.fragment.app.Fragment
    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
        Intrinsics.j(menu, "menu");
        super.onPrepareOptionsMenu(menu);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.invalidateOptionsMenu();
        }
    }

    @Override // Gn.g0.a
    public void p(List<ShoppingListItem> shoppingList, boolean itemDetailsEnabled) {
        Object next;
        Intrinsics.j(shoppingList, "shoppingList");
        D1(shoppingList);
        ShoppingListItemDialogFragment shoppingListItemDialogFragmentY0 = Y0();
        if (shoppingListItemDialogFragmentY0 != null) {
            Iterator<T> it = shoppingList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (shoppingListItemDialogFragmentY0.Y0().getListItemId() == ((ShoppingListItem) next).getListItemId()) {
                        break;
                    }
                }
            }
            if (next == null && itemDetailsEnabled) {
                shoppingListItemDialogFragmentY0.dismiss();
            }
        }
        LegacyShoppingListActivity legacyShoppingListActivityZ0 = Z0();
        if (legacyShoppingListActivityZ0 != null) {
            legacyShoppingListActivityZ0.invalidateOptionsMenu();
        }
        g1().C(shoppingList);
    }

    @Override // Gn.g0.a
    public void q(List<FavoriteListItem> favoriteListItems) {
        Intrinsics.j(favoriteListItems, "favoriteListItems");
        u0 u0Var = this.shoppingListTypeAheadItem;
        if (u0Var == null) {
            Intrinsics.y("shoppingListTypeAheadItem");
            u0Var = null;
        }
        u0Var.C0(favoriteListItems);
        y1(favoriteListItems);
    }

    @Override // En.h.a
    public void u(int position) {
        En.b bVar = this.shoppingListAdapter;
        Intrinsics.g(bVar);
        ShoppingListItem item = bVar.getItem(position);
        Intrinsics.g(item);
        ShoppingListItem shoppingListItem = item;
        En.b bVar2 = this.shoppingListAdapter;
        Intrinsics.g(bVar2);
        int I10 = bVar2.I(shoppingListItem);
        En.b bVar3 = this.shoppingListAdapter;
        Intrinsics.g(bVar3);
        bVar3.w(shoppingListItem);
        w1();
        g0 g0Var = this.viewModel;
        if (g0Var == null) {
            Intrinsics.y("viewModel");
            g0Var = null;
        }
        g0Var.R2(shoppingListItem, I10);
    }

    @Override // Gn.g0.a
    public void u0(int errorResId) {
        if (errorResId != 0) {
            Context contextRequireContext = requireContext();
            Intrinsics.i(contextRequireContext, "requireContext(...)");
            new Pj.j(contextRequireContext, errorResId, new Object[0]).g();
        }
    }

    @Override // En.h.a
    public void v(int from, int to2) {
        En.b bVar = this.shoppingListAdapter;
        Intrinsics.g(bVar);
        bVar.M(from, to2);
    }

    public final void z1(g0.c cVar) {
        Intrinsics.j(cVar, "<set-?>");
        this.newRelatedCouponListCallBack = cVar;
    }

    public ShoppingListAuthenticatedFragment() {
        AbstractC14147c<Intent> abstractC14147cRegisterForActivityResult = registerForActivityResult(new i(), new c());
        Intrinsics.i(abstractC14147cRegisterForActivityResult, "registerForActivityResult(...)");
        this.scannerResultLauncher = abstractC14147cRegisterForActivityResult;
    }

    private final boolean C1() {
        if (!B1() && !k1()) {
            return false;
        }
        return true;
    }

    private final boolean H0() {
        if (K0().f19909F.canScrollVertically(-1) || K0().f19909F.canScrollVertically(1)) {
            return true;
        }
        return false;
    }

    private final ShoppingListItemDialogFragment Y0() {
        Fragment fragmentFindFragmentByTag = getParentFragmentManager().findFragmentByTag("dialogItem");
        if (fragmentFindFragmentByTag != null) {
            return (ShoppingListItemDialogFragment) fragmentFindFragmentByTag;
        }
        return null;
    }

    private final LegacyShoppingListActivity Z0() {
        return (LegacyShoppingListActivity) getActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j1(C14145a result) {
        ArrayList parcelableArrayListExtra;
        if (result.getResultCode() == -1) {
            Intent data = result.getData();
            g0 g0Var = null;
            if (data != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelableArrayListExtra = data.getParcelableArrayListExtra("scanned_items", ProductFullDetails.class);
                } else {
                    parcelableArrayListExtra = data.getParcelableArrayListExtra("scanned_items");
                }
            } else {
                parcelableArrayListExtra = null;
            }
            this.scannedItemsToAdd = parcelableArrayListExtra;
            g0 g0Var2 = this.viewModel;
            if (g0Var2 == null) {
                Intrinsics.y("viewModel");
            } else {
                g0Var = g0Var2;
            }
            List<ProductFullDetails> listM = this.scannedItemsToAdd;
            if (listM == null) {
                listM = CollectionsKt.m();
            }
            g0Var.f2(listM);
        }
    }

    private final void l1() {
        if (!K0().f19904A.j()) {
            K0().f19904A.i();
        }
    }

    private final void w1() {
        if (C1()) {
            En.b bVar = this.shoppingListAdapter;
            Intrinsics.g(bVar);
            if (!bVar.L()) {
                En.b bVar2 = this.shoppingListAdapter;
                Intrinsics.g(bVar2);
                bVar2.x(this.emptyShoppingListView);
                return;
            } else {
                En.b bVar3 = this.shoppingListAdapter;
                Intrinsics.g(bVar3);
                bVar3.v();
                return;
            }
        }
        K0().f19909F.invalidate();
        En.b bVar4 = this.shoppingListAdapter;
        Intrinsics.g(bVar4);
        bVar4.x(this.emptyShoppingListView);
    }

    @Override // Gn.g0.a
    public void H() {
        LegacyShoppingListActivity legacyShoppingListActivityZ0 = Z0();
        Intrinsics.g(legacyShoppingListActivityZ0);
        if (legacyShoppingListActivityZ0.hasNetworkConnection()) {
            q qVar = q.f691a;
            Context contextRequireContext = requireContext();
            Intrinsics.i(contextRequireContext, "requireContext(...)");
            startActivity(qVar.a(contextRequireContext));
        }
    }

    @Override // tm.InterfaceC17123b
    public void R0(boolean isVisible, int textResourceId) {
        if (getActivity() instanceof InterfaceC17123b) {
            InterfaceC17123b interfaceC17123b = (InterfaceC17123b) getActivity();
            Intrinsics.g(interfaceC17123b);
            interfaceC17123b.R0(isVisible, textResourceId);
            K0().f19907D.X(false, false);
            return;
        }
        K0().f19907D.S(textResourceId, isVisible);
    }

    @Override // Gn.g0.a
    public void S0() {
        LegacyShoppingListActivity legacyShoppingListActivityZ0 = Z0();
        Intrinsics.g(legacyShoppingListActivityZ0);
        if (legacyShoppingListActivityZ0.hasNetworkConnection()) {
            o1(true);
        }
    }

    @Override // En.b.InterfaceC0130b
    public boolean b() {
        return L0().i();
    }

    @Override // Gn.g0.a
    public void n(int listingId) {
        startActivity(g.D(getFeatureEntryPoint(), listingId, 0, null, null, 14, null));
        LegacyShoppingListActivity legacyShoppingListActivityZ0 = Z0();
        if (legacyShoppingListActivityZ0 != null) {
            bk.c.b(legacyShoppingListActivityZ0, 0, d.f2593b, d.f2594c, 0, 8, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Deprecated
    public void onActivityCreated(Bundle savedInstanceState) {
        EditText editTextF1;
        super.onActivityCreated(savedInstanceState);
        setHasOptionsMenu(true);
        LegacyShoppingListActivity legacyShoppingListActivityZ0 = Z0();
        if (legacyShoppingListActivityZ0 != null && (editTextF1 = legacyShoppingListActivityZ0.F1()) != null) {
            editTextF1.addTextChangedListener(new b());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v8, types: [android.os.Parcelable] */
    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        f fVar;
        Ok.c cVar;
        Parcelable parcelable;
        Parcelable parcelable2;
        Parcelable parcelable3;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        WeeklyAdItem bVar = null;
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable3 = (Parcelable) arguments.getParcelable("com.meijer.intent.extra.SHOPPING_LIST_PRODUCT", f.class);
            } else {
                Parcelable parcelable4 = arguments.getParcelable("com.meijer.intent.extra.SHOPPING_LIST_PRODUCT");
                if (!(parcelable4 instanceof f)) {
                    parcelable4 = null;
                }
                parcelable3 = (f) parcelable4;
            }
            fVar = (f) parcelable3;
        } else {
            fVar = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = (Parcelable) arguments2.getParcelable("com.meijer.intent.extra.SHOPPING_LIST_COUPON", Ok.c.class);
            } else {
                Parcelable parcelable5 = arguments2.getParcelable("com.meijer.intent.extra.SHOPPING_LIST_COUPON");
                if (!(parcelable5 instanceof Ok.c)) {
                    parcelable5 = null;
                }
                parcelable2 = (Ok.c) parcelable5;
            }
            cVar = (Ok.c) parcelable2;
        } else {
            cVar = null;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments3.getParcelable("com.meijer.intent.extra.SHOPPING_LIST_AD", WeeklyAdItem.class);
            } else {
                ?? parcelable6 = arguments3.getParcelable("com.meijer.intent.extra.SHOPPING_LIST_AD");
                if (parcelable6 instanceof WeeklyAdItem) {
                    bVar = parcelable6;
                }
                parcelable = bVar;
            }
            bVar = (WeeklyAdItem) parcelable;
        }
        this.shoppingListTypeAheadItem = new u0(getAppBackgroundManager(), h1(), true, getStoreProvider().b());
        this.viewModel = new g0(getAppBackgroundManager(), getAnalyticsEngine(), getAppPrefManager(), fVar, cVar, bVar, i1(), T0(), O0(), X0());
        x4.i iVarRequireActivity = requireActivity();
        Intrinsics.h(iVarRequireActivity, "null cannot be cast to non-null type com.meijer.mobile.meijer.activity.shoppinglist.viewmodel.ShoppingListAuthenticatedViewModel.NewRelatedCouponListCallBack");
        z1((g0.c) iVarRequireActivity);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ShoppingListAddItemView shoppingListAddItemView = K0().f19904A;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.i(fragmentActivityRequireActivity, "requireActivity(...)");
        shoppingListAddItemView.f(fragmentActivityRequireActivity, true, getAnalyticsEngine());
        u0 u0Var = this.shoppingListTypeAheadItem;
        g0 g0Var = null;
        if (u0Var == null) {
            Intrinsics.y("shoppingListTypeAheadItem");
            u0Var = null;
        }
        u0Var.Q();
        g0 g0Var2 = this.viewModel;
        if (g0Var2 == null) {
            Intrinsics.y("viewModel");
        } else {
            g0Var = g0Var2;
        }
        g0Var.Q();
        l1();
        Ck.a.a(J0().b(C18067a.class, new Pu.g() { // from class: Fn.c
            @Override // Pu.g
            public final void accept(Object obj) {
                ShoppingListAuthenticatedFragment.v1(this.f10916a, (C18067a) obj);
            }
        }), this.disposables);
        x1(L0().i());
    }

    @Override // Gn.g0.a, com.meijer.mobile.meijer.activity.shoppinglist.view.ShoppingListAddItemView.a
    public void onScan() {
        if (getStoreProvider().d()) {
            AbstractC14147c<Intent> abstractC14147c = this.scannerResultLauncher;
            Context contextRequireContext = requireContext();
            Intrinsics.i(contextRequireContext, "requireContext(...)");
            abstractC14147c.a(Al.h.k(contextRequireContext, false, true, getFeatureManager().e(AbstractC18227f.L.f170551h)));
            return;
        }
        Context contextRequireContext2 = requireContext();
        Intrinsics.i(contextRequireContext2, "requireContext(...)");
        new Bl.a(contextRequireContext2).g();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        u0 u0Var = this.shoppingListTypeAheadItem;
        g0 g0Var = null;
        if (u0Var == null) {
            Intrinsics.y("shoppingListTypeAheadItem");
            u0Var = null;
        }
        u0Var.O(this);
        g0 g0Var2 = this.viewModel;
        if (g0Var2 == null) {
            Intrinsics.y("viewModel");
        } else {
            g0Var = g0Var2;
        }
        g0Var.O(this);
    }

    @Override // Gn.g0.a
    public void r(boolean itemDetailsEnabled) {
        LegacyShoppingListActivity legacyShoppingListActivityZ0 = Z0();
        Intrinsics.g(legacyShoppingListActivityZ0);
        legacyShoppingListActivityZ0.invalidateOptionsMenu();
        ShoppingListItemDialogFragment shoppingListItemDialogFragmentY0 = Y0();
        if (itemDetailsEnabled && shoppingListItemDialogFragmentY0 != null) {
            shoppingListItemDialogFragmentY0.dismiss();
        }
    }

    @Override // Gn.g0.a
    public void t() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(25646);
        }
    }

    @Override // Gn.g0.a
    public void x() {
        w1();
        LegacyShoppingListActivity legacyShoppingListActivityZ0 = Z0();
        if (legacyShoppingListActivityZ0 != null) {
            legacyShoppingListActivityZ0.invalidateOptionsMenu();
        }
    }

    @Override // Gn.g0.a
    public void x0() {
        int i10;
        if (!m1() && K0().f19908E.getTop() > 0) {
            if (!K0().f19904A.n() && H0()) {
                i10 = 21;
            } else {
                i10 = 0;
            }
            LegacyShoppingListActivity legacyShoppingListActivityZ0 = Z0();
            Intrinsics.g(legacyShoppingListActivityZ0);
            ViewGroup.LayoutParams layoutParams = legacyShoppingListActivityZ0.G1().getLayoutParams();
            Intrinsics.h(layoutParams, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
            AppBarLayout.e eVar = (AppBarLayout.e) layoutParams;
            if (i10 != eVar.c()) {
                eVar.g(i10);
                LegacyShoppingListActivity legacyShoppingListActivityZ02 = Z0();
                Intrinsics.g(legacyShoppingListActivityZ02);
                legacyShoppingListActivityZ02.G1().requestLayout();
            }
        }
    }

    public final void x1(boolean enabled) {
        n1(enabled);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.invalidateOptionsMenu();
        }
        if (enabled) {
            LegacyShoppingListActivity legacyShoppingListActivityZ0 = Z0();
            Intrinsics.g(legacyShoppingListActivityZ0);
            legacyShoppingListActivityZ0.E1().setVisibility(0);
            g0 g0Var = this.viewModel;
            if (g0Var == null) {
                Intrinsics.y("viewModel");
                g0Var = null;
            }
            g0Var.S();
        } else {
            LegacyShoppingListActivity legacyShoppingListActivityZ02 = Z0();
            Intrinsics.g(legacyShoppingListActivityZ02);
            legacyShoppingListActivityZ02.E1().setVisibility(8);
        }
        K0().f19904A.i();
    }
}
