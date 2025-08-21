package com.meijer.mobile.meijer.activity.find.viewmodel;

import Ao.C2898u;
import Ao.W;
import Co.ProductFullDetails;
import Ho.ProductSponsorship;
import Kp.ProductReviewFullDetails;
import androidx.view.InterfaceC6157f;
import androidx.view.InterfaceC6172s;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.meijer.activity.find.productdetail.AbstractC12245f;
import com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailFeatureFlags;
import com.meijer.mobile.meijer.activity.find.productdetail.SuggestedProductCarouselDecorator;
import com.meijer.mobile.meijer.activity.find.productdetail.a2;
import com.meijer.mobile.meijer.activity.find.productdetail.m2;
import com.meijer.mobile.meijer.activity.find.viewmodel.AbstractC12325a;
import com.meijer.mobile.meijer.activity.find.viewmodel.AbstractC12425x;
import com.meijer.mobile.meijer.activity.find.viewmodel.G0;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import dl.C13702d;
import ev.C13889a;
import fj.Entry;
import fj.EntryChange;
import fj.ShoppingCart;
import gi.C14375c;
import hi.InterfaceC14523a;
import ii.C14756c;
import ii.TrackingData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import lk.AbstractC15516a;
import lk.AbstractC15517b;
import mv.AbstractC15779K;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16555H;
import pv.C16563h;
import pv.InterfaceC16548A;
import pv.InterfaceC16549B;
import pv.InterfaceC16553F;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;
import qp.C16753b;
import qw.a;
import sp.C17115a;
import sp.ProductState;
import tr.C17284b;
import uk.AbstractC17440a;
import uk.c;
import ur.AbstractC17454a;
import vr.AbstractC17720a;
import wl.CartEntry;
import wr.InterfaceC17909a;
import zl.AbstractC18503f;
import zs.C18546a;

