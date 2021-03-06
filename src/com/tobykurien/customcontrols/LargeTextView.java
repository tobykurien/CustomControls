package com.tobykurien.customcontrols;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class LargeTextView extends TextView {

   public LargeTextView(Context context) {
      super(context);
   }

   public LargeTextView(Context context, AttributeSet attrs, int defStyle) {
      super(context, attrs, defStyle);
   }

   public LargeTextView(Context context, AttributeSet attrs) {
      super(context, attrs);
   }

   @Override
   protected void onFinishInflate() {
      super.onFinishInflate();
      setTextAppearance(getContext(), android.R.style.TextAppearance_Large);
   }
}
