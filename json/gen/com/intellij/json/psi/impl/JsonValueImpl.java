// This is a generated file. Not intended for manual editing.
package com.intellij.json.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.json.JsonElementTypes.*;
import com.intellij.json.psi.*;

public class JsonValueImpl extends JsonElementImpl implements JsonValue {

  public JsonValueImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JsonElementVisitor) ((JsonElementVisitor)visitor).visitValue(this);
    else super.accept(visitor);
  }

}
