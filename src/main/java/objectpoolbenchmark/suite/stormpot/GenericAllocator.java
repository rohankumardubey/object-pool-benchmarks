/**
 * Copyright (c) 2002-2013 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package objectpoolbenchmark.suite.stormpot;

import objectpoolbenchmark.suite.Costs;
import stormpot.Allocator;
import stormpot.Slot;

public class GenericAllocator implements Allocator<GenericPoolable> {
  @Override
  public GenericPoolable allocate(Slot slot) throws Exception {
    Costs.expendAllocation();
    return new GenericPoolable(slot);
  }

  @Override
  public void deallocate(GenericPoolable genericPoolable) throws Exception {
    Costs.expendDeallocation();
  }
}