package com.meijer.mobile.home.ux;

import Il.FulfillmentBarDecorator;
import Ki.LocalThemeScope;
import Kk.AppVersion;
import P0.e;
import Qk.a;
import Ul.ToastMessageData;
import V2.CreationExtras;
import Xl.a;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.view.C6173t;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import bk.AbstractC6392a;
import com.fullstory.FS;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.home.ux.HomeComposeActivity;
import com.meijer.mobile.home.ux.k0;
import com.meijer.mobile.meijer.activity.home.HomeFragment;
import cs.AbstractC13555a;
import dk.C13698b;
import ds.AbstractC13720b;
import e.C13736d;
import e.C13737e;
import es.AbstractC13870f;
import fm.AbstractC14019a;
import fm.AbstractC14020b;
import fm.AbstractC14021c;
import fm.AbstractC14028j;
import fm.AbstractC14029k;
import fs.AbstractC14072a;
import g.AbstractC14276c;
import g.C14274a;
import g.InterfaceC14275b;
import gi.C14375c;
import hi.InterfaceC14523a;
import hm.AbstractC14537b;
import ii.AbstractC14761h;
import ii.AbstractC14762i;
import ii.C14756c;
import ii.InterfaceC14754a;
import ii.TrackingData;
import j0.InterfaceC14882C;
import j0.InterfaceC14902f;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ki.C15158a0;
import ki.R0;
import ki.q1;
import km.C15245a0;
import km.C15255f0;
import km.L0;
import kotlin.C17957L0;
import kotlin.C17959M0;
import kotlin.C17987a1;
import kotlin.C17993c1;
import kotlin.C17995d0;
import kotlin.C17998e0;
import kotlin.C18029o1;
import kotlin.EnumC17961N0;
import kotlin.EnumC18001f0;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
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
import lm.C15521b;
import lm.C15523d;
import lm.C15526g;
import lm.C15528i;
import lm.C15530k;
import lm.C15533n;
import lm.C15538s;
import mi.C15726h;
import mv.C15809k;
import mv.E0;
import mv.InterfaceC15783O;
import org.xmlpull.v1.XmlPullParserException;
import p1.C16338g;
import ps.AbstractC16499C;
import ps.C16498B;
import ps.C16507K;
import ps.C16508L;
import ps.C16521g;
import ps.DrawerLayoutDecorator;
import ps.HeaderDecorator;
import pv.C16563h;
import sr.AbstractC17144a;
import ti.C17265b;
import tp.Builder;
import tp.C17278c;
import tp.EnumC17276a;
import tr.C17284b;
import uo.OrderOutOfStockItem;
import vm.C17693b;
import vo.OrderSubstitutionItem;
import wj.C17897b;
import xm.C18197h;
import xr.InterfaceC18214a;
import yo.C18335a;
import yo.MeijerUser;
import yr.C18370z;
import zl.AbstractC18503f;
import zl.C18499b;
import zs.C18546a;

