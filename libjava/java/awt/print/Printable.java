/* Printable.java -- Renders a page to the print device
   Copyright (C) 1999 Free Software Foundation, Inc.

This file is part of GNU Classpath.

GNU Classpath is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2, or (at your option)
any later version.

GNU Classpath is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License
along with GNU Classpath; see the file COPYING.  If not, write to the
Free Software Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA
02111-1307 USA.

Linking this library statically or dynamically with other modules is
making a combined work based on this library.  Thus, the terms and
conditions of the GNU General Public License cover the whole
combination.

As a special exception, the copyright holders of this library give you
permission to link this library with independent modules to produce an
executable, regardless of the license terms of these independent
modules, and to copy and distribute the resulting executable under
terms of your choice, provided that you also meet, for each linked
independent module, the terms and conditions of the license of that
module.  An independent module is a module which is not derived from
or based on this library.  If you modify this library, you may extend
this exception to your version of the library, but you are not
obligated to do so.  If you do not wish to do so, delete this
exception statement from your version. */


package java.awt.print;

import java.awt.Graphics;

/**
  * This interface provides a mechanism for the actual printing of pages to the
  * printer.  The object implementing this interface performs the page
  * rendering.
  *
  * @author Aaron M. Renn (arenn@urbanophile.com)
  */
public interface Printable
{

/*
 * Static Variables
 */

/**
  * This value is returned by the <code>print()</code> method to indicate
  * that the requested page number does not exist.
  */
public static final int NO_SUCH_PAGE = 0;

/**
  * This value is returned by the <code>print()</code> method to indicate
  * that the requested page exists and has been printed.
  */
public static final int PAGE_EXISTS = 1;

/*************************************************************************/

/**
  * This method prints the specified page to the specified graphics
  * context in the specified format.  The pages are numbered starting
  * from zero.
  *
  * @param graphics The graphics context to render the pages on.
  * @param format The format in which to print the page.
  * @param page_number The page number to print, where numbers start at zero.
  *
  * @return <code>PAGE_EXISTS</code> if the requested page exists and was
  * successfully printed, <code>NO_SUCH_PAGE</code> otherwise.
  *
  * @exception PrinterException If an error occurs during printing.
  */
public abstract int
print(Graphics graphics, PageFormat format, int page_number) 
      throws PrinterException;

} // interface Printable