@Metadata(d1 = {"\u0000\u0080\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u0085\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0003:\u0004¤\u0001¦\u0001B£\u0001\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\b\b\u0001\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J)\u00102\u001a\u0002012\u0006\u0010,\u001a\u00020\u00032\u0012\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.0-¢\u0006\u0004\b2\u00103J\u0015\u00106\u001a\u0002012\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u0002012\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u000201H\u0014¢\u0006\u0004\b<\u0010=J\u0015\u0010@\u001a\u0002012\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001a\u0002012\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u0002012\u0006\u0010C\u001a\u00020FH\u0016¢\u0006\u0004\bG\u0010HJ\u0015\u0010J\u001a\u0002012\u0006\u0010C\u001a\u00020I¢\u0006\u0004\bJ\u0010KJ\u0015\u0010M\u001a\u0002012\u0006\u0010C\u001a\u00020L¢\u0006\u0004\bM\u0010NJ\u0015\u0010P\u001a\u0002012\u0006\u0010C\u001a\u00020O¢\u0006\u0004\bP\u0010QJ\u0015\u0010T\u001a\u0002012\u0006\u0010S\u001a\u00020R¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u000201H\u0002¢\u0006\u0004\bV\u0010=J+\u0010X\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.2\u0012\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.0-H\u0002¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u000201H\u0002¢\u0006\u0004\bZ\u0010=J\u000f\u0010[\u001a\u000201H\u0002¢\u0006\u0004\b[\u0010=J\u0011\u0010]\u001a\u0004\u0018\u00010\\H\u0002¢\u0006\u0004\b]\u0010^J/\u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.0-2\u0012\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.0_H\u0002¢\u0006\u0004\b`\u0010aJ\u000f\u0010b\u001a\u000201H\u0002¢\u0006\u0004\bb\u0010=J\u000f\u0010c\u001a\u000201H\u0002¢\u0006\u0004\bc\u0010=J\u0017\u0010d\u001a\u0002012\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\bd\u00107J\u0018\u0010e\u001a\u0002012\u0006\u00105\u001a\u000204H\u0082@¢\u0006\u0004\be\u0010fJ\u0018\u0010h\u001a\u0002012\u0006\u0010g\u001a\u00020/H\u0082@¢\u0006\u0004\bh\u0010iJ\u0017\u0010l\u001a\u0002012\u0006\u0010k\u001a\u00020jH\u0002¢\u0006\u0004\bl\u0010mJ\u001f\u0010q\u001a\u0002012\u0006\u0010n\u001a\u00020j2\u0006\u0010p\u001a\u00020oH\u0002¢\u0006\u0004\bq\u0010rJ\u0017\u0010t\u001a\u0002012\u0006\u0010s\u001a\u00020/H\u0002¢\u0006\u0004\bt\u0010uJ\u0017\u0010x\u001a\u0002012\u0006\u0010w\u001a\u00020vH\u0002¢\u0006\u0004\bx\u0010yJ\u001f\u0010~\u001a\u0002012\u0006\u0010{\u001a\u00020z2\u0006\u0010}\u001a\u00020|H\u0002¢\u0006\u0004\b~\u0010\u007fJ\u001e\u0010\u0082\u0001\u001a\u00030\u0081\u00012\t\b\u0001\u0010\u0080\u0001\u001a\u00020>H\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u001c\u0010\u0086\u0001\u001a\u0002012\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001H\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001c\u0010\u0088\u0001\u001a\u0002012\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001H\u0002¢\u0006\u0006\b\u0088\u0001\u0010\u0087\u0001J\u001d\u0010\u0089\u0001\u001a\u0002012\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001H\u0082@¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u001b\u0010\u008b\u0001\u001a\u0002012\u0007\u0010\u0085\u0001\u001a\u000204H\u0082@¢\u0006\u0005\b\u008b\u0001\u0010fJ\u001d\u0010\u008c\u0001\u001a\u0002012\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001H\u0082@¢\u0006\u0006\b\u008c\u0001\u0010\u008a\u0001J\u001d\u0010\u008d\u0001\u001a\u0002012\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001H\u0082@¢\u0006\u0006\b\u008d\u0001\u0010\u008a\u0001J+\u0010\u0090\u0001\u001a\u0002012\r\u0010\u008e\u0001\u001a\b\u0012\u0004\u0012\u00020/0-2\b\u0010\u008f\u0001\u001a\u00030\u0081\u0001H\u0002¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J!\u0010\u0093\u0001\u001a\u0002012\r\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00020j0-H\u0002¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J,\u0010\u0099\u0001\u001a\u0002012\u0007\u0010C\u001a\u00030\u0095\u00012\u000f\u0010\u0098\u0001\u001a\n\u0012\u0005\u0012\u00030\u0097\u00010\u0096\u0001H\u0002¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J#\u0010\u009c\u0001\u001a\u0002012\u000f\u0010\u009b\u0001\u001a\n\u0012\u0005\u0012\u00030\u0097\u00010\u0096\u0001H\u0002¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J#\u0010\u009e\u0001\u001a\u0002012\u000f\u0010\u0098\u0001\u001a\n\u0012\u0005\u0012\u00030\u0097\u00010\u0096\u0001H\u0002¢\u0006\u0006\b\u009e\u0001\u0010\u009d\u0001J#\u0010\u009f\u0001\u001a\u0002012\u000f\u0010\u0098\u0001\u001a\n\u0012\u0005\u0012\u00030\u0097\u00010\u0096\u0001H\u0002¢\u0006\u0006\b\u009f\u0001\u0010\u009d\u0001J%\u0010 \u0001\u001a\u0004\u0018\u00010j2\u000f\u0010\u0098\u0001\u001a\n\u0012\u0005\u0012\u00030\u0097\u00010\u0096\u0001H\u0002¢\u0006\u0006\b \u0001\u0010¡\u0001J\u0012\u0010¢\u0001\u001a\u00020jH\u0002¢\u0006\u0006\b¢\u0001\u0010£\u0001R\u0016\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u0016\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u0016\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u0016\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u0016\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R\u0016\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R\u0016\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R\u0016\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u0016\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u0016\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001R\u0016\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R\u0016\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0001\u0010Ç\u0001R\u0016\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001R\u0018\u0010Í\u0001\u001a\u00030Ê\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bË\u0001\u0010Ì\u0001R\u001e\u0010Ñ\u0001\u001a\t\u0012\u0004\u0012\u00020|0Î\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÏ\u0001\u0010Ð\u0001R#\u0010×\u0001\u001a\t\u0012\u0004\u0012\u00020|0Ò\u00018\u0006¢\u0006\u0010\n\u0006\bÓ\u0001\u0010Ô\u0001\u001a\u0006\bÕ\u0001\u0010Ö\u0001R\u001f\u0010Ü\u0001\u001a\n\u0012\u0005\u0012\u00030Ù\u00010Ø\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÚ\u0001\u0010Û\u0001R$\u0010â\u0001\u001a\n\u0012\u0005\u0012\u00030Ù\u00010Ý\u00018\u0006¢\u0006\u0010\n\u0006\bÞ\u0001\u0010ß\u0001\u001a\u0006\bà\u0001\u0010á\u0001R\u001f\u0010å\u0001\u001a\n\u0012\u0005\u0012\u00030ã\u00010Ø\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bä\u0001\u0010Û\u0001R$\u0010è\u0001\u001a\n\u0012\u0005\u0012\u00030ã\u00010Ý\u00018\u0006¢\u0006\u0010\n\u0006\bæ\u0001\u0010ß\u0001\u001a\u0006\bç\u0001\u0010á\u0001R\u001e\u0010ì\u0001\u001a\u00070jj\u0003`é\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bê\u0001\u0010ë\u0001R\u0017\u0010ï\u0001\u001a\u00020>8\u0002X\u0082D¢\u0006\b\n\u0006\bí\u0001\u0010î\u0001R*\u0010ó\u0001\u001a\u0004\u0018\u00010j8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bð\u0001\u0010ë\u0001\u001a\u0006\bñ\u0001\u0010£\u0001\"\u0005\bò\u0001\u0010mR*\u0010÷\u0001\u001a\u0004\u0018\u00010j8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bô\u0001\u0010ë\u0001\u001a\u0006\bõ\u0001\u0010£\u0001\"\u0005\bö\u0001\u0010mR\u001a\u0010ú\u0001\u001a\u00030\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bø\u0001\u0010ù\u0001R*\u0010\u0080\u0002\u001a\u00030\u0081\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bû\u0001\u0010ù\u0001\u001a\u0006\bü\u0001\u0010ý\u0001\"\u0006\bþ\u0001\u0010ÿ\u0001R1\u0010\u0084\u0002\u001a\u001c\u0012\u0017\u0012\u0015\u0012\t\u0012\u00070jj\u0003`\u0082\u0002\u0012\u0005\u0012\u00030\u0095\u00010\u0081\u00020Ø\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0002\u0010Û\u0001¨\u0006\u0086\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/c1;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "", "LRo/c;", "productsRepository", "Lil/m;", "cartRepository", "LTq/j;", "storeProvider", "Lyo/k;", "userManager", "LEq/a;", "favoritesListRepository", "LEq/b;", "shoppingListRepository", "Lwr/f;", "cartInteractor", "Lcom/google/firebase/crashlytics/a;", "firebaseCrashlytics", "Lzl/k;", "featureManager", "Lhi/a;", "analyticsEngine", "Lqp/b;", "beaconClient", "Lsp/Y;", "productStateRepository", "Lsp/a;", "multiChannelProductsStateRepository", "Lpp/g;", "suggestionsRepository", "Lpp/e;", "sponsorshipsDataStore", "Lpp/d;", "productMetadataStore", "LKp/g;", "bazaarVoiceManager", "Ldl/d;", "couponsRepository", "Lmv/K;", "ioDispatcher", "<init>", "(LRo/c;Lil/m;LTq/j;Lyo/k;LEq/a;LEq/b;Lwr/f;Lcom/google/firebase/crashlytics/a;Lzl/k;Lhi/a;Lqp/b;Lsp/Y;Lsp/a;Lpp/g;Lpp/e;Lpp/d;LKp/g;Ldl/d;Lmv/K;)V", "key", "", "Lsp/b;", "LCo/h;", "productState", "", "Z0", "(Ljava/lang/Object;Ljava/util/List;)V", "Lnk/f;", "productIdentity", "h1", "(Lnk/f;)V", "Landroidx/lifecycle/s;", "owner", "onResume", "(Landroidx/lifecycle/s;)V", "onCleared", "()V", "", "count", "V0", "(I)V", "Llk/b;", "action", "U0", "(Llk/b;)V", "Llk/a;", "T0", "(Llk/a;)V", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/x;", "S0", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/x;)V", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/a;", "R0", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/a;)V", "Lcom/meijer/mobile/meijer/activity/find/productdetail/a2;", "Q0", "(Lcom/meijer/mobile/meijer/activity/find/productdetail/a2;)V", "Lcom/meijer/mobile/meijer/activity/find/productdetail/m2;", "result", "Y0", "(Lcom/meijer/mobile/meijer/activity/find/productdetail/m2;)V", "K0", "productStates", "X0", "(Ljava/util/List;)Lsp/b;", "P0", "d1", "LAo/W$a;", "y0", "()LAo/W$a;", "", "J0", "(Ljava/util/List;)Ljava/util/List;", "q0", "L0", "u0", "I0", "(Lnk/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "productFullDetails", "v0", "(LCo/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "productCode", "p0", "(Ljava/lang/String;)V", "reviewId", "LKp/a;", "reviewFeedbackVote", "t0", "(Ljava/lang/String;LKp/a;)V", "productDetails", "o1", "(LCo/h;)V", "", "quantityToUpdate", "r1", "(D)V", "", "throwable", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0;", "event", "a1", "(Ljava/lang/Throwable;Lcom/meijer/mobile/meijer/activity/find/viewmodel/G0;)V", "errorMessageId", "", "s1", "(I)Z", "Lnk/c;", "product", "u1", "(Lnk/c;)V", "t1", "k0", "(Lnk/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c1", "j0", "b1", "productList", "isFrequentlyBoughtTogetherImpression", "o0", "(Ljava/util/List;Z)V", "beacon", "e1", "(Ljava/util/List;)V", "Lcom/meijer/mobile/meijer/activity/find/productdetail/f$a;", "Luk/c;", "Lfj/j;", "entryChange", "W0", "(Lcom/meijer/mobile/meijer/activity/find/productdetail/f$a;Luk/c;)V", "changeRes", "H0", "(Luk/c;)V", "G0", "C0", "x0", "(Luk/c;)Ljava/lang/String;", "A0", "()Ljava/lang/String;", "a", "LRo/c;", "b", "Lil/m;", "c", "LTq/j;", "d", "Lyo/k;", "e", "LEq/a;", "f", "LEq/b;", "g", "Lwr/f;", "h", "Lcom/google/firebase/crashlytics/a;", "i", "Lzl/k;", "j", "Lhi/a;", "k", "Lqp/b;", "l", "Lsp/Y;", "m", "Lsp/a;", "n", "Lpp/g;", "o", "Lpp/e;", "p", "Lpp/d;", "q", "LKp/g;", "r", "Ldl/d;", "s", "Lmv/K;", "LJu/a;", "t", "LJu/a;", "disposables", "Lpv/A;", "u", "Lpv/A;", "_eventFlow", "Lpv/F;", "v", "Lpv/F;", "z0", "()Lpv/F;", "eventFlow", "Lpv/B;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/W0;", "w", "Lpv/B;", "_featureFlags", "Lpv/P;", "x", "Lpv/P;", "getFeatureFlags", "()Lpv/P;", "featureFlags", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/j1;", "y", "_detailsFlow", "z", "B0", "productDetailFlow", "Lcom/meijer/mobile/core/model/common/ResourceId;", "A", "Ljava/lang/String;", "cartId", "B", "I", "limitReviews", "C", "getPreviousTrackAction", "g1", "previousTrackAction", "D", "w0", "f1", "campaignIdValue", "E", "Z", "quantityChangeForFBT", "F", "getCarouselIsVisibleEncountered", "()Z", "setCarouselIsVisibleEncountered", "(Z)V", "carouselIsVisibleEncountered", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "G", "actionsFlow", "H", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C12333c1 extends androidx.view.c0 implements InterfaceC6157f {

    /* renamed from: I, reason: collision with root package name */
    public static final int f109007I = 8;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private String cartId;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final int limitReviews;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private String previousTrackAction;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private String campaignIdValue;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private boolean quantityChangeForFBT;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private boolean carouselIsVisibleEncountered;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<Map<String, AbstractC12245f.Update>> actionsFlow;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ro.c productsRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final il.m cartRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Tq.j storeProvider;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Eq.a favoritesListRepository;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Eq.b shoppingListRepository;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final wr.f cartInteractor;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final com.google.firebase.crashlytics.a firebaseCrashlytics;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final zl.k featureManager;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final C16753b beaconClient;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final sp.Y productStateRepository;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final C17115a multiChannelProductsStateRepository;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final pp.g suggestionsRepository;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final pp.e sponsorshipsDataStore;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final pp.d productMetadataStore;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Kp.g bazaarVoiceManager;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final C13702d couponsRepository;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Ju.a disposables;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<G0> _eventFlow;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16553F<G0> eventFlow;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ProductDetailFeatureFlags> _featureFlags;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final pv.P<ProductDetailFeatureFlags> featureFlags;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ProductDetailsState> _detailsFlow;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final pv.P<ProductDetailsState> productDetailFlow;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$onAction$4", f = "ProductDetailViewModel.kt", l = {1048}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$A */
    static final class A extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f109041a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC15516a f109043c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12333c1.this.new A(this.f109043c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        A(AbstractC15516a abstractC15516a, Continuation<? super A> continuation) {
            super(2, continuation);
            this.f109043c = abstractC15516a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((A) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f109041a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C12333c1 c12333c1 = C12333c1.this;
                nk.c product = ((AbstractC15516a.Remove) this.f109043c).getProduct();
                this.f109041a = 1;
                if (c12333c1.b1(product, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$onAction$6", f = "ProductDetailViewModel.kt", l = {1075}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$B */
    static final class B extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f109044a;

        B(Continuation<? super B> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12333c1.this.new B(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((B) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f109044a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = C12333c1.this._eventFlow;
                G0.RequireLogin requireLogin = new G0.RequireLogin(Cj.o.f5056d);
                this.f109044a = 1;
                if (interfaceC16548A.emit(requireLogin, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$onAction$8", f = "ProductDetailViewModel.kt", l = {1100}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$C */
    static final class C extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f109046a;

        C(Continuation<? super C> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12333c1.this.new C(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f109046a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = C12333c1.this._eventFlow;
                G0.j jVar = G0.j.f108763a;
                this.f109046a = 1;
                if (interfaceC16548A.emit(jVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$onSubstitutionResult$1", f = "ProductDetailViewModel.kt", l = {1599, 1600}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$D */
    static final class D extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f109048a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m2 f109049b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C12333c1 f109050c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        D(m2 m2Var, C12333c1 c12333c1, Continuation<? super D> continuation) {
            super(2, continuation);
            this.f109049b = m2Var;
            this.f109050c = c12333c1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new D(this.f109049b, this.f109050c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((D) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        
            if (r5.emit(r1, r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
        
            if (r5.emit(r1, r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
        
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
                int r1 = r4.f109048a
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
                goto L52
            L1b:
                kotlin.ResultKt.b(r5)
                com.meijer.mobile.meijer.activity.find.productdetail.m2 r5 = r4.f109049b
                com.meijer.mobile.meijer.activity.find.productdetail.m2$a r1 = com.meijer.mobile.meijer.activity.find.productdetail.m2.a.f108509a
                boolean r1 = kotlin.jvm.internal.Intrinsics.e(r5, r1)
                if (r1 == 0) goto L39
                com.meijer.mobile.meijer.activity.find.viewmodel.c1 r5 = r4.f109050c
                pv.A r5 = com.meijer.mobile.meijer.activity.find.viewmodel.C12333c1.c0(r5)
                com.meijer.mobile.meijer.activity.find.viewmodel.G0$e r1 = com.meijer.mobile.meijer.activity.find.viewmodel.G0.e.f108757a
                r4.f109048a = r3
                java.lang.Object r5 = r5.emit(r1, r4)
                if (r5 != r0) goto L52
                goto L51
            L39:
                com.meijer.mobile.meijer.activity.find.productdetail.m2$b r1 = com.meijer.mobile.meijer.activity.find.productdetail.m2.b.f108510a
                boolean r5 = kotlin.jvm.internal.Intrinsics.e(r5, r1)
                if (r5 == 0) goto L55
                com.meijer.mobile.meijer.activity.find.viewmodel.c1 r5 = r4.f109050c
                pv.A r5 = com.meijer.mobile.meijer.activity.find.viewmodel.C12333c1.c0(r5)
                com.meijer.mobile.meijer.activity.find.viewmodel.G0$f r1 = com.meijer.mobile.meijer.activity.find.viewmodel.G0.f.f108758a
                r4.f109048a = r2
                java.lang.Object r5 = r5.emit(r1, r4)
                if (r5 != r0) goto L52
            L51:
                return r0
            L52:
                kotlin.Unit r5 = kotlin.Unit.f143329a
                return r5
            L55:
                kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                r5.<init>()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12333c1.D.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$postError$1", f = "ProductDetailViewModel.kt", l = {899}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$E */
    static final class E extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f109051a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ G0 f109053c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        E(G0 g02, Continuation<? super E> continuation) {
            super(2, continuation);
            this.f109053c = g02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12333c1.this.new E(this.f109053c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((E) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f109051a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = C12333c1.this._eventFlow;
                G0 g02 = this.f109053c;
                this.f109051a = 1;
                if (interfaceC16548A.emit(g02, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel", f = "ProductDetailViewModel.kt", l = {1005}, m = "removeFromFavoriteList")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$F */
    static final class F extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f109054a;

        /* renamed from: b, reason: collision with root package name */
        Object f109055b;

        /* renamed from: c, reason: collision with root package name */
        Object f109056c;

        /* renamed from: d, reason: collision with root package name */
        Object f109057d;

        /* renamed from: e, reason: collision with root package name */
        Object f109058e;

        /* renamed from: f, reason: collision with root package name */
        int f109059f;

        /* renamed from: g, reason: collision with root package name */
        int f109060g;

        /* renamed from: h, reason: collision with root package name */
        int f109061h;

        /* renamed from: i, reason: collision with root package name */
        int f109062i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f109063j;

        /* renamed from: l, reason: collision with root package name */
        int f109065l;

        F(Continuation<? super F> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f109063j = obj;
            this.f109065l |= Integer.MIN_VALUE;
            return C12333c1.this.b1(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$removeFromFavoriteList$5$1", f = "ProductDetailViewModel.kt", l = {1011}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$G */
    static final class G extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f109066a;

        G(Continuation<? super G> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12333c1.this.new G(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((G) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f109066a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = C12333c1.this._eventFlow;
                G0.UpdateShoppingOrFavoriteListFailed updateShoppingOrFavoriteListFailed = new G0.UpdateShoppingOrFavoriteListFailed(C18546a.f173201h, C18546a.f173203j);
                this.f109066a = 1;
                if (interfaceC16548A.emit(updateShoppingOrFavoriteListFailed, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel", f = "ProductDetailViewModel.kt", l = {969}, m = "removeFromShoppingList")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$H */
    static final class H extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f109068a;

        /* renamed from: b, reason: collision with root package name */
        Object f109069b;

        /* renamed from: c, reason: collision with root package name */
        Object f109070c;

        /* renamed from: d, reason: collision with root package name */
        Object f109071d;

        /* renamed from: e, reason: collision with root package name */
        Object f109072e;

        /* renamed from: f, reason: collision with root package name */
        int f109073f;

        /* renamed from: g, reason: collision with root package name */
        int f109074g;

        /* renamed from: h, reason: collision with root package name */
        int f109075h;

        /* renamed from: i, reason: collision with root package name */
        int f109076i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f109077j;

        /* renamed from: l, reason: collision with root package name */
        int f109079l;

        H(Continuation<? super H> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f109077j = obj;
            this.f109079l |= Integer.MIN_VALUE;
            return C12333c1.this.c1(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$removeFromShoppingList$5$1", f = "ProductDetailViewModel.kt", l = {975}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$I */
    static final class I extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f109080a;

        I(Continuation<? super I> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12333c1.this.new I(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((I) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f109080a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = C12333c1.this._eventFlow;
                G0.UpdateShoppingOrFavoriteListFailed updateShoppingOrFavoriteListFailed = new G0.UpdateShoppingOrFavoriteListFailed(C18546a.f173202i, C18546a.f173203j);
                this.f109080a = 1;
                if (interfaceC16548A.emit(updateShoppingOrFavoriteListFailed, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$resetQuantitySteppers$1", f = "ProductDetailViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$J */
    static final class J extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f109082a;

        J(Continuation<? super J> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12333c1.this.new J(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((J) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            ProductDetailsState productDetailsState;
            ArrayList arrayList;
            IntrinsicsKt.f();
            if (this.f109082a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC16549B interfaceC16549B = C12333c1.this._detailsFlow;
            do {
                value = interfaceC16549B.getValue();
                productDetailsState = (ProductDetailsState) value;
                List<SuggestedProductCarouselDecorator> listS = productDetailsState.s();
                if (listS != null) {
                    List<SuggestedProductCarouselDecorator> list = listS;
                    arrayList = new ArrayList(CollectionsKt.x(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(SuggestedProductCarouselDecorator.v((SuggestedProductCarouselDecorator) it.next(), null, null, null, null, null, null, false, false, null, null, null, null, 0.0d, false, true, null, null, null, false, null, 1023999, null));
                    }
                } else {
                    arrayList = null;
                }
            } while (!interfaceC16549B.e(value, ProductDetailsState.d(productDetailsState, null, null, null, null, null, 0, null, false, null, null, null, 0, null, null, null, false, false, null, arrayList, null, null, null, null, 8126463, null)));
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$sendCriteoBeacon$1", f = "ProductDetailViewModel.kt", l = {1248}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$K */
    static final class K extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f109084a;

        /* renamed from: b, reason: collision with root package name */
        Object f109085b;

        /* renamed from: c, reason: collision with root package name */
        Object f109086c;

        /* renamed from: d, reason: collision with root package name */
        Object f109087d;

        /* renamed from: e, reason: collision with root package name */
        Object f109088e;

        /* renamed from: f, reason: collision with root package name */
        Object f109089f;

        /* renamed from: g, reason: collision with root package name */
        int f109090g;

        /* renamed from: h, reason: collision with root package name */
        int f109091h;

        /* renamed from: i, reason: collision with root package name */
        int f109092i;

        /* renamed from: j, reason: collision with root package name */
        int f109093j;

        /* renamed from: k, reason: collision with root package name */
        private /* synthetic */ Object f109094k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ List<String> f109095l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ C12333c1 f109096m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        K(List<String> list, C12333c1 c12333c1, Continuation<? super K> continuation) {
            super(2, continuation);
            this.f109095l = list;
            this.f109096m = c12333c1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            K k10 = new K(this.f109095l, this.f109096m, continuation);
            k10.f109094k = obj;
            return k10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((K) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            InterfaceC15783O interfaceC15783O;
            Iterable iterable;
            C12333c1 c12333c1;
            int i10;
            Iterator it;
            InterfaceC15783O interfaceC15783O2;
            int i11;
            Object objF = IntrinsicsKt.f();
            int i12 = this.f109093j;
            try {
                if (i12 != 0) {
                    if (i12 == 1) {
                        i10 = this.f109091h;
                        i11 = this.f109090g;
                        it = (Iterator) this.f109087d;
                        iterable = (Iterable) this.f109086c;
                        interfaceC15783O2 = (InterfaceC15783O) this.f109085b;
                        c12333c1 = (C12333c1) this.f109084a;
                        interfaceC15783O = (InterfaceC15783O) this.f109094k;
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    interfaceC15783O = (InterfaceC15783O) this.f109094k;
                    List<String> list = this.f109095l;
                    C12333c1 c12333c12 = this.f109096m;
                    Result.Companion companion = Result.INSTANCE;
                    List<String> list2 = list;
                    iterable = list2;
                    c12333c1 = c12333c12;
                    i10 = 0;
                    it = list2.iterator();
                    interfaceC15783O2 = interfaceC15783O;
                    i11 = 0;
                }
                while (it.hasNext()) {
                    Object next = it.next();
                    String str = (String) next;
                    C16753b c16753b = c12333c1.beaconClient;
                    String strF = Bk.b.f(str);
                    this.f109094k = interfaceC15783O;
                    this.f109084a = c12333c1;
                    this.f109085b = interfaceC15783O2;
                    this.f109086c = iterable;
                    this.f109087d = it;
                    this.f109088e = next;
                    this.f109089f = str;
                    this.f109090g = i11;
                    this.f109091h = i10;
                    this.f109092i = 0;
                    this.f109093j = 1;
                    if (c16753b.a(strF, this) == objF) {
                        return objF;
                    }
                }
                objB = Result.b(Unit.f143329a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
            }
            Throwable thE = Result.e(objB);
            if (thE != null) {
                mv.E0.i(interfaceC15783O.getCoroutineContext());
                if (!(thE instanceof Error)) {
                    qw.a.INSTANCE.f(thE, "Error sending Criteo beacon", new Object[0]);
                } else {
                    throw thE;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$L */
    /* synthetic */ class L extends AdaptedFunctionReference implements Function1<List<? extends ProductState<ProductFullDetails>>, Unit> {
        L(Object obj) {
            super(1, obj, C12333c1.class, "onProductState", "onProductState(Ljava/util/List;)Lcom/meijer/mobile/product/state/ProductState;", 8);
        }

        public final void a(List<ProductState<ProductFullDetails>> p02) {
            Intrinsics.j(p02, "p0");
            ((C12333c1) this.f143708a).X0(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends ProductState<ProductFullDetails>> list) {
            a(list);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$M */
    /* synthetic */ class M extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        M(Object obj) {
            super(1, obj, a.Companion.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((a.Companion) this.receiver).e(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$N */
    /* synthetic */ class N extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        N(Object obj) {
            super(1, obj, a.Companion.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((a.Companion) this.receiver).e(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$setProduct$5", f = "ProductDetailViewModel.kt", l = {677}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$O */
    static final class O extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f109097a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ProductFullDetails f109099c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12333c1.this.new O(this.f109099c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        O(ProductFullDetails productFullDetails, Continuation<? super O> continuation) {
            super(2, continuation);
            this.f109099c = productFullDetails;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((O) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f109097a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C12333c1 c12333c1 = C12333c1.this;
                ProductFullDetails productFullDetails = this.f109099c;
                this.f109097a = 1;
                if (c12333c1.v0(productFullDetails, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$trackProductAnalytics$1$1$1", f = "ProductDetailViewModel.kt", l = {851}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$P */
    static final class P extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f109100a;

        /* renamed from: b, reason: collision with root package name */
        Object f109101b;

        /* renamed from: c, reason: collision with root package name */
        Object f109102c;

        /* renamed from: d, reason: collision with root package name */
        Object f109103d;

        /* renamed from: e, reason: collision with root package name */
        Object f109104e;

        /* renamed from: f, reason: collision with root package name */
        int f109105f;

        /* renamed from: g, reason: collision with root package name */
        int f109106g;

        /* renamed from: h, reason: collision with root package name */
        int f109107h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ProductFullDetails f109108i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C12333c1 f109109j;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new P(this.f109108i, this.f109109j, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        P(ProductFullDetails productFullDetails, C12333c1 c12333c1, Continuation<? super P> continuation) {
            super(2, continuation);
            this.f109108i = productFullDetails;
            this.f109109j = c12333c1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((P) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            Iterable iterable;
            C12333c1 c12333c1;
            int i10;
            Object objF = IntrinsicsKt.f();
            int i11 = this.f109107h;
            if (i11 != 0) {
                if (i11 == 1) {
                    i10 = this.f109105f;
                    it = (Iterator) this.f109102c;
                    c12333c1 = (C12333c1) this.f109101b;
                    iterable = (Iterable) this.f109100a;
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                List<String> listE = this.f109108i.getBeaconInfo().e();
                C12333c1 c12333c12 = this.f109109j;
                it = listE.iterator();
                iterable = listE;
                c12333c1 = c12333c12;
                i10 = 0;
            }
            while (it.hasNext()) {
                Object next = it.next();
                String str = (String) next;
                C16753b c16753b = c12333c1.beaconClient;
                String strF = Bk.b.f(str);
                this.f109100a = iterable;
                this.f109101b = c12333c1;
                this.f109102c = it;
                this.f109103d = next;
                this.f109104e = str;
                this.f109105f = i10;
                this.f109106g = 0;
                this.f109107h = 1;
                if (c16753b.a(strF, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$updateCart$1", f = "ProductDetailViewModel.kt", l = {886}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$Q */
    static final class Q extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f109110a;

        Q(Continuation<? super Q> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12333c1.this.new Q(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((Q) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f109110a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = C12333c1.this._eventFlow;
                G0.RefreshCartOnListPageEvent refreshCartOnListPageEvent = new G0.RefreshCartOnListPageEvent(true);
                this.f109110a = 1;
                if (interfaceC16548A.emit(refreshCartOnListPageEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$validateAccountAccess$1", f = "ProductDetailViewModel.kt", l = {909}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$R */
    static final class R extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f109112a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f109114c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        R(int i10, Continuation<? super R> continuation) {
            super(2, continuation);
            this.f109114c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12333c1.this.new R(this.f109114c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((R) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f109112a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = C12333c1.this._eventFlow;
                G0.RequireLogin requireLogin = new G0.RequireLogin(this.f109114c);
                this.f109112a = 1;
                if (interfaceC16548A.emit(requireLogin, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$viewInFavoriteList$1", f = "ProductDetailViewModel.kt", l = {924}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$S */
    static final class S extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f109115a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ nk.c f109117c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12333c1.this.new S(this.f109117c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        S(nk.c cVar, Continuation<? super S> continuation) {
            super(2, continuation);
            this.f109117c = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((S) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f109115a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = C12333c1.this._eventFlow;
                G0.ViewOnFavoriteList viewOnFavoriteList = new G0.ViewOnFavoriteList(this.f109117c);
                this.f109115a = 1;
                if (interfaceC16548A.emit(viewOnFavoriteList, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$viewInShoppingList$1", f = "ProductDetailViewModel.kt", l = {916}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$T */
    static final class T extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f109118a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ nk.c f109120c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12333c1.this.new T(this.f109120c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        T(nk.c cVar, Continuation<? super T> continuation) {
            super(2, continuation);
            this.f109120c = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((T) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f109118a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = C12333c1.this._eventFlow;
                G0.ViewOnShoppingList viewOnShoppingList = new G0.ViewOnShoppingList(this.f109120c);
                this.f109118a = 1;
                if (interfaceC16548A.emit(viewOnShoppingList, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\f\u0010\tJ\u001f\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00072\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\tJ\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001f\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u001b2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00028\u00000\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/c1$a;", "Lwr/a;", "<init>", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/c1;)V", "Luk/c;", "Lfj/j;", "changeRes", "", "i", "(Luk/c;)V", "entryChange", "h", "e", "", "c", "(Luk/c;)Ljava/lang/String;", "d", "()Ljava/lang/String;", "Lfj/C;", "cartResource", "observeCart", "LJu/a;", "getDisposable", "()LJu/a;", "Lur/a;", "processedRequest", "(Lur/a;Luk/c;)V", "T", "Luk/a;", "Lvr/a;", "challenge", "throwChallenge", "(Luk/a;)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$a, reason: case insensitive filesystem */
    public final class C12334a implements InterfaceC17909a {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1645a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EntryChange.c.values().length];
                try {
                    iArr[EntryChange.c.f131920b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EntryChange.c.f131922d.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EntryChange.c.f131921c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EntryChange.c.f131923e.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$CartInteractionListener1$handleCartAddition$2", f = "ProductDetailViewModel.kt", l = {447}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$a$b */
        static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f109122a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C12333c1 f109123b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C12333c1 c12333c1, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f109123b = c12333c1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f109123b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f109122a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f109123b._eventFlow;
                    G0.ShowError showError = new G0.ShowError(yr.Q.f171738F, yr.Q.f171737E, yr.Q.f171761b);
                    this.f109122a = 1;
                    if (interfaceC16548A.emit(showError, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$CartInteractionListener1$handleCartAddition$4", f = "ProductDetailViewModel.kt", l = {464, 468}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$a$c */
        static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f109124a;

            /* renamed from: b, reason: collision with root package name */
            int f109125b;

            /* renamed from: c, reason: collision with root package name */
            int f109126c;

            /* renamed from: d, reason: collision with root package name */
            private /* synthetic */ Object f109127d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C12333c1 f109128e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C12333c1 c12333c1, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f109128e = c12333c1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                c cVar = new c(this.f109128e, continuation);
                cVar.f109127d = obj;
                return cVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
            
                if (wr.f.n(r5, false, false, r11, 3, null) == r0) goto L21;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v13, types: [mv.O] */
            /* JADX WARN: Type inference failed for: r1v16 */
            /* JADX WARN: Type inference failed for: r1v17 */
            /* JADX WARN: Type inference failed for: r1v18 */
            /* JADX WARN: Type inference failed for: r1v2, types: [mv.O] */
            /* JADX WARN: Type inference failed for: r1v7 */
            /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
                /*
                    r11 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r1 = r11.f109126c
                    r2 = 0
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L2f
                    if (r1 == r4) goto L27
                    if (r1 != r3) goto L1f
                    java.lang.Object r0 = r11.f109124a
                    mv.O r0 = (mv.InterfaceC15783O) r0
                    java.lang.Object r0 = r11.f109127d
                    r1 = r0
                    mv.O r1 = (mv.InterfaceC15783O) r1
                    kotlin.ResultKt.b(r12)     // Catch: java.lang.Throwable -> L1c
                    goto L6b
                L1c:
                    r0 = move-exception
                    r12 = r0
                    goto L72
                L1f:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L27:
                    java.lang.Object r1 = r11.f109127d
                    mv.O r1 = (mv.InterfaceC15783O) r1
                    kotlin.ResultKt.b(r12)
                    goto L4f
                L2f:
                    kotlin.ResultKt.b(r12)
                    java.lang.Object r12 = r11.f109127d
                    mv.O r12 = (mv.InterfaceC15783O) r12
                    com.meijer.mobile.meijer.activity.find.viewmodel.c1 r1 = r11.f109128e
                    pv.A r1 = com.meijer.mobile.meijer.activity.find.viewmodel.C12333c1.c0(r1)
                    com.meijer.mobile.meijer.activity.find.viewmodel.G0$n r5 = new com.meijer.mobile.meijer.activity.find.viewmodel.G0$n
                    int r6 = tr.C17284b.f163293P0
                    r5.<init>(r6)
                    r11.f109127d = r12
                    r11.f109126c = r4
                    java.lang.Object r1 = r1.emit(r5, r11)
                    if (r1 != r0) goto L4e
                    goto L6a
                L4e:
                    r1 = r12
                L4f:
                    com.meijer.mobile.meijer.activity.find.viewmodel.c1 r12 = r11.f109128e
                    kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L1c
                    wr.f r5 = com.meijer.mobile.meijer.activity.find.viewmodel.C12333c1.O(r12)     // Catch: java.lang.Throwable -> L1c
                    r11.f109127d = r1     // Catch: java.lang.Throwable -> L1c
                    r11.f109124a = r1     // Catch: java.lang.Throwable -> L1c
                    r11.f109125b = r2     // Catch: java.lang.Throwable -> L1c
                    r11.f109126c = r3     // Catch: java.lang.Throwable -> L1c
                    r6 = 0
                    r7 = 0
                    r9 = 3
                    r10 = 0
                    r8 = r11
                    java.lang.Object r12 = wr.f.n(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L1c
                    if (r12 != r0) goto L6b
                L6a:
                    return r0
                L6b:
                    kotlin.Unit r12 = kotlin.Unit.f143329a     // Catch: java.lang.Throwable -> L1c
                    java.lang.Object r12 = kotlin.Result.b(r12)     // Catch: java.lang.Throwable -> L1c
                    goto L7c
                L72:
                    kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
                    java.lang.Object r12 = kotlin.ResultKt.a(r12)
                    java.lang.Object r12 = kotlin.Result.b(r12)
                L7c:
                    java.lang.Throwable r12 = kotlin.Result.e(r12)
                    if (r12 == 0) goto L98
                    kotlin.coroutines.CoroutineContext r0 = r1.getCoroutineContext()
                    mv.E0.i(r0)
                    boolean r0 = r12 instanceof java.lang.Error
                    if (r0 != 0) goto L97
                    qw.a$a r0 = qw.a.INSTANCE
                    java.lang.String r1 = "fetchLatestCart failed in ProductDetailViewModel"
                    java.lang.Object[] r2 = new java.lang.Object[r2]
                    r0.l(r12, r1, r2)
                    goto L98
                L97:
                    throw r12
                L98:
                    kotlin.Unit r12 = kotlin.Unit.f143329a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12333c1.C12334a.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$CartInteractionListener1$handleCartAddition$6", f = "ProductDetailViewModel.kt", l = {513}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$a$d */
        static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f109129a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C12333c1 f109130b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ uk.c<EntryChange> f109131c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new d(this.f109130b, this.f109131c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(C12333c1 c12333c1, uk.c<EntryChange> cVar, Continuation<? super d> continuation) {
                super(2, continuation);
                this.f109130b = c12333c1;
                this.f109131c = cVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Entry entry;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f109129a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f109130b._eventFlow;
                    int i11 = C17284b.f163319f;
                    int i12 = C17284b.f163301T0;
                    EntryChange entryChange = (EntryChange) ((c.Success) this.f109131c).a();
                    if (entryChange != null) {
                        entry = entryChange.getEntry();
                    } else {
                        entry = null;
                    }
                    G0.AddToCartSuccessEvent addToCartSuccessEvent = new G0.AddToCartSuccessEvent(i11, i12, entry);
                    this.f109129a = 1;
                    if (interfaceC16548A.emit(addToCartSuccessEvent, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$CartInteractionListener1$handleCartChange$1", f = "ProductDetailViewModel.kt", l = {369}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$a$e */
        static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f109132a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C12333c1 f109133b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(C12333c1 c12333c1, Continuation<? super e> continuation) {
                super(2, continuation);
                this.f109133b = c12333c1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new e(this.f109133b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f109132a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f109133b._eventFlow;
                    G0.UpdateToCartFailedEvent updateToCartFailedEvent = new G0.UpdateToCartFailedEvent(C17284b.f163293P0);
                    this.f109132a = 1;
                    if (interfaceC16548A.emit(updateToCartFailedEvent, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$CartInteractionListener1$handleCartChange$2$1", f = "ProductDetailViewModel.kt", l = {HttpResponseStatus.ERROR_EXPECTATION_FAILED}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$a$f */
        static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f109134a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C12333c1 f109135b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(C12333c1 c12333c1, Continuation<? super f> continuation) {
                super(2, continuation);
                this.f109135b = c12333c1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new f(this.f109135b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f109134a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f109135b._eventFlow;
                    G0.UpdateToCartFailedEvent updateToCartFailedEvent = new G0.UpdateToCartFailedEvent(C17284b.f163293P0);
                    this.f109134a = 1;
                    if (interfaceC16548A.emit(updateToCartFailedEvent, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$CartInteractionListener1$handleCartRemoval$1", f = "ProductDetailViewModel.kt", l = {359}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$a$g */
        static final class g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f109136a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C12333c1 f109137b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(C12333c1 c12333c1, Continuation<? super g> continuation) {
                super(2, continuation);
                this.f109137b = c12333c1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new g(this.f109137b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f109136a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f109137b._eventFlow;
                    G0.UpdateToCartFailedEvent updateToCartFailedEvent = new G0.UpdateToCartFailedEvent(C17284b.f163293P0);
                    this.f109136a = 1;
                    if (interfaceC16548A.emit(updateToCartFailedEvent, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$CartInteractionListener1$observeCart$1", f = "ProductDetailViewModel.kt", l = {295}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$a$h */
        static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f109138a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C12333c1 f109139b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(C12333c1 c12333c1, Continuation<? super h> continuation) {
                super(2, continuation);
                this.f109139b = c12333c1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new h(this.f109139b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f109138a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f109139b._eventFlow;
                    G0.RefreshCartOnListPageEvent refreshCartOnListPageEvent = new G0.RefreshCartOnListPageEvent(false);
                    this.f109138a = 1;
                    if (interfaceC16548A.emit(refreshCartOnListPageEvent, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$CartInteractionListener1$processedRequest$1", f = "ProductDetailViewModel.kt", l = {}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$a$i */
        static final class i extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f109140a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C12333c1 f109141b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC17454a f109142c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new i(this.f109141b, this.f109142c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            i(C12333c1 c12333c1, AbstractC17454a abstractC17454a, Continuation<? super i> continuation) {
                super(2, continuation);
                this.f109141b = c12333c1;
                this.f109142c = abstractC17454a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((i) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                ProductDetailsState productDetailsState;
                ArrayList arrayList;
                IntrinsicsKt.f();
                if (this.f109140a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                InterfaceC16549B interfaceC16549B = this.f109141b._detailsFlow;
                AbstractC17454a abstractC17454a = this.f109142c;
                do {
                    value = interfaceC16549B.getValue();
                    productDetailsState = (ProductDetailsState) value;
                    List<SuggestedProductCarouselDecorator> listS = productDetailsState.s();
                    if (listS != null) {
                        List<SuggestedProductCarouselDecorator> list = listS;
                        arrayList = new ArrayList(CollectionsKt.x(list, 10));
                        for (SuggestedProductCarouselDecorator suggestedProductCarouselDecoratorV : list) {
                            if (Intrinsics.e(suggestedProductCarouselDecoratorV.getProduct().getCode(), abstractC17454a.getProductCode())) {
                                suggestedProductCarouselDecoratorV = SuggestedProductCarouselDecorator.v(suggestedProductCarouselDecoratorV, null, null, null, null, null, null, false, false, null, null, null, null, 0.0d, false, false, null, null, null, false, null, 1040383, null);
                            }
                            arrayList.add(suggestedProductCarouselDecoratorV);
                        }
                    } else {
                        arrayList = null;
                    }
                } while (!interfaceC16549B.e(value, ProductDetailsState.d(productDetailsState, null, null, null, null, null, 0, null, false, null, null, null, 0, null, null, null, false, false, null, arrayList, null, null, null, null, 8126463, null)));
                return Unit.f143329a;
            }
        }

        public C12334a() {
        }

        private final String c(uk.c<EntryChange> entryChange) {
            List<SuggestedProductCarouselDecorator> listS;
            Entry entry;
            ProductFullDetails productFullDetailsM;
            if (C12333c1.this.quantityChangeForFBT && (listS = ((ProductDetailsState) C12333c1.this._detailsFlow.getValue()).s()) != null) {
                Iterator<SuggestedProductCarouselDecorator> it = listS.iterator();
                int i10 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i10 = -1;
                        break;
                    }
                    String code = it.next().getProduct().getCode();
                    EntryChange entryChangeA = entryChange.a();
                    if (Intrinsics.e(code, (entryChangeA == null || (entry = entryChangeA.getEntry()) == null || (productFullDetailsM = entry.m()) == null) ? null : productFullDetailsM.getCode())) {
                        break;
                    }
                    i10++;
                }
                Integer numValueOf = Integer.valueOf(i10);
                if (numValueOf.intValue() < 0) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    return Integer.valueOf(numValueOf.intValue() + 1).toString();
                }
            }
            return null;
        }

        private final String d() {
            return C12333c1.this.quantityChangeForFBT ? "edaa - Frequently Bought Together" : "product details page";
        }

        /* JADX WARN: Removed duplicated region for block: B:63:0x011c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void e(uk.c<fj.EntryChange> r81) {
            /*
                Method dump skipped, instructions count: 531
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12333c1.C12334a.e(uk.c):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(TrackingData track) {
            Intrinsics.j(track, "$this$track");
            track.h("errorMessage", "add to cart error");
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(TrackingData track) {
            Intrinsics.j(track, "$this$track");
            track.h("errorMessage", "add to cart error");
            return Unit.f143329a;
        }

        private final void h(uk.c<EntryChange> entryChange) {
            Entry entry;
            ProductFullDetails productFullDetailsM;
            ProductFullDetails productFullDetailsM2;
            ProductSponsorship productSponsorshipA = null;
            if (entryChange instanceof c.Failure) {
                C15809k.d(androidx.view.d0.a(C12333c1.this), null, null, new e(C12333c1.this, null), 3, null);
            }
            W.ComplexPromo complexPromoY0 = C12333c1.this.y0();
            EntryChange entryChangeA = entryChange.a();
            if (entryChangeA != null) {
                C12333c1 c12333c1 = C12333c1.this;
                pp.d dVar = c12333c1.productMetadataStore;
                Entry entry2 = entryChangeA.getEntry();
                boolean zC = dVar.c((entry2 == null || (productFullDetailsM2 = entry2.m()) == null) ? null : productFullDetailsM2.getCode());
                int i10 = C1645a.$EnumSwitchMapping$0[entryChangeA.getStatusCode().ordinal()];
                if (i10 != 1 && i10 != 2) {
                    if (i10 != 3) {
                        return;
                    }
                    C15809k.d(androidx.view.d0.a(c12333c1), null, null, new f(c12333c1, null), 3, null);
                } else if (entryChangeA.getExpectedQuantityChange() >= 0.0d) {
                    if (entryChangeA.getExpectedQuantityChange() > 0.0d) {
                        c12333c1.analyticsEngine.k(C2898u.f1904a.Y(c12333c1.cartId, c12333c1.getCampaignIdValue(), entryChangeA, c(entryChange), entryChange, c12333c1.sponsorshipsDataStore, d(), complexPromoY0, zC));
                    }
                } else {
                    EntryChange entryChangeA2 = entryChange.a();
                    if (entryChangeA2 != null && (entry = entryChangeA2.getEntry()) != null && (productFullDetailsM = entry.m()) != null) {
                        productSponsorshipA = c12333c1.sponsorshipsDataStore.a(productFullDetailsM.getCode());
                    }
                    c12333c1.analyticsEngine.k(C2898u.f1904a.a0(c12333c1.cartId, entryChangeA, zC, c(entryChange), productSponsorshipA, d()));
                }
            }
        }

        @Override // wr.InterfaceC17909a
        /* renamed from: getDisposable */
        public Ju.a getCompositeDisposable() {
            return C12333c1.this.disposables;
        }

        @Override // wr.InterfaceC17909a
        public void observeCart(uk.c<ShoppingCart> cartResource) {
            if (Intrinsics.e(((ProductDetailsState) C12333c1.this._detailsFlow.getValue()).getProduct(), new ProductFullDetails(null, null, 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -1, 268435455, null))) {
                C15809k.d(androidx.view.d0.a(C12333c1.this), null, null, new h(C12333c1.this, null), 3, null);
            }
        }

        @Override // wr.InterfaceC17909a
        public void processedRequest(AbstractC17454a processedRequest, uk.c<EntryChange> entryChange) {
            Intrinsics.j(processedRequest, "processedRequest");
            Intrinsics.j(entryChange, "entryChange");
            if (entryChange instanceof c.Failure) {
                C12333c1.this.d1();
            } else if (entryChange instanceof c.Success) {
                C15809k.d(androidx.view.d0.a(C12333c1.this), null, null, new i(C12333c1.this, processedRequest, null), 3, null);
            }
            if (processedRequest instanceof AbstractC17454a.Add) {
                e(entryChange);
                return;
            }
            if (processedRequest instanceof AbstractC17454a.Update) {
                h(entryChange);
            } else if (processedRequest instanceof AbstractC17454a.Remove) {
                i(entryChange);
            } else if (!Intrinsics.e(processedRequest, AbstractC17454a.b.f164334b)) {
                throw new NoWhenBranchMatchedException();
            }
        }

        @Override // wr.InterfaceC17909a
        public <T> void throwChallenge(AbstractC17440a<AbstractC17720a, T> challenge) {
            Intrinsics.j(challenge, "challenge");
            if (!(challenge.f() instanceof AbstractC17720a.ChokingHazardChallenge)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC17720a abstractC17720aF = challenge.f();
            Intrinsics.h(abstractC17720aF, "null cannot be cast to non-null type com.meijer.mobile.ui.cart.challenges.CartChallenge.ChokingHazardChallenge");
            wr.f.B(C12333c1.this.cartInteractor, new AbstractC17440a.Accept(((AbstractC17720a.ChokingHazardChallenge) abstractC17720aF).a().b(), null, null, 4, null), false, null, 6, null);
        }

        private final void i(uk.c<EntryChange> changeRes) {
            ProductSponsorship productSponsorshipA;
            Entry entry;
            ProductFullDetails productFullDetailsM;
            Entry entry2;
            ProductFullDetails productFullDetailsM2;
            EntryChange entryChangeA = changeRes.a();
            String code = null;
            if (entryChangeA == null || !entryChangeA.h()) {
                C15809k.d(androidx.view.d0.a(C12333c1.this), null, null, new g(C12333c1.this, null), 3, null);
                return;
            }
            EntryChange entryChangeA2 = changeRes.a();
            if (entryChangeA2 != null && (entry2 = entryChangeA2.getEntry()) != null && (productFullDetailsM2 = entry2.m()) != null) {
                productSponsorshipA = C12333c1.this.sponsorshipsDataStore.a(productFullDetailsM2.getCode());
            } else {
                productSponsorshipA = null;
            }
            InterfaceC14523a interfaceC14523a = C12333c1.this.analyticsEngine;
            C2898u c2898u = C2898u.f1904a;
            String str = C12333c1.this.cartId;
            pp.d dVar = C12333c1.this.productMetadataStore;
            EntryChange entryChangeA3 = changeRes.a();
            if (entryChangeA3 != null && (entry = entryChangeA3.getEntry()) != null && (productFullDetailsM = entry.m()) != null) {
                code = productFullDetailsM.getCode();
            }
            interfaceC14523a.k(c2898u.c0(str, dVar.c(code), changeRes.a(), c(changeRes), productSponsorshipA, d()));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$c, reason: case insensitive filesystem */
    public /* synthetic */ class C12336c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EntryChange.c.values().length];
            try {
                iArr[EntryChange.c.f131920b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EntryChange.c.f131922d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EntryChange.c.f131921c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EntryChange.c.f131923e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel", f = "ProductDetailViewModel.kt", l = {986}, m = "addToFavoriteList")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$d, reason: case insensitive filesystem */
    static final class C12337d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f109143a;

        /* renamed from: b, reason: collision with root package name */
        Object f109144b;

        /* renamed from: c, reason: collision with root package name */
        Object f109145c;

        /* renamed from: d, reason: collision with root package name */
        Object f109146d;

        /* renamed from: e, reason: collision with root package name */
        Object f109147e;

        /* renamed from: f, reason: collision with root package name */
        int f109148f;

        /* renamed from: g, reason: collision with root package name */
        int f109149g;

        /* renamed from: h, reason: collision with root package name */
        int f109150h;

        /* renamed from: i, reason: collision with root package name */
        int f109151i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f109152j;

        /* renamed from: l, reason: collision with root package name */
        int f109154l;

        C12337d(Continuation<? super C12337d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f109152j = obj;
            this.f109154l |= Integer.MIN_VALUE;
            return C12333c1.this.j0(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$addToFavoriteList$4$1", f = "ProductDetailViewModel.kt", l = {989}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$e, reason: case insensitive filesystem */
    static final class C12338e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f109155a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ nk.c f109157c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12333c1.this.new C12338e(this.f109157c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12338e(nk.c cVar, Continuation<? super C12338e> continuation) {
            super(2, continuation);
            this.f109157c = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C12338e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f109155a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = C12333c1.this._eventFlow;
                G0.FavoriteListItemAdded favoriteListItemAdded = new G0.FavoriteListItemAdded(this.f109157c);
                this.f109155a = 1;
                if (interfaceC16548A.emit(favoriteListItemAdded, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$addToFavoriteList$5$1", f = "ProductDetailViewModel.kt", l = {994}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$f, reason: case insensitive filesystem */
    static final class C12339f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f109158a;

        C12339f(Continuation<? super C12339f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12333c1.this.new C12339f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C12339f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f109158a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = C12333c1.this._eventFlow;
                G0.UpdateShoppingOrFavoriteListFailed updateShoppingOrFavoriteListFailed = new G0.UpdateShoppingOrFavoriteListFailed(C18546a.f173194a, C18546a.f173197d);
                this.f109158a = 1;
                if (interfaceC16548A.emit(updateShoppingOrFavoriteListFailed, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel", f = "ProductDetailViewModel.kt", l = {932}, m = "addToShoppingList")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$g, reason: case insensitive filesystem */
    static final class C12340g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f109160a;

        /* renamed from: b, reason: collision with root package name */
        Object f109161b;

        /* renamed from: c, reason: collision with root package name */
        Object f109162c;

        /* renamed from: d, reason: collision with root package name */
        Object f109163d;

        /* renamed from: e, reason: collision with root package name */
        Object f109164e;

        /* renamed from: f, reason: collision with root package name */
        int f109165f;

        /* renamed from: g, reason: collision with root package name */
        int f109166g;

        /* renamed from: h, reason: collision with root package name */
        int f109167h;

        /* renamed from: i, reason: collision with root package name */
        int f109168i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f109169j;

        /* renamed from: l, reason: collision with root package name */
        int f109171l;

        C12340g(Continuation<? super C12340g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f109169j = obj;
            this.f109171l |= Integer.MIN_VALUE;
            return C12333c1.this.k0(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$addToShoppingList$4$1", f = "ProductDetailViewModel.kt", l = {936}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$h, reason: case insensitive filesystem */
    static final class C12341h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f109172a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ nk.c f109174c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12333c1.this.new C12341h(this.f109174c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12341h(nk.c cVar, Continuation<? super C12341h> continuation) {
            super(2, continuation);
            this.f109174c = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C12341h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f109172a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = C12333c1.this._eventFlow;
                G0.ShoppingListItemAdded shoppingListItemAdded = new G0.ShoppingListItemAdded(this.f109174c);
                this.f109172a = 1;
                if (interfaceC16548A.emit(shoppingListItemAdded, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$addToShoppingList$5$1", f = "ProductDetailViewModel.kt", l = {948}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$i, reason: case insensitive filesystem */
    static final class C12342i extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f109175a;

        C12342i(Continuation<? super C12342i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12333c1.this.new C12342i(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C12342i) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f109175a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = C12333c1.this._eventFlow;
                G0.UpdateShoppingOrFavoriteListFailed updateShoppingOrFavoriteListFailed = new G0.UpdateShoppingOrFavoriteListFailed(C18546a.f173196c, C18546a.f173197d);
                this.f109175a = 1;
                if (interfaceC16548A.emit(updateShoppingOrFavoriteListFailed, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$fetchBazaarVoiceReviews$1", f = "ProductDetailViewModel.kt", l = {796}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$j, reason: case insensitive filesystem */
    static final class C12343j extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f109177a;

        /* renamed from: b, reason: collision with root package name */
        int f109178b;

        /* renamed from: c, reason: collision with root package name */
        int f109179c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f109180d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f109182f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12343j(String str, Continuation<? super C12343j> continuation) {
            super(2, continuation);
            this.f109182f = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12343j c12343j = C12333c1.this.new C12343j(this.f109182f, continuation);
            c12343j.f109180d = obj;
            return c12343j;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C12343j) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v12, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r2v15 */
        /* JADX WARN: Type inference failed for: r2v16 */
        /* JADX WARN: Type inference failed for: r2v2, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, mv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            ?? r22;
            Object value;
            Object value2;
            Object value3;
            Object objC;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f109179c;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    ?? r23 = (InterfaceC15783O) this.f109180d;
                    InterfaceC16549B interfaceC16549B = C12333c1.this._detailsFlow;
                    do {
                        value3 = interfaceC16549B.getValue();
                    } while (!interfaceC16549B.e(value3, ProductDetailsState.d((ProductDetailsState) value3, null, null, null, null, null, 0, null, false, null, null, null, 0, null, null, null, false, false, null, null, r.f109823c, null, null, null, 7864319, null)));
                    C12333c1 c12333c1 = C12333c1.this;
                    String str = this.f109182f;
                    Result.Companion companion = Result.INSTANCE;
                    Kp.g gVar = c12333c1.bazaarVoiceManager;
                    int i11 = c12333c1.limitReviews;
                    this.f109180d = r23;
                    this.f109177a = r23;
                    this.f109178b = 0;
                    this.f109179c = 1;
                    objC = gVar.c(str, i11, this);
                    i10 = r23;
                    if (objC == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ?? r24 = (InterfaceC15783O) this.f109180d;
                    ResultKt.b(obj);
                    objC = obj;
                    i10 = r24;
                }
                objB = Result.b((ProductReviewFullDetails) objC);
                r22 = i10;
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
                r22 = i10;
            }
            C12333c1 c12333c12 = C12333c1.this;
            if (Result.h(objB)) {
                ProductReviewFullDetails productReviewFullDetails = (ProductReviewFullDetails) objB;
                InterfaceC16549B interfaceC16549B2 = c12333c12._detailsFlow;
                do {
                    value2 = interfaceC16549B2.getValue();
                } while (!interfaceC16549B2.e(value2, ProductDetailsState.d((ProductDetailsState) value2, null, null, null, null, null, 0, null, false, null, null, null, 0, null, null, null, false, false, null, null, r.f109821a, productReviewFullDetails, null, null, 6815743, null)));
            }
            C12333c1 c12333c13 = C12333c1.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                mv.E0.i(r22.getCoroutineContext());
                if (thE instanceof Error) {
                    throw thE;
                }
                InterfaceC16549B interfaceC16549B3 = c12333c13._detailsFlow;
                do {
                    value = interfaceC16549B3.getValue();
                } while (!interfaceC16549B3.e(value, ProductDetailsState.d((ProductDetailsState) value, null, null, null, null, null, 0, null, false, null, null, null, 0, null, null, null, false, false, null, null, r.f109822b, null, null, null, 7864319, null)));
                qw.a.INSTANCE.f(thE, "ProductDisplayPage: Failed to get bulk ratings", new Object[0]);
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$fetchFeedbackSubmission$1", f = "ProductDetailViewModel.kt", l = {818}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$k, reason: case insensitive filesystem */
    static final class C12344k extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f109183a;

        /* renamed from: b, reason: collision with root package name */
        int f109184b;

        /* renamed from: c, reason: collision with root package name */
        int f109185c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f109186d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f109188f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Kp.a f109189g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$fetchFeedbackSubmission$1$3$1", f = "ProductDetailViewModel.kt", l = {829}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$k$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f109190a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C12333c1 f109191b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Kp.a f109192c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f109191b, this.f109192c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C12333c1 c12333c1, Kp.a aVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f109191b = c12333c1;
                this.f109192c = aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f109190a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f109191b._eventFlow;
                    G0.FeedbackSubmissionEvent feedbackSubmissionEvent = new G0.FeedbackSubmissionEvent(true, this.f109192c);
                    this.f109190a = 1;
                    if (interfaceC16548A.emit(feedbackSubmissionEvent, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12344k c12344k = C12333c1.this.new C12344k(this.f109188f, this.f109189g, continuation);
            c12344k.f109186d = obj;
            return c12344k;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12344k(String str, Kp.a aVar, Continuation<? super C12344k> continuation) {
            super(2, continuation);
            this.f109188f = str;
            this.f109189g = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C12344k) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v11, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v2, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, mv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            ?? r12;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f109185c;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ?? r13 = (InterfaceC15783O) this.f109186d;
                        ResultKt.b(obj);
                        i10 = r13;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    ?? r14 = (InterfaceC15783O) this.f109186d;
                    C12333c1 c12333c1 = C12333c1.this;
                    String str = this.f109188f;
                    Kp.a aVar = this.f109189g;
                    Result.Companion companion = Result.INSTANCE;
                    Kp.g gVar = c12333c1.bazaarVoiceManager;
                    this.f109186d = r14;
                    this.f109183a = r14;
                    this.f109184b = 0;
                    this.f109185c = 1;
                    i10 = r14;
                    if (gVar.d(str, aVar, this) == objF) {
                        return objF;
                    }
                }
                objB = Result.b(Unit.f143329a);
                r12 = i10;
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
                r12 = i10;
            }
            Throwable thE = Result.e(objB);
            if (thE != null) {
                mv.E0.i(r12.getCoroutineContext());
                if (!(thE instanceof Error)) {
                    qw.a.INSTANCE.f(thE, "submitFeedback: Failed to get submitFeedback", new Object[0]);
                } else {
                    throw thE;
                }
            }
            C12333c1 c12333c12 = C12333c1.this;
            Kp.a aVar2 = this.f109189g;
            if (Result.h(objB)) {
                C15809k.d(androidx.view.d0.a(c12333c12), null, null, new a(c12333c12, aVar2, null), 3, null);
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$fetchFrequentlyBoughtTogetherProducts$2", f = "ProductDetailViewModel.kt", l = {726, 730}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$l, reason: case insensitive filesystem */
    static final class C12345l extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f109193a;

        /* renamed from: b, reason: collision with root package name */
        Object f109194b;

        /* renamed from: c, reason: collision with root package name */
        Object f109195c;

        /* renamed from: d, reason: collision with root package name */
        Object f109196d;

        /* renamed from: e, reason: collision with root package name */
        int f109197e;

        /* renamed from: f, reason: collision with root package name */
        int f109198f;

        /* renamed from: g, reason: collision with root package name */
        int f109199g;

        /* renamed from: h, reason: collision with root package name */
        int f109200h;

        /* renamed from: i, reason: collision with root package name */
        int f109201i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f109202j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ nk.f f109204l;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12345l c12345l = C12333c1.this.new C12345l(this.f109204l, continuation);
            c12345l.f109202j = obj;
            return c12345l;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12345l(nk.f fVar, Continuation<? super C12345l> continuation) {
            super(2, continuation);
            this.f109204l = fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C12345l) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
        
            if (r2 == r0) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0128  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r34) {
            /*
                Method dump skipped, instructions count: 368
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12333c1.C12345l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel", f = "ProductDetailViewModel.kt", l = {779}, m = "fetchProduct")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$m, reason: case insensitive filesystem */
    static final class C12346m extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f109205a;

        /* renamed from: b, reason: collision with root package name */
        Object f109206b;

        /* renamed from: c, reason: collision with root package name */
        int f109207c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f109208d;

        /* renamed from: f, reason: collision with root package name */
        int f109210f;

        C12346m(Continuation<? super C12346m> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f109208d = obj;
            this.f109210f |= Integer.MIN_VALUE;
            return C12333c1.this.v0(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$handleCartAddition$2", f = "ProductDetailViewModel.kt", l = {1481}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$n, reason: case insensitive filesystem */
    static final class C12347n extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f109211a;

        C12347n(Continuation<? super C12347n> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12333c1.this.new C12347n(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C12347n) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f109211a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = C12333c1.this._eventFlow;
                G0.ShowError showError = new G0.ShowError(yr.Q.f171738F, yr.Q.f171737E, yr.Q.f171761b);
                this.f109211a = 1;
                if (interfaceC16548A.emit(showError, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$handleCartAddition$4", f = "ProductDetailViewModel.kt", l = {1498, 1502}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$o, reason: case insensitive filesystem */
    static final class C12348o extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f109213a;

        /* renamed from: b, reason: collision with root package name */
        int f109214b;

        /* renamed from: c, reason: collision with root package name */
        int f109215c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f109216d;

        C12348o(Continuation<? super C12348o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12348o c12348o = C12333c1.this.new C12348o(continuation);
            c12348o.f109216d = obj;
            return c12348o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C12348o) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
        
            if (wr.f.n(r5, false, false, r11, 3, null) == r0) goto L21;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v13, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v2, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r11.f109215c
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2f
                if (r1 == r4) goto L27
                if (r1 != r3) goto L1f
                java.lang.Object r0 = r11.f109213a
                mv.O r0 = (mv.InterfaceC15783O) r0
                java.lang.Object r0 = r11.f109216d
                r1 = r0
                mv.O r1 = (mv.InterfaceC15783O) r1
                kotlin.ResultKt.b(r12)     // Catch: java.lang.Throwable -> L1c
                goto L6b
            L1c:
                r0 = move-exception
                r12 = r0
                goto L72
            L1f:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L27:
                java.lang.Object r1 = r11.f109216d
                mv.O r1 = (mv.InterfaceC15783O) r1
                kotlin.ResultKt.b(r12)
                goto L4f
            L2f:
                kotlin.ResultKt.b(r12)
                java.lang.Object r12 = r11.f109216d
                mv.O r12 = (mv.InterfaceC15783O) r12
                com.meijer.mobile.meijer.activity.find.viewmodel.c1 r1 = com.meijer.mobile.meijer.activity.find.viewmodel.C12333c1.this
                pv.A r1 = com.meijer.mobile.meijer.activity.find.viewmodel.C12333c1.c0(r1)
                com.meijer.mobile.meijer.activity.find.viewmodel.G0$n r5 = new com.meijer.mobile.meijer.activity.find.viewmodel.G0$n
                int r6 = tr.C17284b.f163293P0
                r5.<init>(r6)
                r11.f109216d = r12
                r11.f109215c = r4
                java.lang.Object r1 = r1.emit(r5, r11)
                if (r1 != r0) goto L4e
                goto L6a
            L4e:
                r1 = r12
            L4f:
                com.meijer.mobile.meijer.activity.find.viewmodel.c1 r12 = com.meijer.mobile.meijer.activity.find.viewmodel.C12333c1.this
                kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L1c
                wr.f r5 = com.meijer.mobile.meijer.activity.find.viewmodel.C12333c1.O(r12)     // Catch: java.lang.Throwable -> L1c
                r11.f109216d = r1     // Catch: java.lang.Throwable -> L1c
                r11.f109213a = r1     // Catch: java.lang.Throwable -> L1c
                r11.f109214b = r2     // Catch: java.lang.Throwable -> L1c
                r11.f109215c = r3     // Catch: java.lang.Throwable -> L1c
                r6 = 0
                r7 = 0
                r9 = 3
                r10 = 0
                r8 = r11
                java.lang.Object r12 = wr.f.n(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L1c
                if (r12 != r0) goto L6b
            L6a:
                return r0
            L6b:
                kotlin.Unit r12 = kotlin.Unit.f143329a     // Catch: java.lang.Throwable -> L1c
                java.lang.Object r12 = kotlin.Result.b(r12)     // Catch: java.lang.Throwable -> L1c
                goto L7c
            L72:
                kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
                java.lang.Object r12 = kotlin.ResultKt.a(r12)
                java.lang.Object r12 = kotlin.Result.b(r12)
            L7c:
                java.lang.Throwable r12 = kotlin.Result.e(r12)
                if (r12 == 0) goto L98
                kotlin.coroutines.CoroutineContext r0 = r1.getCoroutineContext()
                mv.E0.i(r0)
                boolean r0 = r12 instanceof java.lang.Error
                if (r0 != 0) goto L97
                qw.a$a r0 = qw.a.INSTANCE
                java.lang.String r1 = "fetchLatestCart failed in ProductDetailViewModel"
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r0.l(r12, r1, r2)
                goto L98
            L97:
                throw r12
            L98:
                kotlin.Unit r12 = kotlin.Unit.f143329a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12333c1.C12348o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$handleCartAddition$6", f = "ProductDetailViewModel.kt", l = {1547}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$p, reason: case insensitive filesystem */
    static final class C12349p extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f109218a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ uk.c<EntryChange> f109220c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12333c1.this.new C12349p(this.f109220c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12349p(uk.c<EntryChange> cVar, Continuation<? super C12349p> continuation) {
            super(2, continuation);
            this.f109220c = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C12349p) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Entry entry;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f109218a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = C12333c1.this._eventFlow;
                int i11 = C17284b.f163319f;
                int i12 = C17284b.f163301T0;
                EntryChange entryChange = (EntryChange) ((c.Success) this.f109220c).a();
                if (entryChange != null) {
                    entry = entryChange.getEntry();
                } else {
                    entry = null;
                }
                G0.AddToCartSuccessEvent addToCartSuccessEvent = new G0.AddToCartSuccessEvent(i11, i12, entry);
                this.f109218a = 1;
                if (interfaceC16548A.emit(addToCartSuccessEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$handleCartChange$1", f = "ProductDetailViewModel.kt", l = {1404}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$q, reason: case insensitive filesystem */
    static final class C12350q extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f109221a;

        C12350q(Continuation<? super C12350q> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12333c1.this.new C12350q(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C12350q) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f109221a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = C12333c1.this._eventFlow;
                G0.UpdateToCartFailedEvent updateToCartFailedEvent = new G0.UpdateToCartFailedEvent(C17284b.f163293P0);
                this.f109221a = 1;
                if (interfaceC16548A.emit(updateToCartFailedEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$handleCartChange$2$1", f = "ProductDetailViewModel.kt", l = {1451}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$r, reason: case insensitive filesystem */
    static final class C12351r extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f109223a;

        C12351r(Continuation<? super C12351r> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12333c1.this.new C12351r(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C12351r) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f109223a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = C12333c1.this._eventFlow;
                G0.UpdateToCartFailedEvent updateToCartFailedEvent = new G0.UpdateToCartFailedEvent(C17284b.f163293P0);
                this.f109223a = 1;
                if (interfaceC16548A.emit(updateToCartFailedEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$handleCartRemoval$1", f = "ProductDetailViewModel.kt", l = {1394}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$s, reason: case insensitive filesystem */
    static final class C12352s extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f109225a;

        C12352s(Continuation<? super C12352s> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12333c1.this.new C12352s(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C12352s) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f109225a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = C12333c1.this._eventFlow;
                G0.UpdateToCartFailedEvent updateToCartFailedEvent = new G0.UpdateToCartFailedEvent(C17284b.f163293P0);
                this.f109225a = 1;
                if (interfaceC16548A.emit(updateToCartFailedEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$t, reason: case insensitive filesystem */
    public static final class C12353t implements InterfaceC16561f<ProductDetailsState> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f f109227a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$t$a */
        public static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16562g f109228a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$loadSponsoredProducts$$inlined$filter$1$2", f = "ProductDetailViewModel.kt", l = {50}, m = "emit")
            /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$t$a$a, reason: collision with other inner class name */
            public static final class C1646a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f109229a;

                /* renamed from: b, reason: collision with root package name */
                int f109230b;

                /* renamed from: c, reason: collision with root package name */
                Object f109231c;

                /* renamed from: d, reason: collision with root package name */
                Object f109232d;

                /* renamed from: f, reason: collision with root package name */
                Object f109234f;

                /* renamed from: g, reason: collision with root package name */
                Object f109235g;

                /* renamed from: h, reason: collision with root package name */
                int f109236h;

                public C1646a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f109229a = obj;
                    this.f109230b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC16562g interfaceC16562g) {
                this.f109228a = interfaceC16562g;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // pv.InterfaceC16562g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.meijer.mobile.meijer.activity.find.viewmodel.C12333c1.C12353t.a.C1646a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.meijer.mobile.meijer.activity.find.viewmodel.c1$t$a$a r0 = (com.meijer.mobile.meijer.activity.find.viewmodel.C12333c1.C12353t.a.C1646a) r0
                    int r1 = r0.f109230b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f109230b = r1
                    goto L18
                L13:
                    com.meijer.mobile.meijer.activity.find.viewmodel.c1$t$a$a r0 = new com.meijer.mobile.meijer.activity.find.viewmodel.c1$t$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f109229a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f109230b
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r5 = r0.f109235g
                    pv.g r5 = (pv.InterfaceC16562g) r5
                    java.lang.Object r5 = r0.f109232d
                    com.meijer.mobile.meijer.activity.find.viewmodel.c1$t$a$a r5 = (com.meijer.mobile.meijer.activity.find.viewmodel.C12333c1.C12353t.a.C1646a) r5
                    kotlin.ResultKt.b(r6)
                    goto L63
                L31:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L39:
                    kotlin.ResultKt.b(r6)
                    pv.g r6 = r4.f109228a
                    r2 = r5
                    com.meijer.mobile.meijer.activity.find.viewmodel.j1 r2 = (com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailsState) r2
                    Co.h r2 = r2.getProduct()
                    java.lang.String r2 = r2.getDepartment()
                    int r2 = r2.length()
                    if (r2 <= 0) goto L63
                    r0.f109231c = r5
                    r0.f109232d = r0
                    r0.f109234f = r5
                    r0.f109235g = r6
                    r2 = 0
                    r0.f109236h = r2
                    r0.f109230b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L63
                    return r1
                L63:
                    kotlin.Unit r5 = kotlin.Unit.f143329a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12333c1.C12353t.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public C12353t(InterfaceC16561f interfaceC16561f) {
            this.f109227a = interfaceC16561f;
        }

        @Override // pv.InterfaceC16561f
        public Object collect(InterfaceC16562g<? super ProductDetailsState> interfaceC16562g, Continuation continuation) {
            Object objCollect = this.f109227a.collect(new a(interfaceC16562g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel", f = "ProductDetailViewModel.kt", l = {752, 755}, m = "loadSponsoredProducts")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$u */
    static final class u extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f109237a;

        /* renamed from: b, reason: collision with root package name */
        Object f109238b;

        /* renamed from: c, reason: collision with root package name */
        Object f109239c;

        /* renamed from: d, reason: collision with root package name */
        Object f109240d;

        /* renamed from: e, reason: collision with root package name */
        Object f109241e;

        /* renamed from: f, reason: collision with root package name */
        Object f109242f;

        /* renamed from: g, reason: collision with root package name */
        int f109243g;

        /* renamed from: h, reason: collision with root package name */
        int f109244h;

        /* renamed from: i, reason: collision with root package name */
        int f109245i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f109246j;

        /* renamed from: l, reason: collision with root package name */
        int f109248l;

        u(Continuation<? super u> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f109246j = obj;
            this.f109248l |= Integer.MIN_VALUE;
            return C12333c1.this.I0(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$observeCartChangeUpdates$1", f = "ProductDetailViewModel.kt", l = {242}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$v */
    static final class v extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f109249a;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0016\u0010\u0007\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Luk/c;", "Lfj/j;", "entry", "", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/f$a;", "actions", "Lkotlin/Pair;", "<anonymous>", "(Luk/c;Ljava/util/Map;)Lkotlin/Pair;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$observeCartChangeUpdates$1$1", f = "ProductDetailViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$v$a */
        static final class a extends SuspendLambda implements Function3<uk.c<EntryChange>, Map<String, ? extends AbstractC12245f.Update>, Continuation<? super Pair<? extends uk.c<EntryChange>, ? extends AbstractC12245f.Update>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f109251a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f109252b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f109253c;

            a(Continuation<? super a> continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(uk.c<EntryChange> cVar, Map<String, AbstractC12245f.Update> map, Continuation<? super Pair<? extends uk.c<EntryChange>, AbstractC12245f.Update>> continuation) {
                a aVar = new a(continuation);
                aVar.f109252b = cVar;
                aVar.f109253c = map;
                return aVar.invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                String strG2;
                nk.i productQuantity;
                IntrinsicsKt.f();
                if (this.f109251a == 0) {
                    ResultKt.b(obj);
                    uk.c cVar = (uk.c) this.f109252b;
                    Map map = (Map) this.f109253c;
                    EntryChange entryChange = (EntryChange) cVar.a();
                    if (entryChange != null && (productQuantity = entryChange.getProductQuantity()) != null) {
                        strG2 = productQuantity.g2();
                    } else {
                        strG2 = null;
                    }
                    return TuplesKt.a(cVar, map.get(strG2));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        v(Continuation<? super v> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12333c1.this.new v(continuation);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$v$b */
        static final class b<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C12333c1 f109254a;

            b(C12333c1 c12333c1) {
                this.f109254a = c12333c1;
            }

            @Override // pv.InterfaceC16562g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(Pair<? extends uk.c<EntryChange>, AbstractC12245f.Update> pair, Continuation<? super Unit> continuation) {
                Double dB;
                nk.i productQuantity;
                uk.c<EntryChange> cVarA = pair.a();
                AbstractC12245f.Update updateB = pair.b();
                if (updateB != null) {
                    double quantity = updateB.getNewProductQuantity().getQuantity();
                    EntryChange entryChangeA = cVarA.a();
                    if (entryChangeA != null && (productQuantity = entryChangeA.getProductQuantity()) != null) {
                        dB = Boxing.b(productQuantity.getQuantity());
                    } else {
                        dB = null;
                    }
                    if (Intrinsics.a(quantity, dB)) {
                        this.f109254a.W0(updateB, cVarA);
                    }
                }
                return Unit.f143329a;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((v) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f109249a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16561f interfaceC16561fF = C16563h.F(C12333c1.this.cartRepository.O(), C12333c1.this.actionsFlow, new a(null));
                b bVar = new b(C12333c1.this);
                this.f109249a = 1;
                if (interfaceC16561fF.collect(bVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$w */
    /* synthetic */ class w extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        w(Object obj) {
            super(1, obj, a.Companion.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((a.Companion) this.receiver).e(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$onAction$1", f = "ProductDetailViewModel.kt", l = {1029}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$x */
    static final class x extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f109255a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC15517b f109257c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12333c1.this.new x(this.f109257c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(AbstractC15517b abstractC15517b, Continuation<? super x> continuation) {
            super(2, continuation);
            this.f109257c = abstractC15517b;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((x) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f109255a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C12333c1 c12333c1 = C12333c1.this;
                nk.c product = ((AbstractC15517b.Add) this.f109257c).getProduct();
                this.f109255a = 1;
                if (c12333c1.k0(product, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$onAction$2", f = "ProductDetailViewModel.kt", l = {1035}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$y */
    static final class y extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f109258a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC15517b f109260c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12333c1.this.new y(this.f109260c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(AbstractC15517b abstractC15517b, Continuation<? super y> continuation) {
            super(2, continuation);
            this.f109260c = abstractC15517b;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((y) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f109258a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C12333c1 c12333c1 = C12333c1.this;
                nk.c product = ((AbstractC15517b.Remove) this.f109260c).getProduct();
                this.f109258a = 1;
                if (c12333c1.c1(product, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailViewModel$onAction$3", f = "ProductDetailViewModel.kt", l = {1045}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.c1$z */
    static final class z extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f109261a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC15516a f109263c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12333c1.this.new z(this.f109263c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(AbstractC15516a abstractC15516a, Continuation<? super z> continuation) {
            super(2, continuation);
            this.f109263c = abstractC15516a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((z) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f109261a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C12333c1 c12333c1 = C12333c1.this;
                nk.c product = ((AbstractC15516a.Add) this.f109263c).getProduct();
                this.f109261a = 1;
                if (c12333c1.j0(product, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    public C12333c1(Ro.c productsRepository, il.m cartRepository, Tq.j storeProvider, yo.k userManager, Eq.a favoritesListRepository, Eq.b shoppingListRepository, wr.f cartInteractor, com.google.firebase.crashlytics.a firebaseCrashlytics, zl.k featureManager, InterfaceC14523a analyticsEngine, C16753b beaconClient, sp.Y productStateRepository, C17115a multiChannelProductsStateRepository, pp.g suggestionsRepository, pp.e sponsorshipsDataStore, pp.d productMetadataStore, Kp.g bazaarVoiceManager, C13702d couponsRepository, AbstractC15779K ioDispatcher) {
        Intrinsics.j(productsRepository, "productsRepository");
        Intrinsics.j(cartRepository, "cartRepository");
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(favoritesListRepository, "favoritesListRepository");
        Intrinsics.j(shoppingListRepository, "shoppingListRepository");
        Intrinsics.j(cartInteractor, "cartInteractor");
        Intrinsics.j(firebaseCrashlytics, "firebaseCrashlytics");
        Intrinsics.j(featureManager, "featureManager");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        Intrinsics.j(beaconClient, "beaconClient");
        Intrinsics.j(productStateRepository, "productStateRepository");
        Intrinsics.j(multiChannelProductsStateRepository, "multiChannelProductsStateRepository");
        Intrinsics.j(suggestionsRepository, "suggestionsRepository");
        Intrinsics.j(sponsorshipsDataStore, "sponsorshipsDataStore");
        Intrinsics.j(productMetadataStore, "productMetadataStore");
        Intrinsics.j(bazaarVoiceManager, "bazaarVoiceManager");
        Intrinsics.j(couponsRepository, "couponsRepository");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.productsRepository = productsRepository;
        this.cartRepository = cartRepository;
        this.storeProvider = storeProvider;
        this.userManager = userManager;
        this.favoritesListRepository = favoritesListRepository;
        this.shoppingListRepository = shoppingListRepository;
        this.cartInteractor = cartInteractor;
        this.firebaseCrashlytics = firebaseCrashlytics;
        this.featureManager = featureManager;
        this.analyticsEngine = analyticsEngine;
        this.beaconClient = beaconClient;
        this.productStateRepository = productStateRepository;
        this.multiChannelProductsStateRepository = multiChannelProductsStateRepository;
        this.suggestionsRepository = suggestionsRepository;
        this.sponsorshipsDataStore = sponsorshipsDataStore;
        this.productMetadataStore = productMetadataStore;
        this.bazaarVoiceManager = bazaarVoiceManager;
        this.couponsRepository = couponsRepository;
        this.ioDispatcher = ioDispatcher;
        this.disposables = new Ju.a();
        InterfaceC16548A<G0> interfaceC16548AB = C16555H.b(0, 0, null, 7, null);
        this._eventFlow = interfaceC16548AB;
        this.eventFlow = C16563h.b(interfaceC16548AB);
        InterfaceC16549B<ProductDetailFeatureFlags> interfaceC16549BA = pv.S.a(new ProductDetailFeatureFlags(false, false, false, false, false, false, false, false, l3.f93323c, null));
        this._featureFlags = interfaceC16549BA;
        this.featureFlags = C16563h.c(interfaceC16549BA);
        ProductFullDetails productFullDetails = new ProductFullDetails(null, null, 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -1, 268435455, null);
        InterfaceC16549B<ProductDetailsState> interfaceC16549BA2 = pv.S.a(new ProductDetailsState(productFullDetails, null, null, null, null, 0, null, false, null, null, null, 0, null, null, null, false, false, null, null, null, null, null, null, 8388606, null));
        this._detailsFlow = interfaceC16549BA2;
        this.productDetailFlow = C16563h.c(interfaceC16549BA2);
        this.cartId = "-1";
        this.limitReviews = 5;
        this.actionsFlow = pv.S.a(MapsKt.k());
        P0();
        K0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<ProductState<ProductFullDetails>> J0(List<ProductState<ProductFullDetails>> productState) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : productState) {
            if (((ProductFullDetails) ((ProductState) obj).g()).F()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return productState;
        }
        productState.removeAll(arrayList);
        List listB1 = CollectionsKt.b1(arrayList, 2);
        Iterator it = listB1.iterator();
        while (it.hasNext()) {
            R0(new AbstractC12325a.OnLoadCriteoBeacon((ProductFullDetails) ((ProductState) it.next()).g()));
        }
        List listP = CollectionsKt.p(1, 4);
        int size = listB1.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            if (i10 < listP.size()) {
                int iIntValue = ((Number) listP.get(i10)).intValue();
                if (iIntValue > productState.size()) {
                    productState.addAll(listB1.subList(i10, listB1.size()));
                    break;
                }
                productState.add(iIntValue, listB1.get(i10));
            }
            i10++;
        }
        return CollectionsKt.j1(productState);
    }

    private final String A0() {
        return this.quantityChangeForFBT ? "edaa - Frequently Bought Together" : "product details page";
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void C0(uk.c<fj.EntryChange> r81) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12333c1.C0(uk.c):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E0(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.h("errorMessage", "add to cart error");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F0(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.h("errorMessage", "add to cart error");
        return Unit.f143329a;
    }

    private final void G0(uk.c<EntryChange> entryChange) {
        Entry entry;
        ProductFullDetails productFullDetailsM;
        ProductFullDetails productFullDetailsM2;
        ProductSponsorship productSponsorshipA = null;
        if (entryChange instanceof c.Failure) {
            C15809k.d(androidx.view.d0.a(this), null, null, new C12350q(null), 3, null);
        }
        W.ComplexPromo complexPromoY0 = y0();
        EntryChange entryChangeA = entryChange.a();
        if (entryChangeA != null) {
            pp.d dVar = this.productMetadataStore;
            Entry entry2 = entryChangeA.getEntry();
            boolean zC = dVar.c((entry2 == null || (productFullDetailsM2 = entry2.m()) == null) ? null : productFullDetailsM2.getCode());
            int i10 = C12336c.$EnumSwitchMapping$0[entryChangeA.getStatusCode().ordinal()];
            if (i10 != 1 && i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                C15809k.d(androidx.view.d0.a(this), null, null, new C12351r(null), 3, null);
            } else if (entryChangeA.getExpectedQuantityChange() >= 0.0d) {
                if (entryChangeA.getExpectedQuantityChange() > 0.0d) {
                    this.analyticsEngine.k(C2898u.f1904a.Y(this.cartId, this.campaignIdValue, entryChangeA, x0(entryChange), entryChange, this.sponsorshipsDataStore, A0(), complexPromoY0, zC));
                }
            } else {
                EntryChange entryChangeA2 = entryChange.a();
                if (entryChangeA2 != null && (entry = entryChangeA2.getEntry()) != null && (productFullDetailsM = entry.m()) != null) {
                    productSponsorshipA = this.sponsorshipsDataStore.a(productFullDetailsM.getCode());
                }
                this.analyticsEngine.k(C2898u.f1904a.a0(this.cartId, entryChangeA, zC, x0(entryChange), productSponsorshipA, A0()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bd, code lost:
    
        if (r13 == r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I0(nk.f r12, kotlin.coroutines.Continuation<? super kotlin.Unit> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12333c1.I0(nk.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void L0() {
        io.reactivex.l<Integer> lVarSubscribeOn = this.cartRepository.Q().subscribeOn(C13889a.b());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.T0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12333c1.M0(this.f108960a, (Integer) obj);
            }
        };
        Lu.g<? super Integer> gVar = new Lu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.U0
            @Override // Lu.g
            public final void accept(Object obj) {
                C12333c1.N0(function1, obj);
            }
        };
        final w wVar = new w(qw.a.INSTANCE);
        Dk.a.a(lVarSubscribeOn.subscribe(gVar, new Lu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.V0
            @Override // Lu.g
            public final void accept(Object obj) {
                C12333c1.O0(wVar, obj);
            }
        }), this.disposables);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M0(C12333c1 c12333c1, Integer num) {
        ProductDetailsState value;
        InterfaceC16549B<ProductDetailsState> interfaceC16549B = c12333c1._detailsFlow;
        do {
            value = interfaceC16549B.getValue();
            Intrinsics.g(num);
        } while (!interfaceC16549B.e(value, ProductDetailsState.d(value, null, null, null, null, null, 0, null, false, null, null, null, num.intValue(), null, null, null, false, false, null, null, null, null, null, null, 8386559, null)));
        return Unit.f143329a;
    }

    private final void P0() {
        if (this.userManager.b()) {
            this.cartInteractor.q(false, new C12334a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final sp.ProductState<Co.ProductFullDetails> X0(java.util.List<sp.ProductState<Co.ProductFullDetails>> r32) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12333c1.X0(java.util.List):sp.b");
    }

    private final void a1(Throwable throwable, G0 event) {
        qw.a.INSTANCE.e(throwable);
        C15809k.d(androidx.view.d0.a(this), null, null, new E(event, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b1(nk.c r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12333c1.b1(nk.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c1(nk.f r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12333c1.c1(nk.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j0(nk.c r12, kotlin.coroutines.Continuation<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12333c1.j0(nk.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k0(nk.c r12, kotlin.coroutines.Continuation<? super kotlin.Unit> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12333c1.k0(nk.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k1(final C12333c1 c12333c1, final Object key, sp.Y repo) {
        Intrinsics.j(key, "key");
        Intrinsics.j(repo, "repo");
        io.reactivex.l<List<ProductState<ProductFullDetails>>> lVarSubscribeOn = repo.Y0().subscribeOn(C13889a.b());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.I0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12333c1.l1(this.f108782a, key, (List) obj);
            }
        };
        Lu.g<? super List<ProductState<ProductFullDetails>>> gVar = new Lu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.J0
            @Override // Lu.g
            public final void accept(Object obj) {
                C12333c1.m1(function1, obj);
            }
        };
        final N n10 = new N(qw.a.INSTANCE);
        Dk.a.a(lVarSubscribeOn.subscribe(gVar, new Lu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.K0
            @Override // Lu.g
            public final void accept(Object obj) {
                C12333c1.n1(n10, obj);
            }
        }), c12333c1.disposables);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l0(nk.c cVar, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.h("productID", cVar.getCode());
        track.n("product detail page");
        track.v("shopping list");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m0(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("product detail page");
        track.v("mperks");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n0(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.h("errorMessage", "add to shopping list error");
        return Unit.f143329a;
    }

    private final void o0(List<ProductFullDetails> productList, boolean isFrequentlyBoughtTogetherImpression) {
        ProductDetailsState value;
        ProductDetailsState productDetailsState;
        C12328b criteoBeaconTracker;
        ArrayList arrayList = new ArrayList();
        for (Object obj : productList) {
            ProductFullDetails productFullDetails = (ProductFullDetails) obj;
            if (productFullDetails.F() && !this.productDetailFlow.getValue().getCriteoBeaconTracker().a().contains(productFullDetails.getCode())) {
                arrayList.add(obj);
            }
        }
        List<ProductFullDetails> listM1 = CollectionsKt.m1(arrayList);
        if (listM1.isEmpty()) {
            return;
        }
        InterfaceC16549B<ProductDetailsState> interfaceC16549B = this._detailsFlow;
        do {
            value = interfaceC16549B.getValue();
            productDetailsState = value;
            criteoBeaconTracker = productDetailsState.getCriteoBeaconTracker();
            List<String> listA = criteoBeaconTracker.a();
            List<ProductFullDetails> list = listM1;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((ProductFullDetails) it.next()).getCode());
            }
            listA.addAll(arrayList2);
            Unit unit = Unit.f143329a;
        } while (!interfaceC16549B.e(value, ProductDetailsState.d(productDetailsState, null, null, null, null, null, 0, null, false, null, null, null, 0, null, null, null, false, false, null, null, null, null, criteoBeaconTracker, null, 6291455, null)));
        this.analyticsEngine.k(Ao.M.f1665a.b(isFrequentlyBoughtTogetherImpression, this.cartId, listM1));
    }

    private final void o1(final ProductFullDetails productDetails) {
        String str = this.previousTrackAction;
        if (str == null || str.length() == 0) {
            this.analyticsEngine.c(C14756c.h("Product Details Page"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.Y0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C12333c1.p1(productDetails, this, (TrackingData) obj);
                }
            });
        } else {
            this.analyticsEngine.b(C14756c.h("Product Details Page"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.Z0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C12333c1.q1(productDetails, this, (TrackingData) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p1(ProductFullDetails productFullDetails, C12333c1 c12333c1, TrackingData submitEvent) {
        Intrinsics.j(submitEvent, "$this$submitEvent");
        submitEvent.c(Ao.W.f1694a.h(productFullDetails));
        submitEvent.h("pageName", "Meijer:Search Results Page: Product Details Page");
        ProductSponsorship productSponsorshipA = c12333c1.sponsorshipsDataStore.a(productFullDetails.getCode());
        if (productSponsorshipA != null) {
            Ao.e0.a(productSponsorshipA, submitEvent);
            if (productSponsorshipA.getSponsorSource() == Ho.b.f13875c) {
                C15809k.d(androidx.view.d0.a(c12333c1), c12333c1.ioDispatcher, null, new P(productFullDetails, c12333c1, null), 2, null);
            }
        }
        submitEvent.h("isProductOutOfStock", productFullDetails.getStockInfo().e() ? "true" : "false");
        return Unit.f143329a;
    }

    private final void q0() {
        io.reactivex.l<String> lVarSubscribeOn = this.cartRepository.N().subscribeOn(C13889a.b());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.W0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12333c1.r0(this.f108981a, (String) obj);
            }
        };
        Dk.a.a(lVarSubscribeOn.subscribe(new Lu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.X0
            @Override // Lu.g
            public final void accept(Object obj) {
                C12333c1.s0(function1, obj);
            }
        }), this.disposables);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q1(ProductFullDetails productFullDetails, C12333c1 c12333c1, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.c(Ao.W.f1694a.h(productFullDetails));
        track.h("pageName", "Meijer:Search Results Page: Product Details Page");
        track.h("isProductOutOfStock", productFullDetails.getStockInfo().e() ? "true" : "false");
        Ao.e0.a(c12333c1.sponsorshipsDataStore.a(productFullDetails.getCode()), track);
        track.p(c12333c1.previousTrackAction);
        return Unit.f143329a;
    }

    private final boolean s1(int errorMessageId) {
        if (this.userManager.b()) {
            return true;
        }
        C15809k.d(androidx.view.d0.a(this), null, null, new R(errorMessageId, null), 3, null);
        return false;
    }

    private final void u0(nk.f productIdentity) {
        ProductDetailsState value;
        if (this.featureManager.e(AbstractC18503f.X.f172863h)) {
            InterfaceC16549B<ProductDetailsState> interfaceC16549B = this._detailsFlow;
            do {
                value = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value, ProductDetailsState.d(value, null, null, null, null, null, 0, null, false, null, null, null, 0, null, null, null, false, false, r.f109823c, null, null, null, null, null, 8257535, null)));
            C15809k.d(androidx.view.d0.a(this), null, null, new C12345l(productIdentity, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v0(Co.ProductFullDetails r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.meijer.mobile.meijer.activity.find.viewmodel.C12333c1.C12346m
            if (r0 == 0) goto L13
            r0 = r7
            com.meijer.mobile.meijer.activity.find.viewmodel.c1$m r0 = (com.meijer.mobile.meijer.activity.find.viewmodel.C12333c1.C12346m) r0
            int r1 = r0.f109210f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f109210f = r1
            goto L18
        L13:
            com.meijer.mobile.meijer.activity.find.viewmodel.c1$m r0 = new com.meijer.mobile.meijer.activity.find.viewmodel.c1$m
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f109208d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f109210f
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.f109206b
            com.meijer.mobile.meijer.activity.find.viewmodel.c1 r6 = (com.meijer.mobile.meijer.activity.find.viewmodel.C12333c1) r6
            java.lang.Object r6 = r0.f109205a
            Co.h r6 = (Co.ProductFullDetails) r6
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Throwable -> L31
            goto L56
        L31:
            r7 = move-exception
            goto L5d
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            kotlin.ResultKt.b(r7)
            kotlin.Result$Companion r7 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L31
            Ro.c r7 = r5.productsRepository     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = r6.getCode()     // Catch: java.lang.Throwable -> L31
            r0.f109205a = r6     // Catch: java.lang.Throwable -> L31
            r0.f109206b = r5     // Catch: java.lang.Throwable -> L31
            r4 = 0
            r0.f109207c = r4     // Catch: java.lang.Throwable -> L31
            r0.f109210f = r3     // Catch: java.lang.Throwable -> L31
            java.lang.Object r7 = r7.l(r2, r0)     // Catch: java.lang.Throwable -> L31
            if (r7 != r1) goto L56
            return r1
        L56:
            Co.h r7 = (Co.ProductFullDetails) r7     // Catch: java.lang.Throwable -> L31
            java.lang.Object r7 = kotlin.Result.b(r7)     // Catch: java.lang.Throwable -> L31
            goto L67
        L5d:
            kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
            java.lang.Object r7 = kotlin.ResultKt.a(r7)
            java.lang.Object r7 = kotlin.Result.b(r7)
        L67:
            boolean r1 = kotlin.Result.h(r7)
            if (r1 == 0) goto L7c
            r1 = r7
            Co.h r1 = (Co.ProductFullDetails) r1
            sp.Y r2 = r5.productStateRepository
            java.util.List r3 = kotlin.collections.CollectionsKt.e(r1)
            r2.m1(r3)
            r5.o1(r1)
        L7c:
            java.lang.Throwable r7 = kotlin.Result.e(r7)
            if (r7 == 0) goto L99
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            mv.E0.i(r0)
            boolean r0 = r7 instanceof java.lang.Error
            if (r0 != 0) goto L98
            com.meijer.mobile.meijer.activity.find.viewmodel.G0$g r0 = new com.meijer.mobile.meijer.activity.find.viewmodel.G0$g
            int r1 = com.meijer.mobile.meijer.Y.f100652Rc
            r0.<init>(r6, r1)
            r5.a1(r7, r0)
            goto L99
        L98:
            throw r7
        L99:
            kotlin.Unit r6 = kotlin.Unit.f143329a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12333c1.v0(Co.h, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v1(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("product detail page");
        track.v("mperks");
        return Unit.f143329a;
    }

    private final String x0(uk.c<EntryChange> entryChange) {
        List<SuggestedProductCarouselDecorator> listS;
        Entry entry;
        ProductFullDetails productFullDetailsM;
        if (this.quantityChangeForFBT && (listS = this._detailsFlow.getValue().s()) != null) {
            Iterator<SuggestedProductCarouselDecorator> it = listS.iterator();
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i10 = -1;
                    break;
                }
                String code = it.next().getProduct().getCode();
                EntryChange entryChangeA = entryChange.a();
                if (Intrinsics.e(code, (entryChangeA == null || (entry = entryChangeA.getEntry()) == null || (productFullDetailsM = entry.m()) == null) ? null : productFullDetailsM.getCode())) {
                    break;
                }
                i10++;
            }
            Integer numValueOf = Integer.valueOf(i10);
            if (numValueOf.intValue() < 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                return Integer.valueOf(numValueOf.intValue() + 1).toString();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final W.ComplexPromo y0() {
        if (this.quantityChangeForFBT) {
            return null;
        }
        ProductDetailsState value = this._detailsFlow.getValue();
        String complexPromoString = value.getComplexPromoString();
        if (complexPromoString == null || StringsKt.s0(complexPromoString)) {
            value = null;
        }
        ProductDetailsState productDetailsState = value;
        if (productDetailsState != null) {
            return new W.ComplexPromo(productDetailsState.getComplexPromoId(), productDetailsState.getComplexPromoString());
        }
        return null;
    }

    public final pv.P<ProductDetailsState> B0() {
        return this.productDetailFlow;
    }

    public final void Q0(a2 action) {
        Intrinsics.j(action, "action");
        if ((action instanceof a2.ReadMore) || (action instanceof a2.ShowReviewGallery) || (action instanceof a2.WriteReview) || (action instanceof a2.SeeAll)) {
            return;
        }
        if (action instanceof a2.Report) {
            t0(((a2.Report) action).getReviewDetails().getReviewId(), Kp.a.f17595a);
        } else if (action instanceof a2.VotePositive) {
            t0(((a2.VotePositive) action).getReviewDetails().getReviewId(), Kp.a.f17596b);
        } else {
            if (!(action instanceof a2.VoteNegative)) {
                throw new NoWhenBranchMatchedException();
            }
            t0(((a2.VoteNegative) action).getReviewDetails().getReviewId(), Kp.a.f17597c);
        }
    }

    public final void R0(AbstractC12325a action) {
        ProductDetailsState value;
        ProductDetailsState productDetailsState;
        C12328b criteoBeaconTracker;
        ProductDetailsState value2;
        ProductDetailsState productDetailsState2;
        C12328b criteoBeaconTracker2;
        ProductDetailsState value3;
        ProductDetailsState productDetailsState3;
        C12328b criteoBeaconTracker3;
        Intrinsics.j(action, "action");
        if (action instanceof AbstractC12325a.CarouselIsVisible) {
            if (this.carouselIsVisibleEncountered) {
                return;
            }
            o0(((AbstractC12325a.CarouselIsVisible) action).a(), true);
            this.carouselIsVisibleEncountered = true;
            return;
        }
        if (action instanceof AbstractC12325a.NewItemScrolling) {
            o0(((AbstractC12325a.NewItemScrolling) action).a(), false);
            return;
        }
        if (action instanceof AbstractC12325a.OnViewCriteoBeacon) {
            AbstractC12325a.OnViewCriteoBeacon onViewCriteoBeacon = (AbstractC12325a.OnViewCriteoBeacon) action;
            if (this.productDetailFlow.getValue().getCriteoBeaconTracker().d().containsAll(onViewCriteoBeacon.getProductList().getBeaconInfo().g())) {
                return;
            }
            e1(onViewCriteoBeacon.getProductList().getBeaconInfo().g());
            e1(CollectionsKt.e(onViewCriteoBeacon.getProductList().getBeaconInfo().getFormatLevelOnViewBeacon()));
            InterfaceC16549B<ProductDetailsState> interfaceC16549B = this._detailsFlow;
            do {
                value3 = interfaceC16549B.getValue();
                productDetailsState3 = value3;
                criteoBeaconTracker3 = productDetailsState3.getCriteoBeaconTracker();
                criteoBeaconTracker3.d().addAll(CollectionsKt.Q0(onViewCriteoBeacon.getProductList().getBeaconInfo().g(), onViewCriteoBeacon.getProductList().getBeaconInfo().getFormatLevelOnViewBeacon()));
                Unit unit = Unit.f143329a;
            } while (!interfaceC16549B.e(value3, ProductDetailsState.d(productDetailsState3, null, null, null, null, null, 0, null, false, null, null, null, 0, null, null, null, false, false, null, null, null, null, criteoBeaconTracker3, null, 6291455, null)));
            return;
        }
        if (action instanceof AbstractC12325a.OnClickCriteoBeacon) {
            AbstractC12325a.OnClickCriteoBeacon onClickCriteoBeacon = (AbstractC12325a.OnClickCriteoBeacon) action;
            if (this.productDetailFlow.getValue().getCriteoBeaconTracker().b().containsAll(onClickCriteoBeacon.getProductList().getBeaconInfo().e())) {
                return;
            }
            e1(onClickCriteoBeacon.getProductList().getBeaconInfo().e());
            e1(CollectionsKt.e(onClickCriteoBeacon.getProductList().getBeaconInfo().getFormatLevelOnClickBeacon()));
            InterfaceC16549B<ProductDetailsState> interfaceC16549B2 = this._detailsFlow;
            do {
                value2 = interfaceC16549B2.getValue();
                productDetailsState2 = value2;
                criteoBeaconTracker2 = productDetailsState2.getCriteoBeaconTracker();
                criteoBeaconTracker2.b().addAll(CollectionsKt.Q0(onClickCriteoBeacon.getProductList().getBeaconInfo().e(), onClickCriteoBeacon.getProductList().getBeaconInfo().getFormatLevelOnClickBeacon()));
                Unit unit2 = Unit.f143329a;
            } while (!interfaceC16549B2.e(value2, ProductDetailsState.d(productDetailsState2, null, null, null, null, null, 0, null, false, null, null, null, 0, null, null, null, false, false, null, null, null, null, criteoBeaconTracker2, null, 6291455, null)));
            return;
        }
        if (!(action instanceof AbstractC12325a.OnLoadCriteoBeacon)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC12325a.OnLoadCriteoBeacon onLoadCriteoBeacon = (AbstractC12325a.OnLoadCriteoBeacon) action;
        if (this.productDetailFlow.getValue().getCriteoBeaconTracker().c().contains(onLoadCriteoBeacon.getProductList().getBeaconInfo().getOnLoadBeacon())) {
            return;
        }
        e1(CollectionsKt.e(onLoadCriteoBeacon.getProductList().getBeaconInfo().getOnLoadBeacon()));
        e1(CollectionsKt.e(onLoadCriteoBeacon.getProductList().getBeaconInfo().getFormatLevelOnLoadBeacon()));
        InterfaceC16549B<ProductDetailsState> interfaceC16549B3 = this._detailsFlow;
        do {
            value = interfaceC16549B3.getValue();
            productDetailsState = value;
            criteoBeaconTracker = productDetailsState.getCriteoBeaconTracker();
            criteoBeaconTracker.c().addAll(CollectionsKt.p(onLoadCriteoBeacon.getProductList().getBeaconInfo().getOnLoadBeacon(), onLoadCriteoBeacon.getProductList().getBeaconInfo().getFormatLevelOnLoadBeacon()));
            Unit unit3 = Unit.f143329a;
        } while (!interfaceC16549B3.e(value, ProductDetailsState.d(productDetailsState, null, null, null, null, null, 0, null, false, null, null, null, 0, null, null, null, false, false, null, null, null, null, criteoBeaconTracker, null, 6291455, null)));
    }

    public final void S0(AbstractC12425x action) {
        ProductDetailsState value;
        ProductDetailsState productDetailsState;
        ArrayList arrayList;
        ProductDetailsState value2;
        Intrinsics.j(action, "action");
        if (action instanceof AbstractC12425x.UpdateEntry) {
            if (s1(Cj.o.f5056d)) {
                if (this.quantityChangeForFBT) {
                    this.quantityChangeForFBT = false;
                }
                r1(((AbstractC12425x.UpdateEntry) action).getQuantityRequested());
                return;
            }
            return;
        }
        if (action instanceof AbstractC12425x.IsFromCLP) {
            InterfaceC16549B<ProductDetailsState> interfaceC16549B = this._detailsFlow;
            do {
                value2 = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value2, ProductDetailsState.d(value2, null, null, null, null, null, 0, null, false, null, null, null, 0, null, null, null, ((AbstractC12425x.IsFromCLP) action).getIsFromCLP(), false, null, null, null, null, null, null, 8355839, null)));
            return;
        }
        if (action instanceof AbstractC12425x.GetFrequentlyBoughtTogetherProducts) {
            u0(((AbstractC12425x.GetFrequentlyBoughtTogetherProducts) action).getProductIdentity());
            return;
        }
        if (!(action instanceof AbstractC12425x.UpdateCarouselProductEntry)) {
            if (action instanceof AbstractC12425x.GetBazaarVoiceReviews) {
                p0(((AbstractC12425x.GetBazaarVoiceReviews) action).getProductIdentity().getCode());
                return;
            } else if (action instanceof AbstractC12425x.e) {
                C15809k.d(androidx.view.d0.a(this), null, null, new C(null), 3, null);
                return;
            } else {
                if (!(action instanceof AbstractC12425x.GoogleAdClicked)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.analyticsEngine.k(C14375c.b(((AbstractC12425x.GoogleAdClicked) action).getAnalytics(), "product details page"));
                return;
            }
        }
        if (!this.userManager.b()) {
            d1();
            C15809k.d(androidx.view.d0.a(this), null, null, new B(null), 3, null);
            return;
        }
        InterfaceC16549B<ProductDetailsState> interfaceC16549B2 = this._detailsFlow;
        do {
            value = interfaceC16549B2.getValue();
            productDetailsState = value;
            List<SuggestedProductCarouselDecorator> listS = productDetailsState.s();
            if (listS != null) {
                List<SuggestedProductCarouselDecorator> list = listS;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list, 10));
                for (SuggestedProductCarouselDecorator suggestedProductCarouselDecoratorV : list) {
                    if (suggestedProductCarouselDecoratorV.getResetStepperState()) {
                        suggestedProductCarouselDecoratorV = SuggestedProductCarouselDecorator.v(suggestedProductCarouselDecoratorV, null, null, null, null, null, null, false, false, null, null, null, null, 0.0d, false, false, null, null, null, false, null, 1032191, null);
                    }
                    arrayList2.add(suggestedProductCarouselDecoratorV);
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
        } while (!interfaceC16549B2.e(value, ProductDetailsState.d(productDetailsState, null, null, null, null, null, 0, null, false, null, null, null, 0, null, null, null, false, false, null, arrayList, null, null, null, null, 8126463, null)));
        if (!this.quantityChangeForFBT) {
            this.quantityChangeForFBT = true;
        }
        AbstractC12425x.UpdateCarouselProductEntry updateCarouselProductEntry = (AbstractC12425x.UpdateCarouselProductEntry) action;
        wr.f.M(this.cartInteractor, updateCarouselProductEntry.getProduct(), updateCarouselProductEntry.getQuantityToUpdate(), false, null, 12, null);
    }

    public void T0(AbstractC15516a action) {
        Intrinsics.j(action, "action");
        if (action instanceof AbstractC15516a.Add) {
            if (s1(C18546a.f173198e)) {
                C15809k.d(androidx.view.d0.a(this), null, null, new z(action, null), 3, null);
            }
        } else if (action instanceof AbstractC15516a.Remove) {
            C15809k.d(androidx.view.d0.a(this), null, null, new A(action, null), 3, null);
        } else {
            if (!(action instanceof AbstractC15516a.View)) {
                throw new NoWhenBranchMatchedException();
            }
            t1(((AbstractC15516a.View) action).getProduct());
        }
    }

    public void U0(AbstractC15517b action) {
        Intrinsics.j(action, "action");
        if (action instanceof AbstractC15517b.Add) {
            if (s1(C18546a.f173198e)) {
                C15809k.d(androidx.view.d0.a(this), null, null, new x(action, null), 3, null);
            }
        } else {
            if (action instanceof AbstractC15517b.View) {
                u1(((AbstractC15517b.View) action).getProduct());
                return;
            }
            if (action instanceof AbstractC15517b.Remove) {
                C15809k.d(androidx.view.d0.a(this), null, null, new y(action, null), 3, null);
                return;
            }
            throw new NotImplementedError(Reflection.b(C12333c1.class).u() + " does not handle " + Reflection.b(action.getClass()).u());
        }
    }

    public final void V0(int count) {
        ProductDetailsState value;
        InterfaceC16549B<ProductDetailsState> interfaceC16549B = this._detailsFlow;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ProductDetailsState.d(value, null, null, null, null, null, count, null, false, null, null, null, 0, null, null, null, false, false, null, null, null, null, null, null, 8388575, null)));
    }

    public final void Y0(m2 result) {
        Intrinsics.j(result, "result");
        C15809k.d(androidx.view.d0.a(this), null, null, new D(result, this, null), 3, null);
    }

    public final void Z0(Object key, List<ProductState<ProductFullDetails>> productState) {
        ProductDetailsState value;
        ProductDetailsState productDetailsState;
        ArrayList arrayList;
        Intrinsics.j(key, "key");
        Intrinsics.j(productState, "productState");
        if (Intrinsics.e(key, "frequently bought together")) {
            InterfaceC16549B<ProductDetailsState> interfaceC16549B = this._detailsFlow;
            do {
                value = interfaceC16549B.getValue();
                productDetailsState = value;
                List<ProductState<ProductFullDetails>> listJ0 = J0(CollectionsKt.m1(productState));
                arrayList = new ArrayList(CollectionsKt.x(listJ0, 10));
                Iterator<T> it = listJ0.iterator();
                while (it.hasNext()) {
                    arrayList.add(SuggestedProductCarouselDecorator.INSTANCE.a((ProductState) it.next()));
                }
            } while (!interfaceC16549B.e(value, ProductDetailsState.d(productDetailsState, null, null, null, null, null, 0, null, false, null, null, null, 0, null, null, null, false, false, null, arrayList, null, null, null, null, 8126463, null)));
        }
    }

    public final void f1(String str) {
        this.campaignIdValue = str;
    }

    public final void g1(String str) {
        this.previousTrackAction = str;
    }

    public final void h1(nk.f productIdentity) {
        ProductFullDetails productFullDetails;
        Intrinsics.j(productIdentity, "productIdentity");
        this.firebaseCrashlytics.h("PRODUCT_ID", productIdentity.getCode());
        this.firebaseCrashlytics.g("STORE_ID", this.storeProvider.g());
        ProductFullDetails productFullDetails2 = productIdentity instanceof ProductFullDetails ? (ProductFullDetails) productIdentity : null;
        ProductFullDetails productFullDetails3 = productFullDetails2 == null ? new ProductFullDetails(productIdentity.getCode(), null, 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -2, 268435455, null) : productFullDetails2;
        InterfaceC16549B<ProductDetailsState> interfaceC16549B = this._detailsFlow;
        while (true) {
            productFullDetails = productFullDetails3;
            if (interfaceC16549B.e(interfaceC16549B.getValue(), new ProductDetailsState(productFullDetails, null, null, this.storeProvider.a(), null, 0, null, false, null, null, new CartEntry(0, 0.0d, productFullDetails, null, 0.0d, 0.0d, 59, null), 0, null, null, null, false, this.productMetadataStore.c(productFullDetails.getCode()), null, null, null, null, null, null, 8322038, null))) {
                break;
            } else {
                productFullDetails3 = productFullDetails;
            }
        }
        io.reactivex.l<List<ProductState<ProductFullDetails>>> lVarDistinctUntilChanged = this.productStateRepository.Y0().distinctUntilChanged();
        final L l10 = new L(this);
        Lu.g<? super List<ProductState<ProductFullDetails>>> gVar = new Lu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.H0
            @Override // Lu.g
            public final void accept(Object obj) {
                C12333c1.i1(l10, obj);
            }
        };
        final M m10 = new M(qw.a.INSTANCE);
        Dk.a.a(lVarDistinctUntilChanged.subscribe(gVar, new Lu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.R0
            @Override // Lu.g
            public final void accept(Object obj) {
                C12333c1.j1(m10, obj);
            }
        }), this.disposables);
        this.multiChannelProductsStateRepository.b(new C17115a.InterfaceC2527a() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.S0
            @Override // sp.C17115a.InterfaceC2527a
            public final void a(Object obj, sp.Y y10) {
                C12333c1.k1(this.f108957a, obj, y10);
            }
        });
        Dk.a.a(this.productStateRepository.q0(), this.disposables);
        this.productStateRepository.j1(CollectionsKt.e(productFullDetails));
        C15809k.d(androidx.view.d0.a(this), null, null, new O(productFullDetails, null), 3, null);
        if (this.userManager.b()) {
            this.cartInteractor.p();
            L0();
            q0();
        }
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        this.disposables.d();
        super.onCleared();
    }

    @Override // androidx.view.InterfaceC6157f
    public void onResume(InterfaceC6172s owner) {
        Intrinsics.j(owner, "owner");
        P0();
        InterfaceC16549B<ProductDetailFeatureFlags> interfaceC16549B = this._featureFlags;
        do {
        } while (!interfaceC16549B.e(interfaceC16549B.getValue(), new ProductDetailFeatureFlags(this.featureManager.e(AbstractC18503f.C2788f.f172876h), this.featureManager.e(AbstractC18503f.A.f172842h), this.featureManager.e(AbstractC18503f.O.f172854h), false, this.featureManager.e(AbstractC18503f.V.f172861h), this.featureManager.e(AbstractC18503f.W.f172862h), this.featureManager.e(AbstractC18503f.C18522t.f172904h), false, 136, null)));
    }

    /* renamed from: w0, reason: from getter */
    public final String getCampaignIdValue() {
        return this.campaignIdValue;
    }

    public final InterfaceC16553F<G0> z0() {
        return this.eventFlow;
    }

    private final void H0(uk.c<EntryChange> changeRes) {
        ProductSponsorship productSponsorshipA;
        Entry entry;
        ProductFullDetails productFullDetailsM;
        Entry entry2;
        ProductFullDetails productFullDetailsM2;
        EntryChange entryChangeA = changeRes.a();
        String code = null;
        if (entryChangeA == null || !entryChangeA.h()) {
            C15809k.d(androidx.view.d0.a(this), null, null, new C12352s(null), 3, null);
            return;
        }
        EntryChange entryChangeA2 = changeRes.a();
        if (entryChangeA2 != null && (entry2 = entryChangeA2.getEntry()) != null && (productFullDetailsM2 = entry2.m()) != null) {
            productSponsorshipA = this.sponsorshipsDataStore.a(productFullDetailsM2.getCode());
        } else {
            productSponsorshipA = null;
        }
        InterfaceC14523a interfaceC14523a = this.analyticsEngine;
        C2898u c2898u = C2898u.f1904a;
        String str = this.cartId;
        pp.d dVar = this.productMetadataStore;
        EntryChange entryChangeA3 = changeRes.a();
        if (entryChangeA3 != null && (entry = entryChangeA3.getEntry()) != null && (productFullDetailsM = entry.m()) != null) {
            code = productFullDetailsM.getCode();
        }
        interfaceC14523a.k(c2898u.c0(str, dVar.c(code), changeRes.a(), x0(changeRes), productSponsorshipA, A0()));
    }

    private final void K0() {
        C15809k.d(androidx.view.d0.a(this), null, null, new v(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W0(AbstractC12245f.Update action, uk.c<EntryChange> entryChange) {
        Map<String, AbstractC12245f.Update> value;
        AbstractC12245f.Update.AbstractC1640a updateType = action.getUpdateType();
        if (Intrinsics.e(updateType, AbstractC12245f.Update.AbstractC1640a.C1641a.f108429a)) {
            C0(entryChange);
        } else if (!Intrinsics.e(updateType, AbstractC12245f.Update.AbstractC1640a.c.f108431a) && !Intrinsics.e(updateType, AbstractC12245f.Update.AbstractC1640a.b.f108430a)) {
            if (Intrinsics.e(updateType, AbstractC12245f.Update.AbstractC1640a.d.f108432a)) {
                H0(entryChange);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            G0(entryChange);
        }
        InterfaceC16549B<Map<String, AbstractC12245f.Update>> interfaceC16549B = this.actionsFlow;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, MapsKt.q(value, action.getProduct().getCode())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d1() {
        C15809k.d(androidx.view.d0.a(this), null, null, new J(null), 3, null);
    }

    private final void e1(List<String> beacon) {
        C15809k.d(androidx.view.d0.a(this), this.ioDispatcher, null, new K(beacon, this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l1(C12333c1 c12333c1, Object obj, List list) {
        Intrinsics.g(list);
        c12333c1.Z0(obj, list);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void p0(String productCode) {
        C15809k.d(androidx.view.d0.a(this), null, null, new C12343j(productCode, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r0(C12333c1 c12333c1, String str) {
        Intrinsics.g(str);
        c12333c1.cartId = str;
        return Unit.f143329a;
    }

    private final void r1(double quantityToUpdate) {
        C15809k.d(androidx.view.d0.a(this), null, null, new Q(null), 3, null);
        ProductDetailsState value = this._detailsFlow.getValue();
        wr.f.M(this.cartInteractor, value.getProduct(), quantityToUpdate, value.getIsFromCLP(), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void t0(String reviewId, Kp.a reviewFeedbackVote) {
        C15809k.d(androidx.view.d0.a(this), null, null, new C12344k(reviewId, reviewFeedbackVote, null), 3, null);
    }

    private final void t1(nk.c product) {
        C15809k.d(androidx.view.d0.a(this), null, null, new S(product, null), 3, null);
    }

    private final void u1(nk.c product) {
        C15809k.d(androidx.view.d0.a(this), null, null, new T(product, null), 3, null);
        this.analyticsEngine.b(C14756c.a("event: products: view on shopping list"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.L0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12333c1.v1((TrackingData) obj);
            }
        });
    }
}