@Metadata(d1 = {"\u0000\u0096\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u0094\u00022\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0095\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ1\u0010\u0012\u001a\u00020\b2\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\n\u0010\u000f\u001a\u00060\u000bj\u0002`\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J7\u0010\u001d\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b!\u0010\"J1\u0010'\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010\u000b2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u0010H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020)H\u0002¢\u0006\u0004\b*\u0010+J\u0019\u0010-\u001a\u00020\b2\b\u0010,\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b-\u0010.J!\u00100\u001a\u00020\b2\b\u0010,\u001a\u0004\u0018\u00010\u000b2\u0006\u0010/\u001a\u00020\u000bH\u0002¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\b2\u0006\u0010\u0015\u001a\u000202H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\b2\u0006\u0010\u0015\u001a\u000205H\u0002¢\u0006\u0004\b6\u00107J[\u0010C\u001a\u00020\b2\u0006\u00108\u001a\u00020\u000b2\u0006\u0010:\u001a\u0002092\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<0;2\u0006\u0010>\u001a\u00020\u00102\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u000b2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020A0;H\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020EH\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010J\u001a\u00020\b2\u0006\u0010I\u001a\u00020HH\u0002¢\u0006\u0004\bJ\u0010KJ\u0017\u0010N\u001a\u00020\b2\u0006\u0010M\u001a\u00020LH\u0002¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\bH\u0002¢\u0006\u0004\bP\u0010\u0005J\u000f\u0010Q\u001a\u00020\bH\u0002¢\u0006\u0004\bQ\u0010\u0005J\u000f\u0010R\u001a\u00020\bH\u0002¢\u0006\u0004\bR\u0010\u0005J)\u0010W\u001a\u00020\b2\u0006\u0010T\u001a\u00020S2\u0006\u0010U\u001a\u00020\u00102\b\b\u0002\u0010V\u001a\u00020\u0010H\u0002¢\u0006\u0004\bW\u0010XJ\u0017\u0010Y\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\bY\u0010\nJ\u0013\u0010Z\u001a\u00020\u000b*\u00020\u000bH\u0002¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020\bH\u0002¢\u0006\u0004\b\\\u0010\u0005J\u000f\u0010]\u001a\u00020\bH\u0002¢\u0006\u0004\b]\u0010\u0005J\u000f\u0010^\u001a\u00020\bH\u0002¢\u0006\u0004\b^\u0010\u0005J\u0017\u0010`\u001a\u00020\b2\u0006\u0010_\u001a\u00020\u0010H\u0002¢\u0006\u0004\b`\u0010aJ\u000f\u0010b\u001a\u00020\bH\u0003¢\u0006\u0004\bb\u0010\u0005J\u0019\u0010e\u001a\u00020\b2\b\u0010d\u001a\u0004\u0018\u00010cH\u0014¢\u0006\u0004\be\u0010fJ\u000f\u0010g\u001a\u00020\bH\u0014¢\u0006\u0004\bg\u0010\u0005J\u000f\u0010h\u001a\u00020\bH\u0014¢\u0006\u0004\bh\u0010\u0005J\u000f\u0010i\u001a\u00020\bH\u0014¢\u0006\u0004\bi\u0010\u0005J\u001f\u0010n\u001a\u00020\b2\u0006\u0010k\u001a\u00020j2\u0006\u0010m\u001a\u00020lH\u0016¢\u0006\u0004\bn\u0010oJ\u000f\u0010p\u001a\u00020\bH\u0016¢\u0006\u0004\bp\u0010\u0005J\u000f\u0010q\u001a\u00020\bH\u0016¢\u0006\u0004\bq\u0010\u0005J\u000f\u0010r\u001a\u00020\bH\u0016¢\u0006\u0004\br\u0010\u0005J\u000f\u0010s\u001a\u00020\bH\u0016¢\u0006\u0004\bs\u0010\u0005J\u000f\u0010t\u001a\u00020\bH\u0016¢\u0006\u0004\bt\u0010\u0005R\"\u0010|\u001a\u00020u8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R'\u0010\u0084\u0001\u001a\u00020}8\u0000@\u0000X\u0081.¢\u0006\u0016\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R*\u0010\u008c\u0001\u001a\u00030\u0085\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R*\u0010\u0094\u0001\u001a\u00030\u008d\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R*\u0010\u009c\u0001\u001a\u00030\u0095\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R*\u0010¤\u0001\u001a\u00030\u009d\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001R*\u0010¬\u0001\u001a\u00030¥\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¦\u0001\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R*\u0010´\u0001\u001a\u00030\u00ad\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001\"\u0006\b²\u0001\u0010³\u0001R*\u0010¼\u0001\u001a\u00030µ\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¶\u0001\u0010·\u0001\u001a\u0006\b¸\u0001\u0010¹\u0001\"\u0006\bº\u0001\u0010»\u0001R*\u0010Ä\u0001\u001a\u00030½\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¾\u0001\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0006\bÂ\u0001\u0010Ã\u0001R*\u0010Ì\u0001\u001a\u00030Å\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÆ\u0001\u0010Ç\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001\"\u0006\bÊ\u0001\u0010Ë\u0001R*\u0010Ô\u0001\u001a\u00030Í\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÎ\u0001\u0010Ï\u0001\u001a\u0006\bÐ\u0001\u0010Ñ\u0001\"\u0006\bÒ\u0001\u0010Ó\u0001R*\u0010Ü\u0001\u001a\u00030Õ\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\bÖ\u0001\u0010×\u0001\u001a\u0006\bØ\u0001\u0010Ù\u0001\"\u0006\bÚ\u0001\u0010Û\u0001R*\u0010ä\u0001\u001a\u00030Ý\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\bÞ\u0001\u0010ß\u0001\u001a\u0006\bà\u0001\u0010á\u0001\"\u0006\bâ\u0001\u0010ã\u0001R!\u0010ê\u0001\u001a\u00030å\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bæ\u0001\u0010ç\u0001\u001a\u0006\bè\u0001\u0010é\u0001R\u001c\u0010î\u0001\u001a\u0005\u0018\u00010ë\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bì\u0001\u0010í\u0001R\u001e\u0010ò\u0001\u001a\t\u0012\u0004\u0012\u00020\u000b0ï\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bð\u0001\u0010ñ\u0001R\u001f\u0010õ\u0001\u001a\n\u0012\u0005\u0012\u00030ó\u00010ï\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bô\u0001\u0010ñ\u0001R!\u0010÷\u0001\u001a\n\u0012\u0005\u0012\u00030ó\u00010ï\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bö\u0001\u0010ñ\u0001R\u001f\u0010ù\u0001\u001a\n\u0012\u0005\u0012\u00030ó\u00010ï\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bø\u0001\u0010ñ\u0001R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bú\u0001\u0010û\u0001R\u0019\u0010þ\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bü\u0001\u0010ý\u0001R!\u0010\u0083\u0002\u001a\u00030ÿ\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0080\u0002\u0010ç\u0001\u001a\u0006\b\u0081\u0002\u0010\u0082\u0002R!\u0010\u0088\u0002\u001a\u00030\u0084\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0085\u0002\u0010ç\u0001\u001a\u0006\b\u0086\u0002\u0010\u0087\u0002R!\u0010\u008d\u0002\u001a\u00030\u0089\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008a\u0002\u0010ç\u0001\u001a\u0006\b\u008b\u0002\u0010\u008c\u0002R\u0019\u0010\u008f\u0002\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0002\u0010ý\u0001R\u0018\u0010\u0093\u0002\u001a\u00030\u0090\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0091\u0002\u0010\u0092\u0002¨\u0006¤\u0002²\u0006\u000e\u0010\u0097\u0002\u001a\u00030\u0096\u00028\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0099\u0002\u001a\u00030\u0098\u00028\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u009b\u0002\u001a\u00030\u009a\u00028\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u009d\u0002\u001a\u00030\u009c\u00028\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u009f\u0002\u001a\u00030\u009e\u00028\nX\u008a\u0084\u0002²\u0006\u000e\u0010¡\u0002\u001a\u00030 \u00028\nX\u008a\u0084\u0002²\u0006\u000e\u0010£\u0002\u001a\u00030¢\u00028\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/home/ux/HomeComposeActivity;", "Landroidx/fragment/app/FragmentActivity;", "Ltp/c$a;", "LLr/d;", "<init>", "()V", "Lg/a;", "result", "", "p2", "(Lg/a;)V", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "Lcom/meijer/mobile/core/model/common/ExternalShopperId;", "externalShopperId", "", "shouldNavigate", "Q2", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Lcs/a;", "action", "G2", "(Lcs/a;)V", "uri", "carouselTitle", "Lii/h;", "previousTrackAction", "isFromSeeMoreItems", "I2", "(Ljava/lang/String;Ljava/lang/String;Lii/h;Z)V", "Lnk/f;", "productId", "v2", "(Lnk/f;Ljava/lang/String;)V", "deeplink", "analytics", "name", "isFromViewAll", "s2", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Lfm/j;", "B2", "(Lfm/j;)V", "url", "K2", "(Ljava/lang/String;)V", "campaignIdValue", "r2", "(Ljava/lang/String;Ljava/lang/String;)V", "Lsr/a;", "A2", "(Lsr/a;)V", "Les/f;", "F2", "(Les/f;)V", "orderNumber", "Lvo/b;", "substitutionScreenType", "", "Lvo/a;", "listSubstitutedItems", "isOnMyWayClicked", "orderType", "pickupPersonName", "Luo/a;", "listOutOfStockItems", "t2", "(Ljava/lang/String;Lvo/b;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Lfm/b;", "z2", "(Lfm/b;)V", "LXl/a;", "request", "D2", "(LXl/a;)V", "Lxr/a;", "chip", "x2", "(Lxr/a;)V", "L2", "n2", "H2", "", "points", "fromCloseButton", "isClaimPointsNowButton", "O2", "(IZZ)V", "q2", "V1", "(Ljava/lang/String;)Ljava/lang/String;", "N2", "openMeijerPlayStorePage", "checkForAppUpdate", "enabled", "updateNotificationPreference", "(Z)V", "requestNotificationPermission", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onDestroy", "onPause", "Ltp/b;", "builder", "Ltp/a;", "flowType", "onUpdateRateAndTip", "(Ltp/b;Ltp/a;)V", "onRateAppNow", "onRateAppRemindLater", "onRateAppNoThanksCurrentVersion", "onRateAppNoThanks", "onRateAppSendEmail", "LBl/g;", "v", "LBl/g;", "c2", "()LBl/g;", "setFeatureEntryPoint$ux_playstoreRelease", "(LBl/g;)V", "featureEntryPoint", "LDl/e;", "w", "LDl/e;", "g2", "()LDl/e;", "setMeijerIntent$ux_playstoreRelease", "(LDl/e;)V", "meijerIntent", "Lhi/a;", "x", "Lhi/a;", "a2", "()Lhi/a;", "setAnalyticsEngine$ux_playstoreRelease", "(Lhi/a;)V", "analyticsEngine", "Lzl/k;", "y", "Lzl/k;", "d2", "()Lzl/k;", "setFeatureManager$ux_playstoreRelease", "(Lzl/k;)V", "featureManager", "LTq/j;", "z", "LTq/j;", "l2", "()LTq/j;", "setStoreProvider$ux_playstoreRelease", "(LTq/j;)V", "storeProvider", "Lyo/k;", "A", "Lyo/k;", "getUserManager", "()Lyo/k;", "setUserManager", "(Lyo/k;)V", "userManager", "Lxm/h;", "B", "Lxm/h;", "getNotificationManager", "()Lxm/h;", "setNotificationManager", "(Lxm/h;)V", "notificationManager", "LKk/a;", "C", "LKk/a;", "b2", "()LKk/a;", "setAppVersion", "(LKk/a;)V", "appVersion", "Lvm/b;", "D", "Lvm/b;", "getAppBackgroundManager", "()Lvm/b;", "setAppBackgroundManager", "(Lvm/b;)V", "appBackgroundManager", "Lyo/a;", "E", "Lyo/a;", "getAppPrefManager", "()Lyo/a;", "setAppPrefManager", "(Lyo/a;)V", "appPrefManager", "Lzl/b;", "F", "Lzl/b;", "getAppUpdateConfigManager", "()Lzl/b;", "setAppUpdateConfigManager", "(Lzl/b;)V", "appUpdateConfigManager", "Ltp/c;", "G", "Ltp/c;", "k2", "()Ltp/c;", "setRateAndTipUpdater", "(Ltp/c;)V", "rateAndTipUpdater", "LGh/b;", "H", "LGh/b;", "f2", "()LGh/b;", "setInboxManager$ux_playstoreRelease", "(LGh/b;)V", "inboxManager", "LCh/d;", "I", "LCh/d;", "j2", "()LCh/d;", "setPreferencesRepository$ux_playstoreRelease", "(LCh/d;)V", "preferencesRepository", "Lps/g;", "J", "Lkotlin/Lazy;", "i2", "()Lps/g;", "navigationHelper", "Landroidx/appcompat/app/c;", "K", "Landroidx/appcompat/app/c;", "notificationDialog", "Lg/c;", "L", "Lg/c;", "requestPermissionLauncher", "Landroid/content/Intent;", "M", "mPerksRewardsResultLauncher", "N", "startForResult", "O", "substitutionResultLauncher", "P", "Ljava/lang/String;", "Q", "Z", "leavingHomeScreen", "Lps/L;", "R", "h2", "()Lps/L;", "navigationDrawerViewModel", "LIl/b;", "S", "getFulfillmentBarViewModel", "()LIl/b;", "fulfillmentBarViewModel", "Lcom/meijer/mobile/home/ux/k0;", "T", "e2", "()Lcom/meijer/mobile/home/ux/k0;", "homeViewModel", "U", "isShowingUpdatePrompt", "Lyo/c;", "m2", "()Lyo/c;", "user", "V", "a", "Lps/F;", "drawerHeader", "Lps/t;", "drawerDecorator", "Lcom/meijer/mobile/home/ux/k0$m;", "viewState", "LIl/a;", "fulfillmentBar", "Lcom/meijer/mobile/home/ux/k0$h;", "bottomSheetContentState", "Lcom/meijer/mobile/home/ux/k0$j;", "dialogState", "Lx0/c1;", "scaffoldState", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class HomeComposeActivity extends Hilt_HomeComposeActivity implements C17278c.a, Lr.d {

    /* renamed from: W, reason: collision with root package name */
    public static final int f98688W = 8;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    public yo.k userManager;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    public C18197h notificationManager;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public AppVersion appVersion;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    public C17693b appBackgroundManager;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    public C18335a appPrefManager;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    public C18499b appUpdateConfigManager;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    public C17278c rateAndTipUpdater;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    public Gh.b inboxManager;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    public Ch.d preferencesRepository;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private androidx.appcompat.app.c notificationDialog;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private AbstractC14276c<Intent> startForResult;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private String previousTrackAction;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private boolean leavingHomeScreen;

    /* renamed from: U, reason: collision with root package name and from kotlin metadata */
    private boolean isShowingUpdatePrompt;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public Bl.g featureEntryPoint;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public Dl.e meijerIntent;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public InterfaceC14523a analyticsEngine;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public zl.k featureManager;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public Tq.j storeProvider;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private final Lazy navigationHelper = LazyKt.b(new Function0() { // from class: com.meijer.mobile.home.ux.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HomeComposeActivity.w2(this.f98831a);
        }
    });

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<String> requestPermissionLauncher = registerForActivityResult(new h.h(), new InterfaceC14275b() { // from class: com.meijer.mobile.home.ux.c
        @Override // g.InterfaceC14275b
        public final void a(Object obj) {
            HomeComposeActivity.M2(this.f98832a, ((Boolean) obj).booleanValue());
        }
    });

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<Intent> mPerksRewardsResultLauncher = registerForActivityResult(new h.i(), new b());

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<Intent> substitutionResultLauncher = registerForActivityResult(new h.i(), new m());

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private final Lazy navigationDrawerViewModel = new androidx.view.e0(Reflection.b(C16508L.class), new e(this), new d(this), new f(null, this));

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final Lazy fulfillmentBarViewModel = new androidx.view.e0(Reflection.b(Il.b.class), new h(this), new g(this), new i(null, this));

    /* renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final Lazy homeViewModel = new androidx.view.e0(Reflection.b(k0.class), new k(this), new j(this), new l(null, this));

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
            return new FunctionReferenceImpl(1, HomeComposeActivity.this, HomeComposeActivity.class, "handleMPerksRewardsActivityResult", "handleMPerksRewardsActivityResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14275b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14274a p02) {
            Intrinsics.j(p02, "p0");
            HomeComposeActivity.this.p2(p02);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function2<Composer, Integer, Unit> {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeComposeActivity$onCreate$2$1$1", f = "HomeComposeActivity.kt", l = {357, 361}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f98717a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17959M0 f98718b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ z1<k0.AbstractC11774h> f98719c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f98718b, this.f98719c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(C17959M0 c17959m0, z1<? extends k0.AbstractC11774h> z1Var, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f98718b = c17959m0;
                this.f98719c = z1Var;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
            
                if (r5.l(r4) == r0) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
            
                if (r5.i(r4) == r0) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
            
                return r0;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r1 = r4.f98717a
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1b
                    if (r1 == r3) goto L17
                    if (r1 != r2) goto Lf
                    goto L17
                Lf:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L17:
                    kotlin.ResultKt.b(r5)
                    goto L46
                L1b:
                    kotlin.ResultKt.b(r5)
                    androidx.compose.runtime.z1<com.meijer.mobile.home.ux.k0$h> r5 = r4.f98719c
                    com.meijer.mobile.home.ux.k0$h r5 = com.meijer.mobile.home.ux.HomeComposeActivity.c.f(r5)
                    boolean r1 = r5 instanceof com.meijer.mobile.home.ux.k0.AbstractC11774h.MperksPointsExpiryBottomSheet
                    if (r1 == 0) goto L33
                    x0.M0 r5 = r4.f98718b
                    r4.f98717a = r3
                    java.lang.Object r5 = r5.l(r4)
                    if (r5 != r0) goto L46
                    goto L45
                L33:
                    com.meijer.mobile.home.ux.k0$h$b r1 = com.meijer.mobile.home.ux.k0.AbstractC11774h.b.f99060a
                    boolean r5 = kotlin.jvm.internal.Intrinsics.e(r5, r1)
                    if (r5 == 0) goto L49
                    x0.M0 r5 = r4.f98718b
                    r4.f98717a = r2
                    java.lang.Object r5 = r5.i(r4)
                    if (r5 != r0) goto L46
                L45:
                    return r0
                L46:
                    kotlin.Unit r5 = kotlin.Unit.f143329a
                    return r5
                L49:
                    kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                    r5.<init>()
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.home.ux.HomeComposeActivity.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeComposeActivity$onCreate$2$2$1", f = "HomeComposeActivity.kt", l = {}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f98720a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17959M0 f98721b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ HomeComposeActivity f98722c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ z1<k0.AbstractC11774h> f98723d;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f98721b, this.f98722c, this.f98723d, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(C17959M0 c17959m0, HomeComposeActivity homeComposeActivity, z1<? extends k0.AbstractC11774h> z1Var, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f98721b = c17959m0;
                this.f98722c = homeComposeActivity;
                this.f98723d = z1Var;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f98720a == 0) {
                    ResultKt.b(obj);
                    if (!this.f98721b.k() && !(c.t(this.f98723d) instanceof k0.AbstractC11774h.b)) {
                        this.f98722c.e2().I0(k0.AbstractC11778l.b.f99149a);
                    }
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.home.ux.HomeComposeActivity$c$c, reason: collision with other inner class name */
        static final class C1398c implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C17959M0 f98724a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ HomeComposeActivity f98725b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ z1<k0.AbstractC11774h> f98726c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<C17993c1> f98727d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ z1<k0.ViewState> f98728e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ z1<FulfillmentBarDecorator> f98729f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ z1<HeaderDecorator> f98730g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ z1<DrawerLayoutDecorator> f98731h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ A0.g f98732i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ z1<k0.AbstractC11776j> f98733j;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.home.ux.HomeComposeActivity$c$c$a */
            static final class a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ z1<k0.AbstractC11774h> f98734a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f98735b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ HomeComposeActivity f98736c;

                /* JADX WARN: Multi-variable type inference failed */
                a(z1<? extends k0.AbstractC11774h> z1Var, LocalThemeScope localThemeScope, HomeComposeActivity homeComposeActivity) {
                    this.f98734a = z1Var;
                    this.f98735b = localThemeScope;
                    this.f98736c = homeComposeActivity;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit e(HomeComposeActivity homeComposeActivity, k0.AbstractC11774h abstractC11774h, boolean z10) {
                    HomeComposeActivity.P2(homeComposeActivity, ((k0.AbstractC11774h.MperksPointsExpiryBottomSheet) abstractC11774h).getExpiringPoints(), z10, false, 4, null);
                    return Unit.f143329a;
                }

                public final void c(InterfaceC14902f AcresBottomSheet, Composer composer, int i10) {
                    Composer composer2;
                    Intrinsics.j(AcresBottomSheet, "$this$AcresBottomSheet");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-482324377, i10, -1, "com.meijer.mobile.home.ux.HomeComposeActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (HomeComposeActivity.kt:380)");
                    }
                    final k0.AbstractC11774h abstractC11774hT = c.t(this.f98734a);
                    LocalThemeScope localThemeScope = this.f98735b;
                    final HomeComposeActivity homeComposeActivity = this.f98736c;
                    composer.startReplaceGroup(342746875);
                    if (abstractC11774hT instanceof k0.AbstractC11774h.MperksPointsExpiryBottomSheet) {
                        Modifier modifierK = androidx.compose.foundation.layout.D.k(Modifier.INSTANCE, 0.0f, localThemeScope.getAdsSpacing().getFive().getDp(), 1, null);
                        k0.AbstractC11774h.MperksPointsExpiryBottomSheet aVar = (k0.AbstractC11774h.MperksPointsExpiryBottomSheet) abstractC11774hT;
                        int iC = aVar.getExpiringPoints();
                        AbstractC6392a abstractC6392aB = aVar.getExpirationDate();
                        AbstractC6392a abstractC6392aA = aVar.getDaysLeftForPointsToExpire();
                        composer.startReplaceGroup(-1633490746);
                        boolean zD = composer.D(homeComposeActivity) | composer.V(abstractC11774hT);
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.home.ux.D
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return HomeComposeActivity.c.C1398c.a.d(homeComposeActivity, abstractC11774hT);
                                }
                            };
                            composer.t(objB);
                        }
                        Function0 function0 = (Function0) objB;
                        composer.P();
                        composer.startReplaceGroup(-1633490746);
                        boolean zD2 = composer.D(homeComposeActivity) | composer.V(abstractC11774hT);
                        Object objB2 = composer.B();
                        if (zD2 || objB2 == Composer.INSTANCE.a()) {
                            objB2 = new Function1() { // from class: com.meijer.mobile.home.ux.E
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return HomeComposeActivity.c.C1398c.a.e(homeComposeActivity, abstractC11774hT, ((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB2);
                        }
                        composer.P();
                        int i11 = LocalThemeScope.f17314g;
                        int i12 = AbstractC6392a.f60445b;
                        composer2 = composer;
                        os.n0.g(localThemeScope, iC, abstractC6392aB, abstractC6392aA, modifierK, null, function0, (Function1) objB2, composer2, i11 | (i12 << 6) | (i12 << 9), 16);
                    } else {
                        composer2 = composer;
                        if (!Intrinsics.e(abstractC11774hT, k0.AbstractC11774h.b.f99060a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    composer2.P();
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
                    c(interfaceC14902f, composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit d(HomeComposeActivity homeComposeActivity, k0.AbstractC11774h abstractC11774h) {
                    homeComposeActivity.H2();
                    homeComposeActivity.O2(((k0.AbstractC11774h.MperksPointsExpiryBottomSheet) abstractC11774h).getExpiringPoints(), false, true);
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.home.ux.HomeComposeActivity$c$c$b */
            static final class b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<C17993c1> f98737a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f98738b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ HomeComposeActivity f98739c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ z1<k0.ViewState> f98740d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ z1<FulfillmentBarDecorator> f98741e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ z1<HeaderDecorator> f98742f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ z1<DrawerLayoutDecorator> f98743g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ A0.g f98744h;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.home.ux.HomeComposeActivity$c$c$b$a */
                static final class a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f98745a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ HomeComposeActivity f98746b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ z1<k0.ViewState> f98747c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ z1<FulfillmentBarDecorator> f98748d;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.meijer.mobile.home.ux.HomeComposeActivity$c$c$b$a$a, reason: collision with other inner class name */
                    /* synthetic */ class C1399a extends FunctionReferenceImpl implements Function1<Xl.a, Unit> {
                        C1399a(Object obj) {
                            super(1, obj, HomeComposeActivity.class, "onNavigationRequest", "onNavigationRequest(Lcom/meijer/mobile/home/models/navigation/HomeNavigationRequest;)V", 0);
                        }

                        public final void a(Xl.a p02) {
                            Intrinsics.j(p02, "p0");
                            ((HomeComposeActivity) this.receiver).D2(p02);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Xl.a aVar) {
                            a(aVar);
                            return Unit.f143329a;
                        }
                    }

                    a(LocalThemeScope localThemeScope, HomeComposeActivity homeComposeActivity, z1<k0.ViewState> z1Var, z1<FulfillmentBarDecorator> z1Var2) {
                        this.f98745a = localThemeScope;
                        this.f98746b = homeComposeActivity;
                        this.f98747c = z1Var;
                        this.f98748d = z1Var2;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(172799537, i10, -1, "com.meijer.mobile.home.ux.HomeComposeActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeComposeActivity.kt:418)");
                        }
                        LocalThemeScope localThemeScope = this.f98745a;
                        AbstractC6392a abstractC6392aL = c.r(this.f98747c).getGreeting();
                        int i11 = AbstractC6392a.f60445b;
                        String strA = C13698b.a(abstractC6392aL, composer, i11);
                        int iC = c.r(this.f98747c).getCartItemCount();
                        FulfillmentBarDecorator fulfillmentBarDecoratorS = c.s(this.f98748d);
                        AbstractC6392a abstractC6392aD = AbstractC6392a.INSTANCE.d(ps.j0.f157327d, new Object[0]);
                        AppVersion appVersionB2 = this.f98746b.b2();
                        HomeComposeActivity homeComposeActivity = this.f98746b;
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(homeComposeActivity);
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new C1399a(homeComposeActivity);
                            composer.t(objB);
                        }
                        composer.P();
                        L0.j(localThemeScope, null, strA, iC, fulfillmentBarDecoratorS, abstractC6392aD, appVersionB2, (Function1) ((KFunction) objB), composer, LocalThemeScope.f17314g | (FulfillmentBarDecorator.f14849m << 12) | (i11 << 15), 1);
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
                /* renamed from: com.meijer.mobile.home.ux.HomeComposeActivity$c$c$b$b, reason: collision with other inner class name */
                static final class C1400b implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f98749a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ HomeComposeActivity f98750b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ z1<k0.ViewState> f98751c;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.meijer.mobile.home.ux.HomeComposeActivity$c$c$b$b$a */
                    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Xl.a, Unit> {
                        a(Object obj) {
                            super(1, obj, HomeComposeActivity.class, "onNavigationRequest", "onNavigationRequest(Lcom/meijer/mobile/home/models/navigation/HomeNavigationRequest;)V", 0);
                        }

                        public final void a(Xl.a p02) {
                            Intrinsics.j(p02, "p0");
                            ((HomeComposeActivity) this.receiver).D2(p02);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Xl.a aVar) {
                            a(aVar);
                            return Unit.f143329a;
                        }
                    }

                    C1400b(LocalThemeScope localThemeScope, HomeComposeActivity homeComposeActivity, z1<k0.ViewState> z1Var) {
                        this.f98749a = localThemeScope;
                        this.f98750b = homeComposeActivity;
                        this.f98751c = z1Var;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1373940880, i10, -1, "com.meijer.mobile.home.ux.HomeComposeActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeComposeActivity.kt:438)");
                        }
                        if (!c.r(this.f98751c).getUser().getIsLoggedIn()) {
                            LocalThemeScope localThemeScope = this.f98749a;
                            HomeComposeActivity homeComposeActivity = this.f98750b;
                            composer.startReplaceGroup(5004770);
                            boolean zD = composer.D(homeComposeActivity);
                            Object objB = composer.B();
                            if (zD || objB == Composer.INSTANCE.a()) {
                                objB = new a(homeComposeActivity);
                                composer.t(objB);
                            }
                            composer.P();
                            C15245a0.b(localThemeScope, null, (Function1) ((KFunction) objB), composer, LocalThemeScope.f17314g, 1);
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
                /* renamed from: com.meijer.mobile.home.ux.HomeComposeActivity$c$c$b$c, reason: collision with other inner class name */
                static final class C1401c implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ HomeComposeActivity f98752a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f98753b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ z1<HeaderDecorator> f98754c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ z1<DrawerLayoutDecorator> f98755d;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.meijer.mobile.home.ux.HomeComposeActivity$c$c$b$c$a */
                    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<AbstractC16499C, Unit> {
                        a(Object obj) {
                            super(1, obj, C16521g.class, "onNavigationRequest", "onNavigationRequest(Lcom/meijer/mobile/ui/navigation/DrawerNavigationRequest;)V", 0);
                        }

                        public final void a(AbstractC16499C p02) {
                            Intrinsics.j(p02, "p0");
                            ((C16521g) this.receiver).h(p02);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(AbstractC16499C abstractC16499C) {
                            a(abstractC16499C);
                            return Unit.f143329a;
                        }
                    }

                    C1401c(HomeComposeActivity homeComposeActivity, LocalThemeScope localThemeScope, z1<HeaderDecorator> z1Var, z1<DrawerLayoutDecorator> z1Var2) {
                        this.f98752a = homeComposeActivity;
                        this.f98753b = localThemeScope;
                        this.f98754c = z1Var;
                        this.f98755d = z1Var2;
                    }

                    public final void a(InterfaceC14902f Scaffold, Composer composer, int i10) throws XmlPullParserException, Resources.NotFoundException {
                        Intrinsics.j(Scaffold, "$this$Scaffold");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1415598811, i10, -1, "com.meijer.mobile.home.ux.HomeComposeActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeComposeActivity.kt:430)");
                        }
                        HeaderDecorator headerDecoratorO = c.o(this.f98754c);
                        DrawerLayoutDecorator drawerLayoutDecoratorP = c.p(this.f98755d);
                        C16521g c16521gI2 = this.f98752a.i2();
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(c16521gI2);
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new a(c16521gI2);
                            composer.t(objB);
                        }
                        composer.P();
                        AppVersion appVersionB2 = this.f98752a.b2();
                        C16498B.h(this.f98753b, headerDecoratorO, drawerLayoutDecoratorP, appVersionB2, null, (Function1) ((KFunction) objB), composer, LocalThemeScope.f17314g | (HeaderDecorator.f157113i << 3) | (DrawerLayoutDecorator.f157377h << 6), 8);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) throws XmlPullParserException, Resources.NotFoundException {
                        a(interfaceC14902f, composer, num.intValue());
                        return Unit.f143329a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.home.ux.HomeComposeActivity$c$c$b$d */
                static final class d implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ A0.g f98756a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ HomeComposeActivity f98757b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f98758c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ z1<k0.ViewState> f98759d;

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.meijer.mobile.home.ux.HomeComposeActivity$c$c$b$d$a */
                    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<AbstractC17144a, Unit> {
                        a(Object obj) {
                            super(1, obj, HomeComposeActivity.class, "onGoogleAdViewActions", "onGoogleAdViewActions(Lcom/meijer/mobile/ui/advertising/GoogleAdViewAction;)V", 0);
                        }

                        public final void a(AbstractC17144a p02) {
                            Intrinsics.j(p02, "p0");
                            ((HomeComposeActivity) this.receiver).A2(p02);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(AbstractC17144a abstractC17144a) {
                            a(abstractC17144a);
                            return Unit.f143329a;
                        }
                    }

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.meijer.mobile.home.ux.HomeComposeActivity$c$c$b$d$b, reason: collision with other inner class name */
                    /* synthetic */ class C1402b extends FunctionReferenceImpl implements Function1<AbstractC14028j, Unit> {
                        C1402b(Object obj) {
                            super(1, obj, HomeComposeActivity.class, "onMarketingBannerAction", "onMarketingBannerAction(Lcom/meijer/mobile/home/ux/actions/MarketingBannerAction;)V", 0);
                        }

                        public final void a(AbstractC14028j p02) {
                            Intrinsics.j(p02, "p0");
                            ((HomeComposeActivity) this.receiver).B2(p02);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(AbstractC14028j abstractC14028j) {
                            a(abstractC14028j);
                            return Unit.f143329a;
                        }
                    }

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.meijer.mobile.home.ux.HomeComposeActivity$c$c$b$d$c, reason: collision with other inner class name */
                    /* synthetic */ class C1403c extends FunctionReferenceImpl implements Function1<AbstractC14020b, Unit> {
                        C1403c(Object obj) {
                            super(1, obj, HomeComposeActivity.class, "onFeatureEntryPointAction", "onFeatureEntryPointAction(Lcom/meijer/mobile/home/ux/actions/FeatureEntryPointAction;)V", 0);
                        }

                        public final void a(AbstractC14020b p02) {
                            Intrinsics.j(p02, "p0");
                            ((HomeComposeActivity) this.receiver).z2(p02);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(AbstractC14020b abstractC14020b) {
                            a(abstractC14020b);
                            return Unit.f143329a;
                        }
                    }

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.meijer.mobile.home.ux.HomeComposeActivity$c$c$b$d$d, reason: collision with other inner class name */
                    /* synthetic */ class C1404d extends FunctionReferenceImpl implements Function1<AbstractC13555a, Unit> {
                        C1404d(Object obj) {
                            super(1, obj, HomeComposeActivity.class, "onProductCarouselAction", "onProductCarouselAction(Lcom/meijer/mobile/ui/homescreen/carousel/action/ProductCarouselAction;)V", 0);
                        }

                        public final void a(AbstractC13555a p02) {
                            Intrinsics.j(p02, "p0");
                            ((HomeComposeActivity) this.receiver).G2(p02);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(AbstractC13555a abstractC13555a) {
                            a(abstractC13555a);
                            return Unit.f143329a;
                        }
                    }

                    d(A0.g gVar, HomeComposeActivity homeComposeActivity, LocalThemeScope localThemeScope, z1<k0.ViewState> z1Var) {
                        this.f98756a = gVar;
                        this.f98757b = homeComposeActivity;
                        this.f98758c = localThemeScope;
                        this.f98759d = z1Var;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit o(HomeComposeActivity homeComposeActivity, AbstractC14029k it) {
                        Intrinsics.j(it, "it");
                        homeComposeActivity.e2().onAction(it);
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit p(HomeComposeActivity homeComposeActivity, Qk.a it) {
                        Intrinsics.j(it, "it");
                        homeComposeActivity.e2().onAction(it);
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit q(HomeComposeActivity homeComposeActivity, AbstractC14021c it) {
                        Intrinsics.j(it, "it");
                        homeComposeActivity.e2().onAction(it);
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit r(HomeComposeActivity homeComposeActivity, AbstractC14019a it) {
                        Intrinsics.j(it, "it");
                        homeComposeActivity.e2().onAction(it);
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit s(HomeComposeActivity homeComposeActivity, AbstractC14072a it) {
                        Intrinsics.j(it, "it");
                        homeComposeActivity.e2().onAction(it);
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit t(HomeComposeActivity homeComposeActivity, InterfaceC18214a it) {
                        Intrinsics.j(it, "it");
                        homeComposeActivity.x2(it);
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit u(HomeComposeActivity homeComposeActivity, AbstractC13870f it) {
                        Intrinsics.j(it, "it");
                        homeComposeActivity.F2(it);
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit v(HomeComposeActivity homeComposeActivity, AbstractC13720b it) {
                        Intrinsics.j(it, "it");
                        homeComposeActivity.e2().onAction(it);
                        return Unit.f143329a;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
                        l(interfaceC14882C, composer, num.intValue());
                        return Unit.f143329a;
                    }

                    public final void l(InterfaceC14882C paddingValues, Composer composer, int i10) {
                        int i11;
                        Intrinsics.j(paddingValues, "paddingValues");
                        if ((i10 & 6) == 0) {
                            i11 = i10 | (composer.V(paddingValues) ? 4 : 2);
                        } else {
                            i11 = i10;
                        }
                        if ((i11 & 19) == 18 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-2015205992, i11, -1, "com.meijer.mobile.home.ux.HomeComposeActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeComposeActivity.kt:443)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierH = androidx.compose.foundation.layout.D.h(androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null), paddingValues);
                        A0.g gVar = this.f98756a;
                        final HomeComposeActivity homeComposeActivity = this.f98757b;
                        LocalThemeScope localThemeScope = this.f98758c;
                        z1<k0.ViewState> z1Var = this.f98759d;
                        e.Companion companion2 = P0.e.INSTANCE;
                        MeasurePolicy measurePolicyG = C5804h.g(companion2.o(), false);
                        int iA = C5859f.a(composer, 0);
                        InterfaceC5884s interfaceC5884sR = composer.r();
                        Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
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
                        D1.c(composerA, measurePolicyG, companion3.e());
                        D1.c(composerA, interfaceC5884sR, companion3.g());
                        Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        D1.c(composerA, modifierE, companion3.f());
                        C5806j c5806j = C5806j.f48836a;
                        Modifier modifierD = A0.e.d(androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null), gVar, false, 2, null);
                        boolean zE = homeComposeActivity.d2().e(AbstractC18503f.J.f172849h);
                        k0.ViewState c11779mR = c.r(z1Var);
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(homeComposeActivity);
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new a(homeComposeActivity);
                            composer.t(objB);
                        }
                        KFunction kFunction = (KFunction) objB;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD2 = composer.D(homeComposeActivity);
                        Object objB2 = composer.B();
                        if (zD2 || objB2 == Composer.INSTANCE.a()) {
                            objB2 = new C1402b(homeComposeActivity);
                            composer.t(objB2);
                        }
                        KFunction kFunction2 = (KFunction) objB2;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD3 = composer.D(homeComposeActivity);
                        Object objB3 = composer.B();
                        if (zD3 || objB3 == Composer.INSTANCE.a()) {
                            objB3 = new C1403c(homeComposeActivity);
                            composer.t(objB3);
                        }
                        KFunction kFunction3 = (KFunction) objB3;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD4 = composer.D(homeComposeActivity);
                        Object objB4 = composer.B();
                        if (zD4 || objB4 == Composer.INSTANCE.a()) {
                            objB4 = new C1404d(homeComposeActivity);
                            composer.t(objB4);
                        }
                        KFunction kFunction4 = (KFunction) objB4;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD5 = composer.D(homeComposeActivity);
                        Object objB5 = composer.B();
                        if (zD5 || objB5 == Composer.INSTANCE.a()) {
                            objB5 = new Function1() { // from class: com.meijer.mobile.home.ux.F
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return HomeComposeActivity.c.C1398c.b.d.t(homeComposeActivity, (InterfaceC18214a) obj);
                                }
                            };
                            composer.t(objB5);
                        }
                        Function1 function1 = (Function1) objB5;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD6 = composer.D(homeComposeActivity);
                        Object objB6 = composer.B();
                        if (zD6 || objB6 == Composer.INSTANCE.a()) {
                            objB6 = new Function1() { // from class: com.meijer.mobile.home.ux.G
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return HomeComposeActivity.c.C1398c.b.d.u(homeComposeActivity, (AbstractC13870f) obj);
                                }
                            };
                            composer.t(objB6);
                        }
                        Function1 function12 = (Function1) objB6;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD7 = composer.D(homeComposeActivity);
                        Object objB7 = composer.B();
                        if (zD7 || objB7 == Composer.INSTANCE.a()) {
                            objB7 = new Function1() { // from class: com.meijer.mobile.home.ux.H
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return HomeComposeActivity.c.C1398c.b.d.v(homeComposeActivity, (AbstractC13720b) obj);
                                }
                            };
                            composer.t(objB7);
                        }
                        Function1 function13 = (Function1) objB7;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD8 = composer.D(homeComposeActivity);
                        Object objB8 = composer.B();
                        if (zD8 || objB8 == Composer.INSTANCE.a()) {
                            objB8 = new Function1() { // from class: com.meijer.mobile.home.ux.I
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return HomeComposeActivity.c.C1398c.b.d.o(homeComposeActivity, (AbstractC14029k) obj);
                                }
                            };
                            composer.t(objB8);
                        }
                        Function1 function14 = (Function1) objB8;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD9 = composer.D(homeComposeActivity);
                        Object objB9 = composer.B();
                        if (zD9 || objB9 == Composer.INSTANCE.a()) {
                            objB9 = new Function1() { // from class: com.meijer.mobile.home.ux.J
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return HomeComposeActivity.c.C1398c.b.d.p(homeComposeActivity, (Qk.a) obj);
                                }
                            };
                            composer.t(objB9);
                        }
                        Function1 function15 = (Function1) objB9;
                        composer.P();
                        Function1 function16 = (Function1) kFunction;
                        Function1 function17 = (Function1) kFunction2;
                        Function1 function18 = (Function1) kFunction3;
                        composer.startReplaceGroup(5004770);
                        boolean zD10 = composer.D(homeComposeActivity);
                        Object objB10 = composer.B();
                        if (zD10 || objB10 == Composer.INSTANCE.a()) {
                            objB10 = new Function1() { // from class: com.meijer.mobile.home.ux.K
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return HomeComposeActivity.c.C1398c.b.d.q(homeComposeActivity, (AbstractC14021c) obj);
                                }
                            };
                            composer.t(objB10);
                        }
                        Function1 function19 = (Function1) objB10;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD11 = composer.D(homeComposeActivity);
                        Object objB11 = composer.B();
                        if (zD11 || objB11 == Composer.INSTANCE.a()) {
                            objB11 = new Function1() { // from class: com.meijer.mobile.home.ux.L
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return HomeComposeActivity.c.C1398c.b.d.r(homeComposeActivity, (AbstractC14019a) obj);
                                }
                            };
                            composer.t(objB11);
                        }
                        Function1 function110 = (Function1) objB11;
                        composer.P();
                        Function1 function111 = (Function1) kFunction4;
                        composer.startReplaceGroup(5004770);
                        boolean zD12 = composer.D(homeComposeActivity);
                        Object objB12 = composer.B();
                        if (zD12 || objB12 == Composer.INSTANCE.a()) {
                            objB12 = new Function1() { // from class: com.meijer.mobile.home.ux.M
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return HomeComposeActivity.c.C1398c.b.d.s(homeComposeActivity, (AbstractC14072a) obj);
                                }
                            };
                            composer.t(objB12);
                        }
                        composer.P();
                        C15255f0.d(localThemeScope, c11779mR, zE, modifierD, function1, function12, function13, function14, function15, function16, function17, function18, function19, function110, function111, (Function1) objB12, composer, LocalThemeScope.f17314g, 0, 0);
                        A0.c.d(c.r(z1Var).getIsRefreshing(), gVar, c5806j.g(companion, companion2.m()), 0L, 0L, false, composer, A0.g.f55j << 3, 56);
                        composer.v();
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }
                }

                b(InterfaceC5872l0<C17993c1> interfaceC5872l0, LocalThemeScope localThemeScope, HomeComposeActivity homeComposeActivity, z1<k0.ViewState> z1Var, z1<FulfillmentBarDecorator> z1Var2, z1<HeaderDecorator> z1Var3, z1<DrawerLayoutDecorator> z1Var4, A0.g gVar) {
                    this.f98737a = interfaceC5872l0;
                    this.f98738b = localThemeScope;
                    this.f98739c = homeComposeActivity;
                    this.f98740d = z1Var;
                    this.f98741e = z1Var2;
                    this.f98742f = z1Var3;
                    this.f98743g = z1Var4;
                    this.f98744h = gVar;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-878822634, i10, -1, "com.meijer.mobile.home.ux.HomeComposeActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (HomeComposeActivity.kt:412)");
                    }
                    C17987a1.a(C18370z.b(FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), true), c.v(this.f98737a), ComposableLambdaKt.c(172799537, true, new a(this.f98738b, this.f98739c, this.f98740d, this.f98741e), composer, 54), ComposableLambdaKt.c(1373940880, true, new C1400b(this.f98738b, this.f98739c, this.f98740d), composer, 54), null, null, 0, false, ComposableLambdaKt.c(1415598811, true, new C1401c(this.f98739c, this.f98738b, this.f98742f, this.f98743g), composer, 54), false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(-2015205992, true, new d(this.f98744h, this.f98739c, this.f98738b, this.f98740d), composer, 54), composer, 100666752, 12582912, 130800);
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

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeComposeActivity$onCreate$2$3$3$1", f = "HomeComposeActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.home.ux.HomeComposeActivity$c$c$c, reason: collision with other inner class name */
            static final class C1405c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f98760a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ HomeComposeActivity f98761b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f98762c;

                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/home/ux/k0$k;", "effect", "", "<anonymous>", "(Lcom/meijer/mobile/home/ux/k0$k;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeComposeActivity$onCreate$2$3$3$1$1", f = "HomeComposeActivity.kt", l = {534, 534, 541, 541, 570, 570, 587, 587}, m = "invokeSuspend")
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.home.ux.HomeComposeActivity$c$c$c$a */
                static final class a extends SuspendLambda implements Function2<k0.AbstractC11777k, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f98763a;

                    /* renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f98764b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ HomeComposeActivity f98765c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f98766d;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        a aVar = new a(this.f98765c, this.f98766d, continuation);
                        aVar.f98764b = obj;
                        return aVar;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(k0.AbstractC11777k abstractC11777k, Continuation<? super Unit> continuation) {
                        return ((a) create(abstractC11777k, continuation)).invokeSuspend(Unit.f143329a);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    a(HomeComposeActivity homeComposeActivity, LocalThemeScope localThemeScope, Continuation<? super a> continuation) {
                        super(2, continuation);
                        this.f98765c = homeComposeActivity;
                        this.f98766d = localThemeScope;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:45:0x0193, code lost:
                    
                        if (Hi.i.i((Hi.i) r2, r3, null, null, false, r5, null, null, null, r17, 238, null) != r12) goto L81;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:68:0x0263, code lost:
                    
                        if (Hi.i.i((Hi.i) r2, r3, null, r3, false, r5, null, null, null, r17, 234, null) != r12) goto L81;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:79:0x02c0, code lost:
                    
                        if (Hi.i.i((Hi.i) r2, r3, null, r3, false, r5, null, null, null, r17, 234, null) != r12) goto L81;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:55:0x01ea  */
                    /* JADX WARN: Removed duplicated region for block: B:58:0x01f3  */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
                        /*
                            Method dump skipped, instructions count: 738
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.home.ux.HomeComposeActivity.c.C1398c.C1405c.a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final boolean k(HomeComposeActivity homeComposeActivity) {
                        homeComposeActivity.startActivity(homeComposeActivity.c2().d());
                        return true;
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1405c(this.f98761b, this.f98762c, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1405c(HomeComposeActivity homeComposeActivity, LocalThemeScope localThemeScope, Continuation<? super C1405c> continuation) {
                    super(2, continuation);
                    this.f98761b = homeComposeActivity;
                    this.f98762c = localThemeScope;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((C1405c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f98760a == 0) {
                        ResultKt.b(obj);
                        C16563h.J(C16563h.O(this.f98761b.e2().B0(), new a(this.f98761b, this.f98762c, null)), C6173t.a(this.f98761b));
                        return Unit.f143329a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeComposeActivity$onCreate$2$3$4$1", f = "HomeComposeActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.home.ux.HomeComposeActivity$c$c$d */
            static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f98767a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ HomeComposeActivity f98768b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f98769c;

                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LUl/e;", "toastData", "", "<anonymous>", "(LUl/e;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeComposeActivity$onCreate$2$3$4$1$1", f = "HomeComposeActivity.kt", l = {602, 602}, m = "invokeSuspend")
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.home.ux.HomeComposeActivity$c$c$d$a */
                static final class a extends SuspendLambda implements Function2<ToastMessageData, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    Object f98770a;

                    /* renamed from: b, reason: collision with root package name */
                    int f98771b;

                    /* renamed from: c, reason: collision with root package name */
                    int f98772c;

                    /* renamed from: d, reason: collision with root package name */
                    /* synthetic */ Object f98773d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f98774e;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        a aVar = new a(this.f98774e, continuation);
                        aVar.f98773d = obj;
                        return aVar;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    a(LocalThemeScope localThemeScope, Continuation<? super a> continuation) {
                        super(2, continuation);
                        this.f98774e = localThemeScope;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(ToastMessageData toastMessageData, Continuation<? super Unit> continuation) {
                        return ((a) create(toastMessageData, continuation)).invokeSuspend(Unit.f143329a);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:15:0x0089, code lost:
                    
                        if (Hi.i.i((Hi.i) r2, r3, null, null, false, null, null, null, null, r13, 254, null) == r12) goto L16;
                     */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                        /*
                            r13 = this;
                            java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                            int r0 = r13.f98772c
                            r1 = 2
                            r2 = 1
                            if (r0 == 0) goto L34
                            if (r0 == r2) goto L23
                            if (r0 != r1) goto L1b
                            java.lang.Object r0 = r13.f98770a
                            java.lang.String r0 = (java.lang.String) r0
                            java.lang.Object r0 = r13.f98773d
                            Ul.e r0 = (Ul.ToastMessageData) r0
                            kotlin.ResultKt.b(r14)
                            goto L8c
                        L1b:
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                            r0.<init>(r1)
                            throw r0
                        L23:
                            int r0 = r13.f98771b
                            java.lang.Object r2 = r13.f98770a
                            java.lang.String r2 = (java.lang.String) r2
                            java.lang.Object r3 = r13.f98773d
                            Ul.e r3 = (Ul.ToastMessageData) r3
                            kotlin.ResultKt.b(r14)
                            r4 = r3
                            r3 = r2
                            r2 = r14
                            goto L6e
                        L34:
                            kotlin.ResultKt.b(r14)
                            java.lang.Object r0 = r13.f98773d
                            r3 = r0
                            Ul.e r3 = (Ul.ToastMessageData) r3
                            java.lang.StringBuilder r0 = new java.lang.StringBuilder
                            r0.<init>()
                            java.lang.String r4 = r3.getMessage()
                            r0.append(r4)
                            nk.c r4 = r3.getProduct()
                            java.lang.String r4 = Ul.d.a(r4)
                            r0.append(r4)
                            java.lang.String r0 = r0.toString()
                            Ki.M r4 = r13.f98774e
                            r13.f98773d = r3
                            r13.f98770a = r0
                            r5 = 0
                            r13.f98771b = r5
                            r13.f98772c = r2
                            r6 = 0
                            r7 = 0
                            java.lang.Object r2 = Ki.LocalThemeScope.g(r4, r6, r13, r2, r7)
                            if (r2 != r12) goto L6b
                            goto L8b
                        L6b:
                            r4 = r3
                            r3 = r0
                            r0 = r5
                        L6e:
                            Hi.i r2 = (Hi.i) r2
                            r13.f98773d = r4
                            r13.f98770a = r3
                            r13.f98771b = r0
                            r13.f98772c = r1
                            r0 = r2
                            r2 = 0
                            r1 = r3
                            r3 = 0
                            r4 = 0
                            r5 = 0
                            r6 = 0
                            r7 = 0
                            r8 = 0
                            r10 = 254(0xfe, float:3.56E-43)
                            r11 = 0
                            r9 = r13
                            java.lang.Object r0 = Hi.i.i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                            if (r0 != r12) goto L8c
                        L8b:
                            return r12
                        L8c:
                            kotlin.Unit r0 = kotlin.Unit.f143329a
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.home.ux.HomeComposeActivity.c.C1398c.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new d(this.f98768b, this.f98769c, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(HomeComposeActivity homeComposeActivity, LocalThemeScope localThemeScope, Continuation<? super d> continuation) {
                    super(2, continuation);
                    this.f98768b = homeComposeActivity;
                    this.f98769c = localThemeScope;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f98767a == 0) {
                        ResultKt.b(obj);
                        C16563h.J(C16563h.O(this.f98768b.e2().getToastMessageData(), new a(this.f98769c, null)), C6173t.a(this.f98768b));
                        return Unit.f143329a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.home.ux.HomeComposeActivity$c$c$e */
            static final class e implements Function3<R0, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f98775a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ HomeComposeActivity f98776b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ k0.AbstractC11776j f98777c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.home.ux.HomeComposeActivity$c$c$e$a */
                static final class a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ k0.AbstractC11776j f98778a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f98779b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ HomeComposeActivity f98780c;

                    a(k0.AbstractC11776j abstractC11776j, LocalThemeScope localThemeScope, HomeComposeActivity homeComposeActivity) {
                        this.f98778a = abstractC11776j;
                        this.f98779b = localThemeScope;
                        this.f98780c = homeComposeActivity;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit e(HomeComposeActivity homeComposeActivity, k0.AbstractC11776j abstractC11776j) {
                        k0.AbstractC11776j.RateAndTipAlert hVar = (k0.AbstractC11776j.RateAndTipAlert) abstractC11776j;
                        homeComposeActivity.Q2(hVar.getOrderId(), hVar.getExternalShopperId(), true);
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit f(HomeComposeActivity homeComposeActivity, k0.AbstractC11776j abstractC11776j) {
                        k0.AbstractC11776j.RateAndTipAlert hVar = (k0.AbstractC11776j.RateAndTipAlert) abstractC11776j;
                        HomeComposeActivity.R2(homeComposeActivity, hVar.getOrderId(), hVar.getExternalShopperId(), false, 4, null);
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit g(HomeComposeActivity homeComposeActivity, k0.AbstractC11776j abstractC11776j) {
                        k0.AbstractC11776j.RateAndTipAlert hVar = (k0.AbstractC11776j.RateAndTipAlert) abstractC11776j;
                        HomeComposeActivity.R2(homeComposeActivity, hVar.getOrderId(), hVar.getExternalShopperId(), false, 4, null);
                        return Unit.f143329a;
                    }

                    public final void d(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(551157558, i10, -1, "com.meijer.mobile.home.ux.HomeComposeActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeComposeActivity.kt:691)");
                        }
                        AbstractC6392a abstractC6392aC = ((k0.AbstractC11776j.RateAndTipAlert) this.f98778a).getTitle();
                        LocalThemeScope localThemeScope = this.f98779b;
                        composer.startReplaceGroup(-1633490746);
                        boolean zD = composer.D(this.f98780c) | composer.V(this.f98778a);
                        final HomeComposeActivity homeComposeActivity = this.f98780c;
                        final k0.AbstractC11776j abstractC11776j = this.f98778a;
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: com.meijer.mobile.home.ux.P
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return HomeComposeActivity.c.C1398c.e.a.e(homeComposeActivity, abstractC11776j);
                                }
                            };
                            composer.t(objB);
                        }
                        Function0 function0 = (Function0) objB;
                        composer.P();
                        composer.startReplaceGroup(-1633490746);
                        boolean zD2 = composer.D(this.f98780c) | composer.V(this.f98778a);
                        final HomeComposeActivity homeComposeActivity2 = this.f98780c;
                        final k0.AbstractC11776j abstractC11776j2 = this.f98778a;
                        Object objB2 = composer.B();
                        if (zD2 || objB2 == Composer.INSTANCE.a()) {
                            objB2 = new Function0() { // from class: com.meijer.mobile.home.ux.Q
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return HomeComposeActivity.c.C1398c.e.a.f(homeComposeActivity2, abstractC11776j2);
                                }
                            };
                            composer.t(objB2);
                        }
                        Function0 function02 = (Function0) objB2;
                        composer.P();
                        composer.startReplaceGroup(-1633490746);
                        boolean zD3 = composer.D(this.f98780c) | composer.V(this.f98778a);
                        final HomeComposeActivity homeComposeActivity3 = this.f98780c;
                        final k0.AbstractC11776j abstractC11776j3 = this.f98778a;
                        Object objB3 = composer.B();
                        if (zD3 || objB3 == Composer.INSTANCE.a()) {
                            objB3 = new Function0() { // from class: com.meijer.mobile.home.ux.S
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return HomeComposeActivity.c.C1398c.e.a.g(homeComposeActivity3, abstractC11776j3);
                                }
                            };
                            composer.t(objB3);
                        }
                        composer.P();
                        C15538s.e(localThemeScope, abstractC6392aC, null, function0, function02, (Function0) objB3, composer, LocalThemeScope.f17314g | (AbstractC6392a.f60445b << 3), 2);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        d(composer, num.intValue());
                        return Unit.f143329a;
                    }
                }

                e(LocalThemeScope localThemeScope, HomeComposeActivity homeComposeActivity, k0.AbstractC11776j abstractC11776j) {
                    this.f98775a = localThemeScope;
                    this.f98776b = homeComposeActivity;
                    this.f98777c = abstractC11776j;
                }

                public final void b(R0 Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if (ComposerKt.M()) {
                        ComposerKt.U(1363979145, i10, -1, "com.meijer.mobile.home.ux.HomeComposeActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeComposeActivity.kt:685)");
                    }
                    LocalThemeScope localThemeScope = this.f98775a;
                    q1.ModalTemplate modalTemplate = Assemble.getModalTemplate();
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f98776b);
                    final HomeComposeActivity homeComposeActivity = this.f98776b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.home.ux.O
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HomeComposeActivity.c.C1398c.e.c(homeComposeActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    C17265b.b(localThemeScope, modalTemplate, (Function0) objB, null, ComposableLambdaKt.c(551157558, true, new a(this.f98777c, this.f98775a, this.f98776b), composer, 54), composer, LocalThemeScope.f17314g | 24576 | (q1.ModalTemplate.f142363d << 3), 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(R0 r02, Composer composer, Integer num) {
                    b(r02, composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(HomeComposeActivity homeComposeActivity) {
                    homeComposeActivity.e2().n0(k0.AbstractC11776j.f.f99091a);
                    return Unit.f143329a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C1398c(C17959M0 c17959m0, HomeComposeActivity homeComposeActivity, z1<? extends k0.AbstractC11774h> z1Var, InterfaceC5872l0<C17993c1> interfaceC5872l0, z1<k0.ViewState> z1Var2, z1<FulfillmentBarDecorator> z1Var3, z1<HeaderDecorator> z1Var4, z1<DrawerLayoutDecorator> z1Var5, A0.g gVar, z1<? extends k0.AbstractC11776j> z1Var6) {
                this.f98724a = c17959m0;
                this.f98725b = homeComposeActivity;
                this.f98726c = z1Var;
                this.f98727d = interfaceC5872l0;
                this.f98728e = z1Var2;
                this.f98729f = z1Var3;
                this.f98730g = z1Var4;
                this.f98731h = z1Var5;
                this.f98732i = gVar;
                this.f98733j = z1Var6;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit B(HomeComposeActivity homeComposeActivity) {
                homeComposeActivity.D2(a.b.f42323a);
                homeComposeActivity.e2().n0(k0.AbstractC11776j.f.f99091a);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit C(HomeComposeActivity homeComposeActivity) {
                homeComposeActivity.D2(a.j.f42331a);
                homeComposeActivity.e2().n0(k0.AbstractC11776j.f.f99091a);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit E(HomeComposeActivity homeComposeActivity) {
                homeComposeActivity.D2(a.b.f42323a);
                homeComposeActivity.e2().n0(k0.AbstractC11776j.f.f99091a);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit F(HomeComposeActivity homeComposeActivity) {
                homeComposeActivity.D2(a.j.f42331a);
                homeComposeActivity.e2().n0(k0.AbstractC11776j.f.f99091a);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit H(HomeComposeActivity homeComposeActivity) {
                if (Build.VERSION.SDK_INT >= 33) {
                    homeComposeActivity.requestPermissionLauncher.a("android.permission.POST_NOTIFICATIONS");
                } else {
                    homeComposeActivity.updateNotificationPreference(true);
                }
                homeComposeActivity.e2().n0(k0.AbstractC11776j.f.f99091a);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit I(HomeComposeActivity homeComposeActivity) {
                if (Build.VERSION.SDK_INT < 33) {
                    homeComposeActivity.updateNotificationPreference(false);
                } else {
                    Gh.b.c(homeComposeActivity.f2(), 0L, 1, null);
                }
                homeComposeActivity.e2().n0(k0.AbstractC11776j.f.f99091a);
                return Unit.f143329a;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                x(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }

            public final void x(LocalThemeScope AdsTheme, Composer composer, int i10) {
                int i11;
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i11 = i10 | ((i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(669168574, i11, -1, "com.meijer.mobile.home.ux.HomeComposeActivity.onCreate.<anonymous>.<anonymous> (HomeComposeActivity.kt:376)");
                }
                C17959M0 c17959m0 = this.f98724a;
                ComposableLambda composableLambdaC = ComposableLambdaKt.c(-482324377, true, new a(this.f98726c, AdsTheme, this.f98725b), composer, 54);
                ComposableLambda composableLambdaC2 = ComposableLambdaKt.c(-878822634, true, new b(this.f98727d, AdsTheme, this.f98725b, this.f98728e, this.f98729f, this.f98730g, this.f98731h, this.f98732i), composer, 54);
                int i12 = LocalThemeScope.f17314g;
                int i13 = i11 & 14;
                C15726h.h(AdsTheme, null, c17959m0, false, false, composableLambdaC, composableLambdaC2, composer, 1794048 | i12 | i13 | (C17959M0.f168297e << 6), 5);
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(this.f98725b) | (i13 == 4 || ((i11 & 8) != 0 && composer.D(AdsTheme)));
                HomeComposeActivity homeComposeActivity = this.f98725b;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new C1405c(homeComposeActivity, AdsTheme, null);
                    composer.t(objB);
                }
                composer.P();
                androidx.compose.runtime.J.g("HomeComposeActivity:Effects", (Function2) objB, composer, 6);
                composer.startReplaceGroup(-1633490746);
                boolean zD2 = composer.D(this.f98725b) | (i13 == 4 || ((i11 & 8) != 0 && composer.D(AdsTheme)));
                HomeComposeActivity homeComposeActivity2 = this.f98725b;
                Object objB2 = composer.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new d(homeComposeActivity2, AdsTheme, null);
                    composer.t(objB2);
                }
                composer.P();
                androidx.compose.runtime.J.g("HomeComposeActivity:Toast", (Function2) objB2, composer, 6);
                boolean zK = this.f98724a.k();
                composer.startReplaceGroup(5004770);
                boolean zD3 = composer.D(this.f98725b);
                final HomeComposeActivity homeComposeActivity3 = this.f98725b;
                Object objB3 = composer.B();
                if (zD3 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function0() { // from class: com.meijer.mobile.home.ux.l
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HomeComposeActivity.c.C1398c.y(homeComposeActivity3);
                        }
                    };
                    composer.t(objB3);
                }
                composer.P();
                C13736d.a(zK, (Function0) objB3, composer, 0, 0);
                final k0.AbstractC11776j abstractC11776jU = c.u(this.f98733j);
                final HomeComposeActivity homeComposeActivity4 = this.f98725b;
                if (abstractC11776jU instanceof k0.AbstractC11776j.ClipCouponFailedAlert) {
                    composer.startReplaceGroup(1932396609);
                    k0.AbstractC11776j.ClipCouponFailedAlert cVar = (k0.AbstractC11776j.ClipCouponFailedAlert) abstractC11776jU;
                    String strC = C16338g.c(cVar.getTitleResId(), composer, 0);
                    String strC2 = C16338g.c(cVar.getMessageResId(), composer, 0);
                    String strC3 = C16338g.c(cVar.getPositiveButtonResId(), composer, 0);
                    String strC4 = C16338g.c(cVar.getNegativeButtonResId(), composer, 0);
                    composer.startReplaceGroup(5004770);
                    boolean zD4 = composer.D(homeComposeActivity4);
                    Object objB4 = composer.B();
                    if (zD4 || objB4 == Composer.INSTANCE.a()) {
                        objB4 = new Function0() { // from class: com.meijer.mobile.home.ux.C
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HomeComposeActivity.c.C1398c.N(homeComposeActivity4);
                            }
                        };
                        composer.t(objB4);
                    }
                    Function0 function0 = (Function0) objB4;
                    composer.P();
                    composer.startReplaceGroup(-1633490746);
                    boolean zD5 = composer.D(homeComposeActivity4) | composer.V(abstractC11776jU);
                    Object objB5 = composer.B();
                    if (zD5 || objB5 == Composer.INSTANCE.a()) {
                        objB5 = new Function0() { // from class: com.meijer.mobile.home.ux.m
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HomeComposeActivity.c.C1398c.O(homeComposeActivity4, abstractC11776jU);
                            }
                        };
                        composer.t(objB5);
                    }
                    composer.P();
                    C15528i.b(AdsTheme, strC, strC2, strC3, strC4, null, function0, (Function0) objB5, composer, i12 | i13, 16);
                    composer.P();
                } else if (abstractC11776jU instanceof k0.AbstractC11776j.NoStoreAlert) {
                    composer.startReplaceGroup(1933417005);
                    String strC5 = C16338g.c(Cj.o.f5036P0, composer, 0);
                    String strC6 = C16338g.c(Cj.o.f5084r, composer, 0);
                    Locale locale = Locale.ROOT;
                    String upperCase = strC6.toUpperCase(locale);
                    Intrinsics.i(upperCase, "toUpperCase(...)");
                    String upperCase2 = C16338g.c(Cj.o.f5086s, composer, 0).toUpperCase(locale);
                    Intrinsics.i(upperCase2, "toUpperCase(...)");
                    composer.startReplaceGroup(-1633490746);
                    boolean zD6 = composer.D(homeComposeActivity4) | composer.V(abstractC11776jU);
                    Object objB6 = composer.B();
                    if (zD6 || objB6 == Composer.INSTANCE.a()) {
                        objB6 = new Function0() { // from class: com.meijer.mobile.home.ux.n
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HomeComposeActivity.c.C1398c.P(homeComposeActivity4, abstractC11776jU);
                            }
                        };
                        composer.t(objB6);
                    }
                    Function0 function02 = (Function0) objB6;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean zD7 = composer.D(homeComposeActivity4);
                    Object objB7 = composer.B();
                    if (zD7 || objB7 == Composer.INSTANCE.a()) {
                        objB7 = new Function0() { // from class: com.meijer.mobile.home.ux.o
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HomeComposeActivity.c.C1398c.z(homeComposeActivity4);
                            }
                        };
                        composer.t(objB7);
                    }
                    Function0 function03 = (Function0) objB7;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean zD8 = composer.D(homeComposeActivity4);
                    Object objB8 = composer.B();
                    if (zD8 || objB8 == Composer.INSTANCE.a()) {
                        objB8 = new Function0() { // from class: com.meijer.mobile.home.ux.p
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HomeComposeActivity.c.C1398c.A(homeComposeActivity4);
                            }
                        };
                        composer.t(objB8);
                    }
                    composer.P();
                    C15521b.b(AdsTheme, strC5, upperCase, upperCase2, null, function02, function03, (Function0) objB8, composer, i12 | i13, 8);
                    composer.P();
                } else if (abstractC11776jU instanceof k0.AbstractC11776j.LoginAlert) {
                    composer.startReplaceGroup(1934663887);
                    String strC7 = C16338g.c(((k0.AbstractC11776j.LoginAlert) abstractC11776jU).getMessageResId(), composer, 0);
                    String strC8 = C16338g.c(Cj.o.f5090u, composer, 0);
                    Locale locale2 = Locale.ROOT;
                    String upperCase3 = strC8.toUpperCase(locale2);
                    Intrinsics.i(upperCase3, "toUpperCase(...)");
                    String upperCase4 = C16338g.c(Cj.o.f5016F0, composer, 0).toUpperCase(locale2);
                    Intrinsics.i(upperCase4, "toUpperCase(...)");
                    composer.startReplaceGroup(5004770);
                    boolean zD9 = composer.D(homeComposeActivity4);
                    Object objB9 = composer.B();
                    if (zD9 || objB9 == Composer.INSTANCE.a()) {
                        objB9 = new Function0() { // from class: com.meijer.mobile.home.ux.q
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HomeComposeActivity.c.C1398c.B(homeComposeActivity4);
                            }
                        };
                        composer.t(objB9);
                    }
                    Function0 function04 = (Function0) objB9;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean zD10 = composer.D(homeComposeActivity4);
                    Object objB10 = composer.B();
                    if (zD10 || objB10 == Composer.INSTANCE.a()) {
                        objB10 = new Function0() { // from class: com.meijer.mobile.home.ux.r
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HomeComposeActivity.c.C1398c.C(homeComposeActivity4);
                            }
                        };
                        composer.t(objB10);
                    }
                    Function0 function05 = (Function0) objB10;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean zD11 = composer.D(homeComposeActivity4);
                    Object objB11 = composer.B();
                    if (zD11 || objB11 == Composer.INSTANCE.a()) {
                        objB11 = new Function0() { // from class: com.meijer.mobile.home.ux.s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HomeComposeActivity.c.C1398c.D(homeComposeActivity4);
                            }
                        };
                        composer.t(objB11);
                    }
                    composer.P();
                    C15521b.b(AdsTheme, strC7, upperCase3, upperCase4, null, function04, function05, (Function0) objB11, composer, i12 | i13, 8);
                    composer.P();
                } else if (Intrinsics.e(abstractC11776jU, k0.AbstractC11776j.C1406j.f99098a)) {
                    composer.startReplaceGroup(1935734007);
                    String strC9 = C16338g.c(r0.f99367z, composer, 0);
                    String strC10 = C16338g.c(Cj.o.f5090u, composer, 0);
                    Locale locale3 = Locale.ROOT;
                    String upperCase5 = strC10.toUpperCase(locale3);
                    Intrinsics.i(upperCase5, "toUpperCase(...)");
                    String upperCase6 = C16338g.c(Cj.o.f5100z, composer, 0).toUpperCase(locale3);
                    Intrinsics.i(upperCase6, "toUpperCase(...)");
                    composer.startReplaceGroup(5004770);
                    boolean zD12 = composer.D(homeComposeActivity4);
                    Object objB12 = composer.B();
                    if (zD12 || objB12 == Composer.INSTANCE.a()) {
                        objB12 = new Function0() { // from class: com.meijer.mobile.home.ux.t
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HomeComposeActivity.c.C1398c.E(homeComposeActivity4);
                            }
                        };
                        composer.t(objB12);
                    }
                    Function0 function06 = (Function0) objB12;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean zD13 = composer.D(homeComposeActivity4);
                    Object objB13 = composer.B();
                    if (zD13 || objB13 == Composer.INSTANCE.a()) {
                        objB13 = new Function0() { // from class: com.meijer.mobile.home.ux.u
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HomeComposeActivity.c.C1398c.F(homeComposeActivity4);
                            }
                        };
                        composer.t(objB13);
                    }
                    Function0 function07 = (Function0) objB13;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean zD14 = composer.D(homeComposeActivity4);
                    Object objB14 = composer.B();
                    if (zD14 || objB14 == Composer.INSTANCE.a()) {
                        objB14 = new Function0() { // from class: com.meijer.mobile.home.ux.v
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HomeComposeActivity.c.C1398c.G(homeComposeActivity4);
                            }
                        };
                        composer.t(objB14);
                    }
                    composer.P();
                    C15521b.b(AdsTheme, strC9, upperCase5, upperCase6, null, function06, function07, (Function0) objB14, composer, i12 | i13, 8);
                    composer.P();
                } else if (abstractC11776jU instanceof k0.AbstractC11776j.RateAndTipAlert) {
                    composer.startReplaceGroup(1936849759);
                    Ki.Q.e(AdsTheme, C15158a0.f142009a, ComposableLambdaKt.c(1363979145, true, new e(AdsTheme, homeComposeActivity4, abstractC11776jU), composer, 54), composer, i12 | 384 | i13 | (C15158a0.f142010b << 3));
                    composer.P();
                } else if (Intrinsics.e(abstractC11776jU, k0.AbstractC11776j.i.f99097a)) {
                    composer.startReplaceGroup(1938782020);
                    composer.startReplaceGroup(5004770);
                    boolean zD15 = composer.D(homeComposeActivity4);
                    Object objB15 = composer.B();
                    if (zD15 || objB15 == Composer.INSTANCE.a()) {
                        objB15 = new Function0() { // from class: com.meijer.mobile.home.ux.w
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HomeComposeActivity.c.C1398c.H(homeComposeActivity4);
                            }
                        };
                        composer.t(objB15);
                    }
                    Function0 function08 = (Function0) objB15;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean zD16 = composer.D(homeComposeActivity4);
                    Object objB16 = composer.B();
                    if (zD16 || objB16 == Composer.INSTANCE.a()) {
                        objB16 = new Function0() { // from class: com.meijer.mobile.home.ux.x
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HomeComposeActivity.c.C1398c.I(homeComposeActivity4);
                            }
                        };
                        composer.t(objB16);
                    }
                    composer.P();
                    C15533n.b(AdsTheme, null, function08, (Function0) objB16, composer, i12 | i13, 1);
                    composer.P();
                } else if (Intrinsics.e(abstractC11776jU, k0.AbstractC11776j.g.f99092a)) {
                    composer.startReplaceGroup(1940000041);
                    composer.startReplaceGroup(5004770);
                    boolean zD17 = composer.D(homeComposeActivity4);
                    Object objB17 = composer.B();
                    if (zD17 || objB17 == Composer.INSTANCE.a()) {
                        objB17 = new Function0() { // from class: com.meijer.mobile.home.ux.y
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HomeComposeActivity.c.C1398c.J(homeComposeActivity4);
                            }
                        };
                        composer.t(objB17);
                    }
                    composer.P();
                    C15530k.b(AdsTheme, null, (Function0) objB17, composer, i12 | i13, 1);
                    composer.P();
                } else if (abstractC11776jU instanceof k0.AbstractC11776j.CartLoadFailedAlert) {
                    composer.startReplaceGroup(1940383542);
                    k0.AbstractC11776j.CartLoadFailedAlert aVar = (k0.AbstractC11776j.CartLoadFailedAlert) abstractC11776jU;
                    String strC11 = C16338g.c(aVar.getTitle(), composer, 0);
                    String strC12 = C16338g.c(aVar.getMessage(), composer, 0);
                    String strC13 = C16338g.c(aVar.getPositiveButtonText(), composer, 0);
                    composer.startReplaceGroup(5004770);
                    boolean zD18 = composer.D(homeComposeActivity4);
                    Object objB18 = composer.B();
                    if (zD18 || objB18 == Composer.INSTANCE.a()) {
                        objB18 = new Function0() { // from class: com.meijer.mobile.home.ux.z
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HomeComposeActivity.c.C1398c.K(homeComposeActivity4);
                            }
                        };
                        composer.t(objB18);
                    }
                    composer.P();
                    C15523d.b(AdsTheme, strC11, strC12, strC13, null, (Function0) objB18, composer, i12 | i13, 8);
                    composer.P();
                } else if (abstractC11776jU instanceof k0.AbstractC11776j.ChokeWarningAlert) {
                    composer.startReplaceGroup(1940991421);
                    k0.AbstractC11776j.ChokeWarningAlert bVar = (k0.AbstractC11776j.ChokeWarningAlert) abstractC11776jU;
                    String strC14 = C16338g.c(bVar.a().getTitle(), composer, 0);
                    String strC15 = C16338g.c(bVar.a().getBody(), composer, 0);
                    String strC16 = C16338g.c(bVar.a().getNegativeButtonText(), composer, 0);
                    String strC17 = C16338g.c(bVar.a().getPositiveButtonText(), composer, 0);
                    composer.startReplaceGroup(-1633490746);
                    boolean zD19 = composer.D(homeComposeActivity4) | composer.V(abstractC11776jU);
                    Object objB19 = composer.B();
                    if (zD19 || objB19 == Composer.INSTANCE.a()) {
                        objB19 = new Function0() { // from class: com.meijer.mobile.home.ux.A
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HomeComposeActivity.c.C1398c.L(homeComposeActivity4, abstractC11776jU);
                            }
                        };
                        composer.t(objB19);
                    }
                    Function0 function09 = (Function0) objB19;
                    composer.P();
                    composer.startReplaceGroup(-1633490746);
                    boolean zD20 = composer.D(homeComposeActivity4) | composer.V(abstractC11776jU);
                    Object objB20 = composer.B();
                    if (zD20 || objB20 == Composer.INSTANCE.a()) {
                        objB20 = new Function0() { // from class: com.meijer.mobile.home.ux.B
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HomeComposeActivity.c.C1398c.M(homeComposeActivity4, abstractC11776jU);
                            }
                        };
                        composer.t(objB20);
                    }
                    composer.P();
                    C15526g.b(AdsTheme, strC14, strC15, strC16, strC17, null, function09, (Function0) objB20, composer, i12 | i13, 16);
                    composer.P();
                } else {
                    if (!Intrinsics.e(abstractC11776jU, k0.AbstractC11776j.f.f99091a)) {
                        composer.startReplaceGroup(-1461678919);
                        composer.P();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer.startReplaceGroup(1942277084);
                    composer.P();
                }
                Unit unit = Unit.f143329a;
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit A(HomeComposeActivity homeComposeActivity) {
                homeComposeActivity.e2().n0(k0.AbstractC11776j.f.f99091a);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit D(HomeComposeActivity homeComposeActivity) {
                homeComposeActivity.e2().n0(k0.AbstractC11776j.f.f99091a);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit G(HomeComposeActivity homeComposeActivity) {
                homeComposeActivity.e2().n0(k0.AbstractC11776j.f.f99091a);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit J(HomeComposeActivity homeComposeActivity) {
                homeComposeActivity.e2().n0(k0.AbstractC11776j.f.f99091a);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit K(HomeComposeActivity homeComposeActivity) {
                homeComposeActivity.e2().n0(k0.AbstractC11776j.f.f99091a);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit L(HomeComposeActivity homeComposeActivity, k0.AbstractC11776j abstractC11776j) {
                homeComposeActivity.e2().I0(new k0.AbstractC11778l.ResetStepperState(((k0.AbstractC11776j.ChokeWarningAlert) abstractC11776j).a().b().getProductCode()));
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit M(HomeComposeActivity homeComposeActivity, k0.AbstractC11776j abstractC11776j) {
                homeComposeActivity.e2().I0(new k0.AbstractC11778l.AcceptAddToCartChallenge(((k0.AbstractC11776j.ChokeWarningAlert) abstractC11776j).a().b()));
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit N(HomeComposeActivity homeComposeActivity) {
                homeComposeActivity.e2().n0(k0.AbstractC11776j.f.f99091a);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit O(HomeComposeActivity homeComposeActivity, k0.AbstractC11776j abstractC11776j) {
                k0.AbstractC11776j.ClipCouponFailedAlert cVar = (k0.AbstractC11776j.ClipCouponFailedAlert) abstractC11776j;
                homeComposeActivity.e2().onAction(new a.Clip(cVar.getCoupon(), cVar.getTrackingData()));
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit P(HomeComposeActivity homeComposeActivity, k0.AbstractC11776j abstractC11776j) {
                homeComposeActivity.e2().n0(k0.AbstractC11776j.f.f99091a);
                homeComposeActivity.startActivity(Bl.s.f(homeComposeActivity, null, null, false, false, ((k0.AbstractC11776j.NoStoreAlert) abstractC11776j).getDeeplinkCode(), null, false, 222, null));
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit y(HomeComposeActivity homeComposeActivity) {
                homeComposeActivity.e2().I0(k0.AbstractC11778l.b.f99149a);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit z(HomeComposeActivity homeComposeActivity) {
                homeComposeActivity.e2().n0(k0.AbstractC11776j.f.f99091a);
                return Unit.f143329a;
            }
        }

        c() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            l(composer, num.intValue());
            return Unit.f143329a;
        }

        public final void l(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1508783469, i10, -1, "com.meijer.mobile.home.ux.HomeComposeActivity.onCreate.<anonymous> (HomeComposeActivity.kt:317)");
            }
            z1 z1VarC = S2.a.c(HomeComposeActivity.this.h2().u(), null, null, null, composer, 0, 7);
            z1 z1VarC2 = S2.a.c(HomeComposeActivity.this.h2().v(), null, null, null, composer, 0, 7);
            z1 z1VarC3 = S2.a.c(HomeComposeActivity.this.e2().F0(), null, null, null, composer, 0, 7);
            z1 z1VarC4 = S2.a.c(HomeComposeActivity.this.getFulfillmentBarViewModel().n(), null, null, null, composer, 0, 7);
            z1 z1VarC5 = S2.a.c(HomeComposeActivity.this.e2().w0(), null, null, null, composer, 0, 7);
            z1 z1VarA = o1.a(HomeComposeActivity.this.e2().A0(), k0.AbstractC11776j.f.f99091a, null, composer, 48, 2);
            HomeComposeActivity.this.i2().k(0);
            C17998e0 c17998e0J = C17995d0.j(EnumC18001f0.f168977a, null, composer, 6, 2);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new C18029o1();
                composer.t(objB);
            }
            C18029o1 c18029o1 = (C18029o1) objB;
            composer.P();
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = androidx.compose.runtime.J.k(EmptyCoroutineContext.f143553a, composer);
                composer.t(objB2);
            }
            InterfaceC15783O interfaceC15783O = (InterfaceC15783O) objB2;
            composer.startReplaceGroup(1849434622);
            Object objB3 = composer.B();
            if (objB3 == companion.a()) {
                objB3 = t1.e(new C17993c1(c17998e0J, c18029o1), null, 2, null);
                composer.t(objB3);
            }
            InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB3;
            composer.P();
            boolean z10 = r(z1VarC3).getIsRefreshing();
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(HomeComposeActivity.this);
            final HomeComposeActivity homeComposeActivity = HomeComposeActivity.this;
            Object objB4 = composer.B();
            if (zD || objB4 == companion.a()) {
                objB4 = new Function0() { // from class: com.meijer.mobile.home.ux.k
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeComposeActivity.c.q(homeComposeActivity);
                    }
                };
                composer.t(objB4);
            }
            composer.P();
            A0.g gVarA = A0.h.a(z10, (Function0) objB4, 0.0f, 0.0f, composer, 0, 12);
            C17959M0 c17959m0J = C17957L0.j(EnumC17961N0.f168314a, null, null, true, composer, 3078, 6);
            k0.AbstractC11774h abstractC11774hT = t(z1VarC5);
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(z1VarC5) | composer.D(c17959m0J);
            Object objB5 = composer.B();
            if (zV || objB5 == companion.a()) {
                objB5 = new a(c17959m0J, z1VarC5, null);
                composer.t(objB5);
            }
            composer.P();
            androidx.compose.runtime.J.g(abstractC11774hT, (Function2) objB5, composer, 0);
            Boolean boolValueOf = Boolean.valueOf(!c17959m0J.k());
            composer.startReplaceGroup(-1746271574);
            boolean zD2 = composer.D(c17959m0J) | composer.V(z1VarC5) | composer.D(HomeComposeActivity.this);
            HomeComposeActivity homeComposeActivity2 = HomeComposeActivity.this;
            Object objB6 = composer.B();
            if (zD2 || objB6 == companion.a()) {
                objB6 = new b(c17959m0J, homeComposeActivity2, z1VarC5, null);
                composer.t(objB6);
            }
            composer.P();
            androidx.compose.runtime.J.g(boolValueOf, (Function2) objB6, composer, 0);
            C16507K.b(HomeComposeActivity.this.i2(), c17998e0J, interfaceC15783O, composer, C16521g.f157265l);
            Ki.K.b(null, ComposableLambdaKt.c(669168574, true, new C1398c(c17959m0J, HomeComposeActivity.this, z1VarC5, interfaceC5872l0, z1VarC3, z1VarC4, z1VarC, z1VarC2, gVarA, z1VarA), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final HeaderDecorator o(z1<HeaderDecorator> z1Var) {
            return z1Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DrawerLayoutDecorator p(z1<DrawerLayoutDecorator> z1Var) {
            return z1Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(HomeComposeActivity homeComposeActivity) {
            homeComposeActivity.e2().W0();
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final k0.ViewState r(z1<k0.ViewState> z1Var) {
            return z1Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final FulfillmentBarDecorator s(z1<FulfillmentBarDecorator> z1Var) {
            return z1Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final k0.AbstractC11774h t(z1<? extends k0.AbstractC11774h> z1Var) {
            return z1Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final k0.AbstractC11776j u(z1<? extends k0.AbstractC11776j> z1Var) {
            return z1Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C17993c1 v(InterfaceC5872l0<C17993c1> interfaceC5872l0) {
            return interfaceC5872l0.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f98781f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f98781f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f98781f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f98782f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f98782f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f98782f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f98783f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f98784g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f98783f = function0;
            this.f98784g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f98783f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f98784g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f98785f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f98785f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f98785f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class h extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f98786f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f98786f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f98786f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class i extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f98787f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f98788g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f98787f = function0;
            this.f98788g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f98787f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f98788g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class j extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f98789f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentActivity componentActivity) {
            super(0);
            this.f98789f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f98789f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class k extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f98790f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentActivity componentActivity) {
            super(0);
            this.f98790f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f98790f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class l extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f98791f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f98792g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f98791f = function0;
            this.f98792g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f98791f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f98792g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class m implements InterfaceC14275b, FunctionAdapter {
        m() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14275b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, HomeComposeActivity.this, HomeComposeActivity.class, "handleSubstitutionResult", "handleSubstitutionResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14275b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14274a p02) {
            Intrinsics.j(p02, "p0");
            HomeComposeActivity.this.q2(p02);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeComposeActivity$updateNotificationPreference$1", f = "HomeComposeActivity.kt", l = {1452}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class n extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f98794a;

        /* renamed from: b, reason: collision with root package name */
        Object f98795b;

        /* renamed from: c, reason: collision with root package name */
        Object f98796c;

        /* renamed from: d, reason: collision with root package name */
        Object f98797d;

        /* renamed from: e, reason: collision with root package name */
        int f98798e;

        /* renamed from: f, reason: collision with root package name */
        int f98799f;

        /* renamed from: g, reason: collision with root package name */
        int f98800g;

        /* renamed from: h, reason: collision with root package name */
        int f98801h;

        /* renamed from: i, reason: collision with root package name */
        int f98802i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f98803j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f98805l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(boolean z10, Continuation<? super n> continuation) {
            super(2, continuation);
            this.f98805l = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            n nVar = HomeComposeActivity.this.new n(this.f98805l, continuation);
            nVar.f98803j = obj;
            return nVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((n) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f98802i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f98803j;
                    HomeComposeActivity homeComposeActivity = HomeComposeActivity.this;
                    boolean z10 = this.f98805l;
                    Result.Companion companion = Result.INSTANCE;
                    Ch.d dVarJ2 = homeComposeActivity.j2();
                    this.f98803j = interfaceC15783O;
                    this.f98794a = interfaceC15783O;
                    this.f98795b = this;
                    this.f98796c = this;
                    this.f98797d = interfaceC15783O;
                    this.f98798e = 0;
                    this.f98799f = 0;
                    this.f98800g = 0;
                    this.f98801h = 0;
                    this.f98802i = 1;
                    obj = dVarJ2.g(z10, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                Result.b(obj);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                Result.b(ResultKt.a(e10));
            }
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W1(final HomeComposeActivity homeComposeActivity) {
        homeComposeActivity.isShowingUpdatePrompt = true;
        new Qj.j(homeComposeActivity, r0.f99342a, new Object[0]).n().r(r0.f99343b, new Object[0]).o(r0.f99341C, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.home.ux.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                HomeComposeActivity.X1(this.f98835a, dialogInterface, i10);
            }
        }).q(new DialogInterface.OnDismissListener() { // from class: com.meijer.mobile.home.ux.g
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                HomeComposeActivity.Y1(this.f98837a, dialogInterface);
            }
        }).g();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y1(HomeComposeActivity homeComposeActivity, DialogInterface dialogInterface) {
        homeComposeActivity.isShowingUpdatePrompt = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A2(AbstractC17144a action) {
        if (!(action instanceof AbstractC17144a.GoogleAdViewClicked)) {
            throw new NoWhenBranchMatchedException();
        }
        a2().k(C14375c.b(((AbstractC17144a.GoogleAdViewClicked) action).getAdAnalytics(), "home"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B2(final AbstractC14028j action) {
        Object next;
        if (!(action instanceof AbstractC14028j.BannerClicked)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC14028j.BannerClicked bannerClicked = (AbstractC14028j.BannerClicked) action;
        List<AbstractC14762i.Extra> listD = bannerClicked.getMarketingBanner().d();
        final String value = null;
        if (listD != null) {
            Iterator<T> it = listD.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (Intrinsics.e(((AbstractC14762i.Extra) next).getKey(), "campaignId")) {
                        break;
                    }
                }
            }
            AbstractC14762i.Extra extra = (AbstractC14762i.Extra) next;
            if (extra != null) {
                value = extra.getValue();
            }
        }
        String linkURL = bannerClicked.getMarketingBanner().getLinkURL();
        if (linkURL != null && !StringsKt.s0(linkURL)) {
            if (g2().c0(linkURL)) {
                r2(linkURL, value == null ? "" : value);
            } else {
                K2(linkURL);
            }
        }
        a2().b(C14756c.a("event: featured clicked"), new Function1() { // from class: com.meijer.mobile.home.ux.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeComposeActivity.C2(value, action, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C2(String str, AbstractC14028j abstractC14028j, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("home");
        track.n("home");
        track.h("screenName", "New home screen");
        track.h("campaignId", str);
        List<AbstractC14762i.Extra> listD = ((AbstractC14028j.BannerClicked) abstractC14028j).getMarketingBanner().d();
        if (listD == null) {
            listD = CollectionsKt.m();
        }
        track.d(listD);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D2(Xl.a request) {
        if (Intrinsics.e(request, a.d.f42325a)) {
            i2().j();
            return;
        }
        if (Intrinsics.e(request, a.C0901a.f42322a)) {
            n2();
            return;
        }
        if (Intrinsics.e(request, a.e.f42326a)) {
            if (m2().getIsLoggedIn()) {
                startActivity(Bl.l.f3131a.c(this));
                return;
            } else {
                e2().n0(new k0.AbstractC11776j.LoginAlert(C18546a.f173198e));
                return;
            }
        }
        if (Intrinsics.e(request, a.f.f42327a)) {
            if (!l2().d()) {
                e2().n0(new k0.AbstractC11776j.NoStoreAlert(536873012));
                return;
            } else if (d2().e(AbstractC18503f.t0.f172905h)) {
                startActivity(Bl.h.d(this, true));
                return;
            } else {
                startActivity(Bl.h.h(this, true));
                return;
            }
        }
        if (Intrinsics.e(request, a.g.f42328a)) {
            if (!l2().d()) {
                e2().n0(new k0.AbstractC11776j.NoStoreAlert(536872912));
                return;
            }
            if (d2().e(AbstractC18503f.t0.f172905h)) {
                startActivity(Bl.h.c(this, Pp.b.f26238a, null, null, false, null, 60, null));
            } else {
                startActivity(Bl.h.g(this, Pp.b.f26238a, null, null, false, null, 60, null));
            }
            a2().g(C14756c.h("Product Search Page"), new Function1() { // from class: com.meijer.mobile.home.ux.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HomeComposeActivity.E2((TrackingData) obj);
                }
            });
            return;
        }
        if (Intrinsics.e(request, a.h.f42329a)) {
            startActivity(g2().D(this, d2().e(AbstractC18503f.O.f172854h)));
            return;
        }
        if (Intrinsics.e(request, a.i.f42330a)) {
            startActivity(Dl.e.t(g2(), this, 268437856, null, 4, null));
            return;
        }
        if (Intrinsics.e(request, a.b.f42323a)) {
            i2().f();
        } else if (Intrinsics.e(request, a.j.f42331a)) {
            i2().i();
        } else {
            if (!Intrinsics.e(request, a.c.f42324a)) {
                throw new NoWhenBranchMatchedException();
            }
            startActivity(c2().i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E2(TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.h("searchLocation", "event: home search");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F2(AbstractC13870f action) {
        if (action instanceof AbstractC13870f.Dismiss) {
            e2().onAction(action);
            return;
        }
        if (action instanceof AbstractC13870f.RateAndTip) {
            AbstractC13870f.RateAndTip rateAndTip = (AbstractC13870f.RateAndTip) action;
            startActivity(c2().v(rateAndTip.getRateAndTipBuilder(), rateAndTip.getFlowType()));
            return;
        }
        AbstractC14276c<Intent> abstractC14276c = null;
        if (action instanceof AbstractC13870f.ViewDeclinedPayment) {
            this.leavingHomeScreen = true;
            AbstractC14276c<Intent> abstractC14276c2 = this.startForResult;
            if (abstractC14276c2 == null) {
                Intrinsics.x("startForResult");
            } else {
                abstractC14276c = abstractC14276c2;
            }
            AbstractC13870f.ViewDeclinedPayment viewDeclinedPayment = (AbstractC13870f.ViewDeclinedPayment) action;
            abstractC14276c.a(Bl.l.b(Bl.l.f3131a, this, viewDeclinedPayment.getOrderNumber(), viewDeclinedPayment.getPreviousTrackAction() + ": New home screen", null, 8, null));
            return;
        }
        if (action instanceof AbstractC13870f.ViewOrderDetail) {
            AbstractC14276c<Intent> abstractC14276c3 = this.startForResult;
            if (abstractC14276c3 == null) {
                Intrinsics.x("startForResult");
            } else {
                abstractC14276c = abstractC14276c3;
            }
            AbstractC13870f.ViewOrderDetail viewOrderDetail = (AbstractC13870f.ViewOrderDetail) action;
            abstractC14276c.a(Bl.l.b(Bl.l.f3131a, this, viewOrderDetail.getOrderNumber(), viewOrderDetail.getPreviousTrackAction() + ": New home screen", null, 8, null));
            return;
        }
        if (!(action instanceof AbstractC13870f.ViewSubstitutions)) {
            if (!(action instanceof AbstractC13870f.OrderRatedAndTipped)) {
                throw new NoWhenBranchMatchedException();
            }
            e2().onAction(action);
            return;
        }
        AbstractC13870f.ViewSubstitutions viewSubstitutions = (AbstractC13870f.ViewSubstitutions) action;
        vo.b substitutionScreenType = viewSubstitutions.getSubstitutionScreenType();
        vo.b bVar = vo.b.f166128g;
        if (substitutionScreenType == bVar) {
            String orderNumber = viewSubstitutions.getOrderNumber();
            List<OrderSubstitutionItem> listF = viewSubstitutions.f();
            if (listF == null) {
                listF = CollectionsKt.m();
            }
            List<OrderSubstitutionItem> list = listF;
            String pickupPersonName = viewSubstitutions.getPickupPersonName();
            List<OrderOutOfStockItem> listE = viewSubstitutions.e();
            if (listE == null) {
                listE = CollectionsKt.m();
            }
            u2(this, orderNumber, bVar, list, false, null, pickupPersonName, listE, 16, null);
            return;
        }
        String orderNumber2 = viewSubstitutions.getOrderNumber();
        vo.b bVar2 = vo.b.f166129h;
        List<OrderSubstitutionItem> listF2 = viewSubstitutions.f();
        if (listF2 == null) {
            listF2 = CollectionsKt.m();
        }
        List<OrderSubstitutionItem> list2 = listF2;
        String pickupPersonName2 = viewSubstitutions.getPickupPersonName();
        List<OrderOutOfStockItem> listE2 = viewSubstitutions.e();
        if (listE2 == null) {
            listE2 = CollectionsKt.m();
        }
        u2(this, orderNumber2, bVar2, list2, false, null, pickupPersonName2, listE2, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G2(AbstractC13555a action) {
        if (action instanceof AbstractC13555a.ProductClicked) {
            AbstractC13555a.ProductClicked productClicked = (AbstractC13555a.ProductClicked) action;
            v2(productClicked.getProduct(), productClicked.getPreviousTrackActionString());
            if (productClicked.getProduct().getIsSponsoredCriteo()) {
                e2().onAction(new AbstractC14072a.OnClickBeacon(productClicked.getProduct().getBeaconInfo().e(), productClicked.getProduct(), false, productClicked.getCarouselType(), 4, null));
                return;
            }
            return;
        }
        if (action instanceof AbstractC13555a.ViewAll) {
            AbstractC13555a.ViewAll viewAll = (AbstractC13555a.ViewAll) action;
            J2(this, viewAll.getUri(), viewAll.getCarouselTitle(), viewAll.b(), false, 8, null);
        } else {
            if (!(action instanceof AbstractC13555a.ProductCouponClicked) && !(action instanceof AbstractC13555a.UpdateProductEntry) && !(action instanceof AbstractC13555a.ProductClickedPosition) && !(action instanceof AbstractC13555a.Retry)) {
                throw new NoWhenBranchMatchedException();
            }
            e2().J0(action);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void I2(java.lang.String r11, java.lang.String r12, ii.AbstractC14761h r13, boolean r14) {
        /*
            r10 = this;
            if (r11 == 0) goto L8
            android.net.Uri r11 = android.net.Uri.parse(r11)
            if (r11 != 0) goto La
        L8:
            android.net.Uri r11 = android.net.Uri.EMPTY
        La:
            Dl.e r0 = r10.g2()
            if (r11 != 0) goto L13
            android.net.Uri r1 = android.net.Uri.EMPTY
            goto L14
        L13:
            r1 = r11
        L14:
            kotlin.jvm.internal.Intrinsics.g(r1)
            int r5 = r0.O(r1)
            Dl.e r2 = r10.g2()
            if (r11 != 0) goto L23
            android.net.Uri r11 = android.net.Uri.EMPTY
        L23:
            r4 = r11
            kotlin.jvm.internal.Intrinsics.g(r4)
            java.lang.String r11 = ""
            if (r12 != 0) goto L2d
            r6 = r11
            goto L2e
        L2d:
            r6 = r12
        L2e:
            r8 = 16
            r9 = 0
            r7 = 0
            r3 = r10
            android.content.Intent r0 = Dl.e.S(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto Lb4
            r1 = 0
            if (r12 == 0) goto L41
            java.lang.String r2 = r10.V1(r12)
            goto L42
        L41:
            r2 = r1
        L42:
            if (r2 != 0) goto L45
            goto L46
        L45:
            r11 = r2
        L46:
            java.lang.String r2 = "homePageCarouselAnalytics"
            r0.putExtra(r2, r11)
            java.lang.String r11 = "com.meijer.mobile.meijer.activity.find.FilteredProductsActivity.EXTRA_PRODUCT_QUERY_INTENT"
            boolean r2 = r0.hasExtra(r11)
            java.lang.String r4 = "com.meijer.intent.extra.PREVIOUS_TRACK_ACTION"
            java.lang.Class<Qo.l> r5 = Qo.l.class
            r6 = 33
            if (r2 == 0) goto L7d
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r6) goto L64
            java.lang.Object r2 = va.d.a(r0, r11, r5)
            android.os.Parcelable r2 = (android.os.Parcelable) r2
            goto L6f
        L64:
            android.os.Parcelable r2 = r0.getParcelableExtra(r11)
            boolean r7 = r2 instanceof Qo.l
            if (r7 != 0) goto L6d
            r2 = r1
        L6d:
            Qo.l r2 = (Qo.l) r2
        L6f:
            boolean r2 = r2 instanceof Qo.l.Department
            if (r2 == 0) goto L7d
            if (r13 == 0) goto L79
            java.lang.String r1 = r13.getValue()
        L79:
            r0.putExtra(r4, r1)
            goto Lb1
        L7d:
            boolean r2 = r0.hasExtra(r11)
            if (r2 == 0) goto La8
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r6) goto L8e
            java.lang.Object r11 = va.d.a(r0, r11, r5)
            android.os.Parcelable r11 = (android.os.Parcelable) r11
            goto L99
        L8e:
            android.os.Parcelable r11 = r0.getParcelableExtra(r11)
            boolean r2 = r11 instanceof Qo.l
            if (r2 != 0) goto L97
            r11 = r1
        L97:
            Qo.l r11 = (Qo.l) r11
        L99:
            boolean r11 = r11 instanceof Qo.l.BrowseCollection
            if (r11 == 0) goto La8
            java.lang.String r11 = "KEY_CURATED_CAROUSEL"
            r0.putExtra(r11, r12)
            java.lang.String r11 = "SEE_MORE_ITEMS"
            r0.putExtra(r11, r14)
            goto Lb1
        La8:
            if (r13 == 0) goto Lae
            java.lang.String r1 = r13.getValue()
        Lae:
            r0.putExtra(r4, r1)
        Lb1:
            r10.startActivity(r0)
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.home.ux.HomeComposeActivity.I2(java.lang.String, java.lang.String, ii.h, boolean):void");
    }

    static /* synthetic */ void J2(HomeComposeActivity homeComposeActivity, String str, String str2, AbstractC14761h abstractC14761h, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        homeComposeActivity.I2(str, str2, abstractC14761h, z10);
    }

    private final void K2(String url) {
        if (url == null) {
            return;
        }
        Intent intentR = g2().r(url);
        if (intentR.resolveActivity(getPackageManager()) != null) {
            startActivity(intentR);
            return;
        }
        qw.a.INSTANCE.d("Could not open browser from HomeActivity for url: " + url, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M2(HomeComposeActivity homeComposeActivity, boolean z10) {
        if (z10) {
            homeComposeActivity.updateNotificationPreference(true);
        } else {
            homeComposeActivity.updateNotificationPreference(false);
            homeComposeActivity.e2().n0(k0.AbstractC11776j.g.f99092a);
        }
    }

    static /* synthetic */ void P2(HomeComposeActivity homeComposeActivity, int i10, boolean z10, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        homeComposeActivity.O2(i10, z10, z11);
    }

    static /* synthetic */ void R2(HomeComposeActivity homeComposeActivity, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        homeComposeActivity.Q2(str, str2, z10);
    }

    private final String V1(String str) {
        return str + ":View All";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z1(HomeComposeActivity homeComposeActivity, C17897b config) {
        Intrinsics.j(config, "config");
        yo.k.b0(homeComposeActivity.getUserManager(), 0L, 1, null);
        homeComposeActivity.getNotificationManager().s(config.getUpdateAppMessageTitle(), config.getUpdateAppMessage(), homeComposeActivity);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k0 e2() {
        return (k0) this.homeViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Il.b getFulfillmentBarViewModel() {
        return (Il.b) this.fulfillmentBarViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C16508L h2() {
        return (C16508L) this.navigationDrawerViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C16521g i2() {
        return (C16521g) this.navigationHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o2(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("home page");
        track.v("header");
        return Unit.f143329a;
    }

    private final void requestNotificationPermission() {
        if (Z1.b.a(this, "android.permission.POST_NOTIFICATIONS") == 0) {
            updateNotificationPreference(true);
            return;
        }
        if (shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) {
            e2().n0(k0.AbstractC11776j.i.f99097a);
        } else if (f2().g() && Gh.b.f(f2(), 0L, 1, null)) {
            e2().n0(k0.AbstractC11776j.i.f99097a);
        }
    }

    private final void t2(String orderNumber, vo.b substitutionScreenType, List<OrderSubstitutionItem> listSubstitutedItems, boolean isOnMyWayClicked, String orderType, String pickupPersonName, List<OrderOutOfStockItem> listOutOfStockItems) {
        startActivity(Bl.l.f3131a.d(this, listSubstitutedItems, orderNumber, substitutionScreenType, isOnMyWayClicked, orderType, pickupPersonName, listOutOfStockItems));
    }

    static /* synthetic */ void u2(HomeComposeActivity homeComposeActivity, String str, vo.b bVar, List list, boolean z10, String str2, String str3, List list2, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            str2 = null;
        }
        if ((i10 & 32) != 0) {
            str3 = null;
        }
        homeComposeActivity.t2(str, bVar, list, z10, str2, str3, list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C16521g w2(HomeComposeActivity homeComposeActivity) {
        return new C16521g(homeComposeActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x2(InterfaceC18214a chip) {
        if (chip instanceof AbstractC14537b) {
            a2().e((InterfaceC14754a) chip);
            AbstractC14537b abstractC14537b = (AbstractC14537b) chip;
            if (abstractC14537b instanceof AbstractC14537b.f) {
                Intent intentT = Dl.e.t(g2(), this, 1700, null, 4, null);
                if (intentT != null) {
                    startActivity(intentT);
                    return;
                }
                return;
            }
            if (abstractC14537b instanceof AbstractC14537b.MPerks) {
                startActivity(getUserManager().b() ? Bl.p.f3148a.d(this, false) : Bl.p.f3148a.a(this));
                return;
            }
            if (Intrinsics.e(abstractC14537b, AbstractC14537b.C2144b.f135875g)) {
                Intent intentT2 = Dl.e.t(g2(), this, 536871032, null, 4, null);
                if (intentT2 != null) {
                    startActivity(intentT2);
                    return;
                }
                return;
            }
            if (Intrinsics.e(abstractC14537b, AbstractC14537b.g.f135884g)) {
                if (!getUserManager().b()) {
                    e2().n0(new k0.AbstractC11776j.LoginAlert(r0.f99365x));
                    return;
                }
                Intent intentT3 = Dl.e.t(g2(), this, 268437756, null, 4, null);
                if (intentT3 != null) {
                    startActivity(intentT3);
                    return;
                }
                return;
            }
            if (Intrinsics.e(abstractC14537b, AbstractC14537b.e.f135880g)) {
                if (getUserManager().b()) {
                    startActivity(c2().r());
                    return;
                } else {
                    e2().n0(new k0.AbstractC11776j.LoginAlert(r0.f99356o));
                    return;
                }
            }
            if (!Intrinsics.e(abstractC14537b, AbstractC14537b.h.f135886g)) {
                if (!Intrinsics.e(abstractC14537b, AbstractC14537b.c.f135877g)) {
                    throw new NoWhenBranchMatchedException();
                }
                startActivity(Bl.i.f3129a.a(this));
            } else if (l2().d()) {
                startActivity(Bl.g.G(c2(), 0, 0, 3, null));
            } else {
                e2().n0(new k0.AbstractC11776j.NoStoreAlert(536871412));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y2(HomeComposeActivity homeComposeActivity, C14274a result) {
        Intent data;
        Intrinsics.j(result, "result");
        if (result.getResultCode() != -1 || (data = result.getData()) == null) {
            return;
        }
        if (data.getStringExtra(HomeFragment.ORDER_DETAILS_BACK) != null) {
            homeComposeActivity.leavingHomeScreen = false;
            Intent data2 = result.getData();
            homeComposeActivity.previousTrackAction = data2 != null ? data2.getStringExtra(HomeFragment.ORDER_DETAILS_BACK) : null;
        }
        if (data.getStringExtra("orderID") != null) {
            String stringExtra = data.getStringExtra("orderID");
            Intrinsics.g(stringExtra);
            homeComposeActivity.F2(new AbstractC13870f.Dismiss(stringExtra, null, 2, null));
            homeComposeActivity.F2(new AbstractC13870f.OrderRatedAndTipped(stringExtra));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z2(AbstractC14020b action) {
        if (!(action instanceof AbstractC14020b.NavigateToTeachersList)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!getUserManager().b()) {
            e2().n0(k0.AbstractC11776j.C1406j.f99098a);
            return;
        }
        String deeplink = ((AbstractC14020b.NavigateToTeachersList) action).getDeeplink();
        if (deeplink != null) {
            e2().K0(action);
            Intent intentN = g2().n(this, deeplink);
            if (intentN != null) {
                startActivity(intentN);
            }
        }
    }

    public final InterfaceC14523a a2() {
        InterfaceC14523a interfaceC14523a = this.analyticsEngine;
        if (interfaceC14523a != null) {
            return interfaceC14523a;
        }
        Intrinsics.x("analyticsEngine");
        return null;
    }

    public final AppVersion b2() {
        AppVersion appVersion = this.appVersion;
        if (appVersion != null) {
            return appVersion;
        }
        Intrinsics.x("appVersion");
        return null;
    }

    public final Bl.g c2() {
        Bl.g gVar = this.featureEntryPoint;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.x("featureEntryPoint");
        return null;
    }

    public final zl.k d2() {
        zl.k kVar = this.featureManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.x("featureManager");
        return null;
    }

    public final Gh.b f2() {
        Gh.b bVar = this.inboxManager;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.x("inboxManager");
        return null;
    }

    public final Dl.e g2() {
        Dl.e eVar = this.meijerIntent;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.x("meijerIntent");
        return null;
    }

    public final C17693b getAppBackgroundManager() {
        C17693b c17693b = this.appBackgroundManager;
        if (c17693b != null) {
            return c17693b;
        }
        Intrinsics.x("appBackgroundManager");
        return null;
    }

    public final C18335a getAppPrefManager() {
        C18335a c18335a = this.appPrefManager;
        if (c18335a != null) {
            return c18335a;
        }
        Intrinsics.x("appPrefManager");
        return null;
    }

    public final C18499b getAppUpdateConfigManager() {
        C18499b c18499b = this.appUpdateConfigManager;
        if (c18499b != null) {
            return c18499b;
        }
        Intrinsics.x("appUpdateConfigManager");
        return null;
    }

    public final C18197h getNotificationManager() {
        C18197h c18197h = this.notificationManager;
        if (c18197h != null) {
            return c18197h;
        }
        Intrinsics.x("notificationManager");
        return null;
    }

    public final yo.k getUserManager() {
        yo.k kVar = this.userManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.x("userManager");
        return null;
    }

    public final Ch.d j2() {
        Ch.d dVar = this.preferencesRepository;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.x("preferencesRepository");
        return null;
    }

    public final C17278c k2() {
        C17278c c17278c = this.rateAndTipUpdater;
        if (c17278c != null) {
            return c17278c;
        }
        Intrinsics.x("rateAndTipUpdater");
        return null;
    }

    public final Tq.j l2() {
        Tq.j jVar = this.storeProvider;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.x("storeProvider");
        return null;
    }

    @Override // tp.C17278c.a
    public void onUpdateRateAndTip(Builder builder, EnumC17276a flowType) {
        Intrinsics.j(builder, "builder");
        Intrinsics.j(flowType, "flowType");
        e2().updateRatedAndTippedOrder(builder, flowType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H2() {
        e2().I0(k0.AbstractC11778l.b.f99149a);
        startActivity(Bl.p.f(Bl.p.f3148a, this, false, true, false, false, 26, null));
    }

    private final void L2() {
        e2().W0();
    }

    private final void N2() {
        if (!getAppBackgroundManager().getAppWasInBackground() && m2().getIsLoggedIn() && Ck.a.f5180a.a(getAppPrefManager().p(), getAppPrefManager().k(), getAppPrefManager().i(), getAppPrefManager().g(), getAppPrefManager().l(), getAppPrefManager().j(), getAppPrefManager().h(), b2().getVersionCode())) {
            new com.meijer.mobile.ui.common.rateapp.a(this, this, a2()).f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O2(int points, boolean fromCloseButton, boolean isClaimPointsNowButton) {
        AbstractC14762i.Extra extraB;
        e2().I0(k0.AbstractC11778l.b.f99149a);
        InterfaceC14523a interfaceC14523aA2 = a2();
        AbstractC14761h.Action actionA = C14756c.a("mPerks points expiry drawer");
        AbstractC14762i.Page pageC = C14756c.c("Meijer:Home Page");
        AbstractC14762i.PageType pageTypeD = C14756c.d("index");
        AbstractC14762i.Section sectionG = C14756c.g("mPerks 4.0");
        AbstractC14762i.Extra extraB2 = C14756c.b("mperksPoints", String.valueOf(points));
        if (fromCloseButton) {
            extraB = C14756c.b("drawerClosed", "true");
        } else if (isClaimPointsNowButton) {
            extraB = C14756c.b("claimPointsNow", "true");
        } else {
            extraB = C14756c.b("claimPointsLater", "true");
        }
        interfaceC14523aA2.h(actionA, pageC, pageTypeD, sectionG, extraB2, extraB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q2(String orderId, String externalShopperId, boolean shouldNavigate) {
        e2().H0(new k0.AbstractC11773g.UpdateRateAndTipNotification(orderId, externalShopperId, shouldNavigate));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X1(HomeComposeActivity homeComposeActivity, DialogInterface dialogInterface, int i10) {
        homeComposeActivity.openMeijerPlayStorePage();
    }

    private final void checkForAppUpdate() {
        getAppUpdateConfigManager().h(new Function0() { // from class: com.meijer.mobile.home.ux.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeComposeActivity.W1(this.f98833a);
            }
        }, new Function1() { // from class: com.meijer.mobile.home.ux.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeComposeActivity.Z1(this.f98834a, (C17897b) obj);
            }
        });
    }

    private final MeijerUser m2() {
        return e2().F0().getValue().getUser();
    }

    private final void n2() {
        if (m2().getIsLoggedIn()) {
            a2().b(C14756c.a("event: header manage account"), new Function1() { // from class: com.meijer.mobile.home.ux.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HomeComposeActivity.o2((TrackingData) obj);
                }
            });
            startActivity(Bl.a.f3119a.h(this, d2().e(AbstractC18503f.C18504a.f172866h)));
        } else if (d2().e(AbstractC18503f.h0.f172881h)) {
            startActivity(Bl.u.f3153a.a(this));
        } else {
            startActivity(Bl.k.b(this, false, null, null, null, null, null, 126, null));
        }
    }

    private final void openMeijerPlayStorePage() {
        try {
            startActivity(g2().W(this));
        } catch (ActivityNotFoundException e10) {
            qw.a.INSTANCE.f(e10, "Play Store not found, opening browser link", new Object[0]);
            startActivity(g2().X(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p2(C14274a result) {
        if (result.getResultCode() == 223418) {
            e2().t0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q2(C14274a result) {
        int i10;
        switch (result.getResultCode()) {
            case 867530912:
                i10 = C17284b.f163321g;
                break;
            case 867530913:
                i10 = C17284b.f163319f;
                break;
            default:
                i10 = 0;
                break;
        }
        if (i10 != 0) {
            e2().I0(new k0.AbstractC11778l.DisplaySubstitutionToast(i10));
        }
    }

    private final void r2(String url, String campaignIdValue) {
        Intent intentN = g2().n(this, url);
        if (intentN != null) {
            intentN.addFlags(536870912);
            intentN.putExtra("com.meijer.intent.extra.DASHBOARD_LINK", true);
            intentN.putExtra("campaignIdValue", campaignIdValue);
            startActivity(intentN);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s2(String deeplink, String analytics, String name, boolean isFromViewAll) {
        int iP = g2().P(deeplink);
        if (iP != 4000) {
            if (iP != 4100) {
                Intent intentN = g2().n(this, deeplink);
                if (intentN != null) {
                    if (analytics != null) {
                        intentN.putExtra("broseDepartmentCarouselAnalytics", analytics);
                        if (isFromViewAll) {
                            intentN.putExtra("homePageCarouselAnalytics", V1(name) + ':');
                        }
                    }
                    startActivity(intentN);
                    return;
                }
                return;
            }
            Intent intentY = g2().Y(Uri.parse(deeplink), this, 4100);
            if (intentY != null) {
                if (analytics != null) {
                    intentY.putExtra("broseDepartmentCarouselAnalytics", analytics);
                    if (isFromViewAll) {
                        intentY.putExtra("homePageCarouselAnalytics", V1(name));
                    }
                }
                startActivity(intentY.putExtra("KEY_CURATED_CAROUSEL", name));
                return;
            }
            return;
        }
        Intent intentA0 = Dl.e.a0(g2(), Uri.parse(deeplink), name, false, 4, null);
        if (intentA0 != null) {
            if (analytics != null) {
                intentA0.putExtra("broseDepartmentCarouselAnalytics", analytics);
                intentA0.putExtra("homePageCarouselAnalytics", V1(name));
            }
            startActivity(intentA0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateNotificationPreference(boolean enabled) {
        f2().a();
        f2().d(enabled, getUserManager().b());
        getUserManager().R(enabled);
        C15809k.d(C6173t.a(this), null, null, new n(enabled, null), 3, null);
    }

    private final void v2(nk.f productId, String previousTrackAction) {
        startActivity(c2().s(productId, false, true, previousTrackAction));
    }

    @Override // com.meijer.mobile.home.ux.Hilt_HomeComposeActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.startForResult = registerForActivityResult(new h.i(), new InterfaceC14275b() { // from class: com.meijer.mobile.home.ux.a
            @Override // g.InterfaceC14275b
            public final void a(Object obj) {
                HomeComposeActivity.y2(this.f98829a, (C14274a) obj);
            }
        });
        h2().w(0);
        L2();
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(1508783469, true, new c()), 1, null);
        if (Build.VERSION.SDK_INT >= 33) {
            requestNotificationPermission();
        } else if (f2().g()) {
            e2().n0(k0.AbstractC11776j.i.f99097a);
        }
    }

    @Override // com.meijer.mobile.home.ux.Hilt_HomeComposeActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        k2().c("HomeActivity");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        androidx.appcompat.app.c cVar = this.notificationDialog;
        if (cVar != null) {
            if (!cVar.isShowing()) {
                cVar = null;
            }
            if (cVar != null) {
                cVar.dismiss();
            }
        }
    }

    @Override // Lr.d
    public void onRateAppNoThanks() {
        C18335a.B(getAppPrefManager(), 0L, 1, null);
    }

    @Override // Lr.d
    public void onRateAppNoThanksCurrentVersion() {
        getAppPrefManager().y(b2().getVersionCode());
    }

    @Override // Lr.d
    public void onRateAppNow() {
        getAppPrefManager().C(b2().getVersionCode());
        openMeijerPlayStorePage();
    }

    @Override // Lr.d
    public void onRateAppRemindLater() {
        C18335a.E(getAppPrefManager(), 0L, 1, null);
    }

    @Override // Lr.d
    public void onRateAppSendEmail() {
        getAppPrefManager().z(b2().getVersionCode());
        try {
            startActivity(g2().B(this));
        } catch (ActivityNotFoundException unused) {
            new Qj.j(this, r0.f99346e, new Object[0]).g();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        FS.page("Meijer Home Page").start();
        e2().G0();
        k2().a("HomeActivity", this);
        N2();
        if (!this.isShowingUpdatePrompt) {
            checkForAppUpdate();
        }
    }
}
